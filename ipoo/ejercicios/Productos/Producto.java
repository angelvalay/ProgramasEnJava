package Productos;

public class Producto {
    private String clave;
    private double precio;
    private String descripcion;
    private String unidadMedida;
    private String contenido;
    /*Clave, precio Descripcion, unidad de medida, contenido*/

    public Producto(String clave, double precio, String descripcion, String unidadMedida, String contenido) {
        this.clave = clave;
        this.precio = precio;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.contenido = contenido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "clave='" + clave + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
