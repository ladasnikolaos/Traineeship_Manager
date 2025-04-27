package com.example.TraineeshipManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professors")
@PrimaryKeyJoinColumn(name = "username")
public class Professor extends User {
    private String professorName;
    private String interests;

    @OneToMany(mappedBy = "supervisor")
    private List<Traineeship> supervisedTraineeships = new ArrayList<>();


    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public List<Traineeship> getSupervisedTraineeships() {
        return supervisedTraineeships;
    }

    public void setSupervisedTraineeships(List<Traineeship> supervisedTraineeships) {
        this.supervisedTraineeships = supervisedTraineeships;
    }
}