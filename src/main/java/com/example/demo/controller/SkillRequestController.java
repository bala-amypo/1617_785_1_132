package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.SkillRequestService;
import com.example.demo.model.SkillRequest;

@RestController
@RequestMapping("/api/skill-reuqests/skill-requests")
public class SkillRequestController {
    @Autowired SkillRequestService service;
    @PostMapping
    public SkillRequest create(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }
    @GetMapping("/{id}")
    public SkillRequest getById(@PathVariable Long id) {
        return service.getRequestById(id);
    }
    @GetMapping("/user/{userId}")
    public List<SkillRequest> getByUser(@PathVariable Long userId) {
        return service.getRequestsByUser(userId);
    }
    @PutMapping("/{id}")
    public SkillRequest update(@PathVariable Long id, @RequestBody SkillRequest request) {
        return service.updateRequest(id, request);
    }
    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivateRequest(id);
    }
}
