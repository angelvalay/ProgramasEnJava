package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class DibujarCaraSoloUnOjo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //dibujar la cara
        g.setColor(Color.GREEN);
        g.fillOval(10,10,300,300);
        //dibujar el ojo
        g.setColor(Color.WHITE);
        g.fillOval(110,60,100,100);
        //dibujar la pupila
        g.setColor(Color.BLUE);
        g.fillOval(135,75,50,50);
        //Convierte la boca en sonrisa
        g.setColor(Color.BLACK);
        g.fillOval(80,200,150,60);
        g.setColor(Color.GREEN);
        g.fillRect(80,200,150,30);
        g.setColor(Color.RED);
        g.fillRect(130,230,40,50);
        g.fillOval(130,273,40,15);


    }
}
