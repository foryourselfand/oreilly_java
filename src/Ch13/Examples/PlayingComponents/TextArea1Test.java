package Ch13.Examples.PlayingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea1Test implements ActionListener {
    JTextArea text;
    int num = 1;


    public static void main(String[] args) {
        TextArea1Test gui = new TextArea1Test();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click It");
        button.addActionListener(this);

        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.append(String.format("button clicked %d\n", num++));
    }
}
