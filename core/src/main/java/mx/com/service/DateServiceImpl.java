package mx.com.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

  @Override
  public Boolean comparteTwoDatesInJava8(LocalDate startDate, LocalDate endDate) {
    return startDate.isBefore(endDate);
  }

  @Override
  public Boolean comparteTwoTimesInJava8(LocalTime startTime, LocalTime endTime) {
    return startTime.isBefore(endTime);
  }

  @Override
  public Boolean comparteTwoDateTimesInJava8(LocalDateTime startDateTime, LocalDateTime endDateTime) {
    return startDateTime.isBefore(endDateTime);
  }

  @Override
  public Integer countYearsJava7(Calendar starCalendar, Calendar endCalendar) {
    Integer anios = 0;
    while (starCalendar.before(endCalendar)) {
      starCalendar.add(Calendar.YEAR, 1);
      if (starCalendar.before(endCalendar)) {
        anios++;
      }
    }
    return anios;
  }

}
