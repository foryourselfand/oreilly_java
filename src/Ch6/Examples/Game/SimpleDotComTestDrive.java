package Ch6.Examples.Game;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();

        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(2);
        locations.add(3);
        locations.add(4);
        dot.setLocation(locations);
        int userGuess = 2;
        String rezult = dot.chechYourself(userGuess);

        //
        String testRezult = "Неудача";
        if (rezult.equals("Попал")) {
            testRezult = "Пройден";
        }
        System.out.println(testRezult);
    }
}
