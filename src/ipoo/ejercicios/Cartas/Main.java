package Cartas;

public class Main {
    public static void main (String[] args){
        PaqueteCartas paqueteCartas =  new PaqueteCartas();
        System.out.println("SIN REVOLVER");
        paqueteCartas.barajar();
        paqueteCartas.mostrar();
        System.out.println("REVOLVER");
        paqueteCartas.revolver();
        paqueteCartas.mostrar();
    }
}
