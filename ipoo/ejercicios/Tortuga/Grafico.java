package Tortuga;

import javax.swing.*;
import java.awt.*;

public class Grafico extends JPanel {
    private int rastros[][];

    public Grafico(int rastros[][]){
        this.rastros =  rastros;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < Tablero.LIM_MAX; i++) {
            for (int j = 0; j < Tablero.LIM_MAX; j++) {
                g.setColor(Color.BLUE);
                if (rastros[i][j] == 1)
                    g.drawRect(20*j +20,20*i +20,20,20);
            }
        }
    }

}
