package Ch13.Examples;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("click me");
        JCheckBox checkBox = new JCheckBox("choose me");
        JTextField textField = new JTextField("Text me");

        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.getContentPane().add(BorderLayout.WEST, checkBox);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
