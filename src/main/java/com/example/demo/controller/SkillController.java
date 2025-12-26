// package com.example.demo.controller;

// import com.example.demo.model.Skill;
// import com.example.demo.service.SkillService;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import jakarta.validation.Valid;


// @RestController
// @RequestMapping("/api/skills")
// public class SkillController {

//     private final SkillService service;

//     public SkillController(SkillService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public Skill createSkill(@Valid @RequestBody Skill skill) throws Exception {
//         return service.createSkill(skill);
//     }

//     @PutMapping("/{id}")
//     public Skill updateSkill(@PathVariable Long id,@Valid  @RequestBody Skill skill) throws Exception {
//         return service.updateSkill(id, skill);
//     }

//     @GetMapping("/{id}")
//     public Skill getSkillById( @PathVariable Long id) throws Exception {
//         return service.getSkillById(id);
//     }

//     @GetMapping
//     public List<Skill> getAllSkills() {
//         return service.getAllSkills();
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivateSkill(@PathVariable Long id) throws Exception {
//         service.deactivateSkill(id);
//     }
// }
package com.example.demo.controller;

import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillController {
    
    @Autowired
    private SkillService skillService;
    
    @PutMapping("/skills/{id}")
    public ResponseEntity<Skill> update(@PathVariable Long id, @RequestBody Skill skill) {
        Skill updated = skillService.updateSkill(id, skill);
        return ResponseEntity.ok(updated);
    }
    
    @GetMapping("/skills")
    public ResponseEntity<List<Skill>> list() {
        List<Skill> skills = skillService.getAllSkills();
        return ResponseEntity.ok(skills);
    }
}