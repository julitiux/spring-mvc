package mx.com.exercises

import mx.com.exercises.services.UnaryOperatorServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class UnaryOperatorServiceSpec extends Specification {

  @Shared
    service = new UnaryOperatorServiceImpl()

  def "Implement a unit test usign a UnaryOperator in the method UnaryOperator"() {
    given:
    Integer number = _number
    Integer response
    when:
    response = service.unaryOperator(number)
    then:
    response == _response
    where:
    _number | _response
    4       | 8
    8       | 16
    12      | 24
    16      | 32
    32      | 64


  }

  def "Implement a unit test usign a UnaryOperator like parameter"() {
    given:
    List<Integer> list = _list
    List<Integer> response
    when:
    response = service.unaryOperatorLikeArgument(list)
    then:
    response == _response
    where:
    _list                       | _response
    [1, 2, 3, 4, 5, 6, 7, 8, 9] | [2, 4, 6, 8, 10, 12, 14, 16, 18]
  }

}
