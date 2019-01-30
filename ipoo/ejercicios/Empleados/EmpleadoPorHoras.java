package Empleados;

public class EmpleadoPorHoras extends Empleado{
    private double sueldoPorHoras;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String primenNombre, String apellidoPaterno, String NSS, double sueldoPorHoras, int horasTrabajadas) {
        super(primenNombre, apellidoPaterno, NSS);
        this.sueldoPorHoras = sueldoPorHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHoras() {
        return sueldoPorHoras;
    }

    public void setSueldoPorHoras(double sueldoPorHoras) {
        this.sueldoPorHoras = sueldoPorHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    @Override
    public void ingresos() {
        if (horasTrabajadas <= 50)
            System.out.println("Sueldo: " + sueldoPorHoras*horasTrabajadas);
        else
            System.out.println("Sueldo: " + (40*sueldoPorHoras + (horasTrabajadas-40)*sueldoPorHoras*1.5));

    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "sueldoPorHoras=" + sueldoPorHoras +
                ", horasTrabajadas=" + horasTrabajadas +
                "} " + super.toString();
    }
}
