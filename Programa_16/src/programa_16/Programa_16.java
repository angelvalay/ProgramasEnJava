
package programa_16;
import java.util.Scanner;

public class Programa_16 {

    
    public static void main(String[] args) {
       Scanner ent= new Scanner (System.in);
       float sueldo;    
       int ant;
      
       System.out.println("Ingrese el sueldo del empleado: "); sueldo=ent.nextFloat();
       System.out.println("Ingrese su antiguedad en años: "); ant=ent.nextInt();
       float aumento=sueldo;
       condicion(sueldo,ant,aumento);
       float sueldoTotal=sueldo+aumento;
       
       System.out.println("Sueldo a pagar: "+ sueldoTotal);
    }
    public static void condicion(float sueldo,int ant,float aumento){
        if(sueldo<5000&&ant>10){
            aumento*=0.20f;  
        }
        else{
            if(sueldo>=5000&&ant<=10){
                aumento*=0.10f;
            }else{
                if(sueldo<5000){
                    aumento*=0.15f;
                }
            }
        }
    }
    
    
}
