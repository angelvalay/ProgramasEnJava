package Practicas;

public class Polimorfismo {
    public static void main(String[] args){
        MiClaseA[] miClaseAS = new MiClaseA[3];
        miClaseAS[0] = new MiClaseA("Eshter");
        //en array mis clases del tipo mi claseA asignamos un objecto del tipo MiClaseB
        miClaseAS[1] =  new MiClaseB("Juan","Azul");
        miClaseAS[2] = new MiClaseA("Rosa");
        for (MiClaseA e: miClaseAS){
            System.out.println(e.toString() + "\n");
        }
    }
}
