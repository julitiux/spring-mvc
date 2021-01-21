package mx.com.unit

import mx.com.service.BiFunctionService
import mx.com.service.BiFunctionServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class BiFunctionServiceSpec extends Specification {

  @Unroll
  def "BiFunction Lambdas Test #_firstNumber #_secondNumber #_result"() {
    given:
    BiFunctionService biFunctionService = new BiFunctionServiceImpl();
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    when:
    Integer result = biFunctionService.firstExample(firstNumber, secondNumber)
    then:
    result == _result
    where:
    _firstNumber | _secondNumber | _result
    10           | 20            | 30
    1            | 2             | 3
    0            | 0             | 0
  }

}
