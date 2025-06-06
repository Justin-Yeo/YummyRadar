package com.yummyradar.backend.auth.entity;

import jakarta.persistence.*;


@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"), // enforces the unique constraints on these cols in db
                @UniqueConstraint(columnNames = "email")
        }
)
public class User {

    // attributes
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increments id when new user added
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    // getters and setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long newId) {
        this.id = newId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

