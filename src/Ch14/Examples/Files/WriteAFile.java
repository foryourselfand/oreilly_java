package Ch14.Examples.Files;

import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("res/foo.txt");

            writer.write("Привет, Фу!\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
