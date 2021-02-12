package mx.com.exercises

import mx.com.exercises.services.BinaryOperatorServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class BinaryOperatorServiceSpec extends Specification {

  @Shared
    service = new BinaryOperatorServiceImpl()

  def "unit test of BinaryFunction making a add"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    Integer response
    when:
    response = service.addTwoNumbers(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | 3
    1000         | 1000          | 2000

  }

}
