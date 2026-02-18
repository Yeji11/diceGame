package com.yeji.dicegame.service;

import com.yeji.dicegame.controller.RoundResponse;
import com.yeji.dicegame.domain.*;
import com.yeji.dicegame.repository.GamePlayerRepository;
import com.yeji.dicegame.repository.GameRepository;
import com.yeji.dicegame.repository.PlayerRepository;
import com.yeji.dicegame.repository.Recorder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class Judge {
    private final GameRepository gameRepository;
    private final PlayerRepository playerRepository;
    private final GamePlayerRepository gamePlayerRepository;
    private final Recorder recorder;

    public String createGame(List<String> playerIds, int gameCount) {
        registerPlayer(playerIds, gameCount);
        final GameEntity newGame = gameRepository.save(GameEntity.newGameEntity(playerIds, gameCount));
        return newGame.getId().toString();
    }

    private void registerPlayer(List<String> playerIds, int gameCount) {
        final List<GamePlayer> gamePlayers = new ArrayList<>();
        for (String playerId : playerIds) {
            final Player player = playerRepository.findById(Long.parseLong(playerId)).get();
            final GamePlayer gamePlayer = GamePlayer.createPlayer(playerId, player.getName());
            gamePlayerRepository.save(gamePlayer);
            gamePlayers.add(gamePlayer);
        }

        recorder.printGameStart(new GamePlayers(gamePlayers), gameCount);
    }

    public RoundResponse rollDice(String gameId) {
        //게임 정보 가져오기
        GameEntity game = gameRepository.findById(Long.parseLong(gameId)).get();
        //플레이어 정보 가져오기
        GamePlayer gamePlayer1Id = gamePlayerRepository.findById((Long.parseLong)(game.getGamePlayer1Id()));
        GamePlayer gamePlayer2Id = gamePlayerRepository.findById(Long.parseLong)(game.getGamePlayer2Id()));
        //주사위 굴리기
        Dice dice = new Dice();
        int player1Score = dice.roll();
        int player2Score = dice.roll();
        //점수 저장하기
        gamePlayerRepository.save(gamePlayer1Id);
        gamePlayerRepository.save(gamePlayer2Id);
        //결과 반환
        return RoundResponse(gameId,scores);
    }
}