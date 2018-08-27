
package proyecto1_joptionpane__01102015;
import javax.swing.JOptionPane;

public class Proyecto1_JOptionPane__01102015 {

    
    public static void main(String[] args) {
       int aprobados=0,reprobados=0,contador=1,resultado;
       String entrada, salida;
       
       while(contador<10)
       {
           entrada=JOptionPane.showInputDialog("Escriba el resultado 1=APROBADO=  2=REPROBADO=");
           resultado=Integer.parseInt(entrada);
           if(resultado==1) aprobados++;
           else reprobados++;
           contador++;
       }
        JOptionPane.showMessageDialog(null,"Cantidad de aprobados "+ aprobados);
        JOptionPane.showMessageDialog(null,"Cantidad de reprobados "+ reprobados);
        System.exit(0);
    }
    
}
