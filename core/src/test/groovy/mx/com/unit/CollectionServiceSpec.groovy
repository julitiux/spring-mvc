package mx.com.unit

import mx.com.service.CollectionService
import mx.com.service.CollectionServiceImpl
import spock.lang.Specification

class CollectionServiceSpec extends Specification {

  def "For Each java7"() {
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = ['1', '2', '3', '4', '5', '6']
    when:
    collectionService.forEachJava7(list)
    then:
    true
  }


  def "For Each java8"() {
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = ['1', '2', '3', '4', '5', '6']
    when:
    collectionService.forEachJava8(list)
    then:
    true
  }

  def "For Each java8_1 "() {
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = ['1', '2', '3', '4', '5', '6']
    when:
    collectionService.forEachJava8_1(list)
    then:
    true
  }


  def "Iterator delete one element of a list with java 7"() {
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = _list
    when:
    list = collectionService.useRemoveIfJava7(list, _elementRemove)
    then:
    list == _result
    where:
    _list                          | _elementRemove | _result
    ['1', '2', '3', '4', '5', '6'] | '1'            | ['2', '3', '4', '5', '6']
  }

  def "Iterator delete one element of a list with java 8"() {
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = _list
    when:
    list = collectionService.useRemoveIfJava8(list, _elementRemove)
    then:
    list == _result
    where:
    _list                          | _elementRemove | _result
    ['1', '2', '3', '4', '5', '6'] | '6'            | ['1', '2', '3', '4', '5']
  }

}
