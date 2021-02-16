package mx.com.exercises.predicates.services;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateServicesImpl implements PredicateServices {

  @Override
  public List<Integer> filter(List<Integer> list) {
    return list.stream().filter(it -> it >= 5).collect(Collectors.toList());
  }

}
