package mx.com.unit

import mx.com.service.OptionalService
import mx.com.service.OptionalServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class OptionalServiceSpec extends Specification {

  @Unroll
  def "Unit test Optional with just get #_value | #_expectedException | #_expectedMessage"() {
    given:
    String value = _value
    OptionalService service = new OptionalServiceImpl()
    when:
    service.test(value)
    then:
    def error = thrown(_expectedException)
    error.message == _expectedMessage
    where:
    _value         | _expectedException     | _expectedMessage
    "Hola Inmundo" | NoSuchElementException | "No value present"
    null           | NoSuchElementException | "No value present"
  }

  @Unroll
  def "Unit test Optional with just orElse #_value | #_expectedException | #_expectedMessage"() {
    given:
    String value = _value
    String response = ""
    OptionalService service = new OptionalServiceImpl()
    when:
    response = service.orElse(value)
    then:
    response == _response
    where:
    _value         | _response
    "Hola Inmundo" | "Hola Inmundo"
    null           | "Sin valor"
  }

  @Unroll
  def "Unit test of function Optional with orElseThrow #_value | #_expectedException | #_expectedMessage"() {
    given:
    String value = _value
    OptionalService service = new OptionalServiceImpl()
    when:
    service.orElseThrow(value)
    then:
    def error = thrown(_expectedException)
    error.message == _expectedMessage
    where:
    _value | _expectedException    | _expectedMessage
    null   | NumberFormatException | null
  }


}
