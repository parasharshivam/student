package com.example.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.userEntity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {



}
