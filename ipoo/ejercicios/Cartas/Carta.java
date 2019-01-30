package Cartas;

public class Carta {
    private String cara;
    private String palo;

    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }

    public String getCara() {
        return cara;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Cartas.Carta{" +
                "cara='" + cara + '\'' +
                ", palo='" + palo + '\'' +
                '}';
    }

}
