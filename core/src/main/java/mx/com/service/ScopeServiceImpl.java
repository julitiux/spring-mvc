package mx.com.service;

public class ScopeServiceImpl {

  public Double localVariable1(Double number1, Double number2){

    final double number3 = 0;

    ScopeService instance = new ScopeService(){
      @Override
      public Double calculateAverage(Double n1, Double n2) {
        //number3 = (n1 + n2) / 2; YOU USE IT BUT YOU CANT CHANGE HIS VALUE
        return (n1 + n2) / 2;
      }
    };

    return instance.calculateAverage(number1, number2);
  }

  public Double localVariable2(Double number1, Double number2){

    final double number3 = 0;

    ScopeService instance = (n1,n2) -> {
      //number3 = (n1 + n2) / 2; YOU USE IT BUT YOU CANT CHANGE HIS VALUE
      return (n1 + n2) / 2;
    };

    return instance.calculateAverage(number1, number2);
  }

  private static double attribute1;
  private double attribute2;

  public Double attributesStaticVariables(Double number1, Double number2){

    ScopeService instance = (n1,n2) -> {
      attribute1 = (n1 + n2) / 2;
      attribute2 = attribute1;
      return attribute2;
    };

    return instance.calculateAverage(number1, number2);
  }


}
