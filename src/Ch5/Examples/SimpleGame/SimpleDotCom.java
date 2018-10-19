package Ch5.Examples.SimpleGame;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHints;

    public void setLocation(int[] loc) {
        locationCells = loc;
    }

    public String chechYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String rezult = "Мимо";

        for (int cell : locationCells) {
            if (guess == cell) {
                rezult = "Попал";
                numOfHints++;
                break;
            }
        }

        if (numOfHints == locationCells.length)
            rezult = "Потопил";

        System.out.println(rezult);

        return rezult;
    }
}
