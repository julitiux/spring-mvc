package mx.com.service;

import java.util.function.Function;

public interface HighOrderService {
  public void print(Function<String, String> function, String string);
}
