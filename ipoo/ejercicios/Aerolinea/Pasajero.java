package Aerolinea;

public class Pasajero {
    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pasajero: " + this.nombre;
    }
}
