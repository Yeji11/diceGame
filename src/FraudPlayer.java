/**
 * 1.플레이어의 이름을 저장한다
 * 2.주사위를 돌린다
 * 3.점수를 저장한다
 */
public class FraudPlayer {

    //fraudPlayer의 속성
    static String fraudPlayer = "김예지";
    FraudDice fraudDice = new FraudDice();
    int fraudDicePoint;
    int totalFraudPoint;

    //주사위를 돌린다
    public int play() {
        fraudDice.roll();
        return fraudDice.fraudDice;
    }

    //점수를 저장한다
    public int savePoint() {
        fraudDicePoint = this.play();
        totalFraudPoint += fraudDicePoint;
        return totalFraudPoint;
    }
}



