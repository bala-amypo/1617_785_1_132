package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.MatchmakingService;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {
    private final MatchRecordRepository repo;
    public MatchmakingServiceImpl(MatchRecordRepository repo){
        this.repo=repo;
    }
    @Override
    public MatchRecord generateMatch(Long userId) {
        return repo.findFirstByUserAIdOrUserBId(userId, userId)
                .orElseGet(() -> {MatchRecord match = new MatchRecord();
                UserProfile user = new UserProfile();
                user.setId(userId);
                match.setUserA(user);
                match.setUserB(null);
                match.setStatus("PENDING");
                return repo.save(match);
                });
    }
    @Override
    public MatchRecord getMatchById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Match not found"));
    }
    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repo.findByUserAIdOrUserBId(userId, userId);
    }
    @Override
    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return repo.save(match);
    }
}