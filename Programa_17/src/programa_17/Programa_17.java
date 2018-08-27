
package programa_17;
import java.util.Scanner;
import java.lang.*;
public class Programa_17 {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        float prom;
        String text="";
        float acu=0;
        float []pro =  new float[5];
        for(int a =0;a<5;a++){
            System.out.println("Teclea un promedio: "); pro[a]=ent.nextShort();
            acu+=pro[a];
            
        }
        
        prom = acu/5;
        System.out.println("Promedio Final: "+ Math.round(prom));
        
        Calificacion.Promedio(text, (int) prom);
        
    }
   
    
}
