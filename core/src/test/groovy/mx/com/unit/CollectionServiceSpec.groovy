package mx.com.unit

import mx.com.service.CollectionService
import mx.com.service.CollectionServiceImpl
import spock.lang.Specification

class CollectionServiceSpec extends Specification {

  def"For Each java7"(){
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = ['1','2','3','4','5','6']
    when:
    collectionService.forEachJava7(list)
    then:
    true
  }


  def"For Each java8"(){
    given:
    CollectionService collectionService = new CollectionServiceImpl()
    List<String> list = ['1','2','3','4','5','6']
    when:
    collectionService.forEachJava8(list)
    then:
    true
  }

}
