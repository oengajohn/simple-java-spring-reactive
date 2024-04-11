package io.github.oengajohn.simplejavaspring.service.impl;

import org.springframework.stereotype.Service;

import io.github.oengajohn.simplejavaspring.entity.User;
import io.github.oengajohn.simplejavaspring.repository.UserRepository;
import io.github.oengajohn.simplejavaspring.service.UserService;
import reactor.core.publisher.Flux;

@Service
public class UserServiceImpl implements UserService{
    
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
      this.userRepository = userRepository;
    }

    @Override
    public Flux<User> getUsers() {
        return userRepository.findAll();
    }
}
