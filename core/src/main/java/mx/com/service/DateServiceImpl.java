package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class DateServiceImpl implements DateService {

  @Override
  public void dateJava7() {
    Calendar fecha1 = Calendar.getInstance();
    Calendar fecha2 = Calendar.getInstance();
    fecha1.set(1990, 5, 19);
    System.out.println(fecha1.after(fecha2));
  }

}
