package com.yeji.dicegame.controller;

import com.yeji.dicegame.domain.PlayerScore;
import lombok.Getter;

import java.util.List;

@Getter
public class RoundResponse {
    private String gameId;
    private List<PlayerScore> scores;
}
