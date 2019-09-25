package poo.csv_excel;

import archivos.Archivo;
import archivos.ArchivoCSV;

import java.io.IOException;

public class PruebaCSV {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\angel\\IdeaProjects\\mision-primaria-1-angelvalay\\ejemplo2.csv";
        try {
            String[] datos = {"Hola", "Mundo"};
            //para leer
            ArchivoCSV archivoCSV = new ArchivoCSV(fileName, Archivo.L);
            archivoCSV.visualizarDatos();
            //para crear una archivo
            ArchivoCSV archivoCSV2 = new ArchivoCSV(fileName, Archivo.E);
            archivoCSV2.escribirDatos(datos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
