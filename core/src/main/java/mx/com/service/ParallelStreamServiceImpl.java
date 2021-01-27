package mx.com.service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

@Service
public class ParallelStreamServiceImpl implements ParallelStreamService{

  @Override
  public void testStream(List<String> list) {
    list.stream().forEach(System.out::println);
  }

  @Override
  public void testParallelStream(List<String> list) {

  }
}
