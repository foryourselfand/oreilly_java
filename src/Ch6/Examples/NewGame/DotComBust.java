package Ch6.Examples.NewGame;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        //Создадим несколько "сайтов" и присвоим им адреса
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void chechUserGuess(String userGuess) {
        numOfGuesses++;
        String rezult = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            rezult = dotComToTest.checkYourself(userGuess);
            if (rezult.equals("Попал"))
                break;
            if (rezult.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(rezult);
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток");
            System.out.println("Вы успели выбраться до того, как выши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток");
            System.out.println("Рыбы водят хоровод вокруг ваших вложений.");
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход: ");
            chechUserGuess(userGuess);
        }
        finishGame();
    }
}
