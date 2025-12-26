package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@Valid @RequestBody User user) throws Exception {
        return service.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email) throws Exception {
        return service.findByEmail(email);
    }
}
// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.*;
// import com.example.demo.service.UserService;
// import com.example.demo.model.User;

// @RestController
// public class AuthController {

//     private final UserService service;
 
//     public AuthController(UserService service) {
//         this.service = service;
//     }

//     @PostMapping("/auth/POST/register")
//     public User register(@RequestBody User user) {
//         return service.register(user);
//     }

//     @PostMapping("/auth/POST/login")
//     public User login(@RequestParam String email) {
//         return service.findByEmail(email);
//     }
// } 
