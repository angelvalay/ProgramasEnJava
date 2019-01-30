package Nacimientos;

import  java.util.Scanner;
public class Ejercicio {
    public static void  main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String nombre, ape_Pat, ape_Mat,lugar,mer;
        int hora,min,seg;
        int dia,mes,ano;
        int diaB,mesB,anoB;
        boolean sonDatosValidos;

        //datos personales
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellido paterno: ");
        ape_Pat = sc.nextLine();
        System.out.print("Apellido materno: ");
        ape_Mat = sc.nextLine();
        System.out.print("Lugar: ");
        lugar = sc.nextLine();

        //hora de nacimiento
        System.out.print("Nacimientos.Hora (HH): ");
        hora = sc.nextInt();
        System.out.print("Minutos (MM): ");
        min = sc.nextInt();
        System.out.print("Segundos (SS): ");
        seg = sc.nextInt();
        System.out.print("Meridiano (AM o PM o am o pm): ");
        sc.nextLine();
        mer = sc.nextLine();
        Hora horaNac = new Hora(hora,min,seg,mer);
        horaNac.validarTiempo();

        //fecha de nacimiento
        System.out.print("Dia (DD): ");
        dia = sc.nextInt();
        System.out.print("Mes (MM): ");
        mes = sc.nextInt();
        System.out.print("Año (AAAA): ");
        ano = sc.nextInt();
        Fecha fechaNac = new Fecha(dia,mes,ano);
        fechaNac.validarFecha();

        Nacimiento nacimiento =  new Nacimiento(nombre,ape_Mat,ape_Pat,fechaNac,horaNac,lugar);

        //imprime los datos del registro de nacimiento
        nacimiento.getDetalles();

        do {
            //el otro bebe
            System.out.println("Dias para el otro bebe (DD): ");
            diaB = sc.nextInt();
            System.out.println("Mes para el otro bebe (MM): ");
            mesB = sc.nextInt();
            System.out.println("Ano para el otro bebe (AAAA): ");
            anoB = sc.nextInt();

            sonDatosValidos =  nacimiento.getFecha().sumarFechas(diaB, mesB, anoB);
            if ( !sonDatosValidos ){
                System.err.println("Datos invalidos.");
            }
        }while( !sonDatosValidos );


    }
}
