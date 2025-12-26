// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.Skill;

// import java.util.Optional;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface SkillRepository extends JpaRepository<Skill, Long> {
//     Optional<Skill> findByName(String name);
// }
package com.example.demo.repository;

import com.example.demo.model.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface SkillRepository {
    Skill save(Skill skill);
    List<Skill> findAll();
}