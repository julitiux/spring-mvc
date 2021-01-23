package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService {

  @Override
  public void forEachJava7(List<String> list) {
    for(String element : list){
      System.out.println(element);
    }
  }

  @Override
  public void forEachJava8(List<String> list) {
    list.forEach(it -> System.out.println(it));
  }
}
