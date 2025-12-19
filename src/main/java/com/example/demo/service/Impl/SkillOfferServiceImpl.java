package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.service.SkillOfferService;
import com.example.demo.repository.SkillOfferRepository;
import com.example.demo.model.SkillOffer;

@Service
public class SkillOfferServiceImpl implements SkillOfferService{
    private final SkillOfferRepository sor;
    public SkillOffergServiceImpl(SkillOfferRepository sor){
        this.sor=sor;
    }
    public SkillOffer createOffer(SkillOffer offer){
        return sor.save(offer);
    }
    public SkillOffer updateOffer(Long id,SkillOffer offer){
        SkillOffer existing=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        existing.setExperienceLevel(offer.getExperienceLevel());
        existing.setAvailableHoursPerWeek(offer.getAvailableHoursPerWeek());
        return sor.save(existing);
    }
    public SkillOffer getOfferById(Long id){
        return sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
    }
    public List<SkillOffer> getOffersByUser(Long userId){
        return sor.findByUserId(userId);
    }
    public void deactivateOffer(Long id){
        SkillOffer offer=sor.findById(id).orElseThrow(()->new RuntimeException("Offer not found"));
        offer.setActive(false);
        sor.save(offer);
    }
}
