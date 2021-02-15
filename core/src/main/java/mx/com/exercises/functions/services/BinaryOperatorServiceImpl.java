package mx.com.exercises.functions.services;

import mx.com.exercises.functions.domain.Developer;
import mx.com.exercises.functions.services.BinaryOperatorService;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorServiceImpl implements BinaryOperatorService {

  BinaryOperator<Integer> add = (firstNumber, secondNumber) -> firstNumber + secondNumber;

  @Override
  public Integer addTwoNumbers(Integer firstNumber, Integer secondNumber) {
    return add.apply(firstNumber, secondNumber);
  }

  @Override
  public Developer findMaxSalary(List<Developer> list) {

    Comparator<Developer> comparator = Comparator.comparing(Developer::getSalary);
    BinaryOperator<Developer> binaryOperator = BinaryOperator.maxBy(comparator);
    return find(list, binaryOperator);
  }

  private Developer find(List<Developer> list, BinaryOperator<Developer> accumulator) {
    Developer result = null;
    for (Developer t : list) {
      if (result == null) {
        result = t;
      } else {
        result = accumulator.apply(result, t);
      }
    }
    return result;
  }

}
