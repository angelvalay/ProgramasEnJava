
package programa_10;
import java.util.Scanner;
public class Programa_10 {

    
    public static void main(String[] args) {
        Scanner ent= new Scanner (System.in);
        double pago1,pago2,pago3,pagototal;
        System.out.println("Teclea el precio del refrigeradoor: "); pago1=ent.nextDouble();
        System.out.println("Teclea el precio del estufa: "); pago2=ent.nextDouble();
        System.out.println("Teclea el precio del microondas: "); pago3=ent.nextDouble();
        pagototal=(pago1+pago2+pago3)*.90;
        condiciones(pagototal);
        System.out.println("Pago x Mes: "+ pagototal);
    }
    
    public static double condiciones(double pagototal){
      
      if (10000<=pagototal){ 
          if (pagototal>=5000) { pagototal/=12;}
      }
      if (15000<=pagototal){ 
          if (pagototal>=10000) { pagototal/=24;}
      }
      if (pagototal>=15000) { pagototal/=30;}
      
      return pagototal;  
    }
    
}
