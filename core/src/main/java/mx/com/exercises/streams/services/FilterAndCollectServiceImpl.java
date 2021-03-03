package mx.com.exercises.streams.services;

import mx.com.exercises.streams.domain.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollectServiceImpl implements FilterAndCollectService {

  @Override
  public List<String> filterStartWith(List<String> stringList, String filter) {
    return stringList.stream().filter(it -> it.startsWith(filter)).collect(Collectors.toList());
  }

  @Override
  public List<Person> filterPersonByAge(List<Person> stringList, Integer age) {
    return stringList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
  }

}
