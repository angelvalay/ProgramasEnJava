package poo.csv_excel.modelos;

/**
 * Interfaz para asosiar la funcionalidad de las distintas busquedas
 *
 * @param <T> Tipo de conjunto de datos para ordenar
 * @param <A> Dato atomtico de la estructura
 */
public interface Ordenable<T, A> {
    /**
     * Sirve para ordenar los datos con el metodo de burbuja
     *
     * @param datos Conjunto de datos a ordenar
     * @return Conjunto ordenado
     * @throws Exception Si ocurre algun error
     */
    T ordenarBurbuja(T datos) throws Exception;

    /**
     * Sirve para concatenar las listas de datos que se ocupan
     *
     * @param menor Conjunto de datos anteriores
     * @param pivot El punto medio
     * @param mayor Conjunto de datos siguientes
     * @return Cojunto concatenado
     */
    T concatenar(T menor, A pivot, T mayor);

    /**
     * Metodo quicksort
     *
     * @param datos Cojunto de datos anteriores
     * @return Datos ordenados
     * @throws Exception Error a la hora de ordenar
     */
    T ordenarQuickSort(T datos) throws Exception;

    /**
     * Meotodo de mergesort
     *
     * @param datos Conjunto de datos a ordenar
     * @return Datos ordenados
     */
    T ordenarMergeSort(T datos);
}
