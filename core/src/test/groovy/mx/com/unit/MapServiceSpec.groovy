package mx.com.unit

import mx.com.service.MapService
import mx.com.service.MapServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class MapServiceSpec extends Specification {

  def "Implementation a unit test of print a map"() {
    given:
    Map map = [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco']
    MapService service = new MapServiceImpl()
    expect:
    service.printJava7(map);
  }

  def "Implementation a unit test of print a map with Java8 BiConsumer"() {
    given:
    Map map = [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco']
    MapService service = new MapServiceImpl()
    expect:
    service.printJava8(map);
  }

  def "Implementation a unit test of print a map with Java8 Consumer"() {
    given:
    Map map = [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco']
    MapService service = new MapServiceImpl()
    expect:
    service.printJava8_1(map);
  }


  def "Implementation a unit test of method putIfAbsent using #_map | #_response "() {
    given:
    Map map = _map
    Integer key = _key
    String value = _value
    Map reponse
    MapService service = new MapServiceImpl()
    when:
    reponse = service.insertIfAbsent(map, key, value);
    then:
    reponse == _response

    where:
    _map                                                     | _key | _value    | _response
    [1: 'uno', 3: 'tres']                                    | 2    | 'dos dos' | [1: 'uno', 3: 'tres', 2: 'dos dos']
    [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco'] | 5    | null      | [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco']

  }


}
