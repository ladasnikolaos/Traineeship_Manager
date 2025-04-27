package com.example.TraineeshipManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "students")
@PrimaryKeyJoinColumn(name = "username")
public class Student extends User {

    private String studentName;
    private String AM;
    private double avgGrade;
    private String preferredLocation;
    private String interests;
    private String skills;
    private boolean lookingForTraineeship = false;


    @OneToOne(mappedBy = "student")
    private Traineeship assignedTraineeship;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAM() {
        return AM;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public boolean isLookingForTraineeship() {
        return lookingForTraineeship;
    }

    public void setLookingForTraineeship(boolean lookingForTraineeship) {
        this.lookingForTraineeship = lookingForTraineeship;
    }

    public Traineeship getAssignedTraineeship() {
        return assignedTraineeship;
    }

    public void setAssignedTraineeship(Traineeship assignedTraineeship) {
        this.assignedTraineeship = assignedTraineeship;
    }
}