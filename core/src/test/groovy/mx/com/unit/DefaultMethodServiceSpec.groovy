package mx.com.unit

import mx.com.service.DefaultMethodService
import mx.com.service.DefaultMethodServiceImpl
import spock.lang.Specification

class DefaultMethodServiceSpec extends Specification{

  def"Unit test Default Methods "(){
    given:
    DefaultMethodService defaultService = new DefaultMethodServiceImpl()
    when:
    defaultService.holaMundo()
    defaultService.defaulHolaMundo()
    then:
    true
  }

}
