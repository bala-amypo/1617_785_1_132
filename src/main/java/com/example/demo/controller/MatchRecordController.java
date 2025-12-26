package com.example.demo.controller;

import com.example.demo.model.MatchRecord;
import com.example.demo.service.MatchmakingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/matches")
public class MatchRecordController {

    private final MatchmakingService service;

    public MatchRecordController(MatchmakingService service) {
        this.service = service;
    }

    @PostMapping("/generate/{userId}")
    public MatchRecord generateMatch(@Valid @PathVariable Long userId) throws Exception {
        return service.generateMatch(userId);
    }

    @GetMapping("/{id}")
    public MatchRecord getMatchById(@Valid @PathVariable Long id) throws Exception {
        return service.getMatchById(id);
    }

    @GetMapping("/user/{userId}")
    public List<MatchRecord> getMatchesForUser(@Valid @PathVariable Long userId) {
        return service.getMatchesForUser(userId);
    }

    @PutMapping("/{id}/status")
    public MatchRecord updateMatchStatus(@Valid @PathVariable Long id, @RequestParam String status) throws Exception {
        return service.updateMatchStatus(id, status);
    }
}
// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import com.example.demo.service.MatchmakingService;
// import com.example.demo.model.MatchRecord;

// @RestController
// public class MatchRecordController {

//     private final MatchmakingService service;

//     public MatchRecordController(MatchmakingService service) {
//         this.service = service;
//     }

//     @PostMapping("/api/matches/POST/generate/{userId}")
//     public MatchRecord generate(@PathVariable Long userId) {
//         return service.generateMatch(userId);
//     }

//     @GetMapping("/api/matches/GET/{id}")
//     public MatchRecord getById(@PathVariable Long id) {
//         return service.getMatchById(id);
//     }

//     @GetMapping("/api/matches/GET/user/{userId}")
//     public List<MatchRecord> getForUser(@PathVariable Long userId) {
//         return service.getMatchesForUser(userId);
//     }

//     @PutMapping("/api/matches/PUT/{id}/status")
//     public MatchRecord updateStatus(@PathVariable Long id,
//                                     @RequestParam String status) {
//         return service.updateMatchStatus(id, status);
//     }
// }
