
package programa_15;
import java.util.Scanner;

public class Programa_15 {

  
    public static void main(String[] args) {
        String texto="",texto2="";
        Scanner ent=new Scanner(System.in);
        int dia,mes,año=0;    
        System.out.println("Ingrese el dia "); dia=ent.nextInt();
        System.out.println("Ingrese el mes "); mes=ent.nextInt();
        System.out.println("Ingrese el año "); año=ent.nextInt();
        if(mes==12&&dia==25)System.out.println("la fecha ingresada corresponde a Navidad.");
        if(mes==9&&dia==15)System.out.println("la fecha ingresada corresponde a Dia de la Independencia.");
        if(mes==11&&dia==20)System.out.println("la fecha ingresada corresponde a Revolucion Mexicana.");
        if(mes==12&&dia==31)System.out.println("la fecha ingresada corresponde a Año Nuevo.");
        if(mes==5&&dia==10)System.out.println("la fecha ingresada corresponde a Dia de las Madres.");
    
       if(mes>0&&mes<4) texto2="Trimestre 1";
        if(mes>3&&mes<7) texto2="Trimestre 2";
        if(mes>6&&mes<10) texto2="Trimestre 3";
        if(mes>9&&mes<13) texto2="Trimestre 4";
        
        System.out.println(texto2);
        
    }
}
