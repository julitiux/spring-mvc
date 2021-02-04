package mx.com.unit


import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate
import java.time.LocalTime

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

  def "Implement a test unit of the method comparteTwoTimesInJava8 #_startTime isBefore #_endTime"() {
    given:
    LocalTime startTime = _startTime
    LocalTime endTime = _endTime
    Boolean response
    when:
    response = service.comparteTwoTimesInJava8(startTime, endTime)
    then:
    response == _response
    where:
    _startTime             | _endTime               | _response
    LocalTime.of(1, 50, 0) | LocalTime.now()        | true
    LocalTime.now()        | LocalTime.of(1, 50, 0) | false
    LocalTime.now()        | LocalTime.now()        | true
    LocalTime.MAX          | LocalTime.MIN          | false
    LocalTime.MIN          | LocalTime.MAX          | true
  }

  def "Test unit#_startTime isBefore #_endTime"() {
    given:
    LocalTime startTime = _startTime
    LocalTime endTime = _endTime
    expect:
    startTime.isBefore(endTime) == _responseIsBefore
    startTime.isAfter(endTime) == _responseIsAfter
    where:
    _startTime             | _endTime               | _responseIsBefore | _responseIsAfter
    LocalTime.of(1, 50, 0) | LocalTime.now()        | true              | false
    LocalTime.now()        | LocalTime.of(1, 50, 0) | false             | true
    LocalTime.now()        | LocalTime.now()        | true              | false
    LocalTime.MAX          | LocalTime.MIN          | false             | true
    LocalTime.MIN          | LocalTime.MAX          | true              | false
  }

}
