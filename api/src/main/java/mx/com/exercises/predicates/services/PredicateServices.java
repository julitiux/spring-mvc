package mx.com.exercises.predicates.services;

import java.util.List;

public interface PredicateServices {
  public List<Integer> predicate(List<Integer> list);
  public List<Integer> predicateFilter(List<Integer> list);
  public List<Integer> predicateFilterAndAnd(List<Integer> list);
  public List<String> predicateFilterAndOr(List<String> list);
  public List<String> predicateFilterAndNegate(List<String> list);
}
