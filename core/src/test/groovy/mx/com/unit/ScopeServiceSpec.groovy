package mx.com.unit

import mx.com.service.ScopeServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ScopeServiceSpec extends Specification {

  def "Implementing unit test with methof localVariable1 with values #_number1 | #_number2 | #_response"() {
    given:
    ScopeServiceImpl instance = new ScopeServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = instance.localVariable1(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5
  }

  def "Implementing unit test with methof localVariable2 (lambda) with values #_number1 | #_number2 | #_response"() {
    given:
    ScopeServiceImpl instance = new ScopeServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = instance.localVariable2(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5
  }

  def "Implementing unit test with method attributes Statics Variables (lambda) with values #_number1 | #_number2 | #_response"() {
    given:
    ScopeServiceImpl instance = new ScopeServiceImpl()
    Double number1 = _number1
    Double number2 = _number2
    Double response
    when:
    response = instance.attributesStaticVariables(number1, number2)
    then:
    response == _response
    where:
    _number1 | _number2 | _response
    2        | 3        | 2.5
  }

}
