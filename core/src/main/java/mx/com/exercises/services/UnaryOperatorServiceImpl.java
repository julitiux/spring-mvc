package mx.com.exercises.services;

import java.util.function.Function;

public class UnaryOperatorServiceImpl implements UnaryOperatorService {

  private Function<Integer, Integer> functionTheDouble = it -> it * 2;

  @Override
  public Integer unaryOperator(Integer interger) {
    return functionTheDouble.apply(interger);
  }
}
