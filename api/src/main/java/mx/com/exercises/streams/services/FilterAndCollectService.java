package mx.com.exercises.streams.services;

import mx.com.exercises.streams.domain.Person;

import java.util.List;

public interface FilterAndCollectService {
  public List<String> filterStartWith(List<String> stringList, String filter);
  public List<Person> filterPersonByAge(List<Person> personList, Integer age);
}
