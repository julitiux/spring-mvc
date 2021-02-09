package mx.com.service;

import java.util.List;

public interface JavaRxService {
  public void observableRx(List<String> list);
  public List<String> observableRx(List<String> firstList, List<String> secondList, String string);
}
