package mx.com.service;

public interface DefaultMethodService {
  public void holaMundo();
  default public void defaulHolaMundo(){
    System.out.println("Hola Inmundo");
  }
}