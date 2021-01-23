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
    for (String element : list) {
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
    while (iterator.hasNext()) {
      if (iterator.next().equalsIgnoreCase(elementRemove))
        iterator.remove();
    }
    return list;
  }

  @Override
  public List<String> useRemoveIfJava8(List<String> list, String elementRemove) {
    list.removeIf(x -> x.equalsIgnoreCase(elementRemove));
    return list;
  }

  @Override
  public List<String> useSortJava7(List<String> list) {
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    return list;
  }

  @Override
  public List<String> useSortJava8(List<String> list) {
    Collections.sort(list, ((o1, o2) -> o1.compareTo(o2)));
    return list;
  }

}
