package Figuras;

public class PoligonoRegular extends Poligono {
    private double apotema;
    private double perimetro;
    private double longLado;

    public PoligonoRegular(String nombre, int num_lados, boolean regular, double apotema, double longLado) {
        super(nombre, num_lados, regular);
        this.apotema = apotema;
        this.longLado = longLado;
    }

    public double calcularPerimetro(){
        return super.getNum_lados() * this.longLado;
    }

    public double calcularArea(){
        return this.calcularPerimetro() * this.apotema / 2 ;
    }

    public String getAtributos(){
        return super.getAtributos() + "\nPerimetro: " + this.calcularPerimetro() +
                "\nArea: " + this.calcularArea();
    }
}
