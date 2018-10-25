package Ch14.Pool;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();

        System.out.println(d.getX() + d.getY() + d.getZ());
        try {
            FileOutputStream fos = new FileOutputStream("res/dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(d);

            oos.close();

            ///---///

            FileInputStream fis = new FileInputStream("res/dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            d = (DungeonGame) ois.readObject();

            ois.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(d.getX() + d.getY() + d.getZ());
    }
}
