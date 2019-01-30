package Nacimientos;

public class Nacimiento {
    private String nombre;
    private String ape_Mat,ape_Pat;
    private Fecha fecha;
    private Hora hora;
    private String lugar;

    public Nacimiento(String nombre, String ape_Mat, String ape_Pat, Fecha fecha, Hora hora, String lugar) {
        this.nombre = nombre;
        this.ape_Mat = ape_Mat;
        this.ape_Pat = ape_Pat;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_Mat() {
        return ape_Mat;
    }

    public void setApe_Mat(String ape_Mat) {
        this.ape_Mat = ape_Mat;
    }

    public String getApe_Pat() {
        return ape_Pat;
    }

    public void setApe_Pat(String ape_Pat) {
        this.ape_Pat = ape_Pat;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void getDetalles(){
        System.out.println("\nREGISTRO DEL NACIMIENTO");
        System.out.print("Nombre completo: " + this.nombre + " " + this.ape_Pat + " " +this.ape_Mat);
        System.out.print("\nNacimientos.Fecha: " + this.fecha.mostrarFecha());
        System.out.print("\nNacimientos.Hora: "+ this.hora.mostrarTiempo());
        System.out.print("\nLugar de nacimiento: "+ this.lugar);
        System.out.println();
        System.out.println();
    }
}
