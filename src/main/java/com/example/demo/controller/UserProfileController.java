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
    @Autowired UserProfileService ups;
    @PostMapping("/users")
    public UserProfile createUser(@RequestBody UserProfile user){
        return ups.createUser(user);
    }
    @PutMapping("/users/{id}")
    public UserProfile updateUser(@PathVariable Long id,@RequestBody UserProfile user){
        return ups.updateUser(id,user);
    }
    @GetMapping("/users/{id}")
    public UserProfile getUser(@PathVariable Long id){
        return ups.getUserById(id);
    }
    @GetMapping("/users")
    public List<UserProfile> getAll(){
        return ups.getAllUsers();
    }
    @PutMapping("/users/deactivate/{id}")
    public void deactivate(@PathVariable Long id){
        ups.deactivateUser(id);
    }
}
