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
    @PrePersist
    public void onMatch(){
        if (this.matchedAt==null){
            this.matchedAt = LocalDateTime.now();
        }
        if (this.status == null) {
            this.status = "PENDING";
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
