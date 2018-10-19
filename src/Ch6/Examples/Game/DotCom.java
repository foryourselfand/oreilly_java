package Ch6.Examples.Game;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<Integer> locationCells;

    public void setLocation(ArrayList<Integer> loc) {
        locationCells = loc;
    }

    public String chechYourself(Integer userInput) {
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty())
                return "Потопил";
            else
                return "Попал";
        }

        return "Мимо";
    }
}
