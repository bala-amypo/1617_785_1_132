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
package com.example.demo.controller;

import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/users")
@SecurityRequirement(name = "bearerAuth")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserProfile> create(@RequestBody UserProfile user) {
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        service.deactivateUser(id);
        return ResponseEntity.ok().build();
    }
}
