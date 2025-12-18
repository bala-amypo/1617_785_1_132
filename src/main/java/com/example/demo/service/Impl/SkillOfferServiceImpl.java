package com.exmaple.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import orng.springframework.stereotype.Service;
import com.exmaple.demo.service.SkillOfferService;
import com.example.demo.model.SkillOffer;

@Service
public class SkillOfferServieImpl implements SkillOfferServie{
    @Autowired SkillOfferRepository ;
}