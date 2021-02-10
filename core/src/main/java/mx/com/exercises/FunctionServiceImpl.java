package mx.com.exercises;

import java.util.function.Function;

public class FunctionServiceImpl implements FunctionService {

  private Function<String, Integer> functionLength = x -> x.length();
  private Function<Integer, Integer> functionMultiplyBy2 = x -> x*2;

  @Override
  public Integer functionLenght(String string) {
    return functionLength.apply(string);
  }

  @Override
  public Integer functionAndThen(String string) {
    return functionLength.andThen(functionMultiplyBy2).apply(string);
  }

}
