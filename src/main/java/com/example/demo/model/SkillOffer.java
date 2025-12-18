package com.exmaple.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class SkillOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Skill skill;
    private String experienceLevel;
    private Integer availableHoursPerWeek;
    private Boolean active;
    public SkillOffer() {
    }
    public SkillOffer(Long id, User user, Skill skill, String experienceLevel,
                      Integer availableHoursPerWeek, Boolean active) {
        this.id = id;
        this.user = user;
        this.skill = skill;
        this.experienceLevel = experienceLevel;
        this.availableHoursPerWeek = availableHoursPerWeek;
        this.active = active;
    }
    public Long getId(){ 
        return id; 
    }
    public User getUser(){
        return user; 
    }
    public Skill getSkill(){
        return skill; 
    }
    public String getExperienceLevel(){
        return experienceLevel; 
    }
    public Integer getAvailableHoursPerWeek(){
        return availableHoursPerWeek;
    }
    public Boolean getActive(){
        return active;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setUser(User user){
        this.user = user;
    }
    public void setSkill(Skill skill){
        this.skill = skill;
    }
    public void setExperienceLevel(String experienceLevel){
        this.experienceLevel = experienceLevel;
    }
    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek){
        this.availableHoursPerWeek = availableHoursPerWeek;
    }
    public void setActive(Boolean active) { this.active = active; }
}
