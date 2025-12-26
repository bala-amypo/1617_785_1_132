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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping
    public ResponseEntity<Skill> create(@RequestBody Skill skill) {
        return ResponseEntity.ok(skillService.createSkill(skill));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skill> update(@PathVariable Long id,
                                        @RequestBody Skill skill) {
        return ResponseEntity.ok(skillService.updateSkill(id, skill));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skill> get(@PathVariable Long id) {
        return ResponseEntity.ok(skillService.getSkillById(id));
    }

    @GetMapping
    public ResponseEntity<List<Skill>> list() {
        return ResponseEntity.ok(skillService.getAllSkills());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        skillService.deactivateSkill(id);
        return ResponseEntity.ok().build();
    }
}
