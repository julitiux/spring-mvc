package mx.com.exercises.functions

import mx.com.exercises.domain.Developer
import mx.com.exercises.functions.services.BinaryOperatorServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class BinaryOperatorServiceSpec extends Specification {

  @Shared
    service = new BinaryOperatorServiceImpl()

  def "unit test of BinaryFunction making a add"() {
    given:
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    Integer response
    when:
    response = service.addTwoNumbers(firstNumber, secondNumber)
    then:
    response == _response
    where:
    _firstNumber | _secondNumber | _response
    1            | 2             | 3
    1000         | 1000          | 2000

  }


  def "Find a Developer using the method findMaxSalary, too much code for a search in java"() {
    given:
    List<Developer> list = [new Developer('uno', 11000.0),
                            new Developer('dos', 20000.0),
                            new Developer('tres', 31000.0),
                            new Developer('cuatro', 41000.0),
                            new Developer('cinco', 51000.0)]
    Developer response
    when:
    response = service.findMaxSalary(list)
    then:
    response.salary == 51000.0
  }

}
