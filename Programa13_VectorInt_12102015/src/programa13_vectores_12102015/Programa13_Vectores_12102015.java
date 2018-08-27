/*
 
 */
package programa13_vectores_12102015;

import javax.swing.JOptionPane;


public class Programa13_Vectores_12102015 {

    
    public static void main(String[] args) {
        int [] vector= new int[5];
        boolean indice;
        for(int x=0; x<vector.length;x++){
            indice=true;
            while(indice){
                //manejo de excepciones
                try{
                    vector[x]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un valor: "));
                    indice=false;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error de Datos");
                }
            }
        }
        for(int y=0;y<vector.length;y++) JOptionPane.showMessageDialog(null,"["+y+"]"+"="+ vector[y]);
    }
    
}
