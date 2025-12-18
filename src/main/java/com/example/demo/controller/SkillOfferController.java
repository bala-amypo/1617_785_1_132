package com.exmaple.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.demo.model.SkillOffer;
import com.example.demo.service.SkillOfferService;

@RestController
public class SkillOfferController{
    @Autowired SkillOfferService sos;
    @PostMapping("/offers")
    public SkillOffer create(@RequestBody SkillOffer offer){
        return sos.createOffer(offer);
    }
    @PutMapping("/offers/{id}")
    public SkillOffer update(@PathVariable Long id,@RequestBody SkillOffer offer){
        return sos.updateOffer(id,offer);
    }
    @GetMapping("/offers/{id}")
    public SkillOffer get(@PathVariable Long id){
        return sos.getOfferById(id);
    }
    @GetMapping("/offers/user/{userId}")
    public List<SkillOffer> getByUser(@PathVariable Long userId){
        return sos.getOffersByUser(userId);
    }
    @PutMapping("/offers/deactivate/{id}")
    public void deactivate(@PathVariable Long id){
        sos.deactivateOffer(id);
    }
}
