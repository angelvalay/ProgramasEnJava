
package programa14_vectorstring_12102015;


public class Programa14_VectorString_12102015 {

   
    public static void main(String[] args) {
        String []nombre={"Angel","Carlos","Ana","Don Lolo"};
        for(int x=0;x<nombre.length;x++) System.out.println("Nombre->"+x+" - ->"+nombre[x]+"");
        ordenamiento(nombre);
        imprimir(nombre);
    }
    
    public static void ordenamiento(String [] A){
        String aux; 
        for(int i=1; i<=A.length; i++) {  
            for(int j=0; j<A.length-i; j++) { 
                if( A[j].compareTo( A[j+1] ) > 0 ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }
    }
    public static void imprimir(String[]A){
        System.out.println("\n array A ordenado: "); 
        for(int i=0; i<A.length; i++) 
        {System.out.println( " A[" + i + "] = " + A[i] ); }
    }
    
}
