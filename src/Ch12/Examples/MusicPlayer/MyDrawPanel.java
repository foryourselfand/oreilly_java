package Ch12.Examples.MusicPlayer;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;

    @Override
    public void controlChange(ShortMessage event) {
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g) {
        if (msg){
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            g.setColor(new Color(red, green, blue));

            int width = (int) ((Math.random() * 200) + 10);
            int height = (int) ((Math.random() * 200) + 10);
            int x = (int) ((Math.random() * 100) + 10);
            int y = (int) ((Math.random() * 100) + 10);
            g.fillRect(x, y, width, height);
            msg = false;
        }
    }
}
