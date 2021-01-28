package mx.com.unit

import mx.com.service.LambdaSintaxisServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class LambdaSintaxisServiceSpec extends Specification {

  @Unroll
  def "Implement unit test with sintaxis1 lambda #_number1 | #_number2 | #_response"() {
    given:
    LambdaSintaxisServiceImpl clazz = new LambdaSintaxisServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = clazz.sintaxis1(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5

  }

  @Unroll
  def "Implement unit test with sintaxis2 lambda #_number1 | #_number2 | #_response"() {
    given:
    LambdaSintaxisServiceImpl clazz = new LambdaSintaxisServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = clazz.sintaxis2(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5
  }
}
