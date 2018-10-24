package Ch13.Examples;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        panelB.add(new Button("Кнопка 1"));
        panelB.add(new Button("Кнопка 2"));
        panelB.add(new Button("Кнопка 3"));
        panelA.add(panelB);

        frame.getContentPane().add(panelA);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
