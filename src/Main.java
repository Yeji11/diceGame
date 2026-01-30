/**
 * 1.각 클래스로부터 객체 생성(인스턴스화)
 * 2.게임을 시작한다
 */
public class Main {
    public static void main(String[] args) {

        Judge judge = new Judge();

        System.out.println("게임 시작하겠습니다.");

        judge.registerPlayer1();
        judge.registerPlayer2();
        judge.gameCount(); //게임 시작 호출

        // TODO 실제 게임 호출
        judge.roundGame();

        // TODO Judge가 시켜야 함
        judge.gameResult();

    }
}