package Practicas;

public class Promedio {
    public static double calcularPromedio(double ... numeros){
        double total = 0.0;
        for (double numero : numeros){
            total+=numero;
        }
        return total / numeros.length;

    }

    public static void main(String [] args){
        double d1 = 10,d2 =20,d3=30;
        System.out.println("Promedio:");
        System.out.println("El promedio de d1 y d2 es igual: " + calcularPromedio(d1,d2));
        System.out.println("El promedio de d1, d2 y d3 es igual: " +calcularPromedio(d1,d2,d3));
    }
}
