
package programa_9;
import java.util.Scanner;

public class Programa_9 {
    
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String a,n;
        int vec;
        int[] ab = new int[3];//DECLARACION DE UN VECTOR
        for(int i=0;i<3;i++){//INICIO DEL CICLO FOR
            do{//INICIO DEL CICLO DO-WHILE
            System.out.println("Teclea un numero entero: ");
            ab[i] =ent.nextInt();//ENTRADA DE DATOS DEL VECTOR
            vec=ab[i];//VARIABLE AUXILIAR
            if(vec==0){System.out.println("Tecleastes un 0. Vuelve a intentarlo: "); };}
            while(vec==0);//FIN DEL CICLO DO-WHILE
            comparacionposneg(vec,"");//LLAMADA DE UNA FUNCION
        }//FIN DEL CICLO FOR
         
          
    }

    private static String comparacionposneg( int vec, String n) {
        n= (vec<0)?"Negativo":"Positvo";
        System.out.println(n);
        return n;
    }
}
