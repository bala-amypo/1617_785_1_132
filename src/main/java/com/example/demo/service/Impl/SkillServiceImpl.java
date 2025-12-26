package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import com.example.demo.service.SkillService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository repo;

    public SkillServiceImpl(SkillRepository repo) {
        this.repo = repo;
    }

    @Override
    public Skill createSkill(Skill skill) {
        return repo.save(skill);
    }

    @Override
    public Skill updateSkill(Long id, Skill skill) throws Exception {
        Skill existing = getSkillById(id);
        existing.setName(skill.getName());
        existing.setCategory(skill.getCategory());
        existing.setDescription(skill.getDescription());
        return repo.save(existing);
    }

    @Override
    public Skill getSkillById(Long id) throws Exception {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skill not found"));
    }

    @Override
    public List<Skill> getAllSkills() {
        return repo.findAll();
    }

    @Override
    public void deactivateSkill(Long id) throws Exception {
        Skill existing = getSkillById(id);
        existing.setActive(false);
        repo.save(existing);
    }
}
// package com.example.demo.service.Impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import com.example.demo.service.SkillService;
// import com.example.demo.repository.SkillRepository;
// import com.example.demo.model.Skill;
// import com.example.demo.exception.ResourceNotFoundException;


// @Service
// public class SkillServiceImpl implements SkillService{
//     private final SkillRepository sr;
//     public SkillServiceImpl(SkillRepository sr){
//         this.sr=sr;
//     }
//     public Skill createSkill(Skill skill){
//         return sr.save(skill);
//     }
//     public Skill updateSkill(Long id,Skill skill){
//         Skill existing=sr.findById(id).orElseThrow(()->new ResourceNotFoundException("Skill not found"));
//         existing.setName(skill.getName());
//         existing.setCategory(skill.getCategory());
//         existing.setDescription(skill.getDescription());
//         return sr.save(existing);
//     }
//     public Skill getSkillById(Long id){
//         return sr.findById(id).orElseThrow(()->new ResourceNotFoundException("Skill not found"));
//     }
// //     public Skill getSkillById(Long id) {
// //     return sr.findById(id)
// //             .orElseThrow(() -> new ResourceNotFoundException("Skill not found with id " + id));
// // }

//     public List<Skill> getAllSkills(){
//         return sr.findAll();
//     }
//     public void deactivateSkill(Long id){
//         Skill skill=sr.findById(id).orElseThrow(()->new ResourceNotFoundException("Skill not found"));
//         skill.setActive(false);
//         sr.save(skill);
//     }
// }