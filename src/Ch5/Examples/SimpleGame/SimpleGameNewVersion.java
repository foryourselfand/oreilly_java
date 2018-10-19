package Ch5.Examples.SimpleGame;

public class SimpleGameNewVersion {
    public static void main(String[] args) {
        SimpleDotCom theDotCom = new SimpleDotCom();
        GameHelper helper = new GameHelper();

        int numOfGuesses = 0;
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotCom.setLocation(locations);

        while (true) {
            String guess = helper.getUserUnput("Введите число:");
            String rezult = theDotCom.chechYourself(guess);
            numOfGuesses++;
            if (rezult.equals("Потопил")) {
                break;
            }
        }
        System.out.println("Вам потребовалось " + numOfGuesses +
                " попыт(ок)/(ки)");
    }
}
