package io.dowlath.security.securitymysqldb.repository;

import io.dowlath.security.securitymysqldb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
