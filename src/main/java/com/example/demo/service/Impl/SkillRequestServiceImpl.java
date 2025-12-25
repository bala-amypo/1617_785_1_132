// package com.example.demo.service.Impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.service.SkillRequestService;
// import com.example.demo.repository.SkillRequestRepository;
// import com.example.demo.model.SkillRequest;
// import com.example.demo.exception.ResourceNotFoundException;


// @Service
// public class SkillRequestServiceImpl implements SkillRequestService {
//     private final SkillRequestRepository repo;
//     public SkillRequestServiceImpl(SkillRequestRepository repo){
//         this.repo=repo;
//     }
//     @Override
//     public SkillRequest createRequest(SkillRequest request) {
//         return repo.save(request);
//     }
//     @Override
//     public SkillRequest updateRequest(Long id, SkillRequest request) {
//         SkillRequest existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
//         existing.setSkill(request.getSkill());
//         existing.setActive(request.getActive());
//         return repo.save(existing);
//     }
//     @Override
//     public SkillRequest getRequestById(Long id) {
//         return repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
//     }
// //     public SkillRequest getRequestById(Long id) {
// //     return repo.findById(id)
// //             .orElseThrow(() -> new ResourceNotFoundException("Request not found with id " + id));
// // }

//     @Override
//     public List<SkillRequest> getRequestsByUser(Long userId) {
//         return repo.findByUserId(userId);
//     }
//     @Override
//     public void deactivateRequest(Long id) {
//         SkillRequest req = getRequestById(id);
//         req.setActive(false);
//         repo.save(req);
//     }
// }
