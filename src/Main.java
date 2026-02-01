/**
 * 1.각 클래스로부터 객체 생성(인스턴스화)
 * 2.게임을 시작한다
 */
public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        FraudPlayer fraudPlayer = new FraudPlayer();
        Judge judge = new Judge(player, fraudPlayer);

        System.out.println("게임 시작하겠습니다.");

        //정보 & 횟수 받기
        judge.gameCount();

        //게임 시작
        judge.roundGame();

        //게임 결과 출력
        judge.gameResult();

    }
}