// package com.example.demo.service;

// import com.example.demo.model.Skill;
// import java.util.List;

// public interface SkillService {
//     Skill createSkill(Skill skill) throws Exception;
//     Skill updateSkill(Long id, Skill skill) throws Exception;
//     Skill getSkillById(Long id) throws Exception;
//     List<Skill> getAllSkills();
//     void deactivateSkill(Long id) throws Exception;
// }
package com.example.demo.service;

import com.example.demo.model.Skill;
import java.util.List;

public interface SkillService {
    Skill updateSkill(Long id, Skill skill);
    List<Skill> getAllSkills();
}