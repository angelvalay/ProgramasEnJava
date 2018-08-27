package programa10_longitudnumero_071015;
import javax.swing.*;
import java.util.*;
public class Programa10_LongitudNumero_071015 {
    public static void main(String[] args) {
        String sCadena = "";
        String sCadenaInvertida="";
        sCadena=JOptionPane.showInputDialog("Ingresa un numero entero");
        for (int x=sCadena.length()-1;x>=0;x--) 
            sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
	JOptionPane.showMessageDialog(null,sCadenaInvertida);
    }
}
