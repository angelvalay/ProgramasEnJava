package Biblioteca;


public class Libro extends Publicacion {
    private String editorial;
    private String tomo;
    private boolean prestado;
    private Cliente cliente;

    public Libro(String codigo, String titulo, int anoPub, String editorial, String tomo) {
        super(codigo, titulo, anoPub);
        this.editorial = editorial;
        this.tomo = tomo;
        this.prestado = false;
        this.cliente = new Cliente();
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTomo() {
        return tomo;
    }

    public void setTomo(String tomo) {
        this.tomo = tomo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String nombre;
        String estaPrestado = this.prestado ? "SI" : "NO";
        if (this.prestado)
            nombre = "\n"+this.cliente.toString();
         else
            nombre = "";

        return super.toString() +
                "\nEditorial: " + this.editorial +
                "\nTomo: " + this.tomo +
                "\nEsta prestado: " + estaPrestado +
                nombre;
    }

}
