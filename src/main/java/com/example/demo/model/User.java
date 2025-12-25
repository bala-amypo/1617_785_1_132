// package com.example.demo.model;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.Size;
// import java.time.LocalDateTime;

// @Entity
// @Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @NotBlank
//     @Size(min = 3)
//     private String fullName;

//     @Email
//     @NotBlank
//     private String email;

//     @NotBlank
//     private String password;

//     @NotBlank
//     private String role = "MONITOR";

//     private LocalDateTime createdAt = LocalDateTime.now();

//     public User() {}

//     public User(Long id, String fullName, String email,
//                 String password, String role, LocalDateTime createdAt) {
//         this.id = id;
//         this.fullName = fullName;
//         this.email = email;
//         this.password = password;
//         this.role = role;
//         this.createdAt = createdAt;
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public String getFullName() { return fullName; }
//     public void setFullName(String fullName) { this.fullName = fullName; }

//     public String getEmail() { return email; }
//     public void setEmail(String email) { this.email = email; }

//     public String getPassword() { return password; }
//     public void setPassword(String password) { this.password = password; }

//     public String getRole() { return role; }
//     public void setRole(String role) { this.role = role; }

//     public LocalDateTime getCreatedAt() { return createdAt; }
//     public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
// }
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
