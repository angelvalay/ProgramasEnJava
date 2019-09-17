package Biblioteca;

public class Cliente {
    private String nombre;

    public Cliente() {
        this.nombre = "";
    }

    @Override
    public String toString() {
        return "Nombre del cliente: "+this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
