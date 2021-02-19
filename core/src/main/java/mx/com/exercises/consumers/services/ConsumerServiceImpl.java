package mx.com.exercises.consumers.services;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerServiceImpl implements ConsumerService {

  Consumer<String> print = it -> System.out.println(it);
  Consumer<Integer> printIntegers = (Integer it) -> System.out.println(it);

  @Override
  public void outPrintln(List<String> list) {
    list.forEach(System.out::println);
  }

  @Override
  public void usingAConsumer(List<String> list) {
    list.stream().forEach(print);
  }

  @Override
  public void usingAConsumerWithAInteger(List<Integer> list) {
    forEach(list, printIntegers);
  }

  void forEach(List<Integer> list, Consumer<Integer> consumer){
    for(Integer number: list){
      consumer.accept(number);
    }
  }

}
