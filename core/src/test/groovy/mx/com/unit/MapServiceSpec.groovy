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

  def "Implementation a unit test of method computeIfPresent using #_map | #_response "() {
    given:
    Map map = _map
    Integer key = _key
    String value = _value
    Map reponse
    MapService service = new MapServiceImpl()
    when:
    reponse = service.operateIfPresent(map, key, value);
    then:
    reponse == _response

    where:
    _map                  | _key | _value      | _response
    [1: 'uno']            | 1    | null        | [:]
    [1: 'uno', 3: 'tres'] | 1    | null        | [3: 'tres']
    [1: 'uno', 3: 'tres'] | 3    | "tres tres" | [1: 'uno', 3: 'tres tres']

  }

  def "Implementation a unit test of method getOrDefault using #_map | #_response "() {
    given:
    Map map = _map
    Integer key = _key
    String reponse
    MapService service = new MapServiceImpl()
    when:
    reponse = service.getOrDefault(map, key);
    then:
    reponse == _response

    where:
    _map                  | _key | _response
    [1: 'uno']            | 1    | "uno"
    [1: 'uno', 3: 'tres'] | 1    | "uno"
    [1: 'uno', 3: 'tres'] | 3    | "tres"
    [1: 'uno', 3: 'tres'] | 2    | "Don't has value"
    [:]                   | 1    | "Don't has value"
    [:]                   | 100  | "Don't has value"

  }


  def "Implementation a unit test of method collect_v1 using #_map | #_response "() {
    given:
    Map map = _map
    String value = _value
    Map reponse
    MapService service = new MapServiceImpl()
    when:
    reponse = service.collect_v1(map, value);
    then:
    reponse == _response

    where:
    _map                                                     | _value | _response
    [:]                                                      | 'any'  | [:]
    [1: 'uno', 3: 'tres']                                    | 'dos'  | [:]
    [1: 'uno']                                               | 'uno'  | [1: 'uno']
    [1: 'uno']                                               | 'un'   | [1: 'uno']
    [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco'] | 'o'    | [1: 'uno', 2: 'dos', 4: 'cuatro', 5: 'cinco']
  }

  def "Implementation a unit test of method collect_v2 using #_map | #_response "() {
    given:
    Map map = _map
    String value = _value
    Map reponse
    MapService service = new MapServiceImpl()
    when:
    reponse = service.collect_v2(map, value);
    then:
    reponse == _response

    where:
    _map                                                     | _value | _response
    [:]                                                      | 'any'  | [:]
    [1: 'uno', 3: 'tres']                                    | 'dos'  | [:]
    [1: 'uno']                                               | 'uno'  | [1: 'uno']
    [1: 'uno']                                               | 'un'   | [1: 'uno']
    [1: 'uno', 2: 'dos', 3: 'tres', 4: 'cuatro', 5: 'cinco'] | 'o'    | [1: 'uno', 2: 'dos', 4: 'cuatro', 5: 'cinco']
  }

}
