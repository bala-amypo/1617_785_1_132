package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.MatchmakingService;
import com.example.demo.model.MatchRecord;

@RestController
@RequestMapping("/matches")
public class MatchRecordController {
    @Autowired MatchmakingService service;
    private final MatchService service;
    public AuthContoller(UserService service){
        this.service=service;
    }
    @PostMapping("/api/matches/POST/generate/{userId}")
    public MatchRecord generate(@PathVariable Long userId) {
        return service.generateMatch(userId);
    }
    @GetMapping("/api/matches/GET/{id}")
    public MatchRecord getById(@PathVariable Long id) {
        return service.getMatchById(id);
    }
    @GetMapping("/api/matches/GET/user/{userId}")
    public List<MatchRecord> getForUser(@PathVariable Long userId) {
        return service.getMatchesForUser(userId);
    }
    @PutMapping("/api/matches/PUT/{id}/status")
    public MatchRecord updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateMatchStatus(id, status);
    }
}
