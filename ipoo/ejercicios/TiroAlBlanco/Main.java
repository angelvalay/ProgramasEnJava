package TiroAlBlanco;


import javax.swing.*;

public class Main {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        TiroAlBlanco tiroAlBlanco = new TiroAlBlanco();
        frame.setSize(500,500);
        frame.add(tiroAlBlanco);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
