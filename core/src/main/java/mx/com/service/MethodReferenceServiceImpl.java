package mx.com.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceServiceImpl {

  public static void referenceMethodStatic(){
    System.out.println("I just said Hello");
  }

  public String[] referenceMethodInstanceObjectRandom1(){
    String[] numbers = {"uno","dos","tres"};
    Arrays.sort(numbers, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    return numbers;
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
