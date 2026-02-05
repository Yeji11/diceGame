package com.yeji.dicegame;

/**
 * 1.플레이어로부터 받은 점수를 저장한다(단순히 점수만 저장하면 된다)
 * 2.점수를 출력한다
 * 3.승자를 출력한다
 */
public class Recorder {

    private Player player;
    private FraudPlayer fraudPlayer;
    protected int playerPoint1;
    protected int playerPoint2;
    private Judge judge;

    Recorder(Player player, FraudPlayer fraudPlayer,Judge judge) {
        this.player = player;
        this.fraudPlayer = fraudPlayer;
        this.judge = judge;
    }

    public int getPoint1() {
        playerPoint1 = player.sumPoint(playerPoint1);
        return playerPoint1;
    }

    public int getPoint2() {
        playerPoint2 = fraudPlayer.sumPoint(playerPoint2);
        return playerPoint2;
    }

    public void printCurrentPoints(){
        System.out.println("[" + judge.playerName + " : " + getPoint1() + "점 " + judge.fraudPlayerName + " : " + getPoint2() + "점]");
    }

    public void printWinner(){
        System.out.println("승자는 " + judge.winner + "입니다.");
    }
}
