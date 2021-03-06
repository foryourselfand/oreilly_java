package Ch6.Examples.OldGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserUnput(String promt) {
        String inputLine = null;
        System.out.println(promt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println(e);
        }
        return inputLine;
    }
}
