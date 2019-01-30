package Graficos.Caracol;

import javax.swing.*;

public class Main  {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        Caracol caracol = new Caracol();
        jFrame.setSize(600,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(caracol);
        jFrame.setVisible(true);
    }
}
