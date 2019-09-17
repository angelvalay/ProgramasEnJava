package Biblioteca;

public class Articulo extends Publicacion {
    private String claveDOI;
    private int tipoArticulo;

    public Articulo(String codigo, String titulo, int ano, String claveDOI, int tipoArticulo) {
        super(codigo, titulo, ano);
        this.claveDOI = claveDOI;
        this.tipoArticulo = tipoArticulo;
    }

    public String getClaveDOI() {
        return claveDOI;
    }

    public void setClaveDOI(String claveDOI) {
        this.claveDOI = claveDOI;
    }

    public int getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(int tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    @Override
    public String toString() {
        String tipoArt = this.tipoArticulo == 1 ? "Articulo JCR" : "De congreso internacional";
        return super.toString() +
                "\nClave DOI: " + this.claveDOI +
                "\nTipo de articulo: " + tipoArt;
    }
}
