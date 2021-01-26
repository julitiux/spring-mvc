package mx.com.unit

import mx.com.domain.Persona
import mx.com.service.PersonaService
import mx.com.service.PersonaServiceImpl
import spock.lang.Specification

class PersonaServiceSpec extends Specification {

  List<Persona> _personaList = [
    new Persona([nombre         : 'Julio',
                 apellidoPaterno: 'apellidoPaterno',
                 apellidoMaterno: 'apellidoMaterno',
                 correo         : 'correo@gmail.com']),
    new Persona([nombre         : 'Marcos',
                 apellidoPaterno: 'apellidoPaterno',
                 apellidoMaterno: 'apellidoMaterno',
                 correo         : 'correo@gmail.com']),
    new Persona([nombre         : 'Guillermo',
                 apellidoPaterno: 'apellidoPaterno',
                 apellidoMaterno: 'apellidoMaterno',
                 correo         : 'correo@gmail.com'])
  ]


  def ""() {
    given:
    List<Persona> personaList = _personaList
    List<Persona> response
    PersonaService service = new PersonaServiceImpl()
    when:
    response = service.filter(personaList)
    then:
    response.size() == 1
  }

}
