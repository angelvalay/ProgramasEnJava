package poo.csv_excel.controladores;

import modelos.Alumno;

/**
 * Clase concreta para almacenar el arbol de alumnos
 */
public class ArbolAlumnos extends ArbolBinario<Alumno> {
    /**
     * Permite anadir un nodo de forma recursiva
     *
     * @param actual nodo actual
     * @param valor  valor que se desea almacenar
     * @return nodo
     */
    @Override
    public Nodo anadirNodoRecursivo(Nodo actual, Alumno valor) {
        if (actual == null)
            return new Nodo(valor);
        if (valor.getMatricula() < actual.valor.getMatricula())
            actual.izq = anadirNodoRecursivo(actual.izq, valor);
        else if (valor.getMatricula() > actual.valor.getMatricula())
            actual.der = anadirNodoRecursivo(actual.der, valor);
        else
            return actual;
        return actual;
    }

    /**
     * Permite anadir un nodo de alumno al arbol
     *
     * @param valor valor para almacenar al arbol
     */
    @Override
    public void anadir(Alumno valor) {
        raiz = anadirNodoRecursivo(raiz, valor);
    }

    /**
     * Permite buscar un nodo de tipo alumno dentro del arbol
     *
     * @param temporal Nodo en donde empieza el recorrido
     * @param valor    valor del nodo a buscar
     * @return el alumno encontrado
     */
    @Override
    public Alumno buscarNodo(Nodo temporal, Alumno valor) {
        if (temporal == null)
            return null;
        else if (temporal.valor.getMatricula() == valor.getMatricula())
            return temporal.valor;
        else if (temporal.valor.getMatricula() > valor.getMatricula())
            return buscarNodo(temporal.izq, valor);
        else
            return buscarNodo(temporal.der, valor);
    }

    /**
     * Sobre escritura de la funcion que permite buscar un nodo a partir de un valor numerico
     *
     * @param temporal Nodo en donde empieza el recorrido
     * @param valor    Valor del nodo a buscar
     * @return el alumno encontrado
     */
    public Alumno buscarNodo(Nodo temporal, int valor) {
        if (temporal == null)
            return null;
        if (temporal.valor.getMatricula() == valor)
            return temporal.valor;
        else if (temporal.valor.getMatricula() > valor)
            return buscarNodo(temporal.izq, valor);
        else
            return buscarNodo(temporal.der, valor);
    }

    /**
     * Permite realizar un recorrido al arbol de forma InOrder
     *
     * @param node el nodo del inicio del recorrrido
     */
    public void recorridoInOrder(Nodo node) {
        if (node != null) {
            recorridoInOrder(node.izq);
            System.out.print(" " + node.valor.getMatricula());
            recorridoInOrder(node.der);
        }
    }

}
