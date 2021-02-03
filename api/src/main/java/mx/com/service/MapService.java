package mx.com.service;

import java.util.Map;

public interface MapService {
  public Map<Integer, String> printJava7(Map<Integer, String> map);
  public Map<Integer, String> printJava8(Map<Integer, String> map);
  public Map<Integer, String> collect(Map<Integer, String> map);
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map);
  public Map<Integer, String> operateIfPresent();
}
