package com.example.fer.models.User.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserDTO {

    private String name;
    private int phone;
    private int age;
    private int ref;
    private String edu;
    private String gender;
    private String snake;
    private String memory;
}