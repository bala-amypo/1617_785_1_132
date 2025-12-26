// package com.example.demo.controller;

// import com.example.demo.model.UserProfile;
// import com.example.demo.service.UserProfileService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import jakarta.validation.Valid;


// @RestController
// @RequestMapping("/api/users")
// public class UserProfileController {

//     private final UserProfileService service;

//     public UserProfileController(UserProfileService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public UserProfile createUser(@Valid @RequestBody UserProfile user) throws Exception {
//         return service.createUser(user);
//     }

//     @PutMapping("/{id}")
//     public UserProfile updateUser(@PathVariable Long id,@Valid  @RequestBody UserProfile user) throws Exception {
//         return service.updateUser(id, user);
//     }

//     @GetMapping("/{id}")
//     public UserProfile getUserById(@PathVariable Long id) throws Exception {
//         return service.getUserById(id);
//     }

//     @GetMapping
//     public List<UserProfile> getAllUsers() {
//         return service.getAllUsers();
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivateUser(@PathVariable Long id) throws Exception {
//         service.deactivateUser(id);
//     }
// }