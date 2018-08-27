/*Solicitar los datos que se te piden para N empleados: nombre, direccion, edad (entre 18 y 65, solamenrte y validarla). fecha de nacimiento (dia,mes,año).
*/ 
package ejercicio_evaluacion2;
import java.util.Scanner;

public class Clases_Ejercicio2 {
   Scanner ent= new Scanner(System.in); 

    public static void ValidarEdad(int edad){
        Scanner ent= new Scanner(System.in); 
        
    }
    
    public static void ValidarNacimiento(int f_dia , int  f_mes, int f_año){
        Scanner ent= new Scanner(System.in); 
        while((f_dia<1)||(f_dia>31)&&(f_mes<1)||(f_mes>12)&&(f_año>1996)) {
            System.out.println("FECHA INVALIDA (DD-MM-AAAA): ");
            System.out.println("Ingresa la fecha de nacimiento (DD-MM-AAAA): ");
            f_dia=ent.nextInt();f_mes=ent.nextInt();f_año=ent.nextInt();
            
        }
        
    }
    public static void ValidarHora(int h_hora, int h_min, int h_seg){
        Scanner ent= new Scanner(System.in); 
        while((h_hora<0)||(h_hora<25)&&(h_min<0)||(h_min>60)&&(h_seg<0)||(h_seg>60)) {
            System.out.println("HORA INVALIDA (HH-MM-SS): "); 
            System.out.println("Ingresa la hora de entrada (HH-MM-SS): ");
            h_hora=ent.nextInt(); h_min=ent.nextInt(); h_seg=ent.nextInt();
        }
        
    }
    
    public static void ValidarQuincenal(float sueldo){
        Scanner ent= new Scanner(System.in); 
        
        
    }
    
    
    public static void ValidarSexo(String sexo){
        Scanner ent= new Scanner(System.in);
        
        
    }
    
    public static void FormatoFecha(int f_dia , int  f_mes, int f_año){
        
    }
    
    public static void DiasEdad(int edad,int vivido){
        
        
    
    }
    
    public static void PromedioHombres(int edad,double prom_hom, String sexo){
        
        
               
    }
    
    public static void PersonasNacidas (int f_año,int c){
        
    }
    
    public static void MujeresMayores(int edad,float sueldo,String sexo, int c2){ 
        
       
    }
    
    public static void EmpleadoMayor (float sueldo,float aux){
        
        
        
    }
    
    
    
}
