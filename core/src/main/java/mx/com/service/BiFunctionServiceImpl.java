package mx.com.service;

import org.springframework.stereotype.Service;
import java.util.function.BiFunction;

@Service
public class BiFunctionServiceImpl implements BiFunctionService {

  @Override
  public Integer firstExample(Integer firstNumber, Integer secondNumber) {
    BiFunction<Integer, Integer, Integer> function = (first, second) -> first + second;
    return function.apply(firstNumber, secondNumber);
  }

}
