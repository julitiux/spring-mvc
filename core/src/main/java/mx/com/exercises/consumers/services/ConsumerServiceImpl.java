package mx.com.exercises.consumers.services;

import java.util.List;

public class ConsumerServiceImpl implements ConsumerService {

  @Override
  public void outPrintln(List<String> list) {
    list.forEach(System.out::println);
  }

}
