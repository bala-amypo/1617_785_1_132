package com.exmaple.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exmaple.demo.service.UserService;
import com.exmaple.demo.repository.UserRepository;
import com.exmaple.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserRepository repo;
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
