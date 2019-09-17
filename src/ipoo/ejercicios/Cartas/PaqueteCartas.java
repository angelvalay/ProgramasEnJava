package Cartas;

import java.util.Random;

public class PaqueteCartas {
    private String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
    "Ocho", "Nueve", "Diez", "joker", "Reyna", "Rey"};
    private String[] palos = {"Corazonez", "Diamantes", "Treboles", "Espaldas"};
    private Carta cartas[];

    public PaqueteCartas() {
        this.cartas =  new Carta[52];
    }

    public void barajar(){
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas[a] = new Carta(this.caras[j],this.palos[i]);
                //System.out.println(this.cartas[a]);
                a++;
            }
        }
    }
    public void revolver(){
        Carta aux;
        for (int i = 0; i < 52; i++) {
            aux = this.cartas[i];
            int random = new Random().nextInt(51);
            this.cartas[random] = aux;
            this.cartas[i] = this.cartas[random];
        }
    }

    public void mostrar(){
        for (int i = 0; i < 52; i++) {
            System.out.println(this.cartas[i]);
        }
    }
}
