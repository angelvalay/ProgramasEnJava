package poo.interfaces.dragonball;

/**
 * Interfaz para identificar a un Androide
 */
public interface Androide extends Tranformacion{
    /**
     * Interfaz para identificar las tranformaciones de un bioandroide
     */
    interface BioAndroide{
        /**
         * Estado embrionario
         */
        void toEmbrionario();

        /**
         * Estado insectoide
         */
        void toInsectoide();

        /**
         * 1 era forma
         */
        void to1eraForma();

        /**
         * 2 da forma
         */
        void to2daForma();

        /**
         * Estado perfecto de un bioandroide
         */
        void toPerfecto();
    }
}
