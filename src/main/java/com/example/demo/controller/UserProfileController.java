package com.exmaple.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserProfileController{
    @Autowired UserProfileService ups;
    @PostMapping("/POST")
    public UserProfile createuserprofile(@RequestBody UserProfile up){
        return ups.
    }

}