import java.util.HashMap;

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
        playerPoint1 = player.savePoint();
        return playerPoint1;
    }

    public int getPoint2() {
        playerPoint2 = fraudPlayer.savePoint();
        return playerPoint2;
    }

    HashMap<String, Integer> map = new HashMap<>();

    public HashMap<String, Integer> map() {
        map.put(player.player, this.getPoint1());
        map.put(fraudPlayer.fraudPlayer, this.getPoint2());
        return map;
    }

    public void print() {
        this.map();
        System.out.println("[" + player.player + " : " + map.get(player.player) + "점 " + fraudPlayer.fraudPlayer + " : " + map.get(fraudPlayer.fraudPlayer) + "점]");
    }
}


