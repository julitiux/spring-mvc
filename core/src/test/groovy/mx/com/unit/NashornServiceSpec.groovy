package mx.com.unit


import mx.com.service.NashornServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class NashornServiceSpec extends Specification {

  @Shared
    service = new NashornServiceImpl();

  def "Implementing a unit test of call of function with nashorn. Just his execution"() {
    expect:
    service.callFunctionPrint();
  }

  def "Implementing a unit test of call of function from a File. Just his execution"() {
    expect:
    service.callFunctionPrintWithFile();
  }

  def "Implementing a unit test of call the calcular method from a File. Just his execution"() {
    given:
    Double respone
    when:
    respone = service.callFunctionsWithFile();
    then:
    respone == 40.0
  }

}
