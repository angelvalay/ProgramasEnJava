package poo.csv_excel.modelos;

import java.util.ArrayList;

/**
 * Clase concreta de lista de alumnos
 */
public class ListaAlumnos extends ListaDatos<Alumno> {

    /**
     * @param dato Permite anadir un registro a la lista
     * @return
     */
    @Override
    public Alumno add(ArrayList<String> dato) {
        int posCol = 0;
        String nom = "";
        String aPat = "";
        String aMat = "";
        int matricula = -1;
        for (String celda : dato) {
            switch (posCol) {
                case 0:
                    nom = celda;
                    break;
                case 1:
                    aPat = celda;
                    break;
                case 2:
                    aMat = celda;
                    break;
                case 3:
                    matricula = Integer.parseInt(celda);
                    break;
                default:
                    break;
            }
            posCol++;
        }
        Alumno alumno = new Alumno(matricula, nom, aPat, aMat);
//        System.out.println(alumno);
        return alumno;
    }

    /**
     * @param datos Anade un conjunto de datos a la lista
     */
    @Override
    public void addAll(ArrayList<ArrayList<String>> datos) {
        for (ArrayList<String> filas : datos) {
//            System.out.println(filas.toString());
            Alumno alumno = this.add(filas);
            if (!super.contains(alumno))
                super.add(alumno);
        }
    }

}
