package Practicas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PruebaPrintArchivo {
    public static void main(String[] args){
        int[][] numeros=  {
                {
                    1,2,3,4,5
                },
                {
                    6,7,8,9,10
                },
                {
                    11,12,13,14,15
                },
                {
                    16,17,18,19,20
                },
                {
                    21,22,23,24,25
                }
        };
        String idArchivo = "numeros.txt";
        PrintWriter outArchivo = null;
        try {
            outArchivo = new PrintWriter(idArchivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                outArchivo.print(numeros[i][j] + ",");
            }
            outArchivo.println("");
        }
        outArchivo.close();
    }
}
