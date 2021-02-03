package mx.com.unit

import mx.com.service.MapService
import mx.com.service.MapServiceImpl
import spock.lang.Specification

class MapServiceSpec extends Specification {

  def"Implementation a unit test of print a map"(){
    given:
    Map map = [1:'uno', 2:'dos', 3:'tres', 4:'cuatro', 5:'cinco']
    MapService service = new MapServiceImpl()
    expect:
    service.printJava7(map);
  }

}
