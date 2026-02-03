import java.util.Scanner;

/**
 * 1.플레이어의 이름을 저장한다(이름은 심판이 받음)
 * 2.주사위를 돌린다(주사위를 돌리라고 주사위 클래스 불러오면 됨)
 * 3.점수를 저장한다(총 합의 점수 저장)
 */
public class Player {

    private String playerName;
    private final Dice dice = new Dice();
    private int totalNormalPoint = 0;

    //이름 등록
    public String registerPlayer(String name){
        this.playerName  = name;
        return playerName;
    }

    //주사위를 돌린다
    public int play() {
        int point = dice.roll();
        return sumPoint(point);
    }

    //점수를 저장한다
    public int sumPoint(int point) {
        totalNormalPoint += point;
        return totalNormalPoint;
    }
}