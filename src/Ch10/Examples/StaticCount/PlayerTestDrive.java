package Ch10.Examples.StaticCount;

public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Тайгер Вудс");
        System.out.println(Player.playerCount);
    }
}
