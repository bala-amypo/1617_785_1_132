// package com.example.demo.model;

// import jakarta.persistence.*;
// import java.time.LocalDateTime;

// @Entity
// @Table(name = "match_records")
// public class MatchRecord {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "requester_id")
//     private UserProfile requester;

//     @ManyToOne
//     @JoinColumn(name = "provider_id")
//     private UserProfile provider;

//     @ManyToOne
//     @JoinColumn(name = "skill_requested_id")
//     private Skill skillRequested;

//     @ManyToOne
//     @JoinColumn(name = "skill_offered_id")
//     private Skill skillOffered;

//     private LocalDateTime matchedAt = LocalDateTime.now();
//     private String status = "MATCHED";

//     public MatchRecord() {}

//     public MatchRecord(Long id, UserProfile requester, UserProfile provider,
//                        Skill skillRequested, Skill skillOffered,
//                        LocalDateTime matchedAt, String status) {
//         this.id = id;
//         this.requester = requester;
//         this.provider = provider;
//         this.skillRequested = skillRequested;
//         this.skillOffered = skillOffered;
//         this.matchedAt = matchedAt;
//         this.status = status;
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public UserProfile getRequester() { return requester; }
//     public void setRequester(UserProfile requester) { this.requester = requester; }

//     public UserProfile getProvider() { return provider; }
//     public void setProvider(UserProfile provider) { this.provider = provider; }

//     public Skill getSkillRequested() { return skillRequested; }
//     public void setSkillRequested(Skill skillRequested) { this.skillRequested = skillRequested; }

//     public Skill getSkillOffered() { return skillOffered; }
//     public void setSkillOffered(Skill skillOffered) { this.skillOffered = skillOffered; }

//     public LocalDateTime getMatchedAt() { return matchedAt; }
//     public void setMatchedAt(LocalDateTime matchedAt) { this.matchedAt = matchedAt; }

//     public String getStatus() { return status; }
//     public void setStatus(String status) { this.status = status; }
// }