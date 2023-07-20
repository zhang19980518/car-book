package com.example.carbook.service.impl;

import com.example.carbook.entity.User;
import com.example.carbook.repository.UserRepository;
import com.example.carbook.service.UserService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class UserServiceImpl implements UserService {


    private static final Sort sort=Sort.by("id").descending();

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<User> save(User user) {
        return repository.save(user);
    }

    @Override
    public Mono<User> update(User user) {
        return repository.save(user);
    }

    @Override
    public Flux<User> list() {
        return repository.findAll(sort);
    }
}
