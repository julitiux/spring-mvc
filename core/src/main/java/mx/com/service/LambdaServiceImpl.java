package mx.com.service;

public class LambdaServiceImpl {

//  Imperative programming
  public Double calculateImperative(Double num1, Double num2) {
    LambdaService lambdaService = new LambdaService() {
      @Override
      public Double calculateAverage(Double num1, Double num2) {
        return (num1 + num2) / 2;
      }
    };

    return lambdaService.calculateAverage(num1, num2);

  }

//  Declarative programming
  public Double calculateDeclarative(Double num1, Double num2) {
    LambdaService lambdaService = (Double n1, Double n2) -> (n1 + n2) / 2;
    return lambdaService.calculateAverage(num1, num2);
  }

}
