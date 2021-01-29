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

  public void example1(){
    MethodReferenceService instance = () -> MethodReferenceServiceImpl.referenceMethodStatic();
    instance.saidHello();
  }




}
