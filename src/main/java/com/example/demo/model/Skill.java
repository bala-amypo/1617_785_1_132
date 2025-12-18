package com.example.demo.model;

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
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getDescription(){
        return description;
    }
    public Boolean getActive(){
        return active;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setActive(Boolean active){
        this.active=active;
    }
    public Skill(){
    }
    public Skill(Long id, String name, String category, String description, Boolean active) {
        this.id=id;
        this.name=name;
        this.category=category;
        this.description=description;
        this.active=active;
    }
}
