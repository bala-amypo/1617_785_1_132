package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.UserService;
import com.example.demo.model.User;

@Service
public class UserServieImpl implements UserService{
    @Autowired UserRepository;
}