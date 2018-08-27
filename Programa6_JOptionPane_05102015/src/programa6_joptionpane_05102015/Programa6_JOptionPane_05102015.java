
package programa6_joptionpane_05102015;
import java.util.*;
import javax.swing.JOptionPane;

public class Programa6_JOptionPane_05102015 {

    
    public static void main(String[] args) {
        
        char car='A';
        String car1;
        while(car!='M'||car!='F'){
        car1=JOptionPane.showInputDialog("Ingresa Sexo-> Masculino = M , Femenino = F");
        car=car1.charAt(0);
        if(car=='M'||car=='F')break;
        }
                
                
    }
    
}
