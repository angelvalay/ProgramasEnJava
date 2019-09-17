package poo.poo_interfaces;

public abstract class EnEspanol implements Saludar{
    void preguntar(String pregunta){
        System.out.println(pregunta + "?");
    }

    public void adios(){
        System.out.println("Adios");
    }
}
