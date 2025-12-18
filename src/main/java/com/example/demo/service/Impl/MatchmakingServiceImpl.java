package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.MatchmakingService;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService{
    @Autowired MatchRecordRepository ;
}
package com.exmaple.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.exmaple.demo.service.MatchmakingService;
import com.exmaple.demo.repository.MatchRecordRepository;
import com.exmaple.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {

    @Autowired
    private MatchRecordRepository repo;

    @Override
    public MatchRecord generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }

    @Override
    public MatchRecord getMatchById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
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
