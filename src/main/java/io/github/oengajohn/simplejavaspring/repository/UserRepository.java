package io.github.oengajohn.simplejavaspring.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import io.github.oengajohn.simplejavaspring.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User,Integer> {
    
}
