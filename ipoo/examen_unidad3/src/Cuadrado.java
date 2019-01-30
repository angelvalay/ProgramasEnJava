import java.awt.*;

public class Cuadrado extends Rectangulo {

    private int lado;

    public Cuadrado(String nombre, Color color, int posX, int poxY, int lado) {
        super(nombre, color, posX, poxY, lado, lado);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double obtenerArea(){
        return this.lado * this.lado;
    }

    public double obtenerPerimetro(){
        return this.lado * 4;
    }
}
