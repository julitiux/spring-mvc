package mx.com.unit

import mx.com.service.MethodReferenceServiceImpl
import spock.lang.Specification

class MethodReferenceServiceSpec extends Specification{

  def"Implement unit test of reference Method Static"(){
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.example1ReferenceMethodStatic()
    then:
    true
  }
}
