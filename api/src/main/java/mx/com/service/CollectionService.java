package mx.com.service;

import java.util.List;

public interface CollectionService {
  public void forEachJava7(List<String> list);
  public void forEachJava8(List<String> list);
  public void forEachJava8_1(List<String> list);

  public List<String> useRemoveIfJava7(List<String> list, String elementRemove);
  public List<String> useRemoveIfJava8(List<String> list, String elementRemove);

  public List<String> useSortJava7(List<String> list);
}
