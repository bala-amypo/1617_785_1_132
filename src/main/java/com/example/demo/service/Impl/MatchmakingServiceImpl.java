package com.exmaple.demo.service.Impl;

import org.springframework.
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.MatchmakingService;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService{
    @Autowired MatchRecordRepository ;
}