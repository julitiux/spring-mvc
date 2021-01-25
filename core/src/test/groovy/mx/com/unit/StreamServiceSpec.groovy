package mx.com.unit

import mx.com.service.StreamService
import mx.com.service.StreamServiceImpl
import spock.lang.Specification

class StreamServiceSpec extends Specification {

  def "Unit Test Sort"() {
    given:
    List<String> list = _list
    StreamService service = new StreamServiceImpl()
    when:
    println "Before ${list}"
    list = service.filter(list)
    println "After ${list}"
    then:
    list == _ressult
    where:
    _list                                         | _ressult
    ['Mexico', 'Moscu', 'Italia', 'Brazil', 'EU'] | ['Mexico', 'Moscu']

  }

}
