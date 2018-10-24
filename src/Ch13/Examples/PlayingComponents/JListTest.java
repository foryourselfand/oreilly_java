package Ch13.Examples.PlayingComponents;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest implements ListSelectionListener {
    JList list;
    public static void main(String[] args) {
        JListTest gui = new JListTest();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();

        String[] listEntries = {
                "alpha", "betta", "gamma", "delta", "epsilon",
                "zeta", "eta", "theta"};

        list = new JList(listEntries);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        JScrollPane scroller = new JScrollPane(list);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);


        frame.getContentPane().add(scroller);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(50, 100);
        frame.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!list.getValueIsAdjusting()){
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
        }
    }
}
