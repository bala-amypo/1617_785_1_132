package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.model.SkillRequest;

@Repository
public interface SkillRequestRepository extends JpaRepository<SkillRequest,Long>{
    List<SkillRequest> findByUserId(Long userId);
}
