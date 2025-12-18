package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.SkillService;
import com.example.demo.repository.SkillRepository;
import com.example.demo.model.Skill;

@Service
public class SkillServiceImpl implements SkillService{
    @Autowired SkillRepository sr;
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