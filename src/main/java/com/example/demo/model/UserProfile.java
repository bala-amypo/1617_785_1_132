package com.exmaple.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserProfile{
    @Id
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Bool atcive;
    private Date createdAt;
    private Date updatedAt;
}