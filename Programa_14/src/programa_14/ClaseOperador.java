
package programa_14;


public class ClaseOperador {
    
    public static String Operador (String operador,int c){
        
       System.out.println(c+(c>=0?" es positivo":" es negativo"));
       System.out.println(c+(c%2==0? " es par":" es impar"));
       System.out.println(c+(c%5==0?" es multiplo de 5":" no es multiplo de 5"));
       System.out.println(c+ (c%10==0?" es multiplo de 10":" no es multiplo de 10"));
       System.out.println(c+(c>100?" es mayor que 100":" es menor que 100"));
        return operador; 
    }
}
