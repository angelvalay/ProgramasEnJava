package poo.csv_excel.modelos;

/**
 * Clase concreta para la lista ordenada
 */
public class ListaOrdenada implements Ordenable<ListaAlumnos, Alumno> {

    /**
     * Sirve para guardar las evaluaciones
     */
    private ListaEvaluaciones evaluacions;
    /**
     * Sirve para almacenar una lista de alumnos
     */
    private ListaAlumnos alumnos;

    /**
     * Constructor de la clase
     *
     * @param alumnos      ALumnos que se desean ordenar
     * @param evaluaciones Conjunto de evaluaciones
     * @throws Exception Si ocurre algun error a la hora de obtener los datos
     */
    public ListaOrdenada(ListaAlumnos alumnos, ListaEvaluaciones evaluaciones) throws Exception {
        this.evaluacions = evaluaciones;
        this.alumnos = alumnos;
        for (Alumno alumno :
                alumnos) {
            alumno.setPromedioGeneral(evaluaciones.getPromedioGeneral(alumno));
            alumno.setMateriasAprobadas(evaluaciones.getCantMateriasAprobadas(alumno));
            alumno.setMateriasTomadas(evaluaciones.getCantMateriasTomadas(alumno));
        }
        ;
    }

    public ListaEvaluaciones getEvaluacions() {
        return evaluacions;
    }

    public void setEvaluacions(ListaEvaluaciones evaluacions) {
        this.evaluacions = evaluacions;
    }

    public ListaAlumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ListaAlumnos alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @param datos Conjunto de datos a ordenar
     * @return
     * @throws Exception
     */
    @Override
    public ListaAlumnos ordenarBurbuja(ListaAlumnos datos) throws Exception {
        for (int i = 0; i < datos.size() - 1; i++) {
            for (int j = 0; j < datos.size() - i - 1; j++) {
                if (datos.get(j + 1).compareTo(datos.get(j))) {
                    Alumno alumno;
                    alumno = datos.get(j + 1);
                    datos.set(j + 1, datos.get(j));
                    datos.set(j, alumno);
                }
            }
        }
        return datos;
    }

    /**
     * Sirve para ordenar sin restricciones
     *
     * @param datos Datos
     * @return ListaALumnos
     * @throws Exception SI hay error
     */
    public static ListaAlumnos ordenarBurbujaSinRestriccion(ListaAlumnos datos) throws Exception {
        for (int i = 0; i < datos.size() - 1; i++) {
            for (int j = 0; j < datos.size() - i - 1; j++) {
                if (datos.get(j + 1).getMatricula() > datos.get(j).getMatricula()) {
                    Alumno alumno;
                    alumno = datos.get(j + 1);
                    datos.set(j + 1, datos.get(j));
                    datos.set(j, alumno);
                }
            }
        }
//        for (Alumno alumno: datos) {
//            System.out.println(alumno.getMatricula() + " " + alumno.getPromedioGeneral());
//        }
        return datos;
    }

    /**
     * @param menor Conjunto de datos anteriores
     * @param pivot El punto medio
     * @param mayor Conjunto de datos siguientes
     * @return
     */
    @Override
    public ListaAlumnos concatenar(ListaAlumnos menor, Alumno pivot, ListaAlumnos mayor) {
        ListaAlumnos list = new ListaAlumnos();
        list.addAll(menor);
        list.add(pivot);
        list.addAll(mayor);
        return list;
    }

    /**
     * @param datos Cojunto de datos anteriores
     * @return
     */
    @Override
    public ListaAlumnos ordenarQuickSort(ListaAlumnos datos) {
        if (datos.isEmpty())
            return datos;
        ListaAlumnos sorted;
        ListaAlumnos peque = new ListaAlumnos();
        ListaAlumnos greater = new ListaAlumnos();
        Alumno pivot = datos.get(0);
        int i;
        Alumno j;
        for (i = 1; i < datos.size(); i++) {
            j = datos.get(i);
            if (j.compareTo(pivot))
                peque.add(j);
            else
                greater.add(j);
        }
        peque = ordenarQuickSort(peque);
        greater = ordenarQuickSort(greater);
        peque.add(pivot);
        peque.addAll(greater);
        sorted = peque;
        return sorted;
    }

