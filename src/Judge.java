/**
 * 1.플레이어 이름을 받는다
 * 2.게임 횟수를 받는다
 * 3.게임을 한 판씩 실행한다
 * 4.기록원을 통해 점수를 받는다
 * 5.기록원을 통해 받은 점수로 승자를 판단한다
 */

import java.util.Scanner;

public class Judge {

    Player player;
    FraudPlayer fraudPlayer;
    Scanner scan = new Scanner(System.in);
    Recorder recorder;
    private int num;
    String playerName;
    String fraudPlayerName;
    static String winner;

    Judge(Player player, FraudPlayer fraudPlayer) {
        this.player = player;
        this.fraudPlayer = fraudPlayer;
    }

    public int gameCount() {
        this.registerPlayerName();
        this.registerFraudPlayerName();
        System.out.println("게임은 몇 번 진행할까요?");
        num = scan.nextInt();
        return num;
    }

    public String registerPlayerName() {
        playerName = player.registerPlayer();
        return this.playerName;
    }

    public String registerFraudPlayerName() {
        fraudPlayerName = fraudPlayer.registerFraudPlayer();
        return this.fraudPlayerName;
    }

    public void gameStart() {
        player.play();
        fraudPlayer.play();
    }

    public void roundGame() {
        for (int i = 0; i < num; i++) {
            this.gameStart();
            this.recorder = new Recorder(player, fraudPlayer);
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