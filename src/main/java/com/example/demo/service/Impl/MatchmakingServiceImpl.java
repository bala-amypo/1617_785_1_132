package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.MatchmakingService;
import com.example.demo.repository.MatchRecordRepository;
import com.example.demo.model.MatchRecord;

@Service
public class MatchmakingServiceImpl implements MatchmakingService {
    private final MatchRecordRepository repo;
    public MatchmakingServiceImpl(MatchRecordRepository repo){
        this.repo=repo;
    }
    @Override
    public MatchRecord generateMatch(Long userId) {
        throw new RuntimeException("No match found");
    }
    @Override
    public MatchRecord getMatchById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Match not found"));
    }
    @Override
    public List<MatchRecord> getMatchesForUser(Long userId) {
        return repo.findByUserAIdOrUserBId(userId, userId);
    }
    @Override
    public MatchRecord updateMatchStatus(Long id, String status) {
        MatchRecord match = getMatchById(id);
        match.setStatus(status);
        return repo.save(match);
    }
}

package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.SkillOfferService;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.model.SkillOffer;

@Service
public class SkillOfferServiceImpl implements SkillOfferService{
    private final SkillOfferRepository sor;
    public SkillOfferServiceImpl(SkillOfferRepository sor){
        this.sor=sor;
    }
    public SkillOffer createOffer(SkillOffer offer){
        return sor.save(offer);
    }
    public SkillOffer updateOffer(Long id,SkillOffer offer){
        SkillOffer existing=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        existing.setExperienceLevel(offer.getExperienceLevel());
        existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());
        return sor.save(existing);
    }
    public SkillOffer getOfferById(Long id){
        return sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
    }
    public List<SkillOffer> getOffersByUser(Long userId){
        return sor.findByUserId(userId);
    }
    public void deactivateOffer(Long id){
        SkillOffer offer=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        offer.setActive(false);
        sor.save(offer);
    }
}
package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.SkillRequestService;
import com.example.demo.repository.SkillRequestRepository;
import com.example.demo.model.SkillRequest;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {
    private final SkillRequestRepository repo;
    public SkillRequestServiceImpl(SkillRequestRepository repo){
        this.repo=repo;
    }
    @Override
    public SkillRequest createRequest(SkillRequest request) {
        return repo.save(request);
    }
    @Override
    public SkillRequest updateRequest(Long id, SkillRequest request) {
        SkillRequest existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
        existing.setSkill(request.getSkill());
        existing.setActive(request.getActive());
        return repo.save(existing);
    }
    @Override
    public SkillRequest getRequestById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
    }
    @Override
    public List<SkillRequest> getRequestsByUser(Long userId) {
        return repo.findByUserId(userId);
    }
    @Override
    public void deactivateRequest(Long id) {
        SkillRequest req = getRequestById(id);
        req.setActive(false);
        repo.save(req);
    }
}
package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.SkillService;
import com.example.demo.repository.SkillRepository;
import com.example.demo.model.Skill;

@Service
public class SkillServiceImpl implements SkillService{
    private final SkillRepository sr;
    public SkillServiceImpl(SkillRepository sr){
        this.sr=sr;
    }
    public Skill createSkill(Skill skill){
        return sr.save(skill);
    }
    public Skill updateSkill(Long id,Skill skill){
        Skill existing=sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
        existing.setName(skill.getName());
        existing.setCategory(skill.getCategory());
        existing.setDescription(skill.getDescription());
        return sr.save(existing);
    }
    public Skill getSkillById(Long id){
        return sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
    }
    public List<Skill> getAllSkills(){
        return sr.findAll();
    }
    public void deactivateSkill(Long id){
        Skill skill=sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
        skill.setActive(false);
        sr.save(skill);
    }
}
package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.UserProfileService;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.model.UserProfile;

@Service
public class UserProfileServiceImpl implements UserProfileService{
    private final UserProfileRepository upr;
    public UserProfileServiceImpl(UserProfileRepository upr){
        this.upr=upr;
    }
    public UserProfile createUser(UserProfile user){
        if(upr.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        return upr.save(user);
    }
    public UserProfile updateUser(Long id,UserProfile user){
        UserProfile existing=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));

        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());

        return upr.save(existing); 
    }
    public UserProfile getUserById(Long id){
        return upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
    }
    public List<UserProfile> getAllUsers(){
        return upr.findAll();
    }
    public void deactivateUser(Long id){
        UserProfile user=upr.findById(id).orElseThrow(()->new RuntimeException("UserProfile not found"));
        user.setActive(false);
        upr.save(user);
    }
}
package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.UserService;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repo;
    public UserServiceImpl(UserRepository repo){
        this.repo=repo;
    } 
    @Override
    public User findByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
 