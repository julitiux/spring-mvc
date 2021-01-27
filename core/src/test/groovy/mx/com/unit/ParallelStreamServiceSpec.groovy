package mx.com.unit

import mx.com.service.ParallelStreamService
import mx.com.service.ParallelStreamServiceImpl
import spock.lang.Specification

class ParallelStreamServiceSpec extends Specification {

  def "Unit test of forEach without parallels functions"() {
    given:
    ParallelStreamService service = new ParallelStreamServiceImpl()
    List<String> list = _list
    when:
    service.testStream(list)
    then:
    true
    where:
    _list << [['1', '2', '3', '4', '5', '6', '7', '8', '9', '10']]

  }
}
