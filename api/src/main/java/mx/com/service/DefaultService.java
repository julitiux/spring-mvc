package mx.com.service;

public interface DefaultService {
  public void holaMundo();
  default public void defaulHolaMundo(){
    System.out.println("Hola Inmundo");
  }
}
