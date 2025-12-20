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
        LocalD
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