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
  public void printJava8(Map<Integer, String> map) {
    map.forEach((k, v) -> System.out.println("key: " + k + " Value:" + v));
  }

  @Override
  public void printJava8_1(Map<Integer, String> map) {
    map.entrySet().forEach(System.out::println);
  }

  @Override
  public Map<Integer, String> collect(Map<Integer, String> map) {
    return null;
  }

  @Override
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map, Integer key, String value) {
    map.putIfAbsent(key, value);
    return map;
  }

  @Override
  public Map<Integer, String> operateIfPresent(Map<Integer, String> map, Integer key, String value) {
    map.computeIfPresent(key, (k, v) -> k + v);
    return map;
  }
}
