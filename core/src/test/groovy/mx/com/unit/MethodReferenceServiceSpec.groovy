package mx.com.unit

import mx.com.domain.User
import mx.com.service.MethodReferenceServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MethodReferenceServiceSpec extends Specification {

  def "Implement unit test of reference Method Static example 1"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.example1ReferenceMethodStatic()
    then:
    true
  }

  def "Implement unit test of reference Method Static example 2"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.example2ReferenceMethodStatic()
    then:
    true
  }

  def "Implement unit test of reference Method Instance Object Random 1"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    List response
    when:
    response = instance.referenceMethodInstanceObjectRandom1()
    then:
    response == _response
    where:
    _response << [['dos', 'tres', 'uno']]
  }

  def "Implement unit test of reference Method Instance Object Random 2"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    List response
    when:
    response = instance.referenceMethodInstanceObjectRandom2()
    then:
    response == _response
    where:
    _response << [['dos', 'tres', 'uno']]
  }

  def "Implement unit test of reference Method Instance Object Random 3"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    List response
    when:
    response = instance.referenceMethodInstanceObjectRandom3()
    then:
    response == _response
    where:
    _response << [['dos', 'tres', 'uno']]
  }

  def "Implement unit test of reference Method Instance Object Singular"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    when:
    instance.referenceMethodInstanceObjectSingular()
    then:
    true
  }


  def "Implement unit test method with reference a contructor 1 #_id | #_username  | #_result"() {
    given:
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl()
    Long id = _id
    String username = _username
    def response
    when:
    response = instance.referenceConstructor1(id, username)
    then:
    response.id == _result.id
    response.username == _result.username
//    If I Do something like this (response == _result), es a diferente reference, is cos a cant use the operator ==
    where:
    _id | _username      | _result
    1L  | 'j.ramirez008' | new User(1L, 'j.ramirez008')
  }


}
