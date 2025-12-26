// package com.example.demo.controller;

// import com.example.demo.model.MatchRecord;
// import com.example.demo.service.MatchmakingService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import jakarta.validation.Valid;


// @RestController
// @RequestMapping("/api/matches")
// public class MatchRecordController {

//     private final MatchmakingService service;

//     public MatchRecordController(MatchmakingService service) {
//         this.service = service;
//     }

//     @PostMapping("/generate/{userId}")
//     public MatchRecord generateMatch( @PathVariable Long userId) throws Exception {
//         return service.generateMatch(userId);
//     }

//     @GetMapping("/{id}")
//     public MatchRecord getMatchById(@PathVariable Long id) throws Exception {
//         return service.getMatchById(id);
//     }

//     @GetMapping("/user/{userId}")
//     public List<MatchRecord> getMatchesForUser(@PathVariable Long userId) {
//         return service.getMatchesForUser(userId);
//     }

//     @PutMapping("/{id}/status")
//     public MatchRecord updateMatchStatus(@PathVariable Long id, @Valid @RequestParam String status) throws Exception {
//         return service.updateMatchStatus(id, status);
//     }
// }
