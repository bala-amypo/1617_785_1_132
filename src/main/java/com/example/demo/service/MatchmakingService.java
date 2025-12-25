// package com.example.demo.service;

// import com.example.demo.model.MatchRecord;
// import java.util.List;

// public interface MatchmakingService {
//     MatchRecord generateMatch(Long userId) throws Exception;
//     MatchRecord getMatchById(Long id) throws Exception;
//     List<MatchRecord> getMatchesForUser(Long userId);
//     MatchRecord updateMatchStatus(Long id, String status) throws Exception;
// }
package com.example.demo.service;

import java.util.List;
import com.example.demo.model.MatchRecord;

public interface MatchmakingService {
    MatchRecord generateMatch(Long userId);
    MatchRecord getMatchById(Long id);
    List<MatchRecord> getMatchesForUser(Long userId);
    MatchRecord updateMatchStatus(Long id, String status);
}
