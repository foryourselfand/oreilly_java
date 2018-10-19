package Ch6.Examples.NewGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                System.out.println("Ой, вы потопили " + name + " :(");
                return "Потопил";
            } else
                return "Попал";
        }
        return "Мимо";
    }
}
