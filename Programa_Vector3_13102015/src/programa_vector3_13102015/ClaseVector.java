
package programa_vector3_13102015;

import javax.swing.JOptionPane;


public class ClaseVector {
    public static boolean Salir( boolean bye){
        int ope =JOptionPane.showOptionDialog(
                    null,
                    "Salir", 
                    "EXIT",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,   
                    new Object[] { "SALIR", "CONTINUAR" },   
                    "SALIR");
        
                if(JOptionPane.OK_OPTION==ope){
                    bye=false; 
                }
                return bye;
    }
    
    public static void ordenamiento(String [] A, int a){
        String aux; 
        for(int i=1; i<=a; i++) {  
            for(int j=0; j<a-i; j++) { 
                if( A[j].compareTo( A[j+1] ) > 0 ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }
    }
}
