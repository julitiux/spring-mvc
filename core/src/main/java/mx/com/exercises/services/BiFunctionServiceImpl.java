package mx.com.exercises.services;

import java.util.function.BiFunction;

public class BiFunctionServiceImpl implements BiFunctionService{

  private BiFunction<Integer, Integer, Integer> addBiFunction = (firstNumber, secondNumber) -> firstNumber+secondNumber;

  @Override
  public Integer add(Integer firstNumber, Integer secondNumber) {
    return addBiFunction.apply(firstNumber, secondNumber);
  }
}
