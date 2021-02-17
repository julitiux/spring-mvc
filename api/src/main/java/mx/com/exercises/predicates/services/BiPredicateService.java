package mx.com.exercises.predicates.services;

import mx.com.exercises.predicates.domain.Domain;

import java.util.List;
import java.util.function.BiPredicate;

public interface BiPredicateService {
  public Boolean isTheSameSize(String string, Integer integer);
  public Boolean isCorrectTheDomain(List<Domain> domainList, BiPredicate<String, Integer> biPredicate);
}
