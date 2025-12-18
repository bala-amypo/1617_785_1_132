package com.exmaple.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SkillRequest;

@Repository
public interface SkillRequestRepository extends JpaRepository<SkillRequest,Long>{

}