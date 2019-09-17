package Tortuga;

public class Tortuga {
    private boolean boligrafo;
    private int posX;
    private int posY;
    private int ori;

    public Tortuga(boolean boligrafo, int posX, int posY, int ori) {
        this.boligrafo = boligrafo;
        this.posX = posX;
        this.posY = posY;
        this.ori  =  ori;
    }

    public boolean isBoligrafo() {
        return boligrafo;
    }

    public void setBoligrafo(boolean boligrafo) {
        this.boligrafo = boligrafo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getOri() {
        return ori;
    }

    public void setOri(int ori) {
        this.ori = ori;
    }

    @Override
    public String toString() {
        return "Tortuga{" +
                "boligrafo=" + boligrafo +
                ", posX=" + posX +
                ", posY=" + posY +
                ", ori=" + ori +
                '}';
    }
}
