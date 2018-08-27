
package programa5_joptionpane_05102015.zip;

import javax.swing.JOptionPane;

public class Programa5_JOptionPane_05102015ZIP {

    
    public static void main(String[] args) {
        String nombre;
        
        do{
            nombre=JOptionPane.showInputDialog("Ingresa un nombre en mayusculas: ");
            
        }while(nombre.matches("^[a-z ]*$"));
        
    }
    
}
