package programa4_joptionpane_05102015;

import javax.swing.*;
import java.util.*;
public class Programa4_JOptionPane_05102015 {

    public static void main(String[] args) {
        Random ran= new Random();
        int c=0;
        short ab=(short)(ran.nextDouble()*1000+1);
        int  datent=0;
        JOptionPane.showMessageDialog(null,"Clave: "+ab);
        
        while(ab!=datent){
            c++;
            datent= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la clave: "+"   "+"NO. Ingresos "+c));
            if(datent==ab||c==3)break;
            
        }
        if(c==3)JOptionPane.showMessageDialog(null,"Tuvistes 3 Oportunidades de poder ingresar tu Cuenta :-( ");
        else JOptionPane.showMessageDialog(null,"Bien Hecho :-) ");
    }
    
}
