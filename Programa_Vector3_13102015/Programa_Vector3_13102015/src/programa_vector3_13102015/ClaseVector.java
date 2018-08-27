
package programa_vector3_13102015;

import javax.swing.JOptionPane;


public class ClaseVector {
    public static String[] GrupoA(){
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos del grupo A"));
        
        String nombre[]=new String[cant];
        for(int s=0;s<nombre.length;s++)
            nombre[s]=JOptionPane.showInputDialog("Teclea el nombre del "+ s +" alumno(s)");
        
        return nombre;
    }
    public static String[] GrupoB(){
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos del grupo B"));
        
        String nombre[]=new String[cant];
        for(int s=0;s<nombre.length;s++)
            nombre[s]=JOptionPane.showInputDialog("Teclea el nombre del "+ s +" alumno(s)");
        
        return nombre;
    }
    public static String[] GrupoC(){
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos del grupo C"));
        
        String nombre[]=new String[cant];
        for(int s=0;s<nombre.length;s++)
            nombre[s]=JOptionPane.showInputDialog("Teclea el nombre del "+ s +" alumno(s)");
        
        return nombre;
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
}
