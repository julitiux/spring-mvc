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
  public List<Person> filterPersonByAge(List<Person> personList, Integer age) {
    return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
  }

  @Override
  public Person filterPersonUsingAny(List<Person> personList, Integer age) {
    return personList.stream().filter(person -> person.getAge().equals(age)).findAny().orElse(null);
  }

  @Override
  public List<String> getListOfUsernamePerson(List<Person> personList) {
    return personList.stream().map(Person::getName).collect(Collectors.toList());
  }

}
