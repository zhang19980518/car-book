package com.example.carbook.controller;

import com.example.carbook.entity.User;
import com.example.carbook.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping
    public ResponseEntity<Mono<User>> update(@RequestBody User user){
       return ResponseEntity.ok(userService.update(user));
    }
    @PostMapping
    public ResponseEntity<Mono<User>> add(@RequestBody  User user){
        return ResponseEntity.ofNullable(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<Flux<User>> list(){
        return ResponseEntity.ofNullable(userService.list());
    }


}
