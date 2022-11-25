package com.example.fer.controller.Socket;

import com.example.fer.models.EngineRequest.EngineRequest;
import com.example.fer.models.SocketRequest.SocketRequest;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = {"https://wafer-experiment.com","https://waferresults.com","https://wafer-game.com"})
public class SocketController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public SocketController(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @MessageMapping("/prediction")
    public void predictionSend(@Payload SocketRequest socketRequest) {
        simpMessagingTemplate.convertAndSend("/prediction-listen",socketRequest);
    }

    @MessageMapping("/engine")
    public void engineSend(@Payload EngineRequest engineRequest) {
        simpMessagingTemplate.convertAndSend("/engine-listen",engineRequest);
    }
}
