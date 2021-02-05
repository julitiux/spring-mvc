package mx.com.unit

import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Period

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
    LocalDateTime.MAX                       | LocalDateTime.MIN                       | false
    LocalDateTime.MIN                       | LocalDateTime.MAX                       | true
  }

  def "#_startDateTime isBefore #_endDateTime is #_response"() {
    given:
    LocalDateTime startDateTime = _startDateTime
    LocalDateTime endDateTime = _endDateTime
    expect:
    startDateTime.isBefore(endDateTime) == _response
    where:
    _startDateTime                          | _endDateTime                            | _response
    LocalDateTime.of(1984, 5, 19, 1, 50, 0) | LocalDateTime.now()                     | true
    LocalDateTime.now()                     | LocalDateTime.of(1984, 5, 19, 1, 50, 0) | false
    LocalDateTime.MAX                       | LocalDateTime.MIN                       | false
    LocalDateTime.MIN                       | LocalDateTime.MAX                       | true
  }

  def "Count Years anios java7"() {
    given:
    Calendar startCalendar = _startCalendar
    startCalendar.set(1984, 5, 19)
    Calendar endCalendar = _endCalendar
    Integer response
    when:
    response = service.countYearsJava7(startCalendar, endCalendar)
    then:
    response == _response
    where:
    _startCalendar         | _endCalendar           | _response
    Calendar.getInstance() | Calendar.getInstance() | 36
  }

  def "Count Years anios java8 #_dateStart"() {
    given:
    LocalDate dateStart = _dateStart
    LocalDate dateEnd = _dateEnd
    Period response
    when:
    response = service.countYearsJava8(dateStart, dateEnd)
    then:
    println response.getYears()
    println response.getMonths()
    println response.getDays()
    where:
    _dateStart                | _dateEnd        | _responseAnios | _responseMonths | _responseDays
    LocalDate.of(1984, 5, 19) | LocalDate.now() | 36             | 8               | 17
  }


  def "Convert String date to Dates Java7"() {
    given:
    String date = _stringDate
    Date response
    when:
    response = service.convertStringToDate(date)
    then:
    response == _response
    where:
    _stringDate  | _response
    '19/05/1984' | new Date(84, 04, 19)
  }


}
