package poo.csv_excel.archivos;

import java.io.IOException;

/**
 * Interfaz que se utiliza para manejar en la clase Archivo
 */
public interface Manejable {
    /**
     * Que permita la visualizacion de datos a traves de la consola
     *
     * @throws IOException Se lanza el error si fue no posible visualizar los datos
     */
    void visualizarDatos() throws IOException;

    /**
     * Que permita la escritura de datos
     *
     * @param datos conjunto de datos que se guardaran en el archivo
     * @throws IOException Se lanza el error si no fue posible escribir los datos en el archivo
     */
    void escribirDatos(Object... datos) throws IOException;
}
