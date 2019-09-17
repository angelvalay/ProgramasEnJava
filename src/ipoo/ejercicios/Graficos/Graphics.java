package Graficos;

import javax.swing.*;

public class Graphics  {
    public static void main(String[] args){
        DibujarCaraSoloUnOjo caraSonriente = new DibujarCaraSoloUnOjo();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.add(caraSonriente);
        frame.setVisible(true);
    }
}
