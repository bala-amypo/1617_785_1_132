package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class SkillRequest {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Skill skill;
    private String urgencyLevel;
    private Boolean active;
    public Long getId(){
        return id;
    }
    public User getUser(){
        return user;
    }
    public Skill getSkill(){
        return skill;
    }
    public String getUrgencyLevel(){
        return urgencyLevel;
    }
    public Boolean getActive(){
        return active;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setUser(User user){
        this.user=user;
    }
    public void setSkill(Skill skill){
        this.skill=skill;
    }
    public void setUrgencyLevel(String urgencyLevel){
        this.urgencyLevel=urgencyLevel;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public SkillRequest(){
    }
    public SkillRequest(Long id, User user, Skill skill, String urgencyLevel, Boolean active) {
        this.id=id;
        this.user=user;
        this.skill=skill;
        this.urgencyLevel=urgencyLevel;
        this.active=active;
    }
}
