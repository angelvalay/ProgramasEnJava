
package programa_11;
import java.util.Scanner;

public class Programa_11 {

    
    public static void main(String[] args) {
        
        float radio;
        float dis;
        double res;
        Scanner ent=new Scanner (System.in);
        System.out.println("Radio: "); radio=ent.nextFloat();
        System.out.println("Distancia: "); dis=ent.nextFloat();
        radio=radio*(float)3.1416;
        radio=radio*2;
        res=dis/radio;
        
        
        System.out.println("Veces que la rueda da por la distancia"+ res);
        
    }
       
    
}