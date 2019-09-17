package Nacimientos;

import  java.util.Scanner;

public class Hora {
    private int hora,minuto,segundo;
    private String meridiano;

    public Hora(int hora, int minuto, int segundo, String meridiano) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.meridiano = meridiano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(String meridiano) {
        this.meridiano = meridiano;
    }

    private boolean validarSeg(){
        return this.segundo >=0 && this.segundo <=59;
    }

    private boolean validarMin(){
        return this.minuto >=0 && this.minuto<=59;
    }

    private boolean validarHora(){
        return this.hora >= 0 && this.hora<=12;
    }

    private boolean validarMer(){
        return this.meridiano.compareTo("PM") == 0 || this.meridiano.compareTo("AM") == 0
                || this.meridiano.compareTo("pm") == 0 || this.meridiano.compareTo("am") == 0;
    }

    public void validarTiempo(){
        Scanner sc =  new Scanner(System.in);
        while (!this.validarHora()){
            System.err.println("Error\nNacimientos.Hora invalida (0-12). Vuelva a intentarlo.");
            this.setHora(sc.nextInt());
        }
        while (!this.validarMin()){
            System.err.println("Error\nMinutos invalido (00-59). Vuelva a intentarlo.");
            this.setMinuto(sc.nextInt());
        }
        while (!this.validarSeg()){
            System.err.println("Error\nSegundos invalido (00-59). Vuelva a intentarlo.");
            this.setSegundo(sc.nextInt());
        }
        while (!this.validarMer()){
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            System.err.println("Error\nMeridiano invalido (AM,PM,am,pm). Vuelva a intentarlo.");
            this.setMeridiano(sc.nextLine());
        }
    }

    public String mostrarTiempo(){
        String tiempo = "";

        if (this.meridiano.compareTo("AM") == 0 || this.meridiano.compareTo("am") == 0)
            if (this.hora <10)
                tiempo += "0" + this.hora + ":";
            else
                tiempo += this.hora + ":";
        else
            tiempo += (this.hora+12) + ":" ;

        if (this.minuto < 10)
            tiempo += "0" + this.minuto + ":";
        else
            tiempo += this.minuto + ":";

        if (this.segundo < 10)
            tiempo += "0" + this.segundo;
        else
            tiempo += this.segundo;

        tiempo += " hrs";
        return tiempo;
    }
}
