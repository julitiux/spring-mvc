package mx.com.unit


import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification

import java.time.LocalDate

class DateServiceSpec extends Specification {

  @Shared
    service = new DateServiceImpl()

  def "Just execute the implementation of method dateJava7"() {
    expect:
    service.dateJava7()
  }

  def "Implement a test of LocalDate function"() {
    given:
    LocalDate startDate = LocalDate.of(1984,5,19)
    LocalDate endDate = LocalDate.now();
    expect:
    !startDate.isAfter(endDate)
  }

}
