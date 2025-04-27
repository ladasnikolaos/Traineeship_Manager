package com.example.TraineeshipManager.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="traineeships")
public class Traineeship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;


    private String title;

// @Column(length=2000)
    private String description;


    private LocalDate startDate;
    private LocalDate endDate;


    private String topics;
    private String skills;


    private boolean isAssigned = false;

    //@Column(length = 4000)
    private String studentLogbook;
    private boolean passFailGrade;

    @OneToOne
    @JoinColumn(name="student_username")
    private Student student;

    @ManyToOne
    @JoinColumn(name="professor_username")
    private Professor supervisor;

    @ManyToOne
    @JoinColumn(name="company_username")
    private Company company;


    @OneToMany(mappedBy = "traineeship",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Evaluation> evaluations;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public String getStudentLogbook() {
        return studentLogbook;
    }

    public void setStudentLogbook(String studentLogbook) {
        this.studentLogbook = studentLogbook;
    }

    public boolean isPassFailGrade() {
        return passFailGrade;
    }

    public void setPassFailGrade(boolean passFailGrade) {
        this.passFailGrade = passFailGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }
}
