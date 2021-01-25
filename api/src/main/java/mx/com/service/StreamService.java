package mx.com.service;

import java.util.List;

public interface StreamService {
  public void filter(List<String> list);
  public void sorter(List<String> list);
  public void transformer(List<String> list);
  public void limiter(List<String> list);
  public void counter(List<String> list);
}
