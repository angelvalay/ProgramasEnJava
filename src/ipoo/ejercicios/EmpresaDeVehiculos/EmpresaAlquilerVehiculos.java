package EmpresaDeVehiculos;

import java.util.ArrayList;

public class EmpresaAlquilerVehiculos {
    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private ArrayList<Cliente> clientes;
    private int totalVehiculos;
    private ArrayList<Vehiculo> vehiculos;
    private int totalAlquileres;
    private ArrayList<VehiculoAlquilado> alquilados;

    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        this.clientes = new ArrayList<>();
        this.totalVehiculos = 0;
        this.vehiculos = new ArrayList<>();
        this.totalAlquileres = 0;
        this.alquilados =  new ArrayList<>();

    }

    public void imprimirClientes(){
        for (int i = 0; i < this.clientes.size(); i++) {
            System.out.println(this.clientes.get(i).getAtributos() + "\n");
        }
    }

    public void imprimirVehiculos(){
        for (int i = 0; i < this.vehiculos.size(); i++) {
            System.out.println(this.vehiculos.get(i).getAtributos() + "\n");
        }
    }

    public void alquilarVehiculo(String m, String nif, int dia, int mes, int ano, int dias){
        int p = 0;
        Vehiculo vh = null;
        Cliente cliente = null;
        for (int i = 0; i < this.vehiculos.size(); i++) {
            if (this.vehiculos.get(i).getMatricula().equals(m)){
                p = i;
                vh = this.vehiculos.get(i);
                break;
            }
        }
        for (int i = 0; i < this.totalClientes; i++) {
            if (this.clientes.get(i).getIfe().equals(nif)){
                cliente = this.clientes.get(i);
                break;
            }
        }
        if (vh != null && cliente != null){
            this.vehiculos.get(p).setDisponible(false);
            this.alquilados.add(new VehiculoAlquilado(cliente,vh,dia,mes,ano,dias));
            this.totalAlquileres++;
            System.out.println("Vehiculo alquilado.");
        }else{
            System.out.println("Vehiculo no alquilado.");
        }
    }

    public void recibirVehiculo(String matricula){
        for (int i = 0; i < this.totalVehiculos; i++) {
            if (this.vehiculos.get(i).getMatricula() == matricula){
                this.vehiculos.get(i).setDisponible(true);
                break;
            }
        }
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<VehiculoAlquilado> getAlquilados() {
        return alquilados;
    }

    public void setAlquilados(ArrayList<VehiculoAlquilado> alquilados) {
        this.alquilados = alquilados;
    }

    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }
}
