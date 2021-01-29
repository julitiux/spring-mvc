package mx.com.service;

import mx.com.domain.Persona;
import mx.com.domain.User;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceServiceImpl {

  public static void referenceMethodStatic(){
    System.out.println("I just said Hello");
  }

  //Anonymous Function
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

  //Expresion lambda
  public String[] referenceMethodInstanceObjectRandom2(){
    String[] numbers = {"uno","dos","tres"};
    Arrays.sort(numbers, (o1,o2) -> o1.compareTo(o2));
    return numbers;
  }

  //With method reference
  public String[] referenceMethodInstanceObjectRandom3(){
    String[] numbers = {"uno","dos","tres"};
    Arrays.sort(numbers, String::compareTo);
    return numbers;
  }

  public void sayHi(){
    System.out.println("Hola INHUMAN");
  }

  public void referenceMethodInstanceObjectSingular(){
    MethodReferenceServiceImpl instance = new MethodReferenceServiceImpl();
    MethodReferenceService inst = instance::sayHi;
    inst.saidHello();
  }

  public User referenceConstructor1(Long id, String username){
    UserService interfaceUser = new UserService() {
      @Override
      public User crear(Long id, String username) {
        return new User(id, username);
      }
    };
    return interfaceUser.crear(id, username);
  }

  public void referenceConstructor2(){
  }

  public void referenceConstructor3(){
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
