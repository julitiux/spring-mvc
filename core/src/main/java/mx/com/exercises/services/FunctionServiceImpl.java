package mx.com.exercises.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  @Override
  public Map<String, Integer> listToMap(List<String> list) {
    return convertListToMap(list, functionLength);
  }

  private <T, R> Map<T, R> convertListToMap (List<T> list, Function <T,R> function){
    Map<T,R> result = new HashMap<>();
    for(T t : list){
      result.put(t, function.apply(t));
    }
    return result;
  }

  private Map<String, Integer> convertAnotherListToMap (List<String> list, Function <String,Integer> function){
    Map<String, Integer> result = new HashMap<>();
    for(String element : list){
      result.put(element, function.apply(element));
    }
    return result;
  }

}
