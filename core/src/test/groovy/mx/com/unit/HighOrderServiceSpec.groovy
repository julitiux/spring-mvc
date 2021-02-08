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
    def otherString = _otherString
    expect:
    println service.printWithFunction(string)
    where:
    _string | _otherString
    "Hola"  | "Inmundo"
  }

}
