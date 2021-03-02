package mx.com.exercises.suppliers

import mx.com.exercises.suppliers.services.SuplierServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class SuplierServiceSpec extends Specification {

  @Shared
    service = new SuplierServiceImpl()

  def ""() {
    expect:
    service.nowDateFormat()
  }

}
