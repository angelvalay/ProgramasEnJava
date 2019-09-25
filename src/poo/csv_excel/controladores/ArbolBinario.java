package poo.csv_excel.controladores;

/**
 * Clase abtracta para el arbol binario
 *
 * @param <A> Tipo de dato que guarda el arbol binario
 */
public abstract class ArbolBinario<A> {
    /**
     * Clase interior de la clase ArbolBinario para generar la estructura del nodo
     */
    class Nodo {
        /**
         * Guarda el valor del nodo
         */
        A valor;
        /**
         * Nodo izquierdo
         */
        Nodo izq;
        /**
         * Nodo derecho
         */
        Nodo der;

        /**
         * @param nodo Guardar el nodo
         */
        public Nodo(A nodo) {
            this.valor = nodo;
        }

        public A getNodo() {
            return valor;
        }

        public void setNodo(A nodo) {
            this.valor = nodo;
        }

        public Nodo getIzq() {
            return izq;
        }

        public void setIzq(Nodo izq) {
            this.izq = izq;
        }

        public Nodo getDer() {
            return der;
        }

        public void setDer(Nodo der) {
            this.der = der;
        }
    }

    /**
     * Raiz del arbol
     */
    Nodo raiz;

    /**
     * Permite anadir un nodo de forma recursiva
     *
     * @param actual nodo actual
     * @param valor  valor que se desea almacenar
     * @return el nodo en donde se encuentra el valor
     */
    public abstract Nodo anadirNodoRecursivo(Nodo actual, A valor);

    /**
     * Permite anadir un nodo al arbol
     *
     * @param valor valor para anadir al arbol
     */
    public void anadirNodo(A valor) {
        raiz = anadirNodoRecursivo(this.raiz, valor);
    }

    /**
     * Permite anadir un nodo al arbol
     *
     * @param valor valor para almacenar al arbol
     */
    public abstract void anadir(A valor);

    /**
     * Permite buscar un nodo dentro del arbol
     *
     * @param temporal Nodo en donde empieza el recorrido
     * @param valor    valor del nodo a buscar
     * @return nodo donde se encuentra el valor
     */
    public abstract A buscarNodo(Nodo temporal, A valor);

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
