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
public class GamePlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String playerId;

    private String name;

    private String mode;

    private int currentScore;



    public static GamePlayer createPlayer(String playerId, String playerName) {
        return GamePlayer.builder()
                .id(0L)
                .playerId(playerId)
                .currentScore(0)
                .mode("NORMAL")
                .name(playerName)
                .build();
    }

}


