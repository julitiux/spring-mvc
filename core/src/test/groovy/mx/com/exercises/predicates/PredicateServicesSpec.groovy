package mx.com.exercises.predicates

import mx.com.exercises.predicates.services.PredicateServicesImpl
import spock.lang.Shared
import spock.lang.Specification

class PredicateServicesSpec extends Specification {

  @Shared
    service = new PredicateServicesImpl()

  @Shared
  List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]


  def "Filter with a predicate"() {
    given:
    List<Integer> response = []
    when:
    response = service.predicate(integerList)
    then:
    response == integerList.findAll { it >= 5 }
  }

  def "Filter with a predicate majorOrEqualsThanFive"() {
    given:
    List<Integer> response = []
    when:
    response = service.predicateFilter(integerList)
    then:
    response == integerList.findAll { it >= 5 }
  }

  def "Filter with a predicate majorThanFiveAndMinorThanTen"() {
    given:
    List<Integer> response = []
    when:
    response = service.predicateFilterAndAnd(integerList)
    then:
    response == integerList.findAll { it > 5 && 10 < it }
  }

}
