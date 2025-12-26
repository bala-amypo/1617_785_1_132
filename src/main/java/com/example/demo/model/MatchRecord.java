package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "match_records")
public class MatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "requester_id")
    private UserProfile requester;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private UserProfile provider;

    @ManyToOne
    @JoinColumn(name = "skill_requested_id")
    private Skill skillRequested;

    @ManyToOne
    @JoinColumn(name = "skill_offered_id")
    private Skill skillOffered;

    private LocalDateTime matchedAt = LocalDateTime.now();
    private String status = "MATCHED";

    public MatchRecord() {}

    public MatchRecord(Long id, UserProfile requester, UserProfile provider,
                       Skill skillRequested, Skill skillOffered,
                       LocalDateTime matchedAt, String status) {
        this.id = id;
        this.requester = requester;
        this.provider = provider;
        this.skillRequested = skillRequested;
        this.skillOffered = skillOffered;
        this.matchedAt = matchedAt;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserProfile getRequester() { return requester; }
    public void setRequester(UserProfile requester) { this.requester = requester; }

    public UserProfile getProvider() { return provider; }
    public void setProvider(UserProfile provider) { this.provider = provider; }

    public Skill getSkillRequested() { return skillRequested; }
    public void setSkillRequested(Skill skillRequested) { this.skillRequested = skillRequested; }

    public Skill getSkillOffered() { return skillOffered; }
    public void setSkillOffered(Skill skillOffered) { this.skillOffered = skillOffered; }

    public LocalDateTime getMatchedAt() { return matchedAt; }
    public void setMatchedAt(LocalDateTime matchedAt) { this.matchedAt = matchedAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.PrePersist;
// import java.time.LocalDateTime;

// @Entity
// public class MatchRecord{
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     @ManyToOne
//     private User userA;
//     @ManyToOne
//     private User userB;
//     @ManyToOne
//     private Skill skillOfferedByA;
//     @ManyToOne
//     private Skill skillOfferedByB;
//     private LocalDateTime matchedAt;
//     private String status;
//     @PrePersist
//     public void onMatch(){
//         if (this.matchedAt==null){
//             this.matchedAt=LocalDateTime.now();
//         }
//         if (this.status==null){
//             this.status="PENDING";
//         }
//     }
//     public Long getId(){
//         return id;
//     }
//     public User getUserA(){
//         return userA;
//     }
//     public User getUserB(){
//         return userB;
//     }
//     public Skill getSkillOfferedByA(){
//         return skillOfferedByA;
//     }
//     public Skill getSkillOfferedByB(){
//         return skillOfferedByB;
//     }
//     public LocalDateTime getMatchedAt(){
//         return matchedAt;
//     }
//     public String getStatus(){
//         return status;
//     }
//     public void setId(Long id){
//         this.id=id;
//     }
//     public void setUserA(User userA){
//         this.userA=userA;
//     }
//     public void setUserB(User userB){
//         this.userB=userB;
//     }
//     public void setSkillOfferedByA(Skill skillOfferedByA){
//         this.skillOfferedByA=skillOfferedByA;
//     }
//     public void setSkillOfferedByB(Skill skillOfferedByB){
//         this.skillOfferedByB=skillOfferedByB;
//     }
//     public void setMatchedAt(LocalDateTime matchedAt){
//         this.matchedAt=matchedAt;
//     }
//     public void setStatus(String status){
//         this.status=status;
//     }
//     public MatchRecord(){
//         this.status="PENDING";
//     }
//     public MatchRecord(Long id,User userA,User userB,
//                        Skill skillOfferedByA,Skill skillOfferedByB,
//                        LocalDateTime matchedAt,String status){
//         this.id=id;
//         this.userA=userA;
//         this.userB=userB;
//         this.skillOfferedByA=skillOfferedByA;
//         this.skillOfferedByB=skillOfferedByB;
//         this.matchedAt=matchedAt;
//         this.status=status;
//     }
// }