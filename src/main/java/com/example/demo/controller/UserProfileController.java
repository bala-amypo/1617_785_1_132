// package com.example.demo.controller;

// import com.example.demo.model.UserProfile;
// import com.example.demo.service.UserProfileService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/users")
// public class UserProfileController {

//     private final UserProfileService service;

//     public UserProfileController(UserProfileService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public UserProfile createUser(@RequestBody UserProfile user) throws Exception {
//         return service.createUser(user);
//     }

//     @PutMapping("/{id}")
//     public UserProfile updateUser(@PathVariable Long id, @RequestBody UserProfile user) throws Exception {
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;

@RestController
public class UserProfileController{
    private final UserProfileService ups;
    public UserProfileController(UserProfileService ups){
        this.ups=ups;
    }
    @PostMapping("/api/users/POST")
    public UserProfile createUser(@RequestBody UserProfile user){
        return ups.createUser(user);
    }
    @PutMapping("/api/users/PUT/{id}")
    public UserProfile updateUser(@PathVariable Long id,@RequestBody UserProfile user){
        return ups.updateUser(id,user);
    }
    @GetMapping("/api/users/GET/{id}")
    public UserProfile getUser(@PathVariable Long id){
        return ups.getUserById(id);
    }
    @GetMapping("/api/users/GET")
    public List<UserProfile> getAll(){
        return ups.getAllUsers();
    }
    @PutMapping("/api/users/PUT/{id}/deactivate")
    public void deactivate(@PathVariable Long id){
        ups.deactivateUser(id);
    }
}
