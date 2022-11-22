package com.example.fer.models.Affectnet;

import com.example.fer.models.Base.BaseEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "affectnet_results")
@Data
public class Affectnet extends BaseEntity {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_AFFECTNET", sequenceName = "SEQ_AFFECTNET", allocationSize = 1)
    @GeneratedValue(generator = "GEN_AFFECTNET", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String testSubjectName;

    @Column(nullable = false)
    private int experimentNo;

    @Column(nullable = false)
    private double Neutral;

    @Column(nullable = false)
    private double Happy;

    @Column(nullable = false)
    private double Sad;

    @Column(nullable = false)
    private double Angry;

    @Column(nullable = false)
    private double Fear;

    @Column(nullable = false)
    private double Surprise;

    @Column(nullable = false)
    private double Disgust;

    @Column(nullable = false)
    private double xcord;

    @Column(nullable = false)
    private double ycord;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String timeStamp;
}
