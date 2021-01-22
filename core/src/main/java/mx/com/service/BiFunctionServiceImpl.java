package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

@Service
public class BiFunctionServiceImpl implements BiFunctionService {

  @Override
  public Integer firstExample(Integer firstNumber, Integer secondNumber) {
    BiFunction<Integer, Integer, Integer> function = (first, second) -> first + second;
    return function.apply(firstNumber, secondNumber);
  }

  @Override
  public List<String> ordenarJava7(List<String> lista) {
    Collections.sort(lista, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
    return lista;
  }

  @Override
  public List<String> ordenarJava8(List<String> lista) {
//    Collections.sort(lista, (String o1, String o2) -> o1.compareTo(o2) );
    Collections.sort(lista, (o1, o2) -> o1.compareTo(o2) );
    return lista;
  }

}
