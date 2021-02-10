package mx.com.exercises.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionServiceImpl implements BiFunctionService{

  private BiFunction<Integer, Integer, Integer> addBiFunction = (firstNumber, secondNumber) -> firstNumber+secondNumber;
  private BiFunction<Integer, Integer, Double> powFunction = (firstNumber, secondNumber) -> Math.pow(firstNumber,secondNumber);
  private BiFunction<Integer, Integer, List<String>> sumAPairNumbertoList = (firstNumber, secondNumber) -> Arrays.asList(String.valueOf(firstNumber + secondNumber));

  @Override
  public Integer add(Integer firstNumber, Integer secondNumber) {
    return addBiFunction.apply(firstNumber, secondNumber);
  }

  @Override
  public Double pow(Integer firstNumber, Integer secondNumber) {
    return powFunction.apply(firstNumber,secondNumber);
  }

  @Override
  public List<String> addNumbersAndTurnAList(Integer firstNumber, Integer secondNumber) {
    return sumAPairNumbertoList.apply(firstNumber,secondNumber);
  }
}
