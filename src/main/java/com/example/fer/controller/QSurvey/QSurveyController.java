package com.example.fer.controller.QSurvey;

import com.example.fer.models.QSurvey.DTO.QSurveyDTO;
import com.example.fer.models.QSurvey.QSurvey;
import com.example.fer.repository.QSurvey.QSurveyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://wafer-experiment.com","http://waferresults.com","http://wafer-game.com"})
@RequestMapping("/survey")
public class QSurveyController {

    private final QSurveyRepository qSurveyRepository;

    public QSurveyController(QSurveyRepository qSurveyRepository) {
        this.qSurveyRepository = qSurveyRepository;
    }

    @PostMapping("/qsave")
    public void saveSurvey (@RequestBody QSurveyDTO qsurveyRequest){
        QSurvey qsurvey = new QSurvey();

        qsurvey.setCode(qsurveyRequest.getCode());
        qsurvey.setQ1(qsurveyRequest.getQ1());
        qsurvey.setQ2(qsurveyRequest.getQ2());
        qsurvey.setQ3(qsurveyRequest.getQ3());
        qsurvey.setQ4(qsurveyRequest.getQ4());
        qsurvey.setQ5(qsurveyRequest.getQ5());
        qsurvey.setQ6(qsurveyRequest.getQ6());
        qsurvey.setQ7(qsurveyRequest.getQ7());
        qsurvey.setQ8(qsurveyRequest.getQ8());
        qsurvey.setQ9(qsurveyRequest.getQ9());
        qsurvey.setQ10(qsurveyRequest.getQ10());
        qsurvey.setQ11(qsurveyRequest.getQ11());
        qsurvey.setQ12(qsurveyRequest.getQ12());
        qsurvey.setQ13(qsurveyRequest.getQ13());
        qsurvey.setQ14(qsurveyRequest.getQ14());
        qsurvey.setQ15(qsurveyRequest.getQ15());


        qSurveyRepository.save(qsurvey);
    }
}
