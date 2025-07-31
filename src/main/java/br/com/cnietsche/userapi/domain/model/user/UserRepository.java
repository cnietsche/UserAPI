package br.com.cnietsche.userapi.domain.model.user;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    Optional<User> findById(UUID id);

    Optional<User> findByUserName(String userName);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void deleteById(UUID id);

    boolean existsByUserName(String userName);
}
