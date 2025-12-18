package com.exmaple.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exmaple.demo.service.UserService;
import com.exmaple.demo.model.User;

@RestController
@RequestMapping("/users")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
}
