package com.example.demo.service;

import com.example.demo.model.SkillOffer;
import java.util.List;

public interface SkillOfferService {
    SkillOffer createOffer(SkillOffer offer);
    SkillOffer updateOffer(Long id, SkillOffer offer) throws Exception;
    SkillOffer getOfferById(Long id) throws Exception;
    List<SkillOffer> getOffersByUser(Long userId);
    void deactivateOffer(Long id) throws Exception;
}