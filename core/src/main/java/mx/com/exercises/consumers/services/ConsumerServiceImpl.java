package mx.com.exercises.consumers.services;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerServiceImpl implements ConsumerService {

  Consumer<String> print = it -> System.out.println(it);

  @Override
  public void outPrintln(List<String> list) {
    list.forEach(System.out::println);
  }

}
