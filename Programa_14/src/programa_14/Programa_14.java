
package programa_14;
import java.util.Scanner;

public class Programa_14 {

    
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        String operador="";
        
        int c;
        System.out.println("Teclea un numero entero"); c=ent.nextInt();
        
        ClaseOperador.Operador(operador, c);
        
                
    }

  
    
}
