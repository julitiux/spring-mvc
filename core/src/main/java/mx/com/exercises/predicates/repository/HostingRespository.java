package mx.com.exercises.predicates.repository;

import mx.com.exercises.predicates.domain.Hosting;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class HostingRespository {

  public List<Hosting> filter(List<Hosting> list, Predicate<Hosting> predicate) {
    return list.stream().filter(predicate).collect(Collectors.toList());
  }

}
