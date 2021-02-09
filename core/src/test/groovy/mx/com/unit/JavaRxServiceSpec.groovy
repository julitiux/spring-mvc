package mx.com.unit

import mx.com.service.JavaRxServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class JavaRxServiceSpec extends Specification {

  @Shared
  service = new JavaRxServiceImpl()

  def"Implementation unit test of the method observableRx"(){
    given:
    List<String> list = ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez']
    expect:
    service.observableRx(list)
  }
}
