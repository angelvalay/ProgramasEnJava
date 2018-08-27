
package programa11_añobiciesto_071015;
import javax.swing.*;

public class Programa11_añoBiciesto_071015 {

    
    public static void main(String[] args) {
        int año;
        boolean res;
        año=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año"));
        res= bisiestoSiNo(año);
        respuesta(res);
    }
    public static boolean bisiestoSiNo(int año){
        boolean res;
        if(año%4==0&&año%100!=0||año%400==0) res=true; else res=false;
        return res;
    }
    public static void respuesta(boolean res){
        if(res==true)JOptionPane.showMessageDialog(null,"Es Año Bisiesto");else JOptionPane.showMessageDialog(null,"NO Es Año Bisiesto.");
    }
}
