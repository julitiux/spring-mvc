package mx.com.unit

import spock.lang.Specification

class StreamServiceSpec extends Specification {

  def"Test"(){
    given:
    String oneVariable
    when:
    //Execyte something
    oneVariable = 'Assagment a string value'
    then:
    //Something happend
    println oneVariable
//    where:
//    just variables


  }

}
