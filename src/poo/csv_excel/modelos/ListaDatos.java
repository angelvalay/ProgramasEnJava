package poo.csv_excel.modelos;

import java.util.ArrayList;

/**
 * Clase abtract que hereda de la clase ArrayList
 *
 * @param <T> Tipo de dato que almacenar esta lista
 */
public abstract class ListaDatos<T> extends ArrayList<T> {
    /**
     * Sirve para anadir un registro
     *
     * @param dato Permite anadir un registro a la lista
     * @return El registro de forma escructurado
     */
    public abstract T add(ArrayList<String> dato);

    /**
     * Sirve para almacenar un conjunto datos a la lista
     *
     * @param datos Anade un conjunto de datos a la lista
     */
    public abstract void addAll(ArrayList<ArrayList<String>> datos);
}
