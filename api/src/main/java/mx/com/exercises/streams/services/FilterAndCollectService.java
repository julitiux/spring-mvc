package mx.com.exercises.streams.services;

import java.util.List;

public interface FilterAndCollectService {
  public List<String> filterStartWith(List<String> stringList, String filter);
}
