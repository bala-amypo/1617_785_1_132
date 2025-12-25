// package com.example.demo.controller;

// import com.example.demo.model.SkillRequest;
// import com.example.demo.service.SkillRequestService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/skill-requests")
// public class SkillRequestController {

//     private final SkillRequestService service;

//     public SkillRequestController(SkillRequestService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public SkillRequest createRequest(@RequestBody SkillRequest request) {
//         return service.createRequest(request);
//     }

//     @PutMapping("/{id}")
//     public SkillRequest updateRequest(@PathVariable Long id, @RequestBody SkillRequest request) throws Exception {
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.demo.service.SkillRequestService;
import com.example.demo.model.SkillRequest;

@RestController
public class SkillRequestController {
    private final SkillRequestService service;
    public SkillRequestController(SkillRequestService service){
        this.service=service;
    }
    @PostMapping("/api/skill-requests/POST")
    public SkillRequest create(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }
    @GetMapping("/api/skill-requests/GET/{id}")
    public SkillRequest getById(@PathVariable Long id) {
        return service.getRequestById(id);
    }
    @GetMapping("/api/skill-requests/GET/user/{userId}")
    public List<SkillRequest> getByUser(@PathVariable Long userId) {
        return service.getRequestsByUser(userId);
    }
    @PutMapping("/api/skill-requests/PUT/{id}")
    public SkillRequest update(@PathVariable Long id, @RequestBody SkillRequest request) {
        return service.updateRequest(id, request);
    }
    @PutMapping("/api/skill-requests/PUT/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        service.deactivateRequest(id);
    }
}
