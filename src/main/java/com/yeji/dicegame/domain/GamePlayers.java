package com.yeji.dicegame.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GamePlayers {
    private List<GamePlayer> gamePlayers;

    public int playerScore(int index) {
        gamePlayers.get(index).getCurrentScore();
    }

    public String playerName(int index) {
        gamePlayers.get(index).getName();
    }


}