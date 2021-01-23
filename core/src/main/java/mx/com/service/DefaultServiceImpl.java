package mx.com.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultServiceImpl implements DefaultService {

  @Override
  public void holaMundo() {
    System.out.println("Hola Inmundo");
  }

}
