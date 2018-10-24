package Ch12.Examples;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1 implements MouseListener/*, ActionListener*/ {
    JButton button;

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

        button = new JButton("click me");
        button.addMouseListener(this);
//        button.addActionListener(this);

        frame.getContentPane().add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        button.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        button.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        button.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        button.setText("mouseExited");
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        button.setText("actionPerformed");
//    }
}
