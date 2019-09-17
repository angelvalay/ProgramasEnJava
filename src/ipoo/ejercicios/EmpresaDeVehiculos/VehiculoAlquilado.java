package EmpresaDeVehiculos;

public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int anoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int anoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anoAlquiler = anoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAnoAlquiler() {
        return anoAlquiler;
    }

    public void setAnoAlquiler(int anoAlquiler) {
        this.anoAlquiler = anoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public String getAtributos(){
        return "Cliente:\n" +cliente.getAtributos() +
                "\nVehiculo:\n " + vehiculo.getAtributos() +
                "\nFecha del alquiler: " + this.diaAlquiler + "/"
                + this.mesAlquiler + "/" + this.anoAlquiler;

    }
}
