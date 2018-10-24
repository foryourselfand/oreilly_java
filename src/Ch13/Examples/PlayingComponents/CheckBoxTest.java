package Ch13.Examples.PlayingComponents;

import javax.swing.*;
import java.awt.event.*;

public class CheckBoxTest implements ItemListener {
    JCheckBox check;

    public static void main(String[] args) {
        CheckBoxTest gui = new CheckBoxTest();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();

        check = new JCheckBox("Goes to 11");

        check.addItemListener(this);

        frame.getContentPane().add(check);

        check.setSelected(true);
        check.setSelected(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if (check.isSelected())
            onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
