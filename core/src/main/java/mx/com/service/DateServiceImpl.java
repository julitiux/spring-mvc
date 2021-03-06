package mx.com.service;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

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

  @Override
  public Period countYearsJava8(LocalDate dateStart, LocalDate dateEnd) {
    return Period.between(dateStart, dateEnd);
  }

  @Override
  public Date convertStringToDateJava7(String dateString) throws ParseException {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return dateFormat.parse(dateString);
  }

  @Override
  public String formatDateJava7(Date date) {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
    return dateFormat.format(date);
  }

  @Override
  public LocalDate convertStringToDateJava8(String dateString) throws ParseException {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return LocalDate.parse(dateString, dateTimeFormatter);
  }

  @Override
  public String formatDateJava8(String dateString, String patterDate, String formatter) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
    dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
    return dateTimeFormatter.format(localDate);
  }

}
