package mx.com.unit

import mx.com.service.HighOrderServiceImpl
import spock.lang.Shared
import spock.lang.Specification

class HighOrderServiceSpec extends Specification{

  @Shared service = new HighOrderServiceImpl()

  def"Implement unit test with high order"(){
    given:
    String string = _string
    expect:
    service.print(service.convertToUpperCase, string)
    where:
    _string << ["Hola Inmundo"]
  }

}
