package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.SkillService;
import com.example.demo.model.Skillt;

@Service
public class SkillServieImpl implements SkillServie{
    @Autowired SkillRepository ;
}