package mx.com.service;

import java.util.Map;
import java.util.stream.Collectors;

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
  public Map<Integer, String> collect_v1(Map<Integer, String> map, String value) {
    return map.entrySet().stream()
      .filter( entry -> entry.getValue().contains(value) )
      .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
  }

  @Override
  public Map<Integer, String> collect_v2(Map<Integer, String> map, String value) {
    return map.entrySet().stream()
      .filter( entry -> entry.getValue().contains(value) )
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }

  @Override
  public Map<Integer, String> insertIfAbsent(Map<Integer, String> map, Integer key, String value) {
    map.putIfAbsent(key, value);
    return map;
  }

  @Override
  public Map<Integer, String> operateIfPresent(Map<Integer, String> map, Integer key, String value) {
    map.computeIfPresent(key, (k, v) -> value);
    return map;
  }

  @Override
  public String getOrDefault(Map<Integer, String> map, Integer key) {
    return map.getOrDefault(key, "Don't has value");
  }
}
