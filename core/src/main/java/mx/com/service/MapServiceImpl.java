package mx.com.service;

import java.util.Map;

public class MapServiceImpl implements MapService {

  @Override
  public void printJava7(Map<Integer, String> map) {
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("key: " + entry.getKey() + " Value: " + entry.getValue());
    }
  }

  @Override
  public Map<Integer, String> printJava8(Map<Integer, String> map) {
    return null;
  }

  @Override
  public Map<Integer, String> collect(Map<Integer, String> map) {
    return null;
  }

  @Override
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map) {
    return null;
  }

  @Override
  public Map<Integer, String> operateIfPresent() {
    return null;
  }
}
