package br.com.springsecurityjwt.spring_security_jwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.springsecurityjwt.spring_security_jwt.model.User;

public interface UserRepository extends CrudRepository <User, String> {

    Optional<User> findByUsername(String username);
    
}