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

}
