package Productos;

public class ProductoDeLimpieza extends Producto{
    private String area;

    public ProductoDeLimpieza(String clave, double precio, String descripcion, String unidadMedida, String contenido, String area) {
        super(clave, precio, descripcion, unidadMedida, contenido);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ProductoDeLimpieza{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }
}
