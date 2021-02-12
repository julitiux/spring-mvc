package mx.com.exercises.services;

import mx.com.exercises.domain.Developer;

import java.util.List;

public interface BinaryOperatorService {
  public Integer addTwoNumbers(Integer firstNumber, Integer secondNumber);
  public Developer findMaxSalary(List<Developer> list);
}
