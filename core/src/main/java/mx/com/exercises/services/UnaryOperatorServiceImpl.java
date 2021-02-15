package mx.com.exercises.services;

import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorServiceImpl implements UnaryOperatorService {

  private Function<Integer, Integer> functionTheDouble = it -> it * 2;

  @Override
  public Integer unaryOperator(Integer interger) {
    return functionTheDouble.apply(interger);
  }

  @Override
  public List<Integer> unaryOperatorLikeArgument(List<Integer> list) {
    return unaryOperatorLikeArgument(list, it -> it * 2);
  }

  private List<Integer> unaryOperatorLikeArgument(List<Integer> list, UnaryOperator<Integer> unaryOperator) {
    return list.stream().map(it -> unaryOperator.apply(it)).collect(Collectors.toList());
  }

}
