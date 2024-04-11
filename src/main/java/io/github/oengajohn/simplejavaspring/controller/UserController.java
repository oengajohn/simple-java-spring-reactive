package io.github.oengajohn.simplejavaspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.oengajohn.simplejavaspring.entity.User;
import io.github.oengajohn.simplejavaspring.service.UserService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Flux<User> getUsers() {
        return userService.getUsers();
    }

}
