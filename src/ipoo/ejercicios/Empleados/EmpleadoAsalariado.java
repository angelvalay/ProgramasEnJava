package Empleados;

public class EmpleadoAsalariado extends Empleado{

    private double salarioSemanal;

    public EmpleadoAsalariado(String primenNombre, String apellidoPaterno, String NSS, double salarioSemanal) {
        super(primenNombre, apellidoPaterno, NSS);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public void ingresos() {
        System.out.println("Ingresos: " + this.salarioSemanal);
    }

    @Override
    public String toString() {
        return "EmpleadoAsalariado{" +
                "salarioSemanal=" + salarioSemanal +
                "} " + super.toString();
    }
}
