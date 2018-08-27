
package piramide;
import java.util.Scanner;

public class Piramide {

    
    public static void main(String[] args) {
        int a;
        char car='*';
        int c=0,d=0;
        Scanner ent= new Scanner(System.in);
        System.out.println("Teclea el numero: "); a=ent.nextInt();
        c=d=a;
        int b= (2*a)-1;
        for(int x=0; x<a; x++){
            for(int y=0; y<b; y++){
                if((y>=c)&&(y<=d)) System.out.print(car);else System.out.print(" ");
                if((x==(a-1))&&(y==(b-1))) System.out.print(car);
            }
            c--;
            d++;
            System.out.println("");
            
        }
        
    }
    
}
