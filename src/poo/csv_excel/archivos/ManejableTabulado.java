package poo.csv_excel.archivos;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz para manejar archivos de tabulacion
 */
public interface ManejableTabulado extends Manejable {

    /**
     * Sirve para obtener los datos en un array list
     *
     * @param conCabecera Si tiene cabecera el documento
     * @return Un conjunto de datos en formato string
     * @throws IOException Es lanzado si ocurrio algun error en el archivo
     */
    ArrayList<ArrayList<String>> obtenerDatos(boolean conCabecera) throws IOException;


    /**
     * Sirve para dar escritura a un archivo
     *
     * @param datos se da como conjunto de datos un arraylist
     * @throws IOException si ocurre un error con el archivo
     */
    void asignarConjuntoDatos(ArrayList<String> datos) throws IOException, InvalidFormatException;
}
