package com.yeji.dicegame.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gamePlayer1Id;

    private String gamePlayer2Id;

    private LocalDateTime createdAt;

    private String winnerName;

    private int currentRound;

    private int gameCount;

    public static GameEntity newGameEntity(List<String> playerIds, int gameCount) {
        return GameEntity.builder()
                .createdAt(LocalDateTime.now())
                .gamePlayer1Id(playerIds.get(0))
                .gamePlayer2Id(playerIds.get(1))
                .gameCount(gameCount)
                .build();
    }

}
