package mx.com.exercises.streams

import mx.com.exercises.streams.services.FilterAndCollectServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class FilterAndCollectServiceSpec extends Specification {

  @Shared
    service = new FilterAndCollectServiceImpl()

  def "Using a list with stream filter start with #_filter in the list #_stringList"() {
    given:
    List<String> stringList = _stringList
    List<String> response = []
    String filter = _filter
    when:
    response = service.filterStartWith(stringList, filter)
    then:
    response == _response
    where:
    _stringList                                                                         | _filter | _response
    []                                                                                  | ''      | []
    []                                                                                  | null    | []
    []                                                                                  | 'z'     | []
    ['1', '2', '3', '4', '5', '6', '7', '8', '9']                                       | '1'     | ['1']
    ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez'] | 'u'     | ['uno']
    ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez'] | 'c'     | ['cuatro', 'cinco']
  }


}
