package Ch12.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons/*, MouseListener*/ {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());

        MyDrawPanel myDrawPanel = new MyDrawPanel();

        label = new JLabel("Ouch!0");

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!" + (1 + (int) (Math.random() * 9)));
        }
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

//    @Override
//    public void mouseClicked(MouseEvent e) {
//        button.setText("mouseClicked");
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        button.setText("mousePressed");
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        button.setText("mouseReleased");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        button.setText("mouseEntered");
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        button.setText("mouseExited");
//    }
}
