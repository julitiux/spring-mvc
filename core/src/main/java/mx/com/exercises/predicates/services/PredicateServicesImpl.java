package mx.com.exercises.predicates.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateServicesImpl implements PredicateServices {

  Predicate<Integer> majorOrEqualsThanFive = it -> it >= 5;
  Predicate<Integer> majorThanFiveAndMinorThanTen = it -> it > 5 && 10 < it;

  Predicate<String> lengthEqualsThree = it -> it.length() == 3;
  Predicate<String> startWithZ = it -> it.startsWith("Z");

  @Override
  public List<Integer> filter(List<Integer> list) {
    return list.stream().filter(it -> it >= 5).collect(Collectors.toList());
  }

  @Override
  public List<Integer> filterWithPredicate(List<Integer> list) {
    return list.stream().filter(majorOrEqualsThanFive).collect(Collectors.toList());
  }

  @Override
  public List<Integer> filterWithPredicateAnd(List<Integer> list) {
    return list.stream().filter(majorThanFiveAndMinorThanTen).collect(Collectors.toList());
  }

  @Override
  public List<String> filterWithPredicateOr(List<String> list) {
    return list.stream().filter(lengthEqualsThree.and(startWithZ)).collect(Collectors.toList());
  }

}
