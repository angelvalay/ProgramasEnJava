import javax.swing.*;
import java.awt.*;

public class Ovalo extends Rectangulo{
    private double rMayor;
    private double rMenor;

    public Ovalo(String nombre, Color color, int posX, int poxY, int rMenor, int rMayor) {
        super(nombre, color, posX, poxY, rMenor, rMayor);
        this.rMayor = super.getBasRec();
        this.rMenor = super.getAnInt();
    }

    public double getrMayor() {
        return rMayor;
    }

    public void setrMayor(double rMayor) {
        this.rMayor = rMayor;
    }

    public double getrMenor() {
        return rMenor;
    }

    public void setrMenor(double rMenor) {
        this.rMenor = rMenor;
    }

    public double obtenerArea(){
        return this.rMenor * this.rMayor * Math.PI;
    }

    public double obtenerPerimetro(){
        return 2* Math.PI * Math.sqrt((Math.pow(this.rMayor,2) + Math.pow(this.rMenor,2))/2);
    }

    public void imprimir(){
        JFrame jFrame  = new JFrame(super.getNombre());
        jFrame.add(new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(getColor());
                g.drawOval(getPosX(),getPosY(), getBasRec(), getAnInt());
            }
        });
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
