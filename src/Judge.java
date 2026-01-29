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
    int num;
    Player player = new Player();
    FraudPlayer fraudPlayer = new FraudPlayer();

    public void gameCount() {
        System.out.println("게임은 몇 번 진행할까요?");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
    }

    public void gameStart() {
        player.savePoint();
        fraudPlayer.savePoint();
    }

    public void roundGame() {
        for (int i = 0; i < num; i++) {
            this.gameStart();
        }
    }

}

