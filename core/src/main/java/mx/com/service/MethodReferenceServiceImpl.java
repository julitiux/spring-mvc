package mx.com.service;

public class MethodReferenceServiceImpl {

  public static void referenceMethodStatic(){
    System.out.println("I just said Hello");
  }

  public void referenceMethodInstanceObjectRandom(){
  }

  public void referenceMethodInstanceObjectSingular(){
  }

  public void referenceConstructor(){
  }

  //Los metodos referenciados no pueden enviar parametros

  public void example1ReferenceMethodStatic(){
    //with a expresion lambda
    //Name of the class . name of the method
    MethodReferenceService instance = () -> MethodReferenceServiceImpl.referenceMethodStatic();
    instance.saidHello();
  }

  public void example2ReferenceMethodStatic(){
    //deleting expresion lambda
    //Name of the class :: name of the method
    MethodReferenceService instance = MethodReferenceServiceImpl::referenceMethodStatic;
    instance.saidHello();
  }




}
