import java.awt.*;

public abstract class Figura {
    private String nombre;
    private Color color;
    private int posX;
    private int posY;

    public Figura(String nombre, Color color, int posX, int posY) {
        this.nombre = nombre;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public abstract void imprimir();

    public abstract void desplazarFigura(int x, int y);

    public void cambiarColor(Color color){
        this.color = color;
    }
}
