package Vehiculos;

public class Main {
    public static void main (String args []){
        Turismo turismo =  new Turismo("123456", "Nissan", "TP-456", "Amarillo",150000,4,true);
        Fugoneta fugoneta =  new Fugoneta("987654","Ford","ER-456","Azul",500000,1200,15);
        Deportivo deportivo =  new Deportivo("4566123","Chervolet", "DF-498","Negro",500000,6);
        System.out.println(turismo.getAtributos() + "\n");
        System.out.println(fugoneta.getAtributos() + "\n");
        System.out.println(deportivo.getAtributos());
    }
}
