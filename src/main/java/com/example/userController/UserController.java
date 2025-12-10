package com.example.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.userEntity.UserEntity;
import com.example.userService.UserService;

@RestController
public class UserController {
@Autowired
private UserService userService;

@PostMapping("/user")
public UserEntity addUser(@RequestBody UserEntity userEntity) {
    return userService.addUser(userEntity);
}
} 


