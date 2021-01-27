package mx.com.service;

public interface OptionalService {
  public void test(String value);
  public String orElse(String value);
  public void orElseThrow(String value);
  public Boolean isPresent(String value);
}
