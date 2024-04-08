package io.github.oengajohn.simplejavaspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/api")
@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public Mono<String> sayHello() {
        return Mono.just("hello world");
    }
    
    
}
