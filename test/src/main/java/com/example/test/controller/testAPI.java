package com.example.test.controller;

import com.example.test.model.request.UserEntity;
import com.example.test.model.request.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.test.repository.UserRepository;
import com.example.test.service.UserService;

@RestController
@RequestMapping(path = "/testAPI")
public class testAPI {
    private final UserRepository userRepository;
    private final UserService userService;

    public testAPI(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping()
    public String getTest(){
        return "Hello";
    }

    @PostMapping()
    public ResponseEntity<UserEntity> addUser(@RequestBody UserRequest request) {
        UserEntity userEntity = userService.addUser(request);
        return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
    }
    
}
