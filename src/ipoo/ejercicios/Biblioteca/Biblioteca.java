package Biblioteca;

import java.util.ArrayList;
import  java.util.Scanner;

public class Biblioteca {
    private ArrayList articulos;
    private Scanner sc;
    public Biblioteca() {
        this.articulos = new ArrayList();
        this.sc = new Scanner(System.in);
    }

    public ArrayList getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList articulos) {
        this.articulos = articulos;
    }

    public boolean addPublicacion (){
        String codigo, titulo;
        int anoPub, tipoPub;
        boolean guardado;
        System.out.print("Que tipo de publicacion eliges:" +
                "\n\t1.Libro\n\t2.Articulo\n\t3.Revista" +
                "\n\t4.Salir\n:");
        tipoPub = sc.nextInt();
        if (tipoPub != 4){
            System.out.print("Codigo: ");
            sc.nextLine();
            codigo =  sc.nextLine();
            System.out.print("Titulo: ");
            titulo = sc.nextLine();
            System.out.print("Ano de publicacion: ");
            anoPub = sc.nextInt();

            switch (tipoPub){
                case 1:
                    guardado = agregarLibro(codigo,titulo,anoPub);
                    break;
                case 2:
                    guardado = agregarArticulo(codigo,titulo,anoPub);
                    break;
                case 3:
                    guardado = agregarRevista(codigo,titulo,anoPub);
                    break;
                default:
                    guardado = false;
            }
            return guardado;
        }else {
            return false;
        }
    }

    private boolean agregarLibro(String codigo, String titulo, int anoPub){
        String editorial, tomo;
        boolean prestado;
        int opcion;
        System.out.print("Editorial: ");
        sc.nextLine();
        editorial = sc.nextLine();
        System.out.print("Tomo: ");
        tomo =  sc.nextLine();
        Libro nuevoLibro =  new Libro(codigo,titulo,anoPub,editorial,tomo);
        System.out.print("Desea prestar el libro?:\n 1 = Si o 0 = No ");
        opcion = sc.nextInt();
        prestado = opcion != 0;
        if (prestado){
            nuevoLibro.setPrestado(true);
            System.out.print("Nombre del cliente: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            nuevoLibro.getCliente().setNombre(nombre);
        }
        return this.articulos.add(nuevoLibro);
    }

    private boolean agregarArticulo(String codigo, String titulo, int anoPub){
        String claveDOI;
        int tipoArticulo;
        System.out.print("Clave DOI: ");
        sc.nextLine();
        claveDOI = sc.nextLine();
        System.out.print("Tipo de articulo:\n\t1.Articulo JCR\n\t2. Congreso Internacional");
        tipoArticulo = sc.nextInt();
        Articulo nuevoArticulo =  new Articulo(codigo,titulo,anoPub,claveDOI,tipoArticulo);
        return this.articulos.add(nuevoArticulo);
    }

    private boolean agregarRevista(String codigo, String titulo, int anoPub){
        int ano, numero;
        System.out.print("Ano: ");
        ano = sc.nextInt();
        System.out.print("Numero: ");
        numero = sc.nextInt();
        Revista nuevaRevista =  new Revista(codigo,titulo,anoPub,ano,numero);
        return this.articulos.add(nuevaRevista);
    }
    @Override
    public String toString() {
        return articulos.toString();
    }

}
