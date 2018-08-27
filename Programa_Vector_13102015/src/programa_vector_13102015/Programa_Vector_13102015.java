
package programa_vector_13102015;

import javax.swing.JOptionPane;
import java.util.List;  
import java.util.ArrayList;
import java.util.Arrays;
public class Programa_Vector_13102015 {

    public static void main(String[] args) {
        /*  */List <Integer> miListaDeEnteros = new ArrayList <Integer> ();
        int n=0;
        int con,cont;
        con=cont=0;
        boolean ent=true;
        while(ent){
        try{
            n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de numeros: "));
            ent=false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de Datos");
        }
        }
        /*  */Integer [] vector= new Integer[n];
        boolean indice;
        for(int x=0; x<vector.length;x++){
            indice=true;
            while(indice){
                //manejo de excepciones
                try{
                    vector[x]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un valor (50-250): "));
                    indice=false;
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error de Datos");
                }
            }
            if(vector[x]<50||vector[x]>250){
                JOptionPane.showMessageDialog(null,"Ingresastes un numero que no corresponde al rango");
                x--;
                con++;
            }else if(vector[x]%5==0) cont++;
        }
        /*  */miListaDeEnteros = Arrays.asList (vector);
        /*  */System.out.println(miListaDeEnteros);
        JOptionPane.showMessageDialog(null,"Cantidad de numeros que no correspondieron al rango : "
                +"\n"+con
                +"\n"+"Cantidad de numeros multiplos de 5 : "
                +"\n"+cont
        );
        
        
    }
    
}
