package mx.com.service;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface HighOrderService {
  public void print(Function<String, String> function, String string);
  public Function<String, String> printWithFunction(String string);

  public List<String> filter(List<String> list, String string);

}
