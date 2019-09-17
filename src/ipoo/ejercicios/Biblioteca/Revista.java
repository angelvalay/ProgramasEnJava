package Biblioteca;

public class Revista extends Publicacion {
    private int ano;
    private int numero;

    public Revista(String codigo, String titulo, int anoPub, int ano, int numero) {
        super(codigo, titulo, anoPub);
        this.ano = ano;
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAno: " + this.ano +
                "\nNumero: " + this.numero;
    }
}
