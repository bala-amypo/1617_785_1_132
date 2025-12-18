package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.SkillRequestService;
import com.example.demo.model.SkillRequest;

@Service
public class SkillRequestServieImpl implements SkillRequestServie{
    @Autowired SkillRequestRepository ;
}