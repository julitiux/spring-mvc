package mx.com.unit

import mx.com.service.LambdaServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class LambdaServiceSpec extends Specification {

  @Unroll
  def "Implement unit test of the diference Imperative and declarative programming #_number1 | #_number2 | #_response"() {
    given:
    LambdaServiceImpl clazz = new LambdaServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = clazz.calculateImperative(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5

  }

  @Unroll
  def "Implement unit test of the diference Imperative and declarative programming #_number1 | #_number2 | #_response, the same"() {
    given:
    LambdaServiceImpl clazz = new LambdaServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = clazz.calculateDeclarative(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5

  }
}
