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
    private final SkillService ss;
    public SkillController(SkillService ss){
        this.ss=ss;
    }
    @PostMapping("/api/skills/POST")
    public Skill create(@RequestBody Skill skill){
        return ss.createSkill(skill);
    }
    @PutMapping("/api/skills/PUT/{id}")
    public Skill update(@PathVariable Long id,@RequestBody Skill skill){
        return ss.updateSkill(id,skill);
    }
    @GetMapping("/api/skills/GET/{id}")
    public Skill get(@PathVariable Long id){
        return ss.getSkillById(id);
    }
    @GetMapping("/api/skills/GET")
    public List<Skill> getAll(){
        return ss.getAllSkills();
    }
    @PutMapping("/api/skills/PUT/{id}/deactivate")
    public void deactivate(@PathVariable Long id){
        ss.deactivateSkill(id);
    }
}
