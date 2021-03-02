package mx.com.exercises.streams.services;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollectServiceImpl implements FilterAndCollectService {

  @Override
  public List<String> filterStartWith(List<String> stringList, String filter) {
    return stringList.stream().filter(it -> it.startsWith(filter)).collect(Collectors.toList());
  }

}
