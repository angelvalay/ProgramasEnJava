package Figuras;

public class Poligono {
    private  String nombre;
    private  int num_lados;
    private boolean regular;

    public Poligono(String nombre, int num_lados, boolean regular) {
        this.nombre = nombre;
        this.num_lados = num_lados;
        this.regular = regular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public String getAtributos(){
        return "Nombre: " + this.getNombre() + "\nLados: " + this.getNum_lados()
            + "\nRegular: " + this.isRegular();
    }
}
