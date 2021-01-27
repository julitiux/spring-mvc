package mx.com.service;

public interface OptionalService {
  public void test(String value);
  public String orElse(String value);
  public String orElseThrow(String value);
  public String idPresent(String value);
}
