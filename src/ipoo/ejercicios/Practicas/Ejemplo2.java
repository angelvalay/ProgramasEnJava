package Practicas;

import javax.swing.*;
import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        System.out.println("X1: ");
        x1 = sc.nextInt();
        System.out.println("Y1: ");
        y1 = sc.nextInt();
        System.out.println("X2: ");
        x2 = sc.nextInt();
        System.out.println("Y2: ");
        y2 = sc.nextInt();

        Practicas.Coordenadas coordenadas =  new Practicas.Coordenadas(x1,y1,x2,y2);
        coordenadas.calcularDis();

    }
}
