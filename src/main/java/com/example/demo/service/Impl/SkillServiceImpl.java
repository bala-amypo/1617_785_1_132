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
//         Skill existing=sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
//         existing.setName(skill.getName());
//         existing.setCategory(skill.getCategory());
//         existing.setDescription(skill.getDescription());
//         return sr.save(existing);
//     }
//     public Skill getSkillById(Long id){
//         return sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
//     }
// //     public Skill getSkillById(Long id) {
// //     return sr.findById(id)
// //             .orElseThrow(() -> new ResourceNotFoundException("Skill not found with id " + id));
// // }

//     public List<Skill> getAllSkills(){
//         return sr.findAll();
//     }
//     public void deactivateSkill(Long id){
//         Skill skill=sr.findById(id).orElseThrow(()->new RuntimeException("Skill not found"));
//         skill.setActive(false);
//         sr.save(skill);
//     }
// }