package Ch14.Examples.Objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
    private int width;
    private int height;

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            File myFile = new File("res/foo.ser");
            FileOutputStream fs = new FileOutputStream(myFile);
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myBox);

            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
