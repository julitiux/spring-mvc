package mx.com.exercises.suppliers.services;

import mx.com.exercises.suppliers.SuplierService;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SuplierServiceImpl implements SuplierService {

  Supplier<LocalDateTime> now = () -> LocalDateTime.now();

  @Override
  public void nowDateFormat() {
    System.out.println(now.get());
  }

}
