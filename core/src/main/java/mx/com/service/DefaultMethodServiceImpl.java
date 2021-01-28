package mx.com.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultMethodServiceImpl implements DefaultMethodService {

  @Override
  public void holaMundo() {
    System.out.println("Hola Inmundo");
  }

}
