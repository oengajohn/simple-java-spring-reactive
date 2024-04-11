package io.github.oengajohn.simplejavaspring.service;

import io.github.oengajohn.simplejavaspring.entity.User;
import reactor.core.publisher.Flux;

public interface UserService {

	Flux<User> getUsers();
    
}
