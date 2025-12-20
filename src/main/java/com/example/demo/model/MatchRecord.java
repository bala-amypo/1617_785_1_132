package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class MatchRecord{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User userA;
    @ManyToOne
    private User userB;
    @ManyToOne
    private Skill skillOfferedByA;
    @ManyToOne
    private Skill skillOfferedByB;
    private LocalDateTime matchedAt;
    private String status;
    @PrePersist
    public void onMatch(){
        if (this.matchedAt==null){
            this.matchedAt=LocalDateTime.now();
        }
        if (this.status==null){
            this.status="PENDING";
        }
    }
    public Long getId(){
        return id;
    }
    public User getUserA(){
        return userA;
    }
    public User getUserB(){
        return userB;
    }
    public Skill getSkillOfferedByA(){
        return skillOfferedByA;
    }
    public Skill getSkillOfferedByB(){
        return skillOfferedByB;
    }
    public LocalDateTime getMatchedAt(){
        return matchedAt;
    }
    public String getStatus(){
        return status;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setUserA(User userA){
        this.userA=userA;
    }
    public void setUserB(User userB){
        this.userB=userB;
    }
    public void setSkillOfferedByA(Skill skillOfferedByA){
        this.skillOfferedByA=skillOfferedByA;
    }
    public void setSkillOfferedByB(Skill skillOfferedByB){
        this.skillOfferedByB=skillOfferedByB;
    }
    public void setMatchedAt(LocalDateTime matchedAt){
        this.matchedAt=matchedAt;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public MatchRecord(){
        this.status="PENDING";
    }
    public MatchRecord(Long id,User userA,User userB,
                       Skill skillOfferedByA,Skill skillOfferedByB,
                       LocalDateTime matchedAt,String status){
        this.id=id;
        this.userA=userA;
        this.userB=userB;
        this.skillOfferedByA=skillOfferedByA;
        this.skillOfferedByB=skillOfferedByB;
        this.matchedAt=matchedAt;
        this.status=status;
    }
}








package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Skill{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    private String category;
    private String description;
    private Boolean active;
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getDescription(){
        return description;
    }
    public Boolean getActive(){
        return active;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public Skill(){
    }
    public Skill(Long id, String name, String category, String description, Boolean active) {
        this.id=id;
        this.name=name;
        this.category=category;
        this.description=description;
        this.active=active;
    }
}
package com.example.demo.model;

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
        this.id=id;
    }
    public void setUser(User user){
        this.user=user;
    }
    public void setSkill(Skill skill){
        this.skill=skill;
    }
    public void setExperienceLevel(String experienceLevel){
        this.experienceLevel=experienceLevel;
    }
    public void setAvailableHoursPerWeek(Integer availableHoursPerWeek){
        this.availableHoursPerWeek=availableHoursPerWeek;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public SkillOffer(){
    }
    public SkillOffer(Long id, User user, Skill skill, String experienceLevel,
                      Integer availableHoursPerWeek, Boolean active) {
        this.id=id;
        this.user=user;
        this.skill=skill;
        this.experienceLevel=experienceLevel;
        this.availableHoursPerWeek=availableHoursPerWeek;
        this.active=active;
    }
}
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
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    public Long getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getRole(){
        return role;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRole(String role){
        this.role=role;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public User(){
        this.role="MONITOR";
    }
    public User(Long id,String fullName,String email,
                String password,String role,LocalDateTime createdAt){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.role=role;
        this.createdAt=createdAt;
    }
    
}
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.time.LocalDateTime;


@Entity
public class UserProfile{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String username;
    @Column(unique=true)
    private String email;
    private String bio;
    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
    public void Oncreate(){
        LocalDateTime now=LocalDateTime.now();
        if(this.createdAt==null){
            this.createdAt=now;
        }
        this.updatedAt=now;
    }
    @PreUpdate
    public void Onupdate(){
        LocalDateTime now=LocalDateTime.now();
        this.updatedAt=now;
    }
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getBio(){
        return bio;
    }
    public Boolean getActive(){
        return active;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setBio(String bio){
        this.bio=bio;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt=updatedAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public UserProfile(){
        this.active=true;
    }
    public UserProfile(Long id, String username, String email, String bio,
                Boolean active, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id=id;
        this.username=username;
        this.email=email;
        this.bio=bio;
        this.active=active;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }
}