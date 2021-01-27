package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParallelStreamServiceImpl implements ParallelStreamService{

  @Override
  public List<String> testStream(List<String>) {
    return null;
  }

  @Override
  public List<String> testParallelStream(List<String>) {
    return null;
  }
}
