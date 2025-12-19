package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.UserProfileService;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.model.UserProfile;

@Service
public class UserProfileServiceImpl implements UserProfileService{
    private final UserProfileRepository upr;
    public UserProfileServiceImpl(UserProfileRepository upr){
        this.upr=upr;
    }
    public UserProfile createUser(UserProfile user){
        if(upr.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        return upr.save(user);
    }
    public UserProfile updateUser(Long id,UserProfile user){
        UserProfile existing=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));

        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());

        return upr.save(existing); 
    }
    public UserProfile getUserById(Long id){
        return upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
    }
    public List<UserProfile> getAllUsers(){
        return upr.findAll();
    }
    public void deactivateUser(Long id){
        UserProfile user=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
        user.setActive(false);
        upr.save(user);
    }
}
