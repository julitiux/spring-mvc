package mx.com.service;

import mx.com.domain.User;

@FunctionalInterface
public interface UserService {
  public User crear(Long id, String username);
}
