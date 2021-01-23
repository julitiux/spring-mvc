package mx.com.unit

import mx.com.service.FunctionalInterfaceService
import mx.com.service.FunctionalInterfaceServiceImpl
import spock.lang.Specification

class FunctionalInterfaceServiceSpec extends Specification {

  def "Calling Interface Fuctions"() {
    given:
    FunctionalInterfaceService anInterface = new FunctionalInterfaceServiceImpl()
    when:
    anInterface.process()
    then:
    true
  }

}
