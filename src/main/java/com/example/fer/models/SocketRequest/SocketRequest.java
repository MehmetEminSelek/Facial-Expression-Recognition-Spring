package com.example.fer.models.SocketRequest;

import lombok.Data;

@Data
public class SocketRequest {
    private int id;
    private String sender;
    private int experimentCount;
    private String model;
    private double neutral;
    private double happy;
    private double sad;
    private double angry;
    private double fear;
    private double surprise;
    private double disgust;
    private double xcord;
    private double ycord;
    private String status;
}

