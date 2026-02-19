package com.yeji.dicegame.controller;

import lombok.Getter;

import java.util.List;

@Getter
public class CreateGameRequest {
    private List<String> playerIds;
    private int gameCount;
}
