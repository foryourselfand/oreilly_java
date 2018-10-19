package Сh5.Examples.SimpleGame;

public class SimpleGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocation(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserUnput("Введите число:");
            String rezult = theDotCom.chechYourself(guess);
            numOfGuesses++;
            if (rezult.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses +
                        " попыт(ок)/(ки)");
            }
        }
    }
}
