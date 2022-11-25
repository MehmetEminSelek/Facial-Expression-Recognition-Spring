package com.example.fer.controller.Store;

import com.example.fer.models.Affectnet.Affectnet;
import com.example.fer.models.Raf.Raf;
import com.example.fer.models.SocketRequest.SocketRequest;
import com.example.fer.repository.Raf.RafRepository;
import  com.example.fer.repository.Affectnet.AffectnetRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://wafer-experiment.com","http://waferresults.com","http://wafer-game.com"})
public class StoreController {

    private final AffectnetRepository affectnetRepository;
    private final RafRepository rafRepository;

    public StoreController(AffectnetRepository affectnetRepository, RafRepository rafRepository) {
        this.affectnetRepository = affectnetRepository;
        this.rafRepository = rafRepository;
    }

    //Deneme
    @PostMapping("/save")
    public void saveData(@RequestBody List<SocketRequest> socketRequest){
        List<Raf> rafList = convertToRaf(socketRequest);
        List<Affectnet> affectnetList = convertToAffectnet(socketRequest);
        rafRepository.saveAll(rafList);
        affectnetRepository.saveAll(affectnetList);
    }

    public List<Affectnet> convertToAffectnet(List<SocketRequest> socketRequest){
        return socketRequest.stream().filter(y -> y.getModel().equals("Affectnet")).map(x -> {
            Affectnet affectnet = new Affectnet();
            affectnet.setTestSubjectName(x.getSender());
            affectnet.setExperimentNo(x.getExperimentCount());
            affectnet.setNeutral(x.getNeutral());
            affectnet.setHappy(x.getHappy());
            affectnet.setSad(x.getSad());
            affectnet.setAngry(x.getAngry());
            affectnet.setFear(x.getFear());
            affectnet.setSurprise(x.getSurprise());
            affectnet.setDisgust(x.getDisgust());
            affectnet.setXcord(x.getXcord());
            affectnet.setYcord(x.getYcord());
            affectnet.setStatus(x.getStatus());
            affectnet.setTimeStamp(x.getTimeStamp());
            return affectnet;
        }).toList();
    };

    public List<Raf> convertToRaf(List<SocketRequest> socketRequest){
        return socketRequest.stream().filter(y -> y.getModel().equals("Raf")).map(x -> {
            Raf raf = new Raf();
            raf.setTestSubjectName(x.getSender());
            raf.setExperimentNo(x.getExperimentCount());
            raf.setNeutral(x.getNeutral());
            raf.setHappy(x.getHappy());
            raf.setSad(x.getSad());
            raf.setAngry(x.getAngry());
            raf.setFear(x.getFear());
            raf.setSurprise(x.getSurprise());
            raf.setDisgust(x.getDisgust());
            raf.setXcord(x.getXcord());
            raf.setYcord(x.getYcord());
            raf.setStatus(x.getStatus());
            raf.setTimeStamp(x.getTimeStamp());
            return raf;
        }).toList();
    };
}