    /**
     * Funcion para ordenar sin restricciones
     *
     * @param datos Datos a ordenar
     * @return Conjunto de alumnos
     */
    public static ListaAlumnos ordenarQuickSortSinRestriccion(ListaAlumnos datos) {
        if (datos.isEmpty())
            return datos;
        ListaAlumnos sorted;
        ListaAlumnos peque = new ListaAlumnos();
        ListaAlumnos greater = new ListaAlumnos();
        Alumno pivot = datos.get(0);
        int i;
        Alumno j;
        for (i = 1; i < datos.size(); i++) {
            j = datos.get(i);
            if (j.getMatricula() > pivot.getMatricula()) peque.add(j);
            else
                greater.add(j);
        }
        peque = ordenarQuickSortSinRestriccion(peque);
        greater = ordenarQuickSortSinRestriccion(greater);
        peque.add(pivot);
        peque.addAll(greater);
        sorted = peque;
        return sorted;
    }

    /**
     * @param datos Conjunto de datos a ordenar
     * @return
     */
    @Override
    public ListaAlumnos ordenarMergeSort(ListaAlumnos datos) {
        int middle;
        ListaAlumnos left = new ListaAlumnos();
        ListaAlumnos right = new ListaAlumnos();

        if (datos.size() > 1) {
            middle = datos.size() / 2;
            for (int i = 0; i < middle; i++)
                left.add(datos.get(i));

            for (int j = middle; j < datos.size(); j++)
                right.add(datos.get(j));

            ordenarMergeSort(left);
            ordenarMergeSort(right);

            ordenarMergeSort(datos, left, right);
        }
        return datos;
    }

    /**
     * Funcion para ordenar sin restricciones
     *
     * @param datos Conjunto de datos
     * @return Lista de alumnos
     */
    public static ListaAlumnos ordenarMergeSortSinRestriccion(ListaAlumnos datos) {
        int middle;
        ListaAlumnos left = new ListaAlumnos();
        ListaAlumnos right = new ListaAlumnos();

        if (datos.size() > 1) {
            middle = datos.size() / 2;
            for (int i = 0; i < middle; i++)
                left.add(datos.get(i));

            for (int j = middle; j < datos.size(); j++)
                right.add(datos.get(j));

            ordenarMergeSortSinRestriccion(left);
            ordenarMergeSortSinRestriccion(right);

            ordenarMergeSortSinRestriccion(datos, left, right);
        }
        return datos;
    }

    /**
     * Funcion para el merge sort
     *
     * @param datos   Datos
     * @param left    datos del lado izq
     * @param derecha datos del lado der
     */
    public void ordenarMergeSort(ListaAlumnos datos, ListaAlumnos left, ListaAlumnos derecha) {
        ListaAlumnos temp = new ListaAlumnos();

        int numbersIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < derecha.size()) {
            if (left.get(leftIndex).compareTo(derecha.get(rightIndex))) {
                datos.set(numbersIndex, left.get(leftIndex));
                leftIndex++;

            } else {
                datos.set(numbersIndex, derecha.get(rightIndex));
                rightIndex++;
            }
            numbersIndex++;
        }

        int tempIndex = 0;
        if (leftIndex >= left.size()) {
            temp = derecha;
            tempIndex = rightIndex;
        } else {
            temp = left;
            tempIndex = leftIndex;
        }

        for (int i = tempIndex; i < temp.size(); i++) {
            datos.set(numbersIndex, temp.get(i));
            numbersIndex++;
        }

    }

    /**
     * @param datos   Datos
     * @param left    Datos del lado izq
     * @param derecha Datos del lado der
     */
    public static void ordenarMergeSortSinRestriccion(ListaAlumnos datos, ListaAlumnos left, ListaAlumnos derecha) {
        ListaAlumnos temp = new ListaAlumnos();

        int numeroIndice = 0;
        int izqIndice = 0;
        int derIndice = 0;

        while (izqIndice < left.size() && derIndice < derecha.size()) {
            if (left.get(izqIndice).getMatricula() > derecha.get(derIndice).getMatricula()) {
                datos.set(numeroIndice, left.get(izqIndice));
                izqIndice++;
            } else {
                datos.set(numeroIndice, derecha.get(derIndice));
                derIndice++;
            }
            numeroIndice++;
        }

        int tempIndex = 0;
        if (izqIndice >= left.size()) {
            temp = derecha;
            tempIndex = derIndice;
        } else {
            temp = left;
            tempIndex = izqIndice;
        }

        for (int i = tempIndex; i < temp.size(); i++) {
            datos.set(numeroIndice, temp.get(i));
            numeroIndice++;
        }

    }
}
