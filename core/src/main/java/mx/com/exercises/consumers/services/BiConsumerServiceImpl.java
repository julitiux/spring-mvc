package mx.com.exercises.consumers.services;

import java.util.function.BiConsumer;

public class BiConsumerServiceImpl implements BiConsumerService {

  BiConsumer<Integer, Integer> addTwoNumber = (x, y) -> System.out.println(x + y);

  @Override
  public void biConsumer(Integer integerOne, Integer integerTwo) {
    addTwoNumber.accept(integerOne, integerTwo);
  }

  @Override
  public void highOrderFunction(Integer integerOne, Integer integerTwo) {
    addTwoNumbers(integerOne, integerTwo, (x, y) -> System.out.print(x + y));
  }

  void addTwoNumbers(Integer integerOne, Integer integerTwo, BiConsumer<Integer, Integer> biConsumer) {
    biConsumer.accept(integerOne, integerTwo);
  }

}
