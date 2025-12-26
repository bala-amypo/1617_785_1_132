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

import com.example.demo.model.MatchRecord;

import java.util.List;

public interface MatchmakingService {

    MatchRecord generateMatch(Long requestId);

    List<MatchRecord> getMatchesForUser(Long userId);
}
