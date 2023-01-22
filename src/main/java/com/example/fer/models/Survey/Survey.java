package com.example.fer.models.Survey;

import com.example.fer.models.Base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "survey")
@Data
public class Survey extends BaseEntity {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_SURVEY", sequenceName = "SEQ_SURVEY", allocationSize = 1)
    @GeneratedValue(generator = "GEN_SURVEY", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private Integer code;


    private String testNo;

    @Column(nullable = false)
    private String determinato;

    @Column(nullable = false)
    private String attivo;

    @Column(nullable = false)
    private String interessato;

    @Column(nullable = false)
    private String attento;

    @Column(nullable = false)
    private String entusiasta;

    @Column(nullable = false)
    private String concentrato;

    @Column(nullable = false)
    private String forte;

    @Column(nullable = false)
    private String ispirato;

    @Column(nullable = false)
    private String eccitato;

    @Column(nullable = false)
    private String impaurito;

    @Column(nullable = false)
    private String turbato;

    @Column(nullable = false)
    private String nervoso;

    @Column(nullable = false)
    private String agitato;

    @Column(nullable = false)
    private String spaventato;

    @Column(nullable = false)
    private String angosciato;

    @Column(nullable = false)
    private String colpevole;

    @Column(nullable = false)
    private String vergogna;

    @Column(nullable = false)
    private String irritabile;

    @Column(nullable = false)
    private String ostile;

    @Column(nullable = false)
    private String orgoglioso;
}
