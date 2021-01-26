package mx.com.service;

import mx.com.domain.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements PersonaService {

  @Override
  public List<Persona> filter(List<Persona> list) {
    return list.stream().filter(persona -> persona.getNombre().startsWith("J")).collect(Collectors.toList());
  }

  @Override
  public List<Persona> sorter(List<Persona> list) {
    return list.stream().sorted((x, y) -> x.getNombre().compareTo(y.getNombre())).collect(Collectors.toList());
  }

  @Override
  public List<Persona> transformer(List<Persona> list) {
    return list.stream().map(personaTemporal -> {
      Persona persona = new Persona();
      persona.setNombre(personaTemporal.getNombre().toUpperCase());
      persona.setApellidoPaterno(personaTemporal.getApellidoPaterno().toUpperCase());
      persona.setApellidoMaterno(personaTemporal.getApellidoMaterno().toUpperCase());
      persona.setCorreo(personaTemporal.getCorreo().toUpperCase());
      return persona;
    }).collect(Collectors.toList());
  }

  @Override
  public List<Persona> limiter(List<Persona> list) {
    return list.stream().limit(2).collect(Collectors.toList());
  }
}
