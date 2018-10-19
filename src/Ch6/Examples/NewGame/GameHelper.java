package Ch6.Examples.NewGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alpgabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String promt) {
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
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] aplhaCoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int atemps = 0;
        boolean succsess = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1)
            incr = gridLength;

        while (!succsess & atemps++ < 200) {
            location = (int) (Math.random() * gridSize);
            System.out.println("Пробуем " + location);
            int x = 0;
            succsess = true;
            while (succsess && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        succsess = false;
                    }
                    if (x > 0 && (location % gridLength == 0))
                        succsess = false;
                } else {
                    System.out.println("Используется " + location);
                    succsess = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = coords[x] / gridLength;
            column = coords[x] % gridLength;
            temp = String.valueOf(alpgabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));

            x++;
            System.out.println("coord" + x + " = " + alphaCells.get(x - 1));
        }
        System.out.println("\n");
        return alphaCells;
    }
}
