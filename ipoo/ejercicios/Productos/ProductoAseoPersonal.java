package Productos;

public class ProductoAseoPersonal extends Producto {
    private String tipoCuidado;

    public ProductoAseoPersonal(String clave, double precio, String descripcion, String unidadMedida, String contenido, String tipoCuidado) {
        super(clave, precio, descripcion, unidadMedida, contenido);
        this.tipoCuidado = tipoCuidado;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }

    @Override
    public String toString() {
        return "ProductoAseoPersonal{" +
                "tipoCuidado='" + tipoCuidado + '\'' +
                "} " + super.toString();
    }
}
