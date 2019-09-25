package poo.csv_excel;

import archivos.ArchivoXLSX;

import java.io.IOException;

public class PruebaXLSX {
    private static final String FILE_NAME
            = "C:\\Users\\angel\\IdeaProjects\\mision-primaria-1-angelvalay\\micro_ejemplo_lista1.xlsx";

    public static void main(String[] args) {
        try {
            ArchivoXLSX archivoXLSX = new ArchivoXLSX(FILE_NAME);
            archivoXLSX.visualizarDatos();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}