package mx.com.service;

import java.util.Map;

public interface MapService {
  public void printJava7(Map<Integer, String> map);
  public Map<Integer, String> printJava8(Map<Integer, String> map);
  public Map<Integer, String> collect(Map<Integer, String> map);
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map);
  public Map<Integer, String> operateIfPresent();
}
