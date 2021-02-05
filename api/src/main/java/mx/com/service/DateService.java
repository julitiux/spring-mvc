package mx.com.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;

public interface DateService {
  public void dateJava7();
  public Boolean comparteTwoDatesInJava8(LocalDate startDate, LocalDate endDate);
  public Boolean comparteTwoTimesInJava8(LocalTime startTime, LocalTime endTime);
  public Boolean comparteTwoDateTimesInJava8(LocalDateTime startDateTime, LocalDateTime endDateTime);

  public Integer countYearsJava7(Calendar starCalendar, Calendar endCalendar);
  public Period countYearsJava8(LocalDate dateStart, LocalDate dateEnd);
}
