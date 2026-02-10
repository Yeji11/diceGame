package com.yeji.dicegame.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Game {

    private String playerName;

    private int playerScore;

    private LocalDateTime createdAt;

    private String winnerName;

    private int currentRound;

    private int totalRound;

}
