
package programa_8;

import java.util.Scanner;
public class Programa_8 {

  
    public static void main(String[] args) {
        int a=0;
        int an=12345670;
        String nombre;
        short edad;
        double ab;
        double comision;
        double seguro;
        Scanner entrada= new Scanner (System.in);
        
        for(a=0;a<3;a++){
            System.out.println("No del Cliente: "+ (an+a));
            System.out.println("Ingresa El Nombre del Cliente: ");
            nombre=entrada.nextLine();
            System.out.println("Ingresa la edad: ");
            edad=entrada.nextShort();
            System.out.println("Costo del seguro: ");
            seguro=entrada.nextDouble();
            ab= (edad<41)? seguro*0.10:seguro*0.08;
            
            System.out.println("Comision por parte del vendedor: "+ab);
            entrada.nextLine();
            
        }
        
    }
    
}
