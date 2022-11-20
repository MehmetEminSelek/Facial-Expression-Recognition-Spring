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
    private String Determinato;

    @Column(nullable = false)
    private String Attivo;

    @Column(nullable = false)
    private String Interessato;

    @Column(nullable = false)
    private String Attento;

    @Column(nullable = false)
    private String Entusiasta;

    @Column(nullable = false)
    private String Concentrato;

    @Column(nullable = false)
    private String Forte;

    @Column(nullable = false)
    private String Inspirato;

    @Column(nullable = false)
    private String Eccitato;

    @Column(nullable = false)
    private String Impaurito;

    @Column(nullable = false)
    private String Turbato;

    @Column(nullable = false)
    private String Nervoso;

    @Column(nullable = false)
    private String Agitato;

    @Column(nullable = false)
    private String Spaventato;

    @Column(nullable = false)
    private String Angosciato;

    @Column(nullable = false)
    private String Colpevole;

    @Column(nullable = false)
    private String Vergogna;

    @Column(nullable = false)
    private String Irritabile;

    @Column(nullable = false)
    private String Ostile;

    @Column(nullable = false)
    private String Orgoglioso;
}
