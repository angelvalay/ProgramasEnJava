package EmpresaDeVehiculos;

public class Main {
    public static void main(String[] args){
        EmpresaAlquilerVehiculos alquilerVehiculos = new EmpresaAlquilerVehiculos("ADFBDSKJFBSD",
                "GRUPO CARSO","www.grupocarso.com");

        alquilerVehiculos.registrarVehiculo(new Vehiculo("1234","Nissan","FR-13",
                "Blanco",150000,true));
        alquilerVehiculos.registrarVehiculo(new Vehiculo("9875","Ford","FD-78",
                "Blanco",150000,true));
        alquilerVehiculos.registrarCliente(new Cliente("AQAW784555","Jose","Perez"));
        alquilerVehiculos.registrarCliente(new Cliente("HUHO124578","Maria","Gomez"));
        alquilerVehiculos.alquilarVehiculo("1234","HU124578",10,12,2018,16);
        alquilerVehiculos.recibirVehiculo("1234");

        System.out.println("\nLISTA DE CLIENTES:");
        alquilerVehiculos.imprimirClientes();
        System.out.println("\nLISTA DE VEHICULOS:");
        alquilerVehiculos.imprimirVehiculos();

    }
}
