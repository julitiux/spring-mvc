package mx.com.exercises.predicates

import mx.com.exercises.predicates.domain.Hosting
import mx.com.exercises.predicates.services.PredicateServicesImpl
import spock.lang.Shared
import spock.lang.Specification

class PredicateServicesSpec extends Specification {

  @Shared
    service = new PredicateServicesImpl()

  @Shared
  List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

  @Shared
  List<String> stringList = ["AAA", "AA", "AAAA", "AAAAAAA", "ZZZ", "Z", "ZZZZ", "ZAAAZAZA"]


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

  def "Filter with a predicate lengthEqualsThree and startWithZ"() {
    given:
    List<String> response = []
    when:
    response = service.predicateFilterAndOr(stringList)
    then:
    response == stringList.findAll { it.length() == 3 && it.startsWith("Z") }
  }

  def "Filter with a predicate predicateFilterAndNegate"() {
    given:
    List<String> response = []
    when:
    response = service.predicateFilterAndNegate(stringList)
    then:
    response == stringList.findAll { !it.startsWith("Z") }
  }

  def "Filter with a predicate test"() {
    given:
    List<String> response = []
    when:
    response = service.predicateTest(stringList)
    then:
    response == stringList.findAll { it.startsWith("A") }
  }

  @Shared
  List<Hosting> hostingList = [
    new Hosting(1L, "Amazon", "aws.amazon.com"),
    new Hosting(2L, "Linode", "linode"),
    new Hosting(3L, "Liquidweb", "liquidweb.com"),
    new Hosting(4L, "google", "google.com"),
  ]


  def "Filter with hosting Repository.filter send the lambda"() {
    given:
    List<Hosting> response = []
    when:
    response = service.filterHosting(hostingList)
    then:
    response == hostingList.findAll { it.name.startsWith("A") }
  }

  def "Filter with hosting Repository.filter send by the method"() {
    given:
    List<Hosting> response = []
    when:
    response = service.filterHostingFriendly(hostingList)
    then:
    response == hostingList.findAll { it.name.startsWith("A") }
  }

}
