package mx.com.service;

import java.util.List;

public interface ParallelStreamService {
  public List<String> testStream(List<String> list);
  public List<String> testParallelStream(List<String> list);
}
