package poo.interfaces;

public abstract class EnEspanol implements Saludar, Xable {
    void preguntar(String pregunta){
        System.out.println(pregunta + "?");
    }

    public void adios(){
        System.out.println("Adios");
    }
}
