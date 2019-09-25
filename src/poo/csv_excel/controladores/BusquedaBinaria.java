package poo.csv_excel.controladores;

/**
 * Clase abtracta para la busqueda binaria
 *
 * @param <T> Tipo de dato del conjunto de datos
 * @param <A> El dato que devolvera
 */
public abstract class BusquedaBinaria<T, A> {
    /**
     * Funcion que permite la busqueda de forma binaria
     *
     * @param datos conjunto de datos
     * @param clave dato a buscar
     * @param izq   nodo izquierdo
     * @param der   nodo derecho
     * @return el valor encontrado
     */
    public abstract A buscar(T datos, A clave, int izq, int der);
}
