// package com.example.demo.controller;

// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import org.springframework.web.bind.annotation.*;
// import jakarta.validation.Valid;

// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     private final UserService service;

//     public AuthController(UserService service) {
//         this.service = service;
//     }

//     @PostMapping("/register")
//     public User register(@Valid @RequestBody User user) throws Exception {
//         return service.register(user);
//     }

//     @PostMapping("/login")
//     public User login(@Valid @RequestParam String email) throws Exception {
//         return service.findByEmail(email);
//     }
// }
