package mx.com.unit

import mx.com.service.JavaRxServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class JavaRxServiceSpec extends Specification {

  @Shared
  service = new JavaRxServiceImpl()
  @Shared
  List<String> list1 = ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez']
  @Shared
  List<String> list2 = ['unow', 'dosw', 'tresw', 'cuatrow', 'cincow', 'seisw', 'sietew', 'ochow', 'nuevew', 'diezw']

  def"Implementation unit test of the method observableRx"(){
    expect:
    service.observableRx(list1)
  }

  def"Implementation unit test of the method observableRx with two lists"(){
    expect:
    service.observableRx(list1,list2,'o')
  }

}
