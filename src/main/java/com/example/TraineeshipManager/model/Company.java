package com.example.TraineeshipManager.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="companies")
@PrimaryKeyJoinColumn(name = "username")

public class Company extends User{
    private String companyName;
    private String location;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Traineeship> positions = new ArrayList<>();

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Traineeship> getPositions() {
        return positions;
    }

    public void setPositions(List<Traineeship> positions) {
        this.positions = positions;
    }


}
