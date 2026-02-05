package com.yeji.dicegame;

/**
 * 1.플레이어 이름을 받는다
 * 2.게임 횟수를 받는다
 * 3.게임을 한 판씩 실행한다
 * 4.기록원을 통해 점수를 받는다
 * 5.기록원을 통해 받은 점수로 승자를 판단한다
 */
public class Judge {

    private Player player;
    private FraudPlayer fraudPlayer;
    private Recorder recorder;
    private int gameCount;
    protected String playerName;
    protected String fraudPlayerName;
    protected String winner;

    Judge(Player player, FraudPlayer fraudPlayer) {
        this.player = player;
        this.fraudPlayer = fraudPlayer;
    }

    public String registerPlayerName(String playerName) {
        this.playerName = player.registerPlayer(playerName);
        return this.playerName;
    }

    public String registerFraudPlayerName(String fraudPlayerName) {
        this.fraudPlayerName = fraudPlayer.registerFraudPlayer(fraudPlayerName);
        return this.fraudPlayerName;
    }

    public void gameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void gameStart() {
        player.play();
        fraudPlayer.play();
    }

    public void roundGame() {
        for (int i = 0; i < gameCount; i++) {
            this.gameStart();
            this.recorder = new Recorder(player, fraudPlayer, this);
            recorder.printCurrentPoints();
        }
    }

    public void gameResult() {
        if (recorder.playerPoint1 > recorder.playerPoint2) {
           winner = this.playerName;
        } else {
            winner = this.fraudPlayerName;
        }
        recorder.printWinner();
    }
}
