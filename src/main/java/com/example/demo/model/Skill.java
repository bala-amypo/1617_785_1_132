// package com.example.demo.model;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;

// @Entity
// @Table(name = "skills", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
// public class Skill {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @NotBlank
//     private String name;

//     private String category;
//     private String description;
//     private boolean active = true;

//     public Skill() {}

//     public Skill(Long id, String name, String category, String description, boolean active) {
//         this.id = id;
//         this.name = name;
//         this.category = category;
//         this.description = description;
//         this.active = active;
//     }

//     public Long getId() { return id; }
//     public void setId(Long id) { this.id = id; }

//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }

//     public String getCategory() { return category; }
//     public void setCategory(String category) { this.category = category; }

//     public String getDescription() { return description; }
//     public void setDescription(String description) { this.description = description; }

//     public boolean isActive() { return active; }
//     public void setActive(boolean active) { this.active = active; }
// }
package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private boolean active = true;

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
