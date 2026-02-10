package com.yeji.dicegame.repository;

import com.yeji.dicegame.domain.FraudPlayer;
import com.yeji.dicegame.domain.Player;

public class Recorder {


    public void printGameStart(Player player, FraudPlayer fraudPlayer, int gameCount) {
        System.out.println("player1은 " + player.name + " player2는 " + fraudPlayer.name + "게임은 " + gameCount + "번 진행하겠습니다.");
    }

    public void printCurrentPoints(Player player, FraudPlayer fraudPlayer) {
        System.out.println("[" + player.name + " : " + player.currentScore + "점 "  + fraudPlayer.name + " : " + fraudPlayer.currentScore + "점]");
    }
}
