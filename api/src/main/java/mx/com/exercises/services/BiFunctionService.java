package mx.com.exercises.services;

import java.util.List;

public interface BiFunctionService {

  public Integer add(Integer firstNumber, Integer secondNumber);
  public Double pow(Integer firstNumber, Integer secondNumber);
  public List<String> addNumbersAndTurnAList(Integer firstNumber, Integer secondNumber);

}
