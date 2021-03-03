package mx.com.exercises.streams

import mx.com.exercises.streams.services.FilterAndCollectServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FilterAndCollectServiceSpec extends Specification {

  @Shared
    service = new FilterAndCollectServiceImpl()

  def ""() {
    given:
    List<String> stringList = _stringList
    List<String> response = []
    String filter = _filter
    when:
    response = service.filterStartWith(stringList, filter)
    then:
    println response
    response == _response
    where:
    _stringList                                                                         | _filter | _response
    ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez'] | 'u'     | ['uno']
    []                                                                                  | 'z'     | []

  }


}
