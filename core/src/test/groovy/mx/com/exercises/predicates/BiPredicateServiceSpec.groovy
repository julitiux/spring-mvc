package mx.com.exercises.predicates

import mx.com.exercises.predicates.services.BiPredicateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BiPredicateServiceSpec extends Specification {

  @Shared
    service = new BiPredicateServiceImpl()

  def "unit test using a biPredicate #_string | #_size | #_response"() {
    given:
    String string = _string
    Integer size = _size
    Boolean response
    when:
    response = service.isTheSameSize(_string, size)
    then:
    response == _response
    where:
    _string | _size | _response
    "julio" | 5     | true
    "julio" | 4     | false
    "java"  | 4     | true
    "java"  | 3     | false

  }

}
