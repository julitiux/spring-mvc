package mx.com.unit

import mx.com.service.HighOrderServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class HighOrderServiceSpec extends Specification {

  @Shared
    service = new HighOrderServiceImpl()

  def "Implement unit test with high order with #_string | #_function"() {
    given:
    String string = _string
    def function = _function
    expect:
    service.print(function, string)
    where:
    _string        | _function
    "Hola Inmundo" | service.convertToUpperCase
    "HOLA INMUNDO" | service.convertToLowerCase
  }


  def "Implementation a unit test to access a lambda with the method apply"() {
    given:
    String string = _string
    String otherString = _otherString
    String response = _response
    when:
    response = service.printWithFunction(string).apply(otherString)
    then:
    response == _response
    where:
    _string | _otherString | _response
    "Hola"  | "Inmundo"    | "Hola Inmundo"
  }


  def "Implementation unit test that recive a list and string, I delete the consumer xD"() {
    given:
    List<String> list = ['uno', 'dos', 'tres', 'cuatro']
    String string = _string
    List<String> response
    when:
    response = service.filter(list, string)
    then:
    response == _response
    where:
    _string | _response
    "u"     | ['uno', 'cuatro']

  }

}
