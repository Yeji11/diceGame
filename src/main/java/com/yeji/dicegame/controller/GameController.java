package com.yeji.dicegame.controller;

import com.yeji.dicegame.service.Judge;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/games")

public class GameController {

    private final Judge judge;

    public GameController(Judge judge) {
        this.judge = judge;
        System.out.println("게임시작");
    }

    @PostMapping("/start")
    public String gameStart(@RequestBody CreateGameRequest request) {
        return judge.createGame(request.getPlayerIds(), request.getGameCount());
    }

    @GetMapping("/{gameId}/roll")
    public RoundResponse diceRoll(@PathVariable String gameId) {
        return judge.rollDice(gameId);
    }
}
