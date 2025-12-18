package com.exmaple.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Generated Value;
import jakarta.persistence.GenerationType;



@Entity
public class UserProfile{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Bool atcive;
    private Date createdAt;
    private Date updatedAt;
}