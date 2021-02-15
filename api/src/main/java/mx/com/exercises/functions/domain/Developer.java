package mx.com.exercises.functions.domain;

import java.math.BigDecimal;

public class Developer {
  String username;
  BigDecimal salary;

  public Developer(String username, BigDecimal salary) {
    this.username = username;
    this.salary = salary;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
}
