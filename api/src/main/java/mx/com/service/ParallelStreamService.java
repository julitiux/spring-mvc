package mx.com.service;

import java.util.List;

public interface ParallelStreamService {
  public List<String> testStream(List<String>);
  public List<String> testParallelStream(List<String>);
}
