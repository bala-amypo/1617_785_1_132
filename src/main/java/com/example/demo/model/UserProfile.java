package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user_profiles", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3)
    private String fullName;

    @Email
    @NotBlank
    private String email;

    private boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SkillOffer> skillOffers;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SkillRequest> skillRequests;

    public UserProfile() {}

    public UserProfile(Long id, String fullName, String email, boolean active, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.active = active;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public List<SkillOffer> getSkillOffers() { return skillOffers; }
    public void setSkillOffers(List<SkillOffer> skillOffers) { this.skillOffers = skillOffers; }

    public List<SkillRequest> getSkillRequests() { return skillRequests; }
    public void setSkillRequests(List<SkillRequest> skillRequests) { this.skillRequests = skillRequests; }
}

// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Column;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.PrePersist;
// import jakarta.persistence.PreUpdate;
// import java.time.LocalDateTime;


// @Entity
// public class UserProfile{
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     @Column(unique=true)
//     private String username;
//     @Column(unique=true)
//     private String email;
//     private String bio;
//     private Boolean active;
//     private LocalDateTime createdAt;
//     private LocalDateTime updatedAt;
//     @PrePersist
//     public void Oncreate(){
//         LocalDateTime now=LocalDateTime.now();
//         if(this.createdAt==null){
//             this.createdAt=now;
//         }
//         this.updatedAt=now;
//     }
//     @PreUpdate
//     public void Onupdate(){
//         LocalDateTime now=LocalDateTime.now();
//         this.updatedAt=now;
//     }
//     public Long getId(){
//         return id;
//     }
//     public String getUsername(){
//         return username;
//     }
//     public String getEmail(){
//         return email;
//     }
//     public String getBio(){
//         return bio;
//     }
//     public Boolean getActive(){
//         return active;
//     }
//     public LocalDateTime getCreatedAt(){
//         return createdAt;
//     }
//     public LocalDateTime getUpdatedAt(){
//         return updatedAt;
//     }
//     public void setId(Long id){
//         this.id=id;
//     }
//     public void setUsername(String username){
//         this.username=username;
//     }
//     public void setEmail(String email){
//         this.email=email;
//     }
//     public void setBio(String bio){
//         this.bio=bio;
//     }
//     public void setActive(Boolean active){
//         this.active=active;
//     }
//     public void setUpdatedAt(LocalDateTime updatedAt){
//         this.updatedAt=updatedAt;
//     }
//     public void setCreatedAt(LocalDateTime createdAt){
//         this.createdAt=createdAt;
//     }
//     public UserProfile(){
//         this.active=true;
//     }
//     public UserProfile(Long id, String username, String email, String bio,
//                 Boolean active, LocalDateTime createdAt, LocalDateTime updatedAt) {
//         this.id=id;
//         this.username=username;
//         this.email=email;
//         this.bio=bio;
//         this.active=active;
//         this.createdAt=createdAt;
//         this.updatedAt=updatedAt;
//     }
// }

