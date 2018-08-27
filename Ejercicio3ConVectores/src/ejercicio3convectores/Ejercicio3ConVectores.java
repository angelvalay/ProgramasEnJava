//EJERCICIO NUMERO 3
package ejercicio3convectores;


public class Ejercicio3ConVectores {
    
    
    public static void main(String[] args) {
        byte a1=10,a2=20,a3=30,a4=40;
        float b1=5.5f,b2=11.00f,b3=16.5f,b4=22.00f;
        double c1=10001.0001, c2=20002.0002, c3=30003.0003, c4=40004.0004;
        int x1=10000,x2=20000,x3=30000,x4=40000,x5=50000;
        char q1='a',q2='b',q3='c',q4='d';
        
        System.out.println("Variables de tipo Int: ");
        System.out.println(x1 +"+"+ x2+ "=" + + (x1+x2));
        System.out.println(x3 + "+" + x4+ "+" + x5+ "=" + (x3+x4+x5));
        
        System.out.println("Variables de tipo Byte: ");
        System.out.println(a1 +"+"+ a2+ "=" + + (a1+a2));
        System.out.println(a3 + "+" + a4+  "=" + (a3+a4));
        
        System.out.println("Variables de tipo Float: ");
        System.out.println(b1 +"+"+ b2+ "=" + + (b1+b2));
        System.out.println(b3 + "+" + b4+ "+" +"=" + (b3+b4));
        
        System.out.println("Variables de tipo Double: ");
        System.out.println(c1 +"+"+ c2+ "=" + + (c1+c2));
        System.out.println(c3 + "+" +c4 + "=" + (c3+c4));
        
        System.out.println("Variables de tipo Char: ");
        System.out.println(q1 +"+"+ q2+ "=" +  q1+ "" + q2);
        System.out.println(q3 + "+" +q4 + "=" + q3+ "" +q4);
    }
    
}
