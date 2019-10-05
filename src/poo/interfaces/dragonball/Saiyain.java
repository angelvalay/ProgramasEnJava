package poo.interfaces.dragonball;

/**
 * Interfaz para los saiyaines
 */
public interface Saiyain extends Tranformacion {
    /**
     * Interfaz para los supersaiyaines
     */
    interface Super{
        interface Saiyain1{
            void toSaiyain1();
        }
        interface Saiyain2{
            void toSaiyain2();
        }
        interface Saiyain3{
            void toSaiyain3();
        }
        interface Ozaru{
            void toOzaru();
        }
        interface Mistico{
            void toMistico();
        }
        interface FaseDios{
            interface Fase1{
                void toFase1();
            }
            interface Fase2{
                void toFase2();
            }
            interface UltraInstinto{
                void toUltraInstito();
            }
        }
    }
}
