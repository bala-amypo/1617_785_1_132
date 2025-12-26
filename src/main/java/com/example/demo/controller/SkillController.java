package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @PostMapping
    public Skill createSkill(@Valid @RequestBody Skill skill) throws Exception {
        return service.createSkill(skill);
    }

    @PutMapping("/{id}")
    public Skill updateSkill(@PathVariable Long id,@Valid  @RequestBody Skill skill) throws Exception {
        return service.updateSkill(id, skill);
    }

    @GetMapping("/{id}")
    public Skill getSkillById( @PathVariable Long id) throws Exception {
        return service.getSkillById(id);
    }

    @GetMapping
    public List<Skill> getAllSkills() {
        return service.getAllSkills();
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateSkill(@PathVariable Long id) throws Exception {
        service.deactivateSkill(id);
    }
}
// package com.example.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import java.util.List;
// import com.example.demo.model.Skill;
// import com.example.demo.service.SkillService;

// @RestController
// public class SkillController{
//     private final SkillService ss;
//     public SkillController(SkillService ss){
//         this.ss=ss;
//     }
//     @PostMapping("/api/skills/POST")
//     public Skill create(@RequestBody Skill skill){
//         return ss.createSkill(skill);
//     }
//     @PutMapping("/api/skills/PUT/{id}")
//     public Skill update(@PathVariable Long id,@RequestBody Skill skill){
//         return ss.updateSkill(id,skill);
//     }
//     @GetMapping("/api/skills/GET/{id}")
//     public Skill get(@PathVariable Long id){
//         return ss.getSkillById(id);
//     }
//     @GetMapping("/api/skills/GET")
//     public List<Skill> getAll(){
//         return ss.getAllSkills();
//     }
//     @PutMapping("/api/skills/PUT/{id}/deactivate")
//     public void deactivate(@PathVariable Long id){
//         ss.deactivateSkill(id);
//     }
// }
