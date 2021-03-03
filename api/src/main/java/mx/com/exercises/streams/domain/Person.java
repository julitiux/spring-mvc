package mx.com.exercises.streams.domain;

public class Person {

  String name;
  String username;
  Integer age;

  public Person(String name, String username, Integer age) {
    this.name = name;
    this.username = username;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
