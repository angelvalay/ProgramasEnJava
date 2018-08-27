
package programa_archivotxt_22102015;

import java.io.*;
import javax.swing.JOptionPane;


public class Programa_ArchivoTxt_22102015 {

    
    public static void main(String[] args) {
        String ab="";
        try{
            //abro stream, crea el fichero si no existe
        FileWriter f=new FileWriter("C:\\Users\\Equipo 39\\Desktop\\Archivo.txt"); 
        //escribimos en el fichero un string y un caracter 97 (a)
        for(int i=1;i<=5;i++){
            f.write("Esto es una prueba \n");
            f.write("\n");
        }
        //cierro el stream 
        f.close();
        //abro el stream, el fichero debe existir
        FileReader f1=new FileReader("C:\\Users\\Equipo 39\\Desktop\\Archivo.txt");
        //leelemos el fichero y lo mostramos por pantalla
        int valor=f1.read();
        while(valor!=-1){
            System.out.print((char)valor);
            ab+=(char)valor;
            valor=f1.read();
            
        }
        //cerramos el stream 
        f1.close();
        }catch(IOException e){
            System.out.println("ERROR E/S: "+ e);
        }
        JOptionPane.showMessageDialog(null, "Archivo.txt \n"+ab);
        
    }
    
}
