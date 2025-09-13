package dev.delts.jobaro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue
    private UUID id;

    private String companyName;
    private String positionTitle;
    private String applicationMethod;
    private String status;
    @Column(nullable = true)
    private String contactPerson;
    private String workSetup;

    private Double salary;
    @Column(nullable = true)
    private Double salaryRangeLow;
    @Column(nullable = true)
    private Double salaryRangeHigh;

    @Column(nullable = true)
    private String notes;
    private String source;
    @Column(nullable = true)
    private LocalDate followUpDate;

    private String link;

    private LocalDate createdAt;
    private LocalDate updatedAt;

    @Column(nullable = true)
    private LocalDate deletedAt;

    public JobApplication() { }

    public UUID getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getApplicationMethod() {
        return applicationMethod;
    }

    public String getStatus() {
        return status;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getWorkSetup() {
        return workSetup;
    }

    public Double getSalary() {
        return salary;
    }

    public Double getSalaryRangeLow() {
        return salaryRangeLow;
    }

    public Double getSalaryRangeHigh() {
        return salaryRangeHigh;
    }

    public String getNotes() {
        return notes;
    }

    public String getSource() {
        return source;
    }

    public LocalDate getFollowUpDate() {
        return followUpDate;
    }

    public String getLink() {
        return link;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public LocalDate getDeletedAt() {
        return deletedAt;
    }
}
