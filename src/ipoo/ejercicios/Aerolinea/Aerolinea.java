package Aerolinea;

import java.util.Scanner;

public class Aerolinea {
    private Asiento[] asientos;

    public Aerolinea(){
        asientos = new Asiento[15];
        for (int i = 0; i < 15; i++) {
            asientos[i] =  i < 7 ? new Asiento(1,false,i+1) : new Asiento(2,false,i+1) ;
        }
    }

    public void mostrarAsientos(){
        for(Asiento asiento : asientos){
            System.out.println(asiento.toString());
        }
    }

    public void solicitarAsiento(){
        Scanner sc = new Scanner(System.in);
        int tipo = 1;
        String nombre = "";
        System.out.println("Tipo de asiento\n\t1. Primera Clase\n\t2. Economico");
        do{
            tipo = sc.nextInt();
            if (tipo == 1 || tipo == 2){
                break;
            }else{
                System.out.println("Vuelve a intentarlo.");
            }
        }while (true);
        if (hayAsientosDisponibles(tipo) != -1){
            System.out.println("Nombre del pasajero:");
            sc.nextLine();
            nombre = sc.nextLine();
            asignarAsiento(tipo,nombre);
        }else{
            if (tipo == 2){
                System.out.println("Deseas por un costo adicional adquirir el asiento de Primera Clase? SI = 1 NO = 0");
                int opc =  sc.nextInt();
                if (opc == 1){
                    if (hayAsientosDisponibles(1) != - 1){
                        System.out.println("Nombre del pasajero:");
                        sc.nextLine();
                        nombre = sc.nextLine();
                        asignarAsiento(1,nombre);
                    }else {
                        System.out.println("Un vuelo saldra dentro de 3 horas. No hay asiento de Primera Clase.");
                    }
                }else{
                    System.out.println("Un vuelo saldra dentro de 3 horas.");
                }
            }
        }
    }

    private void asignarAsiento(int tipo, String nombre){
        if (hayAsientosDisponibles(tipo) != -1){
            asientos[hayAsientosDisponibles(tipo)].setPasajero(new Pasajero(nombre));
            asientos[hayAsientosDisponibles(tipo)].setOcupado(true);
        }else
            System.out.println("Asientos ocupados! No se asigno el asiento.");

    }

    private int hayAsientosDisponibles(int tipo){
        int estanOcupados = -1;
        if (tipo == 1){
            for (int i = 0; i < 7; i++) {
                if (! asientos[i].isOcupado()){
                    estanOcupados = i;
                    break;
                }
            }
        }else{
            if (tipo == 2){
                for (int i = 7; i < 15; i++) {
                    if (! asientos[i].isOcupado()){
                        estanOcupados = i;
                        break;
                    }
                }
            }
        }
        return estanOcupados;
    }
}
