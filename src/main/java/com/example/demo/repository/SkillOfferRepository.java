// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.demo.model.SkillOffer;

// import java.util.List;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface SkillOfferRepository extends JpaRepository<SkillOffer, Long> {
//     List<SkillOffer> findBySkillIdAndActiveTrue(Long skillId);
// }

package com.example.demo.repository;

import com.example.demo.model.SkillOffer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface SkillOfferRepository extends JpaRepository<SkillOffer, Long>{
    SkillOffer save(SkillOffer skillOffer);
    SkillOffer findById(Long id);
    List<SkillOffer> findByUserId(Long userId);
}