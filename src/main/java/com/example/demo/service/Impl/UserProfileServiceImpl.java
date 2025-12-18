package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.UserProfileService;
import com.example.demo.model.UserProfile;

@Service
public class UserProfileServieImpl implements UserProfileService{
    @Autowired UserProfileRepository ;
}