package Productos;

public class Alimento extends Producto {
    private String fechaCaducidad;
    private String estado;

    public Alimento(String clave, double precio, String descripcion, String unidadMedida, String contenido, String fechaCaducidad, String estado) {
        super(clave, precio, descripcion, unidadMedida, contenido);
        this.fechaCaducidad = fechaCaducidad;
        this.estado = estado;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", estado='" + estado + '\'' +
                "} " + super.toString();
    }
}
