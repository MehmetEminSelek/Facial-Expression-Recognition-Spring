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

    private Integer code;

    private String testNo;

    private String determinato;

    private String attivo;

    private String interessato;

    private String attento;

    private String entusiasta;

    private String concentrato;

    private String forte;

    private String ispirato;

    private String eccitato;

    private String impaurito;

    private String turbato;

    private String nervoso;

    private String agitato;

    private String spaventato;

    private String angosciato;

    private String colpevole;

    private String vergogna;

    private String irritabile;

    private String ostile;

    private String orgoglioso;

}
