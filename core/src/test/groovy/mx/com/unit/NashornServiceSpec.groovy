package mx.com.unit


import mx.com.service.NashornServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class NashornServiceSpec extends Specification {

  @Shared
    service = new NashornServiceImpl();

  def "Implementing a unit test of call of function with nashorn. Just his execution"() {
    expect:
    service.callFunctions();
  }

}
