import java.awt.*;

public class Circulo extends Ovalo {
    private int r;
    public Circulo(String nombre, Color color, int posX, int poxY, int r) {
        super(nombre, color, posX, poxY, r *2, r *2);
        this.r = r;
    }

    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    public double obtenerArea(){
        return Math.pow(this.r, 2) * Math.PI;
    }

    public double obtenerPerimetro(){
        return 2 * Math.PI * this.r;
    }
}
