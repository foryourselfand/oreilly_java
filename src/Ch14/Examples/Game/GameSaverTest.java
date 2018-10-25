package Ch14.Examples.Game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTest {
    public static void main(String[] args) {
//        GameCharacter one = new GameCharacter(50, "Эльф",
//                new String[]{"лук", "мечь", "кастет"});
//        GameCharacter two = new GameCharacter(200, "Тролль",
//                new String[]{"голые руки", "большой топор"});
//        GameCharacter three = new GameCharacter(120, "Маг",
//                new String[]{"заклинания", "невидимость"});
//
//        // Код изменябщий значения состояние персонажей
//
//        try {
//            ObjectOutputStream outputStream = new ObjectOutputStream(
//                    new FileOutputStream("res/Game.ser"));
//            outputStream.writeObject(one);
//            outputStream.writeObject(two);
//            outputStream.writeObject(three);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        one = null;
//        two = null;
//        three = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream("res/Game.ser"));

            GameCharacter oneRestore = (GameCharacter) inputStream.readObject();
            GameCharacter twoRestore = (GameCharacter) inputStream.readObject();
            GameCharacter threeRestore = (GameCharacter) inputStream.readObject();

            System.out.println("Тип первого: " + oneRestore.getType());
            System.out.println("Тип второго: " + twoRestore.getType());
            System.out.println("Тип третьего: " + threeRestore.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
