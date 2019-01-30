package Practicas;

public class Coordenadas{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Coordenadas(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void calcularDis(){
        double xMed;
        double yMed;
        double dis = Math.sqrt(Math.pow(this.x2-this.x1,2) + Math.pow(this.y2-this.y1,2));
        System.out.println("Distancia: "+ dis);
        xMed = (this.x1+this.x2)/2;
        yMed = (this.y1+this.y2)/2;
        System.out.println("Punto medio\nX: "+xMed+"\nY: "+yMed);
    }
}
