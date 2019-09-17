package Empleados;

public class Main {
    public static void main(String[] args){

        Empleado[] empleados =  new Empleado[4];
        empleados[0] =  new EmpleadoAsalariado("Angel",
                "Valay","15464",1500);
        empleados[1] =  new EmpleadoPorComision("Angel ",
                "Valay","154645456", 1500,0.5);
        empleados[2] = new EmpleadoBaseMasComision("Jesus",
                "Valay","165465",1000,0.5,1600);
        empleados[3] = new EmpleadoPorHoras("Juan","Vazquez","12354",150,6);

        for(Empleado empleado: empleados){
            System.out.println(empleado);
            empleado.ingresos();
        }
    }
}
