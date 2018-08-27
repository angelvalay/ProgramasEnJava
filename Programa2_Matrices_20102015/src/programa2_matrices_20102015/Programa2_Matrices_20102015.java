package programa2_matrices_20102015;

import javax.swing.JOptionPane;

public class Programa2_Matrices_20102015 {

    public static void main(String[] args) {
        final int FILAS=3, COLUMNAS=3;
        int [][]A=new int [FILAS][COLUMNAS];
        int [][]B=new int [FILAS][COLUMNAS];
        int [][]C=new int [FILAS][COLUMNAS];
        int acu[]=new int [2];
        JOptionPane.showMessageDialog(null,"Matriz A");
        for(int x=0;x<FILAS;x++){
            for(int y=0;y<COLUMNAS;y++){
                
                A[x][y]=PedirDatos.matriz(x, y);
                acu[0]+=A[x][y];
                
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz B");
        for(int x=0;x<FILAS;x++){
            for(int y=0;y<COLUMNAS;y++){
                
                B[x][y]=PedirDatos.matriz1(x, y);
                acu[1]+=B[x][y];
            }
        }
        for(int x=0;x<A.length;x++){
            for(int y=0;y<A[x].length;y++){
               System.out.print(A[x][y]+" | ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");
        
        for(int x=0;x<B.length;x++){
            for(int y=0;y<B[x].length;y++){
               System.out.print(B[x][y]+" | ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");
        
        for(int x=0;x<FILAS;x++){
            for(int y=0;y<COLUMNAS;y++){
                C[x][y]=A[x][y]*B[x][y];
            }
        }
        for(int x=0;x<C.length;x++){
            for(int y=0;y<C[x].length;y++){
               System.out.print(C[x][y]+" | ");
            }
           System.out.println(" ");
        } 
        
        System.out.println("-------------------------");
        System.out.println("Promedio matriz A: "+(acu[0]/9));
        System.out.println("Promedio matriz B: "+(acu[1]/9));
        
            
        
    }
    
}
