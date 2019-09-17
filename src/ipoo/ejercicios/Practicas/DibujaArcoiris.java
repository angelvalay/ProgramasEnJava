package Practicas;

import javax.swing.*;
import java.awt.*;

public class DibujaArcoiris extends JPanel {
    private final static Color VIOLETA =  new Color(128,0,128);
    private final static Color INDIGO =  new Color(75,0,130);

    private Color[] colors =  {Color.WHITE,Color.WHITE,VIOLETA,INDIGO, Color.BLUE,Color.GREEN,
    Color.YELLOW,Color.ORANGE,Color.RED};

    public DibujaArcoiris(){
        setBackground(Color.WHITE);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int radio = 30;
        int centroX =  getWidth() / 2;
        int centroY = getHeight() - 10;
        for (int i = colors.length - 1; i >= 0 ; i--) {
            g.setColor(colors[i]);
            g.fillArc(centroX-i*radio,centroY-i*radio,i*radio*2,i*radio*2,0,180);
        }
    }
}
