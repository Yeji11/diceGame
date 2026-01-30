/**
 * 1.주사위를 돌린다
 * (주사위만 돌리는 행위 / 점수 기억할 필요 없고, 몇 번 돌려야 하는지 알 필요 없음)
 * 2.점수 반환한다
 */
public class Dice {

    private int normalDice;

    //주사위 돌리기 -> 점수 반환
    public int roll() {
        normalDice = (int) (Math.random() * 6) + 1;
        return normalDice;
    }
}
