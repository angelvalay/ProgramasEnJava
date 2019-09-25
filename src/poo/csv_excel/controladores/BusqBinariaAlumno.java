package poo.csv_excel.controladores;

import modelos.Alumno;
import modelos.ListaAlumnos;

/**
 * Clase concreta para la busqueda de alumnos binario
 */
public class BusqBinariaAlumno extends BusquedaBinaria<ListaAlumnos, Alumno> {
    /**
     * Funcion que permite la busqueda de forma binaria
     *
     * @param datos conjunto de datos
     * @param clave dato a buscar
     * @param izq   nodo izquierdo
     * @param der   nodo derecho
     * @return el alumno encontrado
     */
    @Override
    public Alumno buscar(ListaAlumnos datos, Alumno clave, int izq, int der) {
        if (der >= izq) {
            int medio = izq + (der - izq) / 2;
            if (datos.get(medio).getMatricula() == clave.getMatricula())
                return datos.get(medio);
            if (datos.get(medio).getMatricula() < clave.getMatricula())
                return buscar(datos, clave, izq, medio - 1);
            return buscar(datos, clave, medio + 1, der);
        }
        return null;
    }

}
