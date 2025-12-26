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