package mx.com.exercises.predicates.services;

import mx.com.exercises.predicates.domain.Domain;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

@Service
public class BiPredicateServiceImpl implements BiPredicateService {

  BiPredicate<String, Integer> isTheSameSize = (string, size) -> string.length() == size;
  public BiPredicate<String, Integer> isCorrectUrl = (url, size) -> {
    return url.equalsIgnoreCase("google.com") || size == 0;
  };

  @Override
  public Boolean isTheSameSize(String string, Integer integer) {
    return isTheSameSize.test(string, integer);
  }

  @Override
  public List<Domain> isCorrectTheDomain(List<Domain> domainList, BiPredicate<String, Integer> biPredicate) {
    return filter(domainList, biPredicate);
  }

  List<Domain> filter(List<Domain> domainList, BiPredicate<String, Integer> biPredicate){
    return domainList.stream().filter(domain -> biPredicate.test(domain.getName(), domain.getScore())).collect(Collectors.toList());
  }
}
