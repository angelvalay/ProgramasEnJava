package Graficos.Caracol;

import javax.swing.*;
import java.awt.*;

public class Caracol extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ld = 40;
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int i = 0;
        while (i < 11) {
            if (i % 2 != 0){
                g.drawLine(x+ld*i,y,x+ld*i,y+ld*i);
                g.drawLine(x,y,x+ld*i,y);
                x = x + ld*i;
                y = y + ld*i;
            }else{
                g.drawLine(x-ld*i,y,x-ld*i,y-ld*i);
                g.drawLine(x,y,x-ld*i,y);
                x = x - ld*i;
                y = y - ld*i;
            }
            i++;
        }
    }

}
