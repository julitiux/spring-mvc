package mx.com.service;

import java.util.List;

public interface StreamService {
  public List<String> filter(List<String> list);
  public List<String> sorter(List<String> list);
  public List<String> transformer(List<String> list);
  public List<String> limiter(List<String> list);
  public Long counter(List<String> list);
}
