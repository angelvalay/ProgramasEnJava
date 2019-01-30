import java.awt.*;

public class Examen {
    public static void main(String[] args){
        Rectangulo[] figuras = new Rectangulo[8];

        //Declaracion de polimorfismo
        figuras[0] = new Rectangulo ("Figura 1", Color.BLUE,75,75,15,15);
        figuras[1] = new Ovalo      ("Figura 2",Color.RED,75,12,10,25);
        figuras[2] = new Cuadrado   ("Figura 3",Color.BLACK,50,42,16);
        figuras[3] = new Circulo    ("Figura 4",Color.GREEN,50,50,20);

        //Variables para obtener el maximo de  area
        double arMax = 0;
        Rectangulo figMax = figuras[0];

        for (Rectangulo figura : figuras){
            figura.setColor(Color.MAGENTA);
            figura.desplazarFigura(50,50);
            if (arMax < figura.obtenerArea()){
                arMax = figura.obtenerArea();
                figMax = figura;
            }
        }
        //Imprimir el objecto con mayor area
        figMax.imprimir();
    }
}
