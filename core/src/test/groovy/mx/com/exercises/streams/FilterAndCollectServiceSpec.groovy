package mx.com.exercises.streams

import mx.com.exercises.streams.domain.Person
import mx.com.exercises.streams.services.FilterAndCollectServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class FilterAndCollectServiceSpec extends Specification {

  @Shared
    service = new FilterAndCollectServiceImpl()

  def "Using a list with stream filter start with #_filter in the list #_stringList"() {
    given:
    List<String> stringList = _stringList
    List<String> response = []
    String filter = _filter
    when:
    response = service.filterStartWith(stringList, filter)
    then:
    response == _response
    where:
    _stringList                                                                         | _filter | _response
    []                                                                                  | ''      | []
    []                                                                                  | null    | []
    []                                                                                  | 'z'     | []
    ['1', '2', '3', '4', '5', '6', '7', '8', '9']                                       | '1'     | ['1']
    ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez'] | 'u'     | ['uno']
    ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez'] | 'c'     | ['cuatro', 'cinco']
  }

  def "filter by #_age from a #_personList"() {
    given:
    List<Person> personList = _personList
    Integer age = _age
    List<Person> response = []
    when:
    response = service.filterPersonByAge(personList, age)
    then:
    response*.name == _response*.name
    where:
    _personList                            | _age | _response
    [new Person('Julio', 'j.ramirez', 36),
     new Person('Gils', 'g.reyes', 36),
     new Person('Gaio', 'j.gonzalez', 32)] | 34   | [new Person('Julio', 'j.ramirez', 36),
                                                     new Person('Gils', 'g.reyes', 36)]

  }


  def "Filter a personList #_personList by age #_age using findAny and orElse"() {
    given:
    List<Person> personList = _personList
    Integer age = _age
    Person response
    when:
    response = service.filterPersonUsingAny(personList, age)
    then:
    response?.name == _response?.name
    where:
    _personList                            | _age | _response
    [new Person('Julio', 'j.ramirez', 36),
     new Person('Gils', 'g.reyes', 36),
     new Person('Gaio', 'j.gonzalez', 32)] | 32   | new Person('Gaio', 'j.gonzalez', 32)
    [new Person('Julio', 'j.ramirez', 36),
     new Person('Gils', 'g.reyes', 36),
     new Person('Gaio', 'j.gonzalez', 32)] | 34   | null
    []                                     | 32   | null

  }


  def "Get a List of names from the #_personList"() {
    given:
    List<Person> personList = _personList
    List<String> response
    when:
    response = service.getListOfUsernamePerson(personList)
    then:
    response == _personList*.name  //USING GROOVY
    where:
    _personList << [[new Person('Julio', 'j.ramirez', 36),
                     new Person('Gils', 'g.reyes', 36),
                     new Person('Gaio', 'j.gonzalez', 32)],
                    [new Person('Julio', 'j.ramirez', 36),
                     new Person('Gils', 'g.reyes', 36)],
                    []]

  }

}
