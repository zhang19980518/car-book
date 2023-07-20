package com.example.carbook.repository;

import com.example.carbook.entity.User;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface UserRepository extends ReactiveCrudRepository<User,Long>, ReactiveSortingRepository<User,Long>, ReactiveQueryByExampleExecutor<User> {
}
