package Ch5.Examples.SimpleGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
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
