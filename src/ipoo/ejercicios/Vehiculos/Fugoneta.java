package Vehiculos;

public class Fugoneta extends Vehiculo {
    private int carga;
    private int volumen;

    public Fugoneta(String matricula, String marca, String modelo, String color, double tarifa, int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getAtributos(){
        return super.getAtributos() + "\nCarga (kg): " + this.getCarga() +
                "\nVolumen: " + getVolumen();
    }
}
