
package programabancocapitalmentepago;
import java.util.Random;
import java.util.Scanner;

public class ProgramaBancoCapitalmentePago {

    
    public static void main(String[] args) {
        Random  rnd = new Random();
        Scanner ent= new Scanner(System.in);
        int a=0; 
        float acu=0;
        float cant=0;
        a= (int) (rnd.nextDouble() * 48 + 12); System.out.println(a);
        System.out.println("Teclea la cantidad de prestamo: "); 
        cant=ent.nextFloat();
        
        
        for(int x=0;x<a;x++){
            acu+=cant*0.035;
            
        }
        cant=acu+cant;
        System.out.println("Total a pagar: " + acu);
        
    }
    
}
