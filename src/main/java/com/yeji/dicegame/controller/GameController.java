package com.yeji.dicegame.controller;

import com.yeji.dicegame.service.Judge;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/games")

public class GameController {

    private final Judge judge;
    public GameController(Judge judge){
        this.judge = judge;
        System.out.println("게임시작");
    }

    @GetMapping("/gameStart")
    public String gameStart(@RequestParam("playername1") String playername,
                            @RequestParam("playername2") String playername2,
                            @RequestParam("gameCount") int gameCount) {
        return judge.registerPlayer(playername, playername2, gameCount);
    }
}
