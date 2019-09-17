package Aerolinea;

import java.util.Scanner;

public class MainAerolinea {
    public static void main(String[] args){
        Aerolinea aerolinea =  new Aerolinea();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do{
            aerolinea.mostrarAsientos();
            aerolinea.solicitarAsiento();
            System.out.println("Desea salir?  SI = 1 No = 0");
            salir = sc.nextInt() == 0;
        }while (salir);
    }
}
