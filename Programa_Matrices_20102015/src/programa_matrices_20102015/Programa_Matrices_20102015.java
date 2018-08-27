
package programa_matrices_20102015;
import javax.swing.*;

public class Programa_Matrices_20102015 {

    
    public static void main(String[] args) {
       final int FILAS=5, COLUMNAS=4;
       int i,j,mayor,menor,filaMayor,filaMenor,colMayor,colMenor;
       int [][] A= new int [FILAS][COLUMNAS];
        boolean bye;
        int opcion = JOptionPane.showConfirmDialog(null, 
                "Lectura de elementos de la matriz->"
                        + "\n Deseas ejecutar la aplicación?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        
        if(opcion==1)bye=false; else bye=true;
        
        while(bye==false);{
        
            for(i=0;i<FILAS;i++){
                for(j=0;j<COLUMNAS;j++) A[i][j]=datos(i,j);
            }
            
            for(i=0;i<FILAS;i++){{
                for(j=0;j<COLUMNAS;j++) {System.out.print(A[i][j]+"  ");}
                System.out.print("\n");
            }
            }
            
            mayor=menor=A[0][0];
            filaMayor=filaMenor=colMenor=colMayor=0;
            for(i=0;i<A.length;i++){
                for(j=0;j<A[i].length;j++){
                    if(A[i][j]>mayor){
                        mayor=A[i][j];
                        filaMayor=i;
                        colMayor=j;
                    }
                    else if(A[i][j]<menor){
                        menor=A[i][j];
                        filaMenor=i;
                        colMenor=j;
                    }
                }     
            }
            JOptionPane.showMessageDialog(null, "Elemento Mayor: "+ mayor+
                    "\n"+"Fila:"+filaMayor+" Columna: "+ colMayor+
                    "\n"+"Elemento menor:"+ menor+
                    "\n"+"Fila"+filaMenor+" Columna: "+colMenor);
            
           bye=salir(bye); 
        }
        
    }
    
    
    public static boolean salir(boolean bye){
        int opcion = JOptionPane.showConfirmDialog(null, 
                "Desea seguir ejecutando la aplicación?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        
        if(opcion==1)bye=false; else bye=true;
        return bye;
    }
    public static int datos(int i, int j){
        int valor;
        valor=Integer.parseInt(JOptionPane.showInputDialog("A  Fila "+i+" Columna"+j+ "\n Ingrese el valor de la matriz"));
        return valor;
    }
    
}
