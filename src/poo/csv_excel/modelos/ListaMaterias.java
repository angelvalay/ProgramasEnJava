package poo.csv_excel.modelos;

import java.util.ArrayList;

/**
 * Clase concreta que hereda de la clase ListaDatos
 */
public class ListaMaterias extends ListaDatos<Materia> {
    /**
     * @param dato Permite anadir un registro a la lista
     * @return
     */
    @Override
    public Materia add(ArrayList<String> dato) {
        int posCol = 0;
        int cantUnidades = 0;
        String nombre = "";
        String codigo = "";
        for (String celda : dato) {
            switch (posCol) {
                case 4:
                    nombre = celda;
                    break;
                case 5:
                    codigo = celda;
                    break;
                default:
                    if (posCol > 6 && posCol <= 10) {
                        if (!celda.equals("")) {
                            cantUnidades++;
//                            System.out.println(celda);
                        }
                    }
                    break;
            }
            posCol++;
        }
//        System.out.println(cantUnidades);
        //        System.out.println(alumno);
        return new Materia(nombre, codigo, cantUnidades);
    }

    /**
     * @param datos Anade un conjunto de datos a la lista
     */
    @Override
    public void addAll(ArrayList<ArrayList<String>> datos) {
        for (ArrayList<String> filas : datos) {
//            System.out.println(filas.toString());
            Materia materia = this.add(filas);
            if (!super.contains(materia))
                super.add(materia);
        }
    }

}
