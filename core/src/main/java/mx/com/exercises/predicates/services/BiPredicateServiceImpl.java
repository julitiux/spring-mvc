package mx.com.exercises.predicates.services;

import org.springframework.stereotype.Service;

import java.util.function.BiPredicate;

@Service
public class BiPredicateServiceImpl implements BiPredicateService {

  BiPredicate<String, Integer> isTheSameSize = (string, size) -> string.length() == size;

  @Override
  public Boolean isTheSameSize(String string, Integer integer) {
    return isTheSameSize.test(string, integer);
  }
}
