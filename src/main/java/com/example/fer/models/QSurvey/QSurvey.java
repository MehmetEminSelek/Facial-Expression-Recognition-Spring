package com.example.fer.models.QSurvey;

import com.example.fer.models.Base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "qsurvey")
@Data
public class QSurvey extends BaseEntity {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_QSURVEY", sequenceName = "SEQ_QSURVEY", allocationSize = 1)
    @GeneratedValue(generator = "GEN_QSURVEY", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private Integer code;

    @Column(nullable = false)
    private String q1;

    @Column(nullable = false)
    private String q2;

    @Column(nullable = false)
    private String q3;

    @Column(nullable = false)
    private String q4;

    @Column(nullable = false)
    private String q5;

    @Column(nullable = false)
    private String q6;

    @Column(nullable = false)
    private String q7;

    @Column(nullable = false)
    private String q8;

    @Column(nullable = false)
    private String q9;

    @Column(nullable = false)
    private String q10;

    @Column(nullable = false)
    private String q11;

    @Column(nullable = false)
    private String q12;

    @Column(nullable = false)
    private String q13;

    @Column(nullable = false)
    private String q14;

    @Column(nullable = false)
    private String q15;
}
