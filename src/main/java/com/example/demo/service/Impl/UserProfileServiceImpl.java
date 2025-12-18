package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.UserProfileService;
import com.example.demo.model.UserProfile;

@Service
public class UserProfileServieImpl implements UserProfileService{
    @Autowired UserProfileRepository upr;
    @Override
    public UserProfile createUser(UserProfile up){
        return upr.save(str);
    }

} 
package com.exmaple.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.exmaple.demo.service.UserProfileService;
import com.exmaple.demo.repository.UserProfileRepository;
import com.example.demo.model.UserProfile;

@Service
public class UserProfileServiceImpl implements UserProfileService{
    @Autowired UserProfileRepository upr;
    public UserProfile createUser(UserProfile user){
        if(upr.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        return upr.save(user);
    }

    public UserProfile updateUser(Long id,UserProfile user){
        UserProfile existing=upr.findById(id)
            .orElseThrow(()->new RuntimeException("UserProfile not found"));

        existing.setFullName(user.getFullName());
        existing.setEmail(user.getEmail());

        return upr.save(existing);
    }

    public UserProfile getUserById(Long id){
        return upr.findById(id)
            .orElseThrow(()->new RuntimeException("UserProfile not found"));
    }

    public List<UserProfile> getAllUsers(){
        return upr.findAll();
    }

    public void deactivateUser(Long id){
        UserProfile user=upr.findById(id)
            .orElseThrow(()->new RuntimeException("UserProfile not found"));

        user.setActive(false);
        upr.save(user);
    }
}
