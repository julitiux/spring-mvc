package mx.com.exercises.consumers.services;

import java.util.function.BiConsumer;

public class BiConsumerServiceImpl implements BiConsumerService {

  BiConsumer<Integer, Integer> addTwoNumber = (x, y) -> System.out.println(x + y);

  @Override
  public void biConsumer(Integer integerOne, Integer integerTwo) {
    addTwoNumber.accept(integerOne, integerTwo);
  }
}
