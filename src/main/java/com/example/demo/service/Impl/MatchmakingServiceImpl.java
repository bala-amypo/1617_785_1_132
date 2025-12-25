// package com.example.demo.service.Impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.service.MatchmakingService;
// import com.example.demo.repository.MatchRecordRepository;
// import com.example.demo.model.MatchRecord;
// import com.example.demo.exception.MatchNotFoundException;


// @Service
// public class MatchmakingServiceImpl implements MatchmakingService {
//     private final MatchRecordRepository repo;
//     public MatchmakingServiceImpl(MatchRecordRepository repo){
//         this.repo=repo;
//     }
//     @Override
//     public MatchRecord generateMatch(Long userId) {
//         throw new RuntimeException("No match found");
//     }
//     @Override
//     public MatchRecord getMatchById(Long id) {
//         return repo.findById(id).orElseThrow(() -> new RuntimeException("Match not found"));
//     }
// //     @Override
// // public MatchRecord generateMatch(Long userId) {
// //     throw new MatchNotFoundException("No match found for user " + userId);
// // }

// // @Override
// // public MatchRecord getMatchById(Long id) {
// //     return repo.findById(id)
// //             .orElseThrow(() -> new MatchNotFoundException("Match not found with id " + id));
// // }

//     @Override
//     public List<MatchRecord> getMatchesForUser(Long userId) {
//         return repo.findByUserAIdOrUserBId(userId, userId);
//     }
//     @Override
//     public MatchRecord updateMatchStatus(Long id, String status) {
//         MatchRecord match = getMatchById(id);
//         match.setStatus(status);
//         return repo.save(match);
//     }
// }
