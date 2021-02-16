package mx.com.exercises.predicates.services;

import java.util.List;

public interface PredicateServices {
  public List<Integer> filter(List<Integer> list);
  public List<Integer> filterWithPredicate(List<Integer> list);
  public List<Integer> filterWithPredicateAnd(List<Integer> list);
  public List<String> filterWithPredicateOr(List<String> list);
  public List<String> filterWithPredicateNegate(List<String> list);
}
