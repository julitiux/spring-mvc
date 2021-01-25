package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreamServiceImpl implements StreamService{
  @Override
  public List<String> filter(List<String> list) {
    return list.stream().filter(x -> x.startsWith("M")).collect(Collectors.toList());
  }

  @Override
  public List<String> sorter(List<String> list) {
    return list;
  }

  @Override
  public List<String> transformer(List<String> list) {
    return list;
  }

  @Override
  public List<String> limiter(List<String> list) {
    return list;
  }

  @Override
  public List<String> counter(List<String> list) {
    return list;
  }
}
