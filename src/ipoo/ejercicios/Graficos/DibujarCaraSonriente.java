package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class DibujarCaraSonriente extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //dibujar la cara
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,200,200);
        //dibuja los ojos
        g.setColor(Color.BLACK);
        g.fillOval(55,65,30,30);
        g.fillOval(135,65,30,30);
        //dibuja la boca
        g.fillOval(50,110,120,60);
        //Convierte la boca en sonrisa
        g.setColor(Color.YELLOW);
        g.fillRect(50,110,120,30);
        g.fillOval(50,120,120,40);
    }
}
