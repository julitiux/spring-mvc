package mx.com.unit

import mx.com.service.MethodReferenceServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MethodReferenceServiceSpec extends Specification{

  def"Implement unit test of reference Method Static example 1"(){
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.example1ReferenceMethodStatic()
    then:
    true
  }

  def"Implement unit test of reference Method Static example 2"(){
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.example2ReferenceMethodStatic()
    then:
    true
  }

  def"Implement unit test of reference Method Instance Object Random 1"(){
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    List response
    when:
    response = instance.referenceMethodInstanceObjectRandom1()
    then:
    response == _response
    where:
    _response << [['dos','tres','uno']]
  }

  def"Implement unit test of reference Method Instance Object Random 2"(){
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    List response
    when:
    response = instance.referenceMethodInstanceObjectRandom2()
    then:
    response == _response
    where:
    _response << [['dos','tres','uno']]
  }



}
