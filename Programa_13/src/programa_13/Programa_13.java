
package programa_13;
import java.util.Scanner;

public class Programa_13 {

    
    public static void main(String[] args) {
       Scanner ab = new Scanner (System.in);
       int a1,a2,a3;
       System.out.println("Teclee un numero: ");a1=ab.nextInt();
       System.out.println("Teclee un numero: ");a2=ab.nextInt();
       System.out.println("Teclee un numero: ");a3=ab.nextInt();
       if(a1>a2&&a1>a3) System.out.println("Estan en orden");
       
    }
    
}
