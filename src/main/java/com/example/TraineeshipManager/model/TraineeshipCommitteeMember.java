package myy803.springboot.sb_tutorial_7_signup_signin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "traineeship_committee_members")
public class TraineeshipCommitteeMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public TraineeshipCommitteeMember() {
        super();
    }

    public TraineeshipCommitteeMember(String name) {
        super();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TraineeshipCommitteeMember [id=" + id + ", name=" + name + "]";
    }
}