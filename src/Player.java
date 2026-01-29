/**
 * 1.플레이어의 이름을 저장한다(이름은 심판이 받음)
 * 2.주사위를 돌린다(주사위를 돌리라고 주사위 클래스 불러오면 됨)
 * 3.점수를 저장한다(총 합의 점수 저장)
 */
public class Player {


    //normalPlayer의 속성
    static String player = "주윤덕";
    Dice dice = new Dice();
    int normalDicePoint;
    int totalNormalPoint;

    //주사위를 돌린다
    public int play() {
        dice.roll();
        return dice.normalDice;
    }
    //점수를 저장한다
    public int savePoint() {
        normalDicePoint = this.play();
        totalNormalPoint += normalDicePoint;
        return totalNormalPoint;
    }
}