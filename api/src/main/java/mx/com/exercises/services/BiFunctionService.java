package mx.com.exercises.services;

import mx.com.exercises.domain.Gps;

import java.util.List;

public interface BiFunctionService {

  public Integer add(Integer firstNumber, Integer secondNumber);
  public Double pow(Integer firstNumber, Integer secondNumber);
  public List<String> addNumbersAndTurnAList(Integer firstNumber, Integer secondNumber);

  public String powAndTurnString(Integer firstNumber, Integer secondNumber);

  public String powToString(Integer firstNumber, Integer secondNumber);

  public Gps newGps(String latitude, String longitude);
}
