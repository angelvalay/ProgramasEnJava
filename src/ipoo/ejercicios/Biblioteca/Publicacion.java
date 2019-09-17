package Biblioteca;

public class Publicacion {
    private String codigo;
    private String titulo;
    private int anoPub;

    public Publicacion(String codigo, String titulo, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPub = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + this.codigo + "\nTitulo: " + this.titulo +
                "\nAno de publicacion: " + this.anoPub;
    }
}
