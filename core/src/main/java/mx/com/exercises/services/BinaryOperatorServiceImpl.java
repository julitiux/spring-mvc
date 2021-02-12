package mx.com.exercises.services;

import java.util.function.BinaryOperator;

public class BinaryOperatorServiceImpl implements BinaryOperatorService {

  BinaryOperator<Integer> add = (firstNumber, secondNumber) -> firstNumber + secondNumber;

  @Override
  public Integer addTwoNumbers(Integer firstNumber, Integer secondNumber) {
    return add.apply(firstNumber, secondNumber);
  }
}
