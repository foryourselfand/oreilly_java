package Ch6.Examples.OldGame;

import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        for (int i = 0; i < 3; i++)
            locations.add(Integer.toString(3 + i));
        dot.setLocation(locations);
        String userGuess = "2";
        String rezult = dot.chechYourself(userGuess);

        //
        String testRezult = "Неудача";
        if (rezult.equals("Попал")) {
            testRezult = "Пройден";
        }
        System.out.println(testRezult);
    }
}
