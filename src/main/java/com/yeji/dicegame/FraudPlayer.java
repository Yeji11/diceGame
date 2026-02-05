package com.yeji.dicegame;

/**
 * 1.플레이어의 이름을 저장한다
 * 2.주사위를 돌린다
 * 3.점수를 저장한다
 */
public class FraudPlayer {

    private String fraudPlayerName;
    private final FraudDice fraudDice = new FraudDice();
    private int totalFraudPoint;

    //이름 등록
    public String registerFraudPlayer(String name){
        this.fraudPlayerName = name;
        return fraudPlayerName;
    }

    //주사위를 돌린다
    public int play() {
        int point = fraudDice.roll();
        return sumPoint(point);
    }

    //점수를 저장한다
    public int sumPoint(int point) {
        totalFraudPoint += point;
        return totalFraudPoint;
    }
}
