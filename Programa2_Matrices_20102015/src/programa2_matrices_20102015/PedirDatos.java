
package programa2_matrices_20102015;

import javax.swing.JOptionPane;


public class PedirDatos {
   public static int matriz(int x, int y){
       int matriz=0;
       boolean salir=true;
       while(salir){
           try{
                matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor entero de la Matriz Fila: "+x+" Columna: "+y));
                salir=false;
           }catch(Exception a){
               JOptionPane.showMessageDialog(null, "Ingresaste un dato equivocado");
           }
       }
       return matriz;
   }
   public static int matriz1(int x, int y){
       int matriz=0;
       boolean salir=true;
       while(salir){
           try{
                matriz=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor entero de la Matriz Fila: "+x+" Columna: "+y));
                salir=false;
           }catch(Exception a){
               JOptionPane.showMessageDialog(null, "Ingresaste un dato equivocado");
           }
       }
       return matriz;
   }
   
}
