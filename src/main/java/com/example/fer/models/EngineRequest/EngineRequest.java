package com.example.fer.models.EngineRequest;


import lombok.Data;

@Data
public class EngineRequest {
    private String sender;
    private String message;
    private String testSubjectName;
    private int experimentNo;
}
