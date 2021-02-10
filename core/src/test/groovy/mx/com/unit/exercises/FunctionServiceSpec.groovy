package mx.com.unit.exercises

import mx.com.exercises.services.FunctionServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FunctionServiceSpec extends Specification {

  @Shared
    service = new FunctionServiceImpl()


  def "Test the length of String not null with Functions"() {
    given:
    String string = _string
    Integer response
    when:
    response = service.functionLenght(string)
    then:
    response == _response
    where:
    _string    | _response
    'test'     | 4
    ''         | 0
    '        ' | 8
  }

  def "Test the andThen of String not null with two Functions"() {
    given:
    String string = _string
    Integer response
    when:
    response = service.functionAndThen(string)
    then:
    response == _response
    where:
    _string    | _response
    'test'     | 8
    ''         | 0
    '        ' | 16
  }

  def "Test the method listToMap of String not null with two Functions introducint the apply"() {
    given:
    List<String> list = _list
    Map<String, Integer> response = [:]
    when:
    response = service.listToMap(list)
    then:
    response == _response
    where:
    _list                                              | _response
    ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'] | ['1': 1, '2': 1, '3': 1, '4': 1, '5': 1, '6': 1, '7': 1, '8': 1, '9': 1, '0': 1]
  }

}
