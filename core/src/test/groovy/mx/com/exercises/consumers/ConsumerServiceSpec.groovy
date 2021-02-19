package mx.com.exercises.consumers

import mx.com.exercises.consumers.services.ConsumerServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class ConsumerServiceSpec extends Specification {

  @Shared
    service = new ConsumerServiceImpl()

  @Shared
  List<String> list = ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez']

  def "test that Consumer in a normal forEach with a expression lambda"() {
    expect:
    service.outPrintln(list)
  }

  def "test that implement a Consumer with a Consumer print"() {
    expect:
    service.usingAConsumer(list)
  }

}
