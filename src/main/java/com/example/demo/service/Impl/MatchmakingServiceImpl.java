package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.MatchmakingService;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService{
    @Autowired MatchRecordRepository ;
}