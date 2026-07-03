package Lib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int angle = 0;
        public RollingBall(){
            Timer i = new Timer(50,this);
            i.start();
        }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, angle, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        angle += 6;
        if(x<-80) x = getWidth();
        if(angle >= 360) angle = 0;
        repaint();
    }
}
