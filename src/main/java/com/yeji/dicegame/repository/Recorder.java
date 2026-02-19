package com.yeji.dicegame.repository;

import com.yeji.dicegame.domain.GamePlayer;
import com.yeji.dicegame.domain.GamePlayers;

public class Recorder {


    public void printGameStart(GamePlayers players, int gameCount) {
        System.out.println("player1은 " + players.playerScore(0) + " player2는 " + players.playerScore(1) + "게임은 " + gameCount + "번 진행하겠습니다.");
    }

    public void printCurrentPoints(GamePlayers players) {
        System.out.println("[" + players.playerName(0) + " : " + players.playerScore(0) + "점 "  + players.playerName(1) + " : " + players.playerScore(1) + "점]");
    }
}
