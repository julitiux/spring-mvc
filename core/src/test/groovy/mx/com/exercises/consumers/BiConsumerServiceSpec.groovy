package mx.com.exercises.consumers

import mx.com.exercises.consumers.services.BiConsumerServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class BiConsumerServiceSpec extends Specification {

  @Shared
    service = new BiConsumerServiceImpl()

  def "unit test using a BiConsumer with accept"() {
    given:
    Integer integerOne = 1
    Integer integerTwo = 2
    expect:
    service.highOrderFunction(integerOne, integerTwo)
  }

  def "unit test using a BiConsumer like a parameter in another method"() {
    given:
    Integer integerOne = 1
    Integer integerTwo = 2
    expect:
    service.highOrderFunction(integerOne, integerTwo)
  }

}
