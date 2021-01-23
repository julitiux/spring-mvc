package mx.com.service;

public class FunctionalInterfaceServiceImpl implements FunctionalInterfaceService{

  @Override
  public void process() {
    System.out.println("Estas clases estan limitadas hacer referencia a un solo metodo ");
  }

}
