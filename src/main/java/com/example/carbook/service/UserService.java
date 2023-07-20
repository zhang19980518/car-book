package com.example.carbook.service;

import com.example.carbook.entity.User;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService{
    Mono<User> save(User user);

    Mono<User> update(User user);

    Flux<User> list();
}
