package mx.com.exercises.consumers.services;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public class BiConsumerServiceImpl implements BiConsumerService {

  BiConsumer<Integer, Integer> addTwoNumber = (x, y) -> System.out.println(x + y);

  @Override
  public void biConsumer(Integer integerOne, Integer integerTwo) {
    addTwoNumber.accept(integerOne, integerTwo);
  }

  @Override
  public void highOrderFunction(Integer integerOne, Integer integerTwo) {
    addTwoNumbers(integerOne, integerTwo, (x, y) -> System.out.print(x + y));
  }

  void addTwoNumbers(Integer integerOne, Integer integerTwo, BiConsumer<Integer, Integer> biConsumer) {
    biConsumer.accept(integerOne, integerTwo);
  }

  @Override
  public void mapForEach(Map<Integer, String> map) {
    map.forEach((k, v) -> System.out.println(k + ":" + v));
  }

  default <K,V> void forEach(BiConsumer<? super K, ? super V> action) {
    Objects.requireNonNull(action);
    for (Map.Entry<K, V> entry : Map.entrySet()) {
      K k;
      V v;
      try {
        k = entry.getKey();
        v = entry.getValue();
      } catch (IllegalStateException ise) {
        // this usually means the entry is no longer in the map.
        throw new ConcurrentModificationException(ise);
      }
      action.accept(k, v);
    }
  }


}
