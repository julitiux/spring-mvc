package mx.com.exercises.predicates

import mx.com.exercises.predicates.domain.Domain
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

  @Shared
    domainList = [new Domain("google.com", 1),
                  new Domain("i-am-spammer.com", 10),
                  new Domain("github.com", 0),
                  new Domain("microsoft.com", 2)]

  def "unit test using a biPredicate with a parameter"() {
    given:
    List<Domain> response = []
    when:
    response = service.isCorrectTheDomain(domainList, _lambda)
    then:
    response == _response
    where:
    _lambda                                                  | _response
    service.isCorrectUrl                                     | domainList.findAll { it.name.equalsIgnoreCase("google.com") || it.score == 0 }
    { domain, score -> score == 0 }                          | domainList.findAll { it.score == 0 }
    { domain, score -> domain.startsWith("i") && score > 5 } | domainList.findAll { it.name.startsWith("i") && it.score > 5 }

  }

}
