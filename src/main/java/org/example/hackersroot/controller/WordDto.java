package org.example.hackersroot.controller;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WordDto {
    private String eng;
    private String kor;
    private int day;
}

