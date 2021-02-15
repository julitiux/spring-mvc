package mx.com.exercises.functions.services;

import java.util.List;
import java.util.Map;

public interface FunctionService {
  public Integer functionLenght(String string);
  public Integer functionAndThen(String string);
  public Map<String, Integer> listToMap(List<String> list);
}
