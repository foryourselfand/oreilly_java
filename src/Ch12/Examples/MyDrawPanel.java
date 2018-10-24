package Ch12.Examples;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        g.setColor(Color.ORANGE);
//        g.fillRect(0, 0, 100, 100);
//        g.setColor(Color.GREEN);
//        g.fillRect(100, 100, 200, 200);
//        Image image = new ImageIcon("cat.jpg").getImage();
//        g.drawImage(image, 3, 4, this);

        Graphics2D g2d = (Graphics2D) g;

//        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
