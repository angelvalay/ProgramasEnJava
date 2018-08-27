
package programa_2daevaluacion;
import java.util.Scanner;
public class Programa_2daEvaluacion {

    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        
       String nombre, direccion;
       int edad, f_dia, f_mes, f_año;
       int h_hora, h_min, h_seg;
       float sueldo;
       int sexo ;
       int aux=0;
       double prom_hom;
       int c=0;
       int c2=0;
       int h=0, w=0; 
       int n;
       String nomb="";
       int vivido;
       int auxi=0;
       
       System.out.println("Ingresa el numero de empleados: "); n=ent.nextInt();
       
       
       for(int k=1;k<=n;k++){
           ent.nextLine();
           System.out.println("Ingresa el nombre: "); nombre=ent.nextLine();
           System.out.println("Ingresa la direccion: "); direccion=ent.nextLine();
           System.out.println("Ingresa la edad: "); edad=ent.nextInt();
           
           while((edad<18)||(edad>65)){
            System.out.println("===EDAD INVALIDA=== (18-65 AÑOS) ");
            System.out.println("Ingresa la edad -> "); edad=ent.nextInt();
           }
           
           vivido=edad*365;
           System.out.println(vivido+" dias de vida");
           
            System.out.println("Ingresa la fecha de nacimiento  ");
            System.out.println("    (DD)-> ");f_dia=ent.nextInt();
            System.out.println("    (MM)-> ");f_mes=ent.nextInt();
            System.out.println("    (AAAA)-> ");f_año=ent.nextInt();
           
           while((f_dia<1)||(f_dia>31)||(f_mes<1)||(f_mes>12)||(f_año>1996)) {
            System.out.println("=== FECHA INVALIDA === ");
            System.out.println("    (DD)-> ");f_dia=ent.nextInt();
            System.out.println("    (MM)-> ");f_mes=ent.nextInt();
            System.out.println("    (AAAA)-> ");f_año=ent.nextInt();
            }
           switch (f_mes) {
            
            case 1: System.out.println(f_dia+" De Enero Del "+f_año);break;
            case 2: System.out.println(f_dia+" De Febrero Del "+f_año);break;
            case 3: System.out.println(f_dia+" De Marzo Del "+f_año);break;
            case 4: System.out.println(f_dia+" De Abril Del "+f_año);break;
            case 5: System.out.println(f_dia+" De Mayo Del "+f_año);break;
            case 6: System.out.println(f_dia+" De Junio Del "+f_año);break;
            case 7: System.out.println(f_dia+" De Julio Del "+f_año);break;
            case 8: System.out.println(f_dia+" De Agosto Del "+f_año);break;
            case 9: System.out.println(f_dia+" De Septiembre Del "+f_año);break;
            case 10: System.out.println(f_dia+" De Octubre Del "+f_año);break;
            case 11: System.out.println(f_dia+" De Noviembre Del "+f_año);break;
            case 12: System.out.println(f_dia+" De Diciembre Del "+f_año);break;
            default: break;
        }
           
           System.out.println("Ingresa la hora de entrada (HH-MM-SS): ");  h_hora=ent.nextInt(); h_min=ent.nextInt(); h_seg=ent.nextInt();
           
           while(h_hora<1||h_min<0||h_seg<0||h_hora>60||h_min>60||h_min>60){
            System.out.println("===HORA INVALIDA=== ");
            System.out.println("Hora de entrada  ->");  
            System.out.println("    (HH)-> "); h_hora=ent.nextInt(); 
            System.out.println("    (MM)-> "); h_min=ent.nextInt(); 
            System.out.println("    (SS)-> ");  h_seg=ent.nextInt();
        }
           System.out.println("Ingresa el sueldo quincenal"); sueldo=ent.nextFloat();
           
           while((sueldo<=2000)||(sueldo>=10000)){
            System.out.println("===SUELDO INVALIDO===  ");
            System.out.println("Ingresa el sueldo quincenal ->"); sueldo=ent.nextFloat();
            
        }
           System.out.println("Ingresa sexo M=1 - F=2 "); sexo=ent.nextInt();
           
           
           if (sueldo>auxi){ 
               nomb = nombre;
               aux=(int)sueldo;
           }
           
           if ((sexo==2)||sexo==2&&(sueldo>=3100)&&(sueldo<4600)) c2++; 
           
           
           if (f_año<1980) c++;
           if (sexo==1||sexo==1&&edad>29&&edad<=50){
            h+=edad;
            w++;
            }
           
           
           
           }
       prom_hom= h/w;
       System.out.println("Cantidad de empleadas mayores de 30 año y que reciben un sueldo entre 3100 y 4600:  " +c2);
       System.out.println("El promedio de hombres cuya edad oscila entre 30 y 50 años es: " +prom_hom);
       System.out.println("Personas nacidas menos de 1980"+ c);
               
       System.out.println("El empleado que más gana es: "+ auxi+ " Nombre "+ nomb);
       System.out.println(aux/1000);
       System.out.println(aux/100);
       System.out.println(aux/10);
       System.out.println(aux);
    }
    
}
