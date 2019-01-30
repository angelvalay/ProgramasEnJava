package Productos;

public class ProductoLacteo extends Producto{
    private String fechaCad;

    public ProductoLacteo(String clave, double precio, String descripcion, String unidadMedida, String contenido, String fechaCad) {
        super(clave, precio, descripcion, unidadMedida, contenido);
        this.fechaCad = fechaCad;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    @Override
    public String toString() {
        return "ProductoLacteo{" +
                "fechaCad='" + fechaCad + '\'' +
                "} " + super.toString();
    }
}
