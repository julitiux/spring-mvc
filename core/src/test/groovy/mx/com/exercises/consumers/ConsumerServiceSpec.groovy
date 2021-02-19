package mx.com.exercises.consumers

import mx.com.exercises.consumers.services.ConsumerServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class ConsumerServiceSpec extends Specification {

  @Shared
    service = new ConsumerServiceImpl()

  @Shared
  List<String> stringList = ['uno', 'dos', 'tres', 'cuatro', 'cinco', 'seis', 'siete', 'ocho', 'nueve', 'diez']

  @Shared
  List<Integer> integerList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  def "test that Consumer in a normal forEach with a expression lambda"() {
    expect:
    service.outPrintln(stringList)
  }

  def "test that implement a Consumer with a Consumer print"() {
    expect:
    service.usingAConsumer(stringList)
  }

  def "test that implement a Consumer with a function that recive a List of Integers"() {
    expect:
    service.usingAConsumerWithAInteger(integerList)
  }

}
