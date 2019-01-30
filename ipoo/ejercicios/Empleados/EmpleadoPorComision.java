package Empleados;

public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primenNombre, String apellidoPaterno, String NSS, double ventasBrutas, double tarifaComision) {
        super(primenNombre, apellidoPaterno, NSS);
        if (ventasBrutas < 0.0 ) {
            throw new IllegalArgumentException("La venta brutas deben ser >= 0.0");
        }
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0 ) {
            throw new IllegalArgumentException("La tarifa de comision debe ser entre 0 y 1.");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }


    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }


    @Override
    public void ingresos() {
        System.out.println("Ingresos: " + tarifaComision * ventasBrutas);
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" +
                "ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                "} " + super.toString();
    }
}
