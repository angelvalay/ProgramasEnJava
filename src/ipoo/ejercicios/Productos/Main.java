package Productos;

public class Main {
    public static void  main(String [] args){
        Producto[] productos =  new Producto[4];
        productos[0] =  new ProductoAseoPersonal("ABC",15.65,"Jabon","KG",
                "NADA","Cuidado cuerpo");
        productos[1] =  new ProductoLacteo("ABC",15.65,"Jabon","KG",
                "Vacio","15-Enero-2018");
        productos[2] =  new Alimento("ABC",15.65,"Jabon","KG",
                "NADA","Cuidado cuerpo","Enlatado");
        productos[3] = new Producto("BCD",15.65,"Descripcion","KG","Nada");

        for (Producto producto:productos){
            System.out.println(producto);
        }
    }
}
