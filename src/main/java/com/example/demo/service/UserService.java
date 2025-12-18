package com.exmaple.demo.service;

import com.exmaple.demo.model.User;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}
