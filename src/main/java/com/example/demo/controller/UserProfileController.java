package com.exmaple.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.UserProfile;
import com.example.demo.service.UserProfileService;

@RestController
public class UserProfileController{
    @Autowired UserProfileService ups;
    @PostMapping("/POST")
    public UserProfile createuserprofile(@RequestBody UserProfile up){
        return ups.createUser(up);
    }

}