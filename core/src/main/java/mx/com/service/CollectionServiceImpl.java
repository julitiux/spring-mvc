package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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

  @Override
  public void forEachJava8_1(List<String> list) {
    list.forEach(System.out::println);
  }

  @Override
  public List<String> useRemoveIfJava7(List<String> list, String elementRemove) {
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
      if(iterator.next().equalsIgnoreCase(elementRemove))
        iterator.remove();
    }
    return list;
  }

  @Override
  public List<String> useRemoveIfJava8(List<String> list, String elementRemove) {
    list.removeIf(x-> x.equalsIgnoreCase(elementRemove));
    return list;
  }
  
}
