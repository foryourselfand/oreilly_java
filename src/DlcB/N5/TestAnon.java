package DlcB.N5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAnon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("щелчок");
        frame.getContentPane().add(button);

//        button.addActionListener(quitListener);

//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });

        button.addActionListener(e -> System.exit(0));


        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
