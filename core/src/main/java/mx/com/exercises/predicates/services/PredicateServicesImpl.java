package mx.com.exercises.predicates.services;

import mx.com.exercises.predicates.domain.Hosting;
import mx.com.exercises.predicates.repository.HostingRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PredicateServicesImpl implements PredicateServices {

  @Autowired
  HostingRespository hostingRespository;

  Predicate<Integer> majorOrEqualsThanFive = it -> it >= 5;
  Predicate<Integer> majorThanFiveAndMinorThanTen = it -> it > 5 && 10 < it;

  Predicate<String> lengthEqualsThree = it -> it.length() == 3;
  Predicate<String> startWithZ = it -> it.startsWith("Z");

  @Override
  public List<Integer> predicate(List<Integer> list) {
    return list.stream().filter(it -> it >= 5).collect(Collectors.toList());
  }

  @Override
  public List<Integer> predicateFilter(List<Integer> list) {
    return list.stream().filter(majorOrEqualsThanFive).collect(Collectors.toList());
  }

  @Override
  public List<Integer> predicateFilterAndAnd(List<Integer> list) {
    return list.stream().filter(majorThanFiveAndMinorThanTen).collect(Collectors.toList());
  }

  @Override
  public List<String> predicateFilterAndOr(List<String> list) {
    return list.stream().filter(lengthEqualsThree.and(startWithZ)).collect(Collectors.toList());
  }

  @Override
  public List<String> predicateFilterAndNegate(List<String> list) {
    return list.stream().filter(startWithZ.negate()).collect(Collectors.toList());
  }

  //::This method it could be generic
  @Override
  public List<String> predicateTest(List<String> list) {
    return filter(list, it -> it.startsWith("A"));
  }

  <T> List<T> filter(List<T> list, Predicate<T> predicate) {
    return list.stream().filter(predicate::test).collect(Collectors.toList());
  }

  @Override
  public List<Hosting> filterHosting(List<Hosting> list) {
    return hostingRespository.filter(list, it -> it.getName().startsWith("A"));
  }

  @Override
  public List<Hosting> filterHostingFriendly(List<Hosting> list) {
    return hostingRespository.filter(list, otherPredicateMethod());
  }

  Predicate<Hosting> otherPredicateMethod() {
    return it -> it.getName().startsWith("A");
  }

}
