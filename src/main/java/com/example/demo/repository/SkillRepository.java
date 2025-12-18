package com.exmaple.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill,>{

}