package Figuras;

import java.util.Scanner;

public class PoligonoIrregular extends Poligono {

    private Scanner sc;
    private Vertices vertices;

    public PoligonoIrregular(String nombre, int num_lados, boolean regular) {
        super(nombre, num_lados, regular);
        this.sc         = new Scanner(System.in);
        this.vertices   = new Vertices();
    }

    public Vertices getVertices() {
        return vertices;
    }

    public void setVertices(Vertices vertices) {
        this.vertices = vertices;
    }

    public void leerPuntos(int cant){
        double x,y;
        System.out.print("Vertice "+(super.getNum_lados() - cant + 1)+" \n\tx:");
        x = sc.nextDouble();
        System.out.print("\ty:");
        y = sc.nextDouble();

        vertices.agregarX(x);
        vertices.agregarY(y);

        cant--;
        if (cant > 0)
            leerPuntos(cant);
    }

    public String getAtributos(){
        return super.getAtributos() + "\nPerimetro: " + this.getVertices().getDistanciaTotal() +
                "\nArea: " + this.getVertices().getAreaTotal();
    }

}
