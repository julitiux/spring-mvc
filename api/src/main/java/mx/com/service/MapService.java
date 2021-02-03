package mx.com.service;

import java.util.Map;

public interface MapService {
  public void printJava7(Map<Integer, String> map);
  public void printJava8(Map<Integer, String> map);
  public void printJava8_1(Map<Integer, String> map);
  public Map<Integer, String> collect(Map<Integer, String> map);
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map, Integer key, String value);
  public Map<Integer, String> operateIfPresent(Map<Integer, String> map);
}
