package dev.delts.jobaro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    private String userName;
    private String emailAddress;
    private String password;
    private LocalDate createdAt;
    @Column(nullable = true)
    private LocalDate deletedAt;

    public User() { }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getDeletedAt() {
        return deletedAt;
    }
}
