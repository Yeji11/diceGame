package com.yeji.dicegame.service;

import com.yeji.dicegame.domain.FraudPlayer;
import com.yeji.dicegame.domain.Player;
import com.yeji.dicegame.repository.FraudPlayerRepository;
import com.yeji.dicegame.repository.PlayerRepository;
import com.yeji.dicegame.repository.Recorder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class Judge {

    private final PlayerRepository playerRepository;
    private final FraudPlayerRepository fraudPlayerRepository;
    private final Recorder recorder;

    public Judge(PlayerRepository playerRepository, FraudPlayerRepository fraudPlayerRepository, Recorder recorder) {
        this.playerRepository = playerRepository;
        this.fraudPlayerRepository = fraudPlayerRepository;
        this.recorder = recorder;
    }

    public String registerPlayer(String playerName, String fraudPlayerName, int gameCount) {
        Player player = new Player(null, playerName, "NORMAL",gameCount, 0, 0);
        FraudPlayer fraudPlayer = new FraudPlayer(null, fraudPlayerName,gameCount, "FRAUD", 0, 0);

        playerRepository.save(player);
        fraudPlayerRepository.save(fraudPlayer);

        recorder.printGameStart(player, fraudPlayer, gameCount);


        for (int i = 0; i < gameCount; i++) {
            this.gameStart(player, fraudPlayer);
            recorder.printCurrentPoints(player,fraudPlayer);

        }
        return "player1은 " + playerName + " player2는 " + fraudPlayerName + "게임은 " + gameCount + "번 진행하겠습니다.";
    }
}