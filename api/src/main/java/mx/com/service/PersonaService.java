package mx.com.service;

import mx.com.domain.Persona;

import java.util.List;

public interface PersonaService {
  public List<Persona> filter(List<Persona> list);
  public List<Persona> sorter(List<Persona> list);
  public List<Persona> transformer(List<Persona> list);
  public List<Persona> limiter(List<Persona> list);
}
