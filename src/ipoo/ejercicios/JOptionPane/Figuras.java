package JOptionPane;

import java.awt.Graphics;
import javax.swing.*;

public class Figuras extends JPanel {
    private int opcion;
    public Figuras(int opcionUsuario){
        this.opcion = opcionUsuario;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            switch (opcion){
                case 1: g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
                break;
                case 2: g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
                break;
            }
        }
    }
}
