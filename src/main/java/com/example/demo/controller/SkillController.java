package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;

@RestController
public class SkillController{
    @Autowired SkillService ss;
    @PostMapping("/skills")
    public Skill create(@RequestBody Skill skill){
        return ss.createSkill(skill);
    }
    @PutMapping("/skills/{id}")
    public Skill update(@PathVariable Long id,@RequestBody Skill skill){
        return ss.updateSkill(id,skill);
    }
    @GetMapping("/skills/{id}")
    public Skill get(@PathVariable Long id){
        return ss.getSkillById(id);
    }
    @GetMapping("/skills")
    public List<Skill> getAll(){
        return ss.getAllSkills();
    }
    @PutMapping("/skills/deactivate/{id}")
    public void deactivate(@PathVariable Long id){
        ss.deactivateSkill(id);
    }
}
