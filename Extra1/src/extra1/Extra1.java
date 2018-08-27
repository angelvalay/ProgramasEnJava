/*
Sin Parametros, Metodo  Externo
 */
package extra1;
import java.util.Scanner;

public class Extra1 {
 
    
    public static void main(String[] args) {
        Scanner ent=new Scanner (System.in);
        int a;
        System.out.println("1-Suma 2-Resta");a=ent.nextInt();
        switch(a){
            case 1:
                //llamada
                OperacionSumaResta.suma();break;
            case 2:
                //llamada
                OperacionSumaResta.resta();break;
            default:
                break;
        }
    }
    
}
