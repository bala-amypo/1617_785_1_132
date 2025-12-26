// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.SkillRequest;

// import java.util.List;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {
//     List<SkillRequest> findBySkillIdAndActiveTrue(Long skillId);
// }

package com.example.demo.repository;

import com.example.demo.model.SkillRequest;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface SkillRequestRepository {
    SkillRequest save(SkillRequest skillRequest);
    SkillRequest findById(Long id);
    List<SkillRequest> findByUserId(Long userId);
}