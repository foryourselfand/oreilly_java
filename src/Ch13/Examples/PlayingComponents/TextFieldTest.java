package Ch13.Examples.PlayingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener {
    public static void main(String[] args) {
        TextFieldTest gui = new TextFieldTest();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();

//        JTextField textField = new JTextField(10);
        JTextField textField = new JTextField("Ваше имя");

        System.out.println(textField.getText());

        textField.setText(""); // Очищает поле
        textField.setText("Что угодно");

        textField.addActionListener(this);

        textField.selectAll();

        textField.requestFocus();

        frame.getContentPane().add(BorderLayout.NORTH, textField);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Нажат Enter");
    }
}
