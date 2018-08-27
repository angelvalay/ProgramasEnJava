
package programa_12;
import java.util.Scanner;

public class Programa_12 {

    
    public static void main(String[] args) {
        Scanner e= new Scanner (System.in);
        short [] a= new short[5];
        for(int x=0;x<5;x++){
            System.out.println("Teclea un numero entero: ");
            a[x]=e.nextShort();
            short ab= a[x];        
            ClaseMultiplo.Multiplo(ab);
        }
    }
    
}
