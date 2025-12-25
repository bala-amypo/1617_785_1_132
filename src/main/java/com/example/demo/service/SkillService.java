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

import java.util.List;
import com.example.demo.model.Skill;

public interface SkillService{
    Skill createSkill(Skill skill);
    Skill updateSkill(Long id,Skill skill);
    Skill getSkillById(Long id);
    List<Skill> getAllSkills();
    void deactivateSkill(Long id);
}
