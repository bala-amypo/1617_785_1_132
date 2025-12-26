
package com.example.demo.service;

import com.example.demo.model.AppUser;

public interface UserService {
    AppUser findByEmail(String email);
    AppUser register(AppUser user);
    String login(String email, String password);
}
