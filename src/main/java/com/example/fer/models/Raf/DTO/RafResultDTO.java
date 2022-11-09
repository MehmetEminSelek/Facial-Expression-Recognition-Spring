package com.example.fer.models.Raf.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RafResultDTO {
    private int Neutral;
    private int Happy;
    private int Sad;
    private int Angry;
    private int Fear;
    private int Suprise;
    private int Disgust;
}
