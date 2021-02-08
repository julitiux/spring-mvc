package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.function.Function;

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
    return (String it) -> string + it;
  }

}
