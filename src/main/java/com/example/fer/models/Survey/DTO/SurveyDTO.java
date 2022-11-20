package com.example.fer.models.Survey.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class SurveyDTO {
    private String Determinato;

    private String Attivo;

    private String Interessato;

    private String Attento;

    private String Entusiasta;

    private String Concentrato;

    private String Forte;

    private String Inspirato;

    private String Eccitato;

    private String Impaurito;

    private String Turbato;

    private String Nervoso;

    private String Agitato;

    private String Spaventato;

    private String Angosciato;

    private String Colpevole;

    private String Vergogna;

    private String Irritabile;

    private String Ostile;

    private String Orgoglioso;

}
