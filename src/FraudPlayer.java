/**
 * 1.플레이어의 이름을 저장한다
 * 2.주사위를 돌린다
 * 3.점수를 저장한다
 */
public class FraudPlayer {

    //fraudPlayer의 속성
    public static String name;
    private final FraudDice fraudDice = new FraudDice();
    private int totalFraudPoint;
    Judge judge;

    public String playerName2(){
        name = judge.registerPlayer2();
        return name;
    }

    //주사위를 돌린다
    public int play() {
        this.playerName2();
        int point = fraudDice.roll();
        return sumPoint(point);
    }

    //점수를 저장한다
    public int sumPoint(int point) {
        totalFraudPoint += point;
        return totalFraudPoint;
    }
}



