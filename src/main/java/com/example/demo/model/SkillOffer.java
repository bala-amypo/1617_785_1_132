package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "skill_offers")
public class SkillOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserProfile user;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @NotBlank
    private String experienceLevel;

    @Min(1)
    private Integer availableHoursPerWeek;

    private boolean active = true;

    public SkillOffer() {}

    public SkillOffer(Long id, UserProfile user, Skill skill, String experienceLevel,
                      Integer availableHoursPerWeek, boolean active) {
        this.id = id;
        this.user = user;
        this.skill = skill;
        this.experienceLevel = experienceLevel;
        this.availableHoursPerWeek = availableHoursPerWeek;
        this.active = active;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }

    public String getExperienceLevel() { return experienceLevel; }
    public void setExperienceLevel(String experienceLevel) { this.experienceLevel = experienceLevel; }

    public Integer getAvailableHoursPerWeek() { return availableHoursPerWeek; }
    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek) {
        this.availableHoursPerWeek = availableHoursPerWeek;
    }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;

// @Entity
// public class SkillOffer {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     @ManyToOne
//     private User user;
//     @ManyToOne
//     private Skill skill;
//     private String experienceLevel;
//     private Integer availableHoursPerWeek;
//     private Boolean active;
//     public Long getId(){ 
//         return id; 
//     }
//     public User getUser(){
//         return user; 
//     }
//     public Skill getSkill(){
//         return skill; 
//     }
//     public String getExperienceLevel(){
//         return experienceLevel; 
//     }
//     public Integer getAvailableHoursPerWeek(){
//         return availableHoursPerWeek;
//     }
//     public Boolean getActive(){
//         return active;
//     }
//     public void setId(Long id){
//         this.id=id;
//     }
//     public void setUser(User user){
//         this.user=user;
//     }
//     public void setSkill(Skill skill){
//         this.skill=skill;
//     }
//     public void setExperienceLevel(String experienceLevel){
//         this.experienceLevel=experienceLevel;
//     }
//     public void setAvailableHoursPerWeek(Integer availableHoursPerWeek){
//         this.availableHoursPerWeek=availableHoursPerWeek;
//     }
//     public void setActive(Boolean active){
//         this.active=active;
//     }
//     public SkillOffer(){
//     }
//     public SkillOffer(Long id, User user, Skill skill, String experienceLevel,
//                       Integer availableHoursPerWeek, Boolean active) {
//         this.id=id;
//         this.user=user;
//         this.skill=skill;
//         this.experienceLevel=experienceLevel;
//         this.availableHoursPerWeek=availableHoursPerWeek;
//         this.active=active;
//     }
// }
