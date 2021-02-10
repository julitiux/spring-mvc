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

}
