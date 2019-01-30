package Biblioteca;

public class Main {
    public static void main (String args[]){
        Biblioteca biblioteca = new Biblioteca();

        while (biblioteca.addPublicacion());

        System.out.println("PUBLICACIONES REGISTRADAS:");

        for (int i = 0; i < biblioteca.getArticulos().size(); i++)
            System.out.println(biblioteca.getArticulos().get(i));

    }
}
