package com.example.fer.controller.Survey;

import com.example.fer.models.Survey.DTO.SurveyDTO;
import com.example.fer.models.Survey.Survey;
import com.example.fer.repository.Survey.SurveyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/survey")
public class SurveyController {
    private  final SurveyRepository surveyRepository;

    public SurveyController(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @PostMapping("/save")
    public void saveSurvey(@RequestBody SurveyDTO surveyRequest){
        Survey survey = new Survey();

        survey.setDeterminato(surveyRequest.getDeterminato());
        survey.setAttivo(surveyRequest.getAttivo());
        survey.setInteressato(surveyRequest.getInteressato());
        survey.setAttento(surveyRequest.getAttento());
        survey.setEntusiasta(surveyRequest.getEntusiasta());
        survey.setConcentrato(surveyRequest.getConcentrato());
        survey.setForte(surveyRequest.getForte());
        survey.setInspirato(surveyRequest.getInspirato());
        survey.setEccitato(surveyRequest.getEccitato());
        survey.setImpaurito(surveyRequest.getImpaurito());
        survey.setTurbato(surveyRequest.getTurbato());
        survey.setNervoso(surveyRequest.getNervoso());
        survey.setAgitato(surveyRequest.getAgitato());
        survey.setSpaventato(surveyRequest.getSpaventato());
        survey.setAngosciato(surveyRequest.getAngosciato());
        survey.setColpevole(surveyRequest.getColpevole());
        survey.setVergogna(surveyRequest.getVergogna());
        survey.setIrritabile(surveyRequest.getIrritabile());
        survey.setOstile(surveyRequest.getOstile());
        survey.setOrgoglioso(surveyRequest.getOrgoglioso());




        surveyRepository.save(survey);
    }
}
