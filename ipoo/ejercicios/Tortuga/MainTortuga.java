package Tortuga;

import javax.swing.*;

public class MainTortuga {
    public static void main(String[] args){
        Tablero tablero = new Tablero();
        int opcion = 0;
        Object[] options = {"Boligrafo arriba","Boligrafo abajo",
                "Voltear a la derecha","Voltear a la izquierda",
                "Avanzar","Mostrar el recorrido","Fin de los datos"};
        int n;
        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(false);
        do{
            n = JOptionPane.showOptionDialog(frame,
                    "Escoge una opcion.",
                    "Tortuga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.DEFAULT_OPTION,
                    null,
                    options,
                    options[1]);
            switch (n){
                case 0:
                    //COMANDO 1
                    tablero.getTortuga().setBoligrafo(true);
                    break;
                case 1:
                    //COMANDO 2
                    tablero.getTortuga().setBoligrafo(false);
                    break;
                case 2:
                    //COMANDO 3
                    tablero.girar(1);
                    break;
                case 3:
                    //COMANDO 4
                    tablero.girar(2);
                    break;
                case 4:
                    //COMANDO 5,12
                    String cant  = JOptionPane.showInputDialog("Cuantos espacios?");
                    int can = Integer.parseInt(cant);
                    tablero.avanzar(can);
                    Grafico grafico = new Grafico(tablero.getTablero());
                    frame.add(grafico);
                    frame.setVisible(true);
                    break;
                case 5:
                    //COMANDO 6
                    tablero.mostrarTablero();
                    break;
                case 6:
                    //COMANDO 6
                    tablero.mostrarTablero();
                    break;
            }
            System.out.println(n);
        }while (n != -1 && n!= 6);



    }
}
