package mx.com.unit

import mx.com.service.StreamService
import mx.com.service.StreamServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class StreamServiceSpec extends Specification {

  @Unroll
  def "Unit Test Sort with array list #_list and result #_result"() {
    given:
    List<String> list = _list
    StreamService service = new StreamServiceImpl()
    when:
    list = service.filter(list)
    then:
    list == _result
    where:
    _list                                         | _result
    ['Mexico', 'Moscu', 'Italia', 'Brazil', 'EU'] | ['Mexico', 'Moscu']

  }

  @Unroll
  def "Unit Test method Stream Sorted with a list #_list and returned _#result"() {
    given:
    List<String> list = _list
    StreamService service = new StreamServiceImpl()
    when:
    println list
    list = service.sorter(list)
    println list
    then:
    list == _result
    where:
    _list                                         | _result
    ['Mexico', 'Moscu', 'Italia', 'Brazil', 'EU'] | ['Brazil', 'EU', 'Italia', 'Mexico', 'Moscu']
  }

  @Unroll
  def "Map method to test unit test"() {
    given:
    List<String> list = _list
    StreamService service = new StreamServiceImpl()
    when:
    println list
    list = service.transformer(list)
    println list
    then:
    list == _result
    where:
    _list                                         | _result
    ['1', '2', '3', '4', '5', '6', '7', '8', '9'] | ['2', '3', '4', '5', '6', '7', '8', '9', '10']
  }

  @Unroll
  def "Map method to limit unit test"() {
    given:
    List<String> list = _list
    StreamService service = new StreamServiceImpl()
    when:
    println list
    list = service.limiter(list)
    println list
    then:
    list == _result
    list.size() == _size
    where:
    _list                                         | _size | _result
    ['1', '2', '3', '4', '5', '6', '7', '8', '9'] | 2     | ['1', '2']
  }


  @Unroll
  def "Map method to limit unit test: #_list has #_size"() {
    given:
    List<String> list = _list
    Long count
    StreamService service = new StreamServiceImpl()
    when:
    count = service.counter(list)
    then:
    count == _size
    where:
    _list                                         | _size
    ['1', '2', '3', '4', '5', '6', '7', '8', '9'] | 9
  }

}
