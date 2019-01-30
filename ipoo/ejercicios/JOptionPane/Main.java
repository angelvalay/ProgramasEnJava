package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Titulo");
        frame.setSize(300,300);
        String textoOpc =  JOptionPane.showInputDialog(frame,"1. Circulo\n2.Rectangulo","Opcion",JOptionPane.INFORMATION_MESSAGE);
        int opcion = Integer.parseInt(textoOpc);
        Figuras figuras = new Figuras(opcion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(figuras);
        frame.setVisible(true);
    }
}
