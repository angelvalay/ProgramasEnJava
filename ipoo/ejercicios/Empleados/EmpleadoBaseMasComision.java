package Empleados;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public void ingresos(){
        System.out.println("Ingresos: " + (salarioBase + (getTarifaComision() * getVentasBrutas())));
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" +
                "salarioBase=" + salarioBase +
                "} " + super.toString();
    }
}
