
package programa_2daevaluacion;
import java.util.Scanner;

public class ClaseEmpleados {
    Scanner ent= new Scanner(System.in);
    
    private String nombre;
    private String direccion;
    public int edad, f_dia,f_mes,f_año;
    public int h_hora, h_min, h_seg;
    public float sueldo;
    public String sexo;
    public int aux=0;
    public double prom_hom=0;
    public int c=0;
    public int vivido=0;
    public int c2=0;
    public int h=0, w=0; 
    
    public ClaseEmpleados( String nombre,String direccion,int edad, int f_dia,int f_mes,int f_año,int h_hora,int  h_min,int  h_seg,float sueldo,String sexo ){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.f_dia=f_dia;
        this.f_mes=f_mes;
        this.f_año=f_año;
        this.h_hora=h_hora;
        this.h_min=h_min;
        this.h_seg=h_seg;
        this.sueldo=sueldo;
        this.sexo=sexo;
    }
    
    public String ObtenerNombre(String nombre){
        return nombre;
    }
    public String ObtenerDireccion(String direccion){
        return direccion;
    }
    
    public void ValidarEdad(int edad){
        
    }
    
    public int ValidarFecha(int f_dia,int f_mes,int f_año){
        
        return f_dia;
    }
    
    public void ValidarHora(int h_hora,int  h_min,int  h_seg){
        
    }
    
    public void MostrarFecha(int f_dia,int f_mes,int f_año){
        
        
        
    }
    
    public void ValidarQuincenal(float sueldo){
        
    }
    
    public void ValidarSexo(String sexo){
        while (sexo!="M"||sexo!="F"){
            System.out.println("===SEXO INVALIDO===  ");
            System.out.println("Ingresa sexo M-F "); sexo=ent.nextLine(); 
            
        }
    }
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
}
