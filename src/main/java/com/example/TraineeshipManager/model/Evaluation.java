package com.example.TraineeshipManager.model;

import jakarta.persistence.*;


@Entity
@Table(name = "evaluations")
public class Evaluation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EvaluationSource evaluationSource;

    private int motivation;
    private int efficiency;
    private int effectiveness;


    @ManyToOne
    @JoinColumn(name = "traineeship_id")
    private Traineeship traineeship;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EvaluationSource getEvaluationSource() {
        return evaluationSource;
    }

    public void setEvaluationSource(EvaluationSource evaluationSource) {
        this.evaluationSource = evaluationSource;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public int getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(int effectiveness) {
        this.effectiveness = effectiveness;
    }

    public Traineeship getTraineeshipPosition() {
        return traineeship;
    }

    public void setTraineeshipPosition(Traineeship traineeshipPosition) {
        this.traineeship= traineeshipPosition;
    }
}

