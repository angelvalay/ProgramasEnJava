package Aerolinea;

public class Asiento {
    private int tipo;
    private boolean ocupado;
    private int num;
    private Pasajero pasajero;

    public Asiento(int tipo, boolean ocupado, int num) {
        this.tipo = tipo;
        this.ocupado = ocupado;
        this.num = num;
        pasajero = null;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    private String tipoNombre(){
        return tipo == 1 ? "Primera clase" : "Economico";
    }

    @Override
    public String toString() {
        if (this.pasajero == null)
            return "Asiento:\tNo. " + this.num + "\t" + this.tipoNombre() + "\t" + this.ocupado ;
        else
            return "Asiento:\tNo. " + this.num + "\t" + this.tipoNombre() + "\t" + this.ocupado +"\t"+ this.pasajero.toString();
    }
}
