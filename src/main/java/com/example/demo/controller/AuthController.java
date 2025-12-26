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
package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;

    public AuthController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        authenticationManager.authenticate(null);
        return ResponseEntity.ok("dummy-token");
    }
}
