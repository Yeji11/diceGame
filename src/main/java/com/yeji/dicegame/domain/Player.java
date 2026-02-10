package com.yeji.dicegame.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public String name;

    private String mode;

    private int gameCount;

    public int currentScore;

    private int totalScore;

    }


