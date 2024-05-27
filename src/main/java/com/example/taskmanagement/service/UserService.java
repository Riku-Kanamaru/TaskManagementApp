package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.UserEntity;
import com.example.taskmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    // コンストラクタ
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<UserEntity> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    // その他のメソッドを必要に応じて追加
}
