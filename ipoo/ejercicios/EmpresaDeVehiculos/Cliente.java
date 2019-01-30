package EmpresaDeVehiculos;

public class Cliente {
    private String ife;
    private String nombre;
    private String apellido;

    public Cliente(String ife, String nombre, String apellido) {
        this.ife = ife;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIfe() {
        return ife;
    }

    public void setIfe(String ife) {
        this.ife = ife;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAtributos(){
        return "IFE: " + this.ife +
                "\nNombre: " + this.nombre +
                "\nApellidos: " + this.apellido;
    }
}
