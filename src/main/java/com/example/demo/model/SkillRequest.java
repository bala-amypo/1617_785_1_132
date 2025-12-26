// package com.example.demo.model;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;

// @Entity
// @Table(name = "skill_requests")
// public class SkillRequest {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "user_id", nullable = false)
//     private UserProfile user;

//     @ManyToOne
//     @JoinColumn(name = "skill_id", nullable = false)
//     private Skill skill;

//     @NotBlank
//     private String urgencyLevel;

//     private boolean active = true;

//     public SkillRequest() {}

//     public SkillRequest(Long id, UserProfile user, Skill skill, String urgencyLevel, boolean active) {
//         this.id = id;
//         this.user = user;
//         this.skill = skill;
//         this.urgencyLevel = urgencyLevel;
//         this.active = active;
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public UserProfile getUser() { return user; }
//     public void setUser(UserProfile user) { this.user = user; }

//     public Skill getSkill() { return skill; }
//     public void setSkill(Skill skill) { this.skill = skill; }

//     public String getUrgencyLevel() { return urgencyLevel; }
//     public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

//     public boolean isActive() { return active; }
//     public void setActive(boolean active) { this.active = active; }
// }

