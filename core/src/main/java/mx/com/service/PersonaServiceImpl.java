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
    return list;
  }

  @Override
  public List<Persona> transformer(List<Persona> list) {
    return list;
  }

  @Override
  public List<Persona> limiter(List<Persona> list) {
    return list;
  }
}
