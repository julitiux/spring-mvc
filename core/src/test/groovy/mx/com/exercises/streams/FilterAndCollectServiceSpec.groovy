package mx.com.exercises.streams


import mx.com.exercises.streams.services.FilterAndCollectServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class FilterAndCollectServiceSpec extends Specification {

  @Shared
    service = new FilterAndCollectServiceImpl()

  def ""() {
    given:
    List<String> stringList = ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez']
    List<String> response = []
    when:
    response = service.filterStartWith(stringList, 'u')
    then:
    response
  }


}
