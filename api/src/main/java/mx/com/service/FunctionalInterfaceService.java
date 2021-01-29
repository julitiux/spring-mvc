package mx.com.service;

@FunctionalInterface
public interface FunctionalInterfaceService {
//  Es aquella que define solo una implementacion, Java lo presenta con la anotacion FunctionalInterface. Basicamente no puedes colocar dos metodos en la interface
  public void process();
}
