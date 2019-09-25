package poo.csv_excel.modelos;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Clase concreta para la lista de evaluaciones
 */
public class ListaEvaluaciones
        extends ListaDatos<Evaluacion> {
    /**
     * Sirve para guardar una lista de alumnos para tener la referencia
     */
    private ListaAlumnos alumnos;
    /**
     * Sirve para guardar la lista de materias
     */
    private ListaMaterias materias;

    /**
     * Contructor de la clase
     *
     * @param alumnos  Conjunto de alumnos
     * @param materias Conjunto de materias
     */
    public ListaEvaluaciones(ListaAlumnos alumnos, ListaMaterias materias) {
        this.alumnos = alumnos;
        this.materias = materias;
    }

    /**
     * @param dato Permite anadir un registro a la lista
     * @return
     */
    @Override
    public Evaluacion add(ArrayList<String> dato) {
        int posCol = 0;
        Alumno alumnoEva = new Alumno();
        Materia materiaEva = new Materia();
        int asis = 0;
        Vector<Double> calificaciones = new Vector<>();
        for (String celda : dato) {
            switch (posCol) {
                case 3:
                    for (Alumno alumno : this.alumnos) {
                        if (((String.valueOf(alumno.getMatricula())).equals(celda))) {
                            alumnoEva = alumno;
                            break;
                        }
                    }
                    break;
                case 5:
                    for (Materia materia : this.materias) {
                        if ((materia.getCodigo().equals(celda))) {
                            materiaEva = materia;
                            break;
                        }
                    }
                    break;
                case 6:
                    asis = Integer.parseInt(celda);
                    break;
                default:
                    if (posCol >= 7 && posCol <= 10) {
                        if (!celda.equals("")) {
                            calificaciones.add(Double.parseDouble(celda));
                        }
                    }
                    break;
            }
            posCol++;
        }
        Evaluacion evaluacion = new Evaluacion(materiaEva, alumnoEva, asis);
        for (Double cal : calificaciones) {
            evaluacion.addUnidad(cal);
        }
        return evaluacion;
    }

    /**
     * @param datos Anade un conjunto de datos a la lista
     */
    @Override
    public void addAll(ArrayList<ArrayList<String>> datos) {
        for (ArrayList<String> filas : datos) {
            Evaluacion materia = this.add(filas);
            super.add(materia);
        }
    }

    /**
     * Funcion para obtener la cantidad de materias tomadas
     *
     * @param alumno Alumno que se desea obtener las materias tomadas
     * @return Un valor numerico de la cantidad de materias tomadas
     */
    public int getCantMateriasTomadas(Alumno alumno) {
        int cont = 0;
        for (Evaluacion evaluacion : this) {
            if (evaluacion.getAlumno() == alumno) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Funcion para obtener la cantidad de materias aprovadas
     *
     * @param alumno Alumno que se desea obtener la cantidad de materias aprobadas
     * @return Cantidad de materias aprobadas
     * @throws Exception SI ocurre algun error a la hora de obtener el dato
     */
    public int getCantMateriasAprobadas(Alumno alumno) throws Exception {
        int cont = 0;
        for (Evaluacion evaluacion : this) {
            if (evaluacion.getAlumno() == alumno && evaluacion.getPromedio() > 60) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Funcion para obtener el promedio general de un alumno
     *
     * @param alumno Alumno que se desea sacar la calificacion
     * @return Promedio general
     * @throws Exception Si ocurre algun error a la hora de obtener el promedio
     */
    public double getPromedioGeneral(Alumno alumno) throws Exception {
        double suma = 0;
        int cantidadMaterias = 0;
        for (Evaluacion evaluacion : this) {
            if (evaluacion.getAlumno().getMatricula() == alumno.getMatricula()) {
                //System.out.print(evaluacion.getPromedio() + "\t");
                suma += evaluacion.getPromedio();
                cantidadMaterias++;
            }
        }
        //System.out.println("\t");
        return suma / cantidadMaterias;
    }
}
