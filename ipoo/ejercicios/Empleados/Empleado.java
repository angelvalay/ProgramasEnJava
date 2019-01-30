package Empleados;

public abstract class Empleado {
    private final String primenNombre;
    private final String apellidoPaterno;
    private final String NSS;

    public Empleado(String primenNombre, String apellidoPaterno, String NSS) {
        this.primenNombre = primenNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.NSS = NSS;
    }

    public String getPrimenNombre() {
        return primenNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNSS() {
        return NSS;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "primenNombre='" + primenNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", NSS='" + NSS + '\'' +
                '}';
    }

    public abstract void ingresos();
}
