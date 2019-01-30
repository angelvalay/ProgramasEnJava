package Figuras;

import java.util.Scanner;

public class Main {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int num_lados;
        int opcion;
        double apotema, longLado;
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Numero de lados: ");
        num_lados = sc.nextInt();
        System.out.print("Regular (1) o Irregular(0): ");
        opcion = sc.nextInt();
        if (opcion == 0 ) {
            PoligonoIrregular poligonoIrregular = new PoligonoIrregular(nombre, num_lados, false);
            poligonoIrregular.leerPuntos(poligonoIrregular.getNum_lados());
            poligonoIrregular.getVertices().calcularDistanciaTotal();
            poligonoIrregular.getVertices().calcularAreaTotal();
            System.out.print( "\n" + poligonoIrregular.getAtributos());
        }else{
            System.out.print("Apotema: ");
            apotema = sc.nextDouble();
            System.out.print("Longitud del lado: ");
            longLado = sc.nextDouble();
            PoligonoRegular poligono = new PoligonoRegular(nombre,num_lados,true,apotema,longLado);
            System.out.println("\n"+poligono.getAtributos());
        }
    }
}
