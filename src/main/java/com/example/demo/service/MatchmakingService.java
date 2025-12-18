package com.exmaple.demo.service;

import java.util.List;
import com.exmaple.demo.model.MatchRecord;

public interface MatchmakingService {
    MatchRecord generateMatch(Long userId);
    MatchRecord getMatchById(Long id);
    List<MatchRecord> getMatchesForUser(Long userId);
    MatchRecord updateMatchStatus(Long id, String status);
}
