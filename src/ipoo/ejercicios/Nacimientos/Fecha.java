package Nacimientos;

import  java.util.Scanner;
public class Fecha {
    private int dia, mes, ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private boolean validarDia(){
        if ( this.dia <=0)
            return false;
        else
            if (this.mes == 2)
                return this.dia <= 29;
            else
                if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 ||
                        this.mes == 8 || this.mes == 10 || this.mes == 12)
                    return this.dia <= 31;
                else
                    if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)
                        return this.dia <= 30;
                    else
                        return false;

    }

    private boolean validarMes(){
        return  this.mes >=1 && this.mes <=12;
    }

    private boolean validarAno(){
        return this.ano > 0;
    }

    public void validarFecha(){
        Scanner sc =  new Scanner(System.in);
        while (!this.validarAno()){
            System.err.print("Error\nAno invalido (Mayor a 0). Vuelva a intentarlo.\n");
            this.setAno(sc.nextInt());
        }
        while (!this.validarMes()){
            System.err.print("Error\nMes invalido (1-12). Vuelva a intentarlo.\n");
            this.setMes(sc.nextInt());
        }
        while (!this.validarDia()){
            System.err.print("Error\nDia invalido. Vuelva a intentarlo.\n");
            this.setDia(sc.nextInt());
        }
    }

    public String mostrarFecha(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public boolean sumarFechas(int dias, int meses, int anos){
        if ( dias < 0 || meses < 0 || anos < 0){
            return false;
        }
        else {

            for (int i = 0; i < dias; i++) {
                if (validarDia()){
                    this.dia ++;
                }else{
                    this.dia = 1;
                    this.mes ++;
                }
            }

            for (int i = 0; i < meses; i++) {
                if (validarMes()){
                    this.mes ++;
                }else {
                    this.mes = 1;
                    this.ano ++;
                }
            }

            this.ano += anos;

            System.out.print("\nEn " + this.dia + "/"+ this.mes + "/" + this.ano);
            System.out.print("\nVa a nacer el otro bebe");
            return true;
        }
    }
}
