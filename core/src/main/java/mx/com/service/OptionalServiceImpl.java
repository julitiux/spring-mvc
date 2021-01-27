package mx.com.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OptionalServiceImpl implements OptionalService {

  @Override
  public void test(String value) {
    Optional<String> optional = Optional.empty();
    optional.get();
  }

  @Override
  public String orElse(String value) {

    Optional<String> optional = Optional.ofNullable(value);
    return optional.orElse("Sin valor");

  }

  @Override
  public String orElseThrow(String value) {
    return null;
  }

  @Override
  public String idPresent(String value) {
    return null;
  }
}
