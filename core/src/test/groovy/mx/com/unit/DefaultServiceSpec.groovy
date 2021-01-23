package mx.com.unit

import mx.com.service.DefaultService
import mx.com.service.DefaultServiceImpl
import spock.lang.Specification

class DefaultServiceSpec extends Specification{

  def"Unit test Default Methods "(){
    given:
    DefaultService defaultService = new DefaultServiceImpl()
    when:
    defaultService.holaMundo()
    defaultService.defaulHolaMundo()
    then:
    true
  }

}
