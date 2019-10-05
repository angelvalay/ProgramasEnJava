package poo.interfaces.dragonball;

/**
 * Interfaz para la raza de freezer
 */
public interface Changlong extends Tranformacion {
    /**
     * Interfaz para aquellos que tiene formas particulares
     */
    interface OtrasFormas{
        void toSegundaForma();
        void toTerceraForma();
        void toFormaFinal();
        void toFormaMecha();

        /**
         * Interfaz para el golden freezer
         */
        interface Dorado{
            void toDorado();
            void toDoradoAuntentico();
        }
    }
}
