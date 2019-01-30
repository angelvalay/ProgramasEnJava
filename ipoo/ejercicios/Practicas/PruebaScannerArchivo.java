package Practicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PruebaScannerArchivo {
    public static void main(String[] args){
        String idArchivo = "numeros.txt";
        File archivoEntrada = new File(idArchivo);
        if (archivoEntrada.exists()){
            Scanner datosArchivo = null;
            try {
                datosArchivo = new Scanner(archivoEntrada);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Numeros del archivo:");
            while (datosArchivo.hasNext()){
                StringTokenizer numerosArchivo = new StringTokenizer(datosArchivo.next()+ ",") ;
                while (numerosArchivo.hasMoreTokens())
                    System.out.print(numerosArchivo.nextToken()+"\t");
                System.out.println();
            }
            datosArchivo.close();
        }else{
            System.out.println("No existe el archivo.");
        }
    }
}
