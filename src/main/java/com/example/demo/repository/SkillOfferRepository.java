package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.model.SkillOffer;

@Repository
public interface SkillOfferRepository extends JpaRepository<SkillOffer,Long>{
    List<SkillOffer> findByUserId(Long userId);
}
