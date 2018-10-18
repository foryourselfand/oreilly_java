package Ch2.GuessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean isRightp1 = false;
        boolean isRightp2 = false;
        boolean isRightp3 = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber)
                isRightp1 = true;
            if (guessp2 == targetNumber)
                isRightp2 = true;
            if (guessp3 == targetNumber)
                isRightp3 = true;

            if (isRightp1 || isRightp2 || isRightp3) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + isRightp1);
                System.out.println("Второй игрок угадал? " + isRightp2);
                System.out.println("Третий игрок угадал? " + isRightp3);
                System.out.println("Конец игры.");
                break;
            } else
                System.out.println("Игроки должны попробовать еще раз.");
        }
    }

}
