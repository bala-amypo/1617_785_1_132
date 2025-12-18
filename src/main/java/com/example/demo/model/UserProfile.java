package com.exmaple.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Generated Value;
import jakarta.persistence.GenerationType;
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
    private boolean atcive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}