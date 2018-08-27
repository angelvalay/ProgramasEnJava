
package proyecto1_ejercicio1;
import java.util.Scanner;

public class Proyecto1_Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        String nombre;
        String destino;
        double costo_boleto;
        short hora_salida;
        short min_salida;
        short mat_ves;
       
        int no_aciento,no_pas=100300;
        short tip_est;
        String am="";
        
            System.out.println("No de pasajero:"+ no_pas);
            System.out.println("Teclea el nombre del pasajero: "); nombre= ent.nextLine();
            System.out.println("Teclea el destino: "); destino= ent.nextLine();
            System.out.print("Teclea el costo del boleto: "); costo_boleto= ent.nextDouble();
            System.out.print("Teclea la hora de salida(HH)en formato 24hrs: "); hora_salida= ent.nextShort();
            System.out.print(" : (MM)"); min_salida= ent.nextShort();
            System.out.println("Teclea el aciento del pasajero: "); no_aciento= ent.nextShort();
            System.out.println("Tipo de pasajero: ");
            System.out.println("    1-Estudiante ");
            System.out.println("    2- Maestro");
            System.out.println("    3-Adulto Mayor");
            System.out.println("Teclea el tipo: "); tip_est=ent.nextShort();
            System.out.println("");
            System.out.println("no "+ no_pas);
            System.out.println(nombre);
            System.out.println(destino);
            
            tipo_desc(tip_est,costo_boleto);
            System.out.println("$"+ costo_boleto);
            
            hora_min24(hora_salida,min_salida,am);
            System.out.println("");System.out.println("");
            
        
        
        
    }
    
    public static double tipo_desc (short tip_est,double costo_boleto){
        if(tip_est==1) costo_boleto*=0.50;
        if(tip_est==2) costo_boleto*=0.25;
        if(tip_est==3) costo_boleto*=0.60;
        
        return costo_boleto;
    }
    
    public static short hora_min24(short hora_salida,short min_salida,String am){
        if(hora_salida>12)am="pm";
        else am="pm";
        hora_salida-=12;
        System.out.println( hora_salida+":"+ min_salida + am);
        return hora_salida;
        
    }
            
    
    
}
