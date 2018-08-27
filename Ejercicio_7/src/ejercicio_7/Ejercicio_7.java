
package ejercicio_7;
import java.util.Scanner;
import java.util.*;

public class Ejercicio_7 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        String lugar_trabajo;
        int año;
        int etd_civil;
        double sueldo;
        System.out.println("Tecla el nombre del empleado: "); nombre = entrada.nextLine();
        System.out.println("Tecla el nombre del lugar de trabajo: "); lugar_trabajo = entrada.nextLine();
        System.out.println("Tecla tu sueldo actual: "); sueldo = entrada.nextInt();
        System.out.println("Tecla tu año de nacimiento: "); año = entrada.nextInt();
        double nuevo_sueldo;
        nuevo_sueldo = sueldo +(sueldo*.10);
        System.out.println("Tu nuevo sueldo es: " + nuevo_sueldo);
        System.out.println("Tu edad aroximada es: " + (2015-año)); 
        System.out.println("Cantidad incrementada anual que recibiras dentro un año :"+ (24*(sueldo*.10)));
        
        
    }
    
}
