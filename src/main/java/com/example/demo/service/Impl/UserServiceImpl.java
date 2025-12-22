package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.UserService;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repo;
    public UserServiceImpl(UserRepository repo){
        this.repo=repo;
    }
    @Override
    public User register(User user) {
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        return repo.save(user);
    }
    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
 