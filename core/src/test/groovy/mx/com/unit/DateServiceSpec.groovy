package mx.com.unit


import mx.com.service.DateServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class DateServiceSpec extends Specification {

  @Shared
    service = new DateServiceImpl()

  def "Just execute the implementation of method dateJava7"() {
    expect:
    service.dateJava7()
  }

}
