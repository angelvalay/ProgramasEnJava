import javax.swing.*;
import java.awt.*;

public class Rectangulo extends Figura{

    private int basRec;
    private int anInt;

    public Rectangulo(String nombre, Color color, int posX, int poxY, int base, int anInt) {
        super(nombre, color, posX, poxY);
        this.basRec = base;
        this.anInt = anInt;
        super.setPosX(posX - (base / 2));
        super.setPosY(poxY - (anInt / 2));
    }

    @Override
    public void desplazarFigura(int x, int y) {
        super.setPosX(x - (basRec / 2));
        super.setPosY(y - (anInt / 2));
    }

    public int getBasRec() {
        return basRec;
    }

    public void setBasRec(int basRec) {
        this.basRec = basRec;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public double obtenerArea(){
        return this.basRec * this.anInt;
    }
    public double obtenerPerimetro(){
        return this.basRec * 2 + this.anInt * 2;
    }

    public void modificarTalla(double escalar){
        this.anInt = (int) (escalar * this.anInt);
        this.basRec = (int) (escalar * this.basRec);
    }

    public void imprimir(){
        JFrame jFrame  = new JFrame(super.getNombre());
        jFrame.setSize(350,350);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(getColor());
                g.drawRect(getPosX(),getPosY(), getBasRec(), getAnInt());
            }
        });
        jFrame.setVisible(true);
    }
}
