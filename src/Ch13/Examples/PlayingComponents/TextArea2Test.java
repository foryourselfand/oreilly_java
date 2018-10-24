package Ch13.Examples.PlayingComponents;

import javax.swing.*;

public class TextArea2Test {
    public static void main(String[] args) {
        TextArea2Test gui = new TextArea2Test();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();

        JTextArea text = new JTextArea(10, 20);

        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        text.setText("Не все потерявшиеся - бродяги");
        text.append("\nКнопка нажата");

        text.selectAll();

        text.requestFocus();

        frame.getContentPane().add(scroller);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
