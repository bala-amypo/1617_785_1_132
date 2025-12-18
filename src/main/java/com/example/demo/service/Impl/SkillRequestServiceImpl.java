package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.SkillRequestService;
import com.example.demo.model.SkillRequest;

@Service
public class SkillRequestServieImpl implements SkillRequestServie{
    @Autowired SkillRequestRepository ;
} 
package com.exmaple.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.List;
import com.exmaple.demo.service.SkillRequestService;
import com.exmaple.demo.repository.SkillRequestRepository;
import com.exmaple.demo.model.SkillRequest;

@Service
public class SkillRequestServiceImpl implements SkillRequestService{

    private final SkillRequestRepository repo;

    public SkillRequestServiceImpl(SkillRequestRepository repo){
        this.repo=repo;
    }

    public SkillRequest createRequest(SkillRequest request){
        return repo.save(request);
    }

    public SkillRequest updateRequest(Long id,SkillRequest request){
        SkillRequest existing=repo.findById(id)
                .orElseThrow(()->new RuntimeException("Request not found"));
        existing.setSkill(request.getSkill());
        existing.setActive(request.getActive());
        return repo.save(existing);
    }

    public SkillRequest getRequestById(Long id){
        return repo.findById(id)
                .orElseThrow(()->new RuntimeException("Request not found"));
    }

    public List<SkillRequest> getRequestsByUser(Long userId){
        return repo.findByUserId(userId);
    }

    public void deactivateRequest(Long id){
        SkillRequest req=getRequestById(id);
        req.setActive(false);
        repo.save(req);
    }
}
