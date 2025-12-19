package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.SkillRequestService;
import com.example.demo.model.SkillRequest;

@RestController
@RequestMapping("/skill-requests")
public class SkillRequestController {
    private final SkillRequestService service;
    public SkillRequestController(SkillRequestService service){
        this.service=service;
    }
    @PostMapping("/api/skill-requests/POST")
    public SkillRequest create(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }
    @GetMapping("/api/skill-requests/PUT/{id}")
    public SkillRequest getById(@PathVariable Long id) {
        return service.getRequestById(id);
    }
    @GetMapping("/api/skill-requests/GET/{Id}")
    public List<SkillRequest> getByUser(@PathVariable Long userId) {
        return service.getRequestsByUser(userId);
    }
    @PutMapping("/api/skill-requests/GET/user/{userid}")
    public SkillRequest update(@PathVariable Long id, @RequestBody SkillRequest request) {
        return service.updateRequest(id, request);
    }
    @PutMapping("/api/skill-requests/PUT/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivateRequest(id);
    }
}
