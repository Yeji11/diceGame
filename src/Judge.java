/**
 * 1.플레이어 이름을 받는다
 * 2.게임 횟수를 받는다
 * 3.게임을 한 판씩 실행한다
 * 4.기록원을 통해 점수를 받는다
 * 5.기록원을 통해 받은 점수로 승자를 판단한다
 */

import java.util.Scanner;

public class Judge {

    //Judge의 속성

    Player player = new Player();
    FraudPlayer fraudPlayer = new FraudPlayer();
    Scanner scan = new Scanner(System.in);
    Recorder recorder = new Recorder(player, fraudPlayer);
    private int num;

    // TODO 이름 입력 받기 에러 발생
    public String registerPlayer1() {
        System.out.println("1번 플레이어를 등록해주세요");
        String playerName1 = scan.nextLine();
        playerName1 = player.name;
        return playerName1;
    }
    // TODO 이름 입력 받기 에러 발생
    public String registerPlayer2() {
        System.out.println("2번 플레이어를 등록해주세요");
        String playerName2 = scan.nextLine();
        playerName2 = FraudPlayer.name;
        return playerName2;
    }

    public int gameCount() {
        System.out.println("게임은 몇 번 진행할까요?");
        num = scan.nextInt();
        return num;
    }

    public void gameStart() {
        player.play();
        fraudPlayer.play();
    }
    // TODO 누적값이 중복으로 더해지고 있는 에러 발생
    public void roundGame() {
        for (int i = 0; i < num; i++) {
            this.gameStart();
            recorder.printCurrentPoints();
        }
    }

    public void gameResult() {
        if (recorder.playerPoint1 > recorder.playerPoint2) {
            System.out.println("승자는 " + registerPlayer1() + "입니다");
        } else {
            System.out.println("승자는 " + registerPlayer2() + "입니다");
        }
    }
}

