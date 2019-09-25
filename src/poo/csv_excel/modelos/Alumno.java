package poo.csv_excel.modelos;

import java.util.StringJoiner;

/**
 * Clase para generar la estructura de los datos de un alumno
 */
public class Alumno {
    /**
     * Matricula del alumno
     */
    private int matricula;
    /**
     * Nombre del alumno
     */
    private String nombre;
    /**
     * Apellido paterno del alumno
     */
    private String apellidoPaterno;
    /**
     * Apellido materno del alumno
     */
    private String apellidoMaterno;
    /**
     * Promedio general
     */
    private double promedioGeneral;
    /**
     * Materias tomadas en el periodo
     */
    private int materiasTomadas;
    /**
     * Materias aprobadas en el periodo
     */
    private int materiasAprobadas;

    /**
     * Contructor base
     */
    public Alumno() {
        this.matricula = -1;
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.promedioGeneral = 0;
    }

    /**
     * Otro constructor
     *
     * @param matricula Matricula del alumno
     */
    public Alumno(int matricula) {
        this.matricula = matricula;
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.promedioGeneral = 0;
    }

    /**
     * Otro constructor
     *
     * @param matricula       Matricula del alumno
     * @param nombre          Nombre
     * @param apellidoPaterno Apellido Paterno
     * @param apellidoMaterno Apellido Materno
     */
    public Alumno(int matricula, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.promedioGeneral = 0;
    }

    /**
     * Otro constructor
     *
     * @param matricula       Matricula del alumno
     * @param nombre          Nombre
     * @param apellidoPaterno Apellido Paterno
     * @param apellidoMaterno Apellido Materno
     * @param promedioGeneral Promedio general
     */
    public Alumno(int matricula, String nombre, String apellidoPaterno, String apellidoMaterno, double promedioGeneral) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.promedioGeneral = promedioGeneral;
    }

    /**
     * Otro constructor
     *
     * @param matricula         Matricula del alumno
     * @param nombre            Nombre
     * @param apellidoPaterno   Apellido Paterno
     * @param apellidoMaterno   Apellido Materno
     * @param promedioGeneral   Promedio general
     * @param materiasTomadas   Materias tomadas
     * @param materiasAprobadas Materias aprobadas
     */
    public Alumno(int matricula, String nombre, String apellidoPaterno, String apellidoMaterno, double promedioGeneral, int materiasTomadas, int materiasAprobadas) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.promedioGeneral = promedioGeneral;
        this.materiasTomadas = materiasTomadas;
        this.materiasAprobadas = materiasAprobadas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public int getMateriasTomadas() {
        return materiasTomadas;
    }

    public void setMateriasTomadas(int materiasTomadas) {
        this.materiasTomadas = materiasTomadas;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    /**
     * Funcion para validar si son compatibles dos objectos de tipo ALumno
     *
     * @param o Objecto a comparar
     * @return evalua si el objecto es de la misma clase o si es la misma matricula
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return matricula == alumno.matricula;
    }

    /**
     * Se obtiene una cadena de datos para la visualizacion de datos
     *
     * @return Cadena del objecto
     */
    @Override
    public String toString() {
        return new StringJoiner(", ", Alumno.class.getSimpleName() + "[", "]")
                .add("matricula=" + matricula)
                .add("nombre='" + nombre + "'")
                .add("apellidoPaterno='" + apellidoPaterno + "'")
                .add("apellidoMaterno='" + apellidoMaterno + "'")
                .add("promedioGeneral=" + promedioGeneral)
                .add("materiasTomadas=" + materiasTomadas)
                .add("materiasAprobadas=" + materiasAprobadas)
                .toString();
    }

    /**
     * Permite comparar los datos de un alumno con otro
     *
     * @param alumno Alumno a comparar
     * @return si es igual el alumno
     */
    public boolean compareTo(Alumno alumno) {
        if (this.getPromedioGeneral() > alumno.getPromedioGeneral()) {
            return true;
        } else if (this.getPromedioGeneral() == alumno.getPromedioGeneral()) {
            if (this.getMatricula() / 100000 < alumno.getMatricula() / 100000) {
                return true;
            } else {
                if (this.getMatricula() / 100000 == alumno.getMatricula() / 100000) {
                    if (this.getMateriasTomadas() > alumno.getMateriasTomadas()) {
                        return true;
                    } else {
                        if (this.getMateriasAprobadas() > alumno.getMateriasTomadas()) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }

            }
        } else {
            return false;
        }
    }
}
