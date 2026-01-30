/**
 * 1.플레이어로부터 받은 점수를 저장한다(단순히 점수만 저장하면 된다)
 * 2.점수를 출력한다
 * 3.승자를 출력한다
 */
public class Recorder {

    Player player;
    FraudPlayer fraudPlayer;
    int playerPoint1;
    int playerPoint2;

    Recorder(Player player, FraudPlayer fraudPlayer) {
        this.player = player;
        this.fraudPlayer = fraudPlayer;
    }

    public int getPoint1() {
        playerPoint1 = player.sumPoint(playerPoint1);
        return playerPoint1;
    }

    public int getPoint2() {
        playerPoint2 = fraudPlayer.sumPoint(playerPoint2);
        return playerPoint2;
    }

    public void printCurrentPoints(){
        System.out.println("[" + player.name + " : " + getPoint1() + "점 " + fraudPlayer.name + " : " + getPoint2() + "점]");
    }
}

