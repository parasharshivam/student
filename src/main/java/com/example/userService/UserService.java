package com.example.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.userEntity.UserEntity;
import com.example.userRepository.UserRepository;

@Service
public class UserService {
@Autowired 
private UserRepository userRepository;



public UserEntity addUser(UserEntity userEntity) {
    return userRepository.save(userEntity);
}
}