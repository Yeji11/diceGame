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

    private String name;

    private int totalGameCount;

    private int totalWinCount;

    private int currentScore;

    private int totalScore;


    public static Player createPlayer(String playerName) {
        return Player.builder()
                .id(0L)
                .currentScore(0)
                .name(playerName)
                .totalGameCount(0)
                .totalWinCount(0)
                .totalScore(0)
                .build();
    }

}


