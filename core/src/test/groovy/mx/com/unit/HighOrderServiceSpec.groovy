package mx.com.unit

import mx.com.service.HighOrderServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class HighOrderServiceSpec extends Specification {

  @Shared
    service = new HighOrderServiceImpl()

  def "Implement unit test with high order"() {
    given:
    String string = _string
    def function = _function
    expect:
    service.print(function, string)
    where:
    _string        | _function
    "Hola Inmundo" | service.convertToUpperCase
  }

}
