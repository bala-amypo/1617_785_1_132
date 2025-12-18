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
    @PostMapping("/POST/generate/{userId}")
    public MatchRecord generate(@PathVariable Long userId) {
        return service.generateMatch(userId);
    }
    @GetMapping("/{id}")
    public MatchRecord getById(@PathVariable Long id) {
        return service.getMatchById(id);
    }
    @GetMapping("/user/{userId}")
    public List<MatchRecord> getForUser(@PathVariable Long userId) {
        return service.getMatchesForUser(userId);
    }
    @PutMapping("/{id}/status")
    public MatchRecord updateStatus(@PathVariable Long id, @RequestParam String status) {
        return service.updateMatchStatus(id, status);
    }
}
