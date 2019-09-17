package TiroAlBlanco;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TiroAlBlanco extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        generarCirculos(g);
    }

    private void generarCirculos(Graphics g){
        int i = 0;
        int random1,random2,random3;
        while (i < 10) {
            random1 = new Random().nextInt(255);
            random2 = new Random().nextInt(255);
            random3 = new Random().nextInt(255);
            g.setColor(new Color(random1,random2,random3));
            g.fillOval(20 + i*20,20 + i*20,400 - 40*i,400 - 40*i);
            i++;
        }
    }
}
