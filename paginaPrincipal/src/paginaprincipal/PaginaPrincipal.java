
package paginaprincipal;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import javax.swing.JOptionPane;


public class PaginaPrincipal {

    /*
    public static void main(String[] args) {
        Inicio launcher = new Inicio();
        launcher.setTitle("Bienvenido a Programacion");
        launcher.setExtendedState(MAXIMIZED_BOTH);
        launcher.setResizable(false); 
        launcher.getContentPane().setBackground(Color.BLACK);
        launcher.setVisible(true);
    }
    */
    public static void main(String[] args) throws IOException {

        try {
            Process process = Runtime.getRuntime().exec("C://Users//Osvaldo//Documents//NetBeansProjects//paginaPrincipal//Vectores.exe");
            InputStream inputstream = process.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
