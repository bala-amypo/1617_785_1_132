package com.exmaple.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Generated Value;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
public class Skill{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    private String category;
    private String description;
    private Boolean active;
}