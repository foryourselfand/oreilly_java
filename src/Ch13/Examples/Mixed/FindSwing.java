package Ch13.Examples.Mixed;

import javax.swing.*;
import java.awt.*;

public class FindSwing {
    public static void main(String[] args) {
        FindSwing gui = new FindSwing();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        //D 2
//        JButton button = new JButton("tesuji");
//        JButton buttonTwo = new JButton("watari");
//        frame.getContentPane().add(BorderLayout.NORTH, panel);
//        panel.add(buttonTwo);
//        frame.getContentPane().add(BorderLayout.CENTER, button);

        //B 6
//        JButton button = new JButton("tesuji");
//        JButton buttonTwo = new JButton("watari");
//        panel.add(buttonTwo);
//        frame.getContentPane().add(BorderLayout.CENTER, button);
//        frame.getContentPane().add(BorderLayout.EAST, panel);

        //C 1
//        JButton button = new JButton("tesuji");
//        JButton buttonTwo = new JButton("watari");
//        panel.add(buttonTwo);
//        frame.getContentPane().add(BorderLayout.CENTER, button);

        //A 4
//        JButton button = new JButton("tesuji");
//        JButton buttonTwo = new JButton("watari");
//        panel.add(button);
//        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
//        frame.getContentPane().add(BorderLayout.EAST, panel);

        //E 3
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);


        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
