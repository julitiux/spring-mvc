package mx.com.service;

public class LambdaSintaxisServiceImpl {

  public Double sintaxis1(Double number1, Double number2){
    LambdaSintaxisService instance = new LambdaSintaxisService(){
      @Override
      public Double calculateAverage(Double num1, Double num2) {
        return (num1 + num2) / 2;
      }
    };
    return instance.calculateAverage(number1,number2);
  }

  public Double sintaxis2(Double number1, Double number2){
    LambdaSintaxisService instance = (Double num1, Double num2) -> (num1 + num2) / 2;
    return instance.calculateAverage(number1,number2);
  }

  public Double sintaxis3(Double number1, Double number2){
    LambdaSintaxisService instance = (Double num1, Double num2) -> { return (num1 + num2) / 2;};
    return instance.calculateAverage(number1,number2);
  }

}
