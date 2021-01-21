package mx.com.unit

import spock.lang.Specification

class TestSpock extends Specification {

  def ""() {
    given:
    Long prueba = 12345
    String cadenaDeJava8 = ""
    Long theNewLong
    when:
    cadenaDeJava8 = cadenaDeJava8.valueOf(prueba)
    theNewLong = Long.parseLong(cadenaDeJava8)
    println Float.parseFloat("4.9").getClass()
    then:
    println "Pero la cadena se matiene con su valor normal ${cadenaDeJava8}"
    println "El nuevo Long ${theNewLong}"
    println "${theNewLong.getClass()}"
    println "*" * 30
  }

}