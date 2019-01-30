package Tortuga;

import javax.swing.*;

public class Tablero {
    protected static final int LIM_MIN = 0;
    protected static final int LIM_MAX = 30;
    private int tablero[][];
    private Tortuga tortuga;
    public Tablero(){
        this.tortuga = new Tortuga(true,LIM_MIN,LIM_MIN,3);
        this.tablero = new int[LIM_MAX][LIM_MAX];
        for (int i = 0; i < LIM_MAX; i++) {
            for (int j = 0; j < LIM_MAX; j++) {
                this.tablero[i][j] = 0;
            }
        }
    }

    public void mostrarTablero(){
        for (int i = 0; i < LIM_MAX; i++) {
            for (int j = 0; j <LIM_MAX; j++) {
                System.out.print(this.tablero[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public void girar(int lado){
        // 1 - der
        // 2 - izq
        int ori = this.tortuga.getOri();
        if (lado == 1){
            ori  = ori-1 < 0 ? 3: ori-1;
            this.tortuga.setOri(ori);
        }else{
            if (lado == 2){
                ori  = ori+1 > 3 ? 0: ori+1;
                this.tortuga.setOri(ori);
            }
        }
    }

    public void avanzar(int esp){
//        0 - arriba
//        1 - izq
//        2 - abajo
//        3 - der
        int posInicialX =  this.tortuga.getPosX();
        int posInicialY =  this.tortuga.getPosY();
        switch (this.tortuga.getOri()){
            case 0:
                if (posInicialY - esp < LIM_MIN){
                    System.out.println("LIMITE SUPERIOR");
                }else{
                    if (!this.tortuga.isBoligrafo()){
                        for (int i = posInicialY; i > (posInicialY -esp); i--) {
                            this.tablero[i][posInicialX] = 1;
                        }
                        posInicialY = posInicialY - esp;
                    }
                }
                break;
            case 1:
                if (posInicialX - esp < LIM_MIN){
                    System.out.println("LIMITE SUPERIOR IZQUIERDO");
                }else{
                    if (!this.tortuga.isBoligrafo()){
                        for (int i = posInicialX; i > (posInicialX -esp); i--) {
                            this.tablero[posInicialY][i] = 1;
                        }
                        posInicialX = posInicialX - esp;
                    }
                }
                break;
            case 2:
                if ((posInicialY + esp) >= LIM_MAX){
                    System.out.println("LIMITE INFERIOR");
                }else{
                    if (!this.tortuga.isBoligrafo()){
                        for (int i = posInicialY; i < (posInicialY + esp); i++) {
                            this.tablero[i][posInicialX] = 1;
                        }
                        posInicialY = posInicialY + esp;
                    }
                }
                break;
            case 3:
                if ((posInicialX + esp) >= LIM_MAX){
                    System.out.println("LIMITE INFERIOR DERECHO");
                }else{
                    if (!this.tortuga.isBoligrafo()){
                        for (int i = posInicialX; i < (posInicialX + esp); i++) {
                            this.tablero[posInicialY][i] = 1;
                        }
                        posInicialX = posInicialX + esp;
                    }
                }
                break;
        }
        this.tortuga.setPosX(posInicialX);
        this.tortuga.setPosY(posInicialY);
    }

    //GETTERS Y SETTERS
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public Tortuga getTortuga() {
        return tortuga;
    }

    public void setTortuga(Tortuga tortuga) {
        this.tortuga = tortuga;
    }

}
