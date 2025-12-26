// package com.example.demo.model;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.Size;
// import java.time.LocalDateTime;
// import java.util.List;

// @Entity
// @Table(name = "user_profiles", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
// public class UserProfile {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @NotBlank
//     @Size(min = 3)
//     private String fullName;

//     @Email(message="Invalid Email")
//     @NotBlank
//     private String email;

//     private boolean active = true;

//     private LocalDateTime createdAt = LocalDateTime.now();

//     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//     private List<SkillOffer> skillOffers;

//     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//     private List<SkillRequest> skillRequests;

//     public UserProfile() {}

//     public UserProfile(Long id, String fullName, String email, boolean active, LocalDateTime createdAt) {
//         this.id = id;
//         this.fullName = fullName;
//         this.email = email;
//         this.active = active;
//         this.createdAt = createdAt;
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public String getFullName() { return fullName; }
//     public void setFullName(String fullName) { this.fullName = fullName; }

//     public String getEmail() { return email; }
//     public void setEmail(String email) { this.email = email; }

//     public boolean isActive() { return active; }
//     public void setActive(boolean active) { this.active = active; }

//     public LocalDateTime getCreatedAt() { return createdAt; }
//     public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

//     public List<SkillOffer> getSkillOffers() { return skillOffers; }
//     public void setSkillOffers(List<SkillOffer> skillOffers) { this.skillOffers = skillOffers; }

//     public List<SkillRequest> getSkillRequests() { return skillRequests; }
//     public void setSkillRequests(List<SkillRequest> skillRequests) { this.skillRequests = skillRequests; }
// }
package com.example.demo.model;

import java.sql.Timestamp;

public class UserProfile {
    private Long id;
    private String username;
    private String email;
    private boolean active = true;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
    
    public Timestamp getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Timestamp updatedAt) { this.updatedAt = updatedAt; }
}