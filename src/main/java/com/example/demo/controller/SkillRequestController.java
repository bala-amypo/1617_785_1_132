// package com.example.demo.controller;

// import com.example.demo.model.SkillRequest;
// import com.example.demo.service.SkillRequestService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import jakarta.validation.Valid;


// @RestController
// @RequestMapping("/api/skill-requests")
// public class SkillRequestController {

//     private final SkillRequestService service;

//     public SkillRequestController(SkillRequestService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public SkillRequest createRequest(@Valid @RequestBody SkillRequest request) {
//         return service.createRequest(request);
//     }

//     @PutMapping("/{id}")
//     public SkillRequest updateRequest(@PathVariable Long id,@Valid  @RequestBody SkillRequest request) throws Exception {
//         return service.updateRequest(id, request);
//     }

//     @GetMapping("/{id}")
//     public SkillRequest getRequestById(@PathVariable Long id) throws Exception {
//         return service.getRequestById(id);
//     }

//     @GetMapping("/user/{userId}")
//     public List<SkillRequest> getRequestsByUser(@PathVariable Long userId) {
//         return service.getRequestsByUser(userId);
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivateRequest(@PathVariable Long id) throws Exception {
//         service.deactivateRequest(id);
//     }
// }
package com.example.demo.controller;

import com.example.demo.model.SkillRequest;
import com.example.demo.service.SkillRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillRequestController {
    
    @Autowired
    private SkillRequestService skillRequestService;
    
    @PostMapping("/requests")
    public ResponseEntity<SkillRequest> create(@RequestBody SkillRequest skillRequest) {
        SkillRequest created = skillRequestService.createRequest(skillRequest);
        return ResponseEntity.ok(created);
    }
    
    @GetMapping("/requests/{id}")
    public ResponseEntity<SkillRequest> get(@PathVariable Long id) {
        SkillRequest request = skillRequestService.getRequestById(id);
        return ResponseEntity.ok(request);
    }
}