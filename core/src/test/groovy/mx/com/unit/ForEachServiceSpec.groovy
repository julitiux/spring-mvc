package mx.com.unit

import mx.com.service.ForEachService
import mx.com.service.ForEachServiceImpl
import spock.lang.Specification

class ForEachServiceSpec extends Specification {

  def "ForEachService.loopAMap"() {
    given:
    ForEachService intance = new ForEachServiceImpl()
    when:
    Map map = intance.loopAMap()
    println map
    then:
    map
  }

}
