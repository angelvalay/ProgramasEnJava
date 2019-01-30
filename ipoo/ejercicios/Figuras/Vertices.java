package Figuras;

import java.util.ArrayList;

public class Vertices {
    private ArrayList<Double> coorX;
    private ArrayList<Double> coorY;
    private double distanciaTotal;
    private double areaTotal;

    public Vertices() {
        this.coorX = new ArrayList<>();
        this.coorY = new ArrayList<>();
        this.distanciaTotal = 0;
        this.areaTotal      = 0;
    }

    public ArrayList<Double> getCoorX() {
        return coorX;
    }

    public void setCoorX(ArrayList<Double> coorX) {
        this.coorX = coorX;
    }

    public ArrayList<Double> getCoorY() {
        return coorY;
    }

    public void setCoorY(ArrayList<Double> coorY) {
        this.coorY = coorY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public void agregarX(double coorX){
        this.coorX.add(coorX);
    }

    public void agregarY(double coorY){
        this.coorY.add(coorY);
    }

    private double calcularDistancia(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public void calcularDistanciaTotal(){
        int i = 0;
        for ( ; i < coorX.size() - 1; i++) {
            this.distanciaTotal += calcularDistancia(this.coorX.get(i),this.coorY.get(i),
                    this.coorX.get(i+1),this.coorY.get(i+1));
        }
        this.distanciaTotal += calcularDistancia(this.coorX.get(i),this.coorY.get(i),
                this.coorX.get(0),this.coorY.get(0));
    }

    public void calcularAreaTotal(){
        int contador = 0;
        double x = 0,y = 0;

        while (contador < coorX.size() - 1){
            x += coorX.get(contador) * coorY.get(contador+1);
            y += -1 * (coorY.get(contador) * coorX.get(contador+1));
            contador++;
        }

        x += coorX.get(coorX.size()-1) * coorY.get(0);
        y += -1 * (coorY.get(coorY.size()-1) * coorX.get(0));

        this.areaTotal = .5 * (x + y);
        if (this.areaTotal < 0)
            this.areaTotal = this.areaTotal * -1;
        //this.areaTotal = 0;
    }
}
