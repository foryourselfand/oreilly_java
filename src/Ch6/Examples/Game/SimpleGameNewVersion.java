package Ch6.Examples.Game;

import java.util.ArrayList;

public class SimpleGameNewVersion {
    public static void main(String[] args) {
        DotCom theDotCom = new DotCom();
        GameHelper helper = new GameHelper();

        int numOfGuesses = 0;
        int randomNum = (int) (Math.random() * 5);
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(randomNum);
        locations.add(randomNum + 1);
        locations.add(randomNum + 2);
        theDotCom.setLocation(locations);

        while (true) {
            String guess = helper.getUserUnput("Введите число:");
            String rezult = theDotCom.chechYourself(Integer.parseInt(guess));
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
