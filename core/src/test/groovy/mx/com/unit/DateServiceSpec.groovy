package mx.com.unit


import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate
import java.time.LocalDateTime
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

  def "Test unit#_startTime isBefore #_endTime is #_responseIsBefore"() {
    given:
    LocalTime startTime = _startTime
    LocalTime endTime = _endTime
    expect:
    startTime.isBefore(endTime) == _responseIsBefore
    where:
    _startTime             | _endTime               | _responseIsBefore
    LocalTime.of(1, 50, 0) | LocalTime.now()        | true
    LocalTime.now()        | LocalTime.of(1, 50, 0) | false
    LocalTime.now()        | LocalTime.now()        | true
    LocalTime.MAX          | LocalTime.MIN          | false
    LocalTime.MIN          | LocalTime.MAX          | true
  }

  def "Test unit#_startTime isAfter #_endTime is #_responseIsAfter"() {
    given:
    LocalTime startTime = _startTime
    LocalTime endTime = _endTime
    expect:
    startTime.isAfter(endTime) == _responseIsAfter
    where:
    _startTime             | _endTime               | _responseIsAfter
    LocalTime.of(1, 50, 0) | LocalTime.now()        | false
    LocalTime.now()        | LocalTime.of(1, 50, 0) | true
    LocalTime.now()        | LocalTime.now()        | false
    LocalTime.MAX          | LocalTime.MIN          | true
    LocalTime.MIN          | LocalTime.MAX          | false
  }

  def "Implement a test unit of the method comparteTwoDateTimesInJava8 #_startDateTime isBefore #_endDateTime is #_response"() {
    given:
    LocalDateTime startDateTime = _startDateTime
    LocalDateTime endDateTime = _endDateTime
    Boolean response
    when:
    response = service.comparteTwoDateTimesInJava8(startDateTime, endDateTime)
    then:
    response == _response
    where:
    _startDateTime                          | _endDateTime                            | _response
    LocalDateTime.of(1984, 5, 19, 1, 50, 0) | LocalDateTime.now()                     | true
    LocalDateTime.now()                     | LocalDateTime.of(1984, 5, 19, 1, 50, 0) | false
    LocalDateTime.now()                     | LocalDateTime.now()                     | true
    LocalDateTime.MAX                       | LocalDateTime.MIN                       | false
    LocalDateTime.MIN                       | LocalDateTime.MAX                       | true
  }

}
