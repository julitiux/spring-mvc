package mx.com.exercises.services;

import mx.com.exercises.domain.Gps;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionServiceImpl implements BiFunctionService {

  private BiFunction<Integer, Integer, Integer> addBiFunction = (firstNumber, secondNumber) -> firstNumber + secondNumber;
  private BiFunction<Integer, Integer, Double> powFunction = (firstNumber, secondNumber) -> Math.pow(firstNumber, secondNumber);
  private BiFunction<Integer, Integer, List<String>> sumAPairNumbertoList = (firstNumber, secondNumber) -> Arrays.asList(String.valueOf(firstNumber + secondNumber));

  private Function<Double, String> outputFunction = (it) -> String.valueOf(it);


  @Override
  public Integer add(Integer firstNumber, Integer secondNumber) {
    return addBiFunction.apply(firstNumber, secondNumber);
  }

  @Override
  public Double pow(Integer firstNumber, Integer secondNumber) {
    return powFunction.apply(firstNumber, secondNumber);
  }

  @Override
  public List<String> addNumbersAndTurnAList(Integer firstNumber, Integer secondNumber) {
    return sumAPairNumbertoList.apply(firstNumber, secondNumber);
  }

  @Override
  public String powAndTurnString(Integer firstNumber, Integer secondNumber) {
    return powFunction.andThen(outputFunction).apply(firstNumber, secondNumber);
  }

  @Override
  public String powToString(Integer firstNumber, Integer secondNumber) {
    return powToString(firstNumber, secondNumber, powFunction, outputFunction);
  }

  private String powToString(Integer integer1, Integer integer2,
                             BiFunction<Integer, Integer, Double> pow,
                             Function<Double, String> toString) {
    return pow.andThen(toString).apply(integer1, integer2);
  }

  @Override
  public Gps newGps(String latitude, String longitude) {
    return factory(latitude, longitude, Gps::new);
  }

  private Gps factory(String latitude, String longitude, BiFunction<String, String, Gps> biFunction) {
    return biFunction.apply(latitude, longitude);
  }

}
