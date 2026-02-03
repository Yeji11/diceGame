import java.util.Scanner;

/**
 * 1.각 클래스로부터 객체 생성(인스턴스화)
 * 2.게임을 시작한다
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Player player = new Player();
        FraudPlayer fraudPlayer = new FraudPlayer();
        Judge judge = new Judge(player, fraudPlayer);

        System.out.println("게임 시작하겠습니다.");
        System.out.println("첫번째 플레이어를 등록해주세요.");
        String registerPlayer = scan.nextLine();
        judge.registerPlayerName(registerPlayer);

        System.out.println("두번째 플레이어를 등록해주세요.");
        String registerFraudPlayerName = scan.nextLine();
        judge.registerFraudPlayerName(registerFraudPlayerName);

        System.out.println("게임은 몇 번 진행할까요?");
        int setGameCount = scan.nextInt();
        judge.gameCount(setGameCount);

        //게임 시작
        judge.roundGame();

        //게임 결과 출력
        judge.gameResult();

    }
}