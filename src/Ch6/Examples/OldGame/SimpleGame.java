package Ch6.Examples.OldGame;

import java.util.ArrayList;

public class SimpleGame {
    public static void main(String[] args) {
        DotCom theDotCom = new DotCom();
        GameHelper helper = new GameHelper();

        int numOfGuesses = 0;
        int randomNum = (int) (Math.random() * 5);
        ArrayList<String> locations = new ArrayList<String>();
        for (int i = 0; i < 3; i++)
            locations.add(Integer.toString(randomNum + i));
        theDotCom.setLocation(locations);

        while (true) {
            String guess = helper.getUserUnput("Введите число:");
            String rezult = theDotCom.chechYourself(guess);
            System.out.println(rezult);
            numOfGuesses++;
            if (rezult.equals("Потопил")) {
                break;
            }
        }
        System.out.println("Вам потребовалось " + numOfGuesses +
                " попыт(ок)/(ки)");
    }
}
