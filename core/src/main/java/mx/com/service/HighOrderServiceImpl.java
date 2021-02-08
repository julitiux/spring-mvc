package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class HighOrderServiceImpl implements HighOrderService{

  public Function<String, String> convertToUpperCase = String::toUpperCase;
  public Function<String, String> convertToLowerCase = String::toLowerCase;

  @Override
  public void print(Function<String, String> function, String string) {
    System.out.println(function.apply(string));
  }

  @Override
  public Function<String, String> printWithFunction(String string) {
    return (String it) -> string + " " + it;
  }

  @Override
  public List<String> filter(List<String> list, String string) {
    return list.stream().filter(filterString(string)).collect(Collectors.toList());
  }

  @Override
  public List<String> filter(List<String> list, String string, Consumer<String> consumer) {
    list.stream().filter(filterString(string)).forEach(consumer);
    return list;
  }

  private Predicate<String> filterString(String string){
    return it -> it.contains(string);
  }

}
