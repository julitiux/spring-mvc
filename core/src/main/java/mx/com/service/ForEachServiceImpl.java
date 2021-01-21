package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ForEachServiceImpl implements ForEachService {

  @Override
  public Map<String, Integer> loopAMap() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("A",10);
    map.put("B",20);
    map.put("C",30);
    map.put("D",40);
    map.put("E",50);
    map.put("F",60);
    for(Map.Entry<String, Integer> entry: map.entrySet()){
      System.out.println("Key: " + entry.getKey() + " value " + entry.getValue());
    }
    return map;
  }
}
