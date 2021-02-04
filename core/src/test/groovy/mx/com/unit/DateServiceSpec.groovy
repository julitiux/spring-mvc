package mx.com.unit


import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate

@Unroll
class DateServiceSpec extends Specification {

  @Shared
    service = new DateServiceImpl()

  def "Just execute the implementation of method dateJava7"() {
    expect:
    service.dateJava7()
  }

  def "Implement a test unit of the method comparteTwoDatesInJava8"() {
    given:
    LocalDate startDate = _startDate
    LocalDate endtDate = _endDate
    Boolean response
    when:
    response = service.comparteTwoDatesInJava8(startDate, endtDate)
    then:
    response == _response
    where:
    _startDate                 | _endDate                   | _response
    LocalDate.of(19984, 5, 19) | LocalDate.now()            | false
    LocalDate.now()            | LocalDate.of(19984, 5, 19) | true
    LocalDate.now()            | LocalDate.now()            | false
    LocalDate.MAX              | LocalDate.MIN              | false
    LocalDate.MIN              | LocalDate.MAX              | true
  }

  def "Same test before but using expect"() {
    given:
    LocalDate startDate = _startDate
    LocalDate endDate = _endDate
    expect:
    startDate.isBefore(endDate) == _response
    where:
    _startDate                 | _endDate                   | _response
    LocalDate.of(19984, 5, 19) | LocalDate.now()            | false
    LocalDate.now()            | LocalDate.of(19984, 5, 19) | true
    LocalDate.now()            | LocalDate.now()            | false
    LocalDate.MAX              | LocalDate.MIN              | false
    LocalDate.MIN              | LocalDate.MAX              | true

  }

  def "Implement a test of LocalDate function"() {
    given:
    LocalDate startDate = LocalDate.of(1984, 5, 19)
    LocalDate endDate = LocalDate.now();
    expect:
    !startDate.isAfter(endDate)
  }

}
