package mx.com.unit

import mx.com.service.BiFunctionService
import mx.com.service.BiFunctionServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class BiFunctionServiceSpec extends Specification {

  @Unroll
  def "BiFunction Lambdas Test #_firstNumber #_secondNumber #_result"() {
    given:
    BiFunctionService biFunctionService = new BiFunctionServiceImpl();
    Integer firstNumber = _firstNumber
    Integer secondNumber = _secondNumber
    when:
    Integer result = biFunctionService.firstExample(firstNumber, secondNumber)
    then:
    result == _result
    where:
    _firstNumber | _secondNumber | _result
    10           | 20            | 30
    1            | 2             | 3
    0            | 0             | 0
  }

  def "ordenar Java7 ordenando listas #_lista de #_result"() {
    given:
    BiFunctionService biFunctionService = new BiFunctionServiceImpl();
    List<String> lista = _lista
//    List<String> lista = Arrays.asList("5", "6", "3", "7", "2");  JAVA7
//    List<String> lista = ["5","6","3","7","2"]   GROOVY
    List<String> listaOrdenanda
    when:
    listaOrdenanda = biFunctionService.ordenarJava7(lista);
    then:
    listaOrdenanda == _result
    where:
    _lista                    | _result
    ["5", "6", "3", "7", "2"] | ["2", "3", "5", "6", "7"]
    ["5"]                     | ["5"]
    []                     | []
  }

  def "ordenar Java8 ordenando listas #_lista de #_result"() {
    given:
    BiFunctionService biFunctionService = new BiFunctionServiceImpl();
    List<String> lista = _lista
    when:
    lista = biFunctionService.ordenarJava7(lista);
    then:
    lista == _result
    where:
    _lista                    | _result
    ["5", "6", "3", "7", "2"] | ["2", "3", "5", "6", "7"]
    ["5"]                     | ["5"]
    []                     | []
  }

}
