package mx.com.exercises;

import java.util.function.Function;

public class FunctionServiceImpl implements FunctionService {

  private Function<String, Integer> function = x -> x.length();

  @Override
  public Integer lenght(String string) {
    return function.apply(string);
  }

}
