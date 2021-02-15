package mx.com.exercises.functions.services;

import mx.com.exercises.functions.domain.Developer;

import java.util.List;

public interface BinaryOperatorService {
  public Integer addTwoNumbers(Integer firstNumber, Integer secondNumber);
  public Developer findMaxSalary(List<Developer> list);
}
