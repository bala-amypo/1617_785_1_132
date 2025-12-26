package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "skill_requests")
public class SkillRequest {

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
    private String urgencyLevel;

    private boolean active = true;

    public SkillRequest() {}

    public SkillRequest(Long id, UserProfile user, Skill skill, String urgencyLevel, boolean active) {
        this.id = id;
        this.user = user;
        this.skill = skill;
        this.urgencyLevel = urgencyLevel;
        this.active = active;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserProfile getUser() { return user; }
    public void setUser(UserProfile user) { this.user = user; }

    public Skill getSkill() { return skill; }
    public void setSkill(Skill skill) { this.skill = skill; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

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
// public class SkillRequest {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     @ManyToOne
//     private User user;
//     @ManyToOne
//     private Skill skill;
//     private String urgencyLevel;
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
//     public String getUrgencyLevel(){
//         return urgencyLevel;
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
//     public void setUrgencyLevel(String urgencyLevel){
//         this.urgencyLevel=urgencyLevel;
//     }
//     public void setActive(Boolean active){
//         this.active=active;
//     }
//     public SkillRequest(){
//     }
//     public SkillRequest(Long id, User user, Skill skill, String urgencyLevel, Boolean active) {
//         this.id=id;
//         this.user=user;
//         this.skill=skill;
//         this.urgencyLevel=urgencyLevel;
//         this.active=active;
//     }
// }
