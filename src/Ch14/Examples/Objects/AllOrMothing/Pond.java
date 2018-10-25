package Ch14.Examples.Objects.AllOrMothing;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    private Duck duck = new Duck();

    transient String currentId; //Не должна сохраняться

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("res/pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond); // Автоматическуи сереализуется duck

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
