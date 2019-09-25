package poo.csv_excel.modelos;

import java.util.StringJoiner;

/**
 * Clase concreta Materia
 */
public class Materia {
    /**
     * Cantidad maxima de materias
     */
    public static int CANT_UN_MAX = 4;
    /**
     * Cantidad minima de materias
     */
    public static int CANT_UN_MIN = 1;
    /**
     * Nombre de la materia
     */
    private String nombre;
    /**
     * Codigo de la materia
     */
    private String codigo;
    /**
     * Cantidad de unidades max de la materia
     */
    private int cantUnidadesMax;

    /**
     * Constructor
     */
    public Materia() {
        this.nombre = "";
        this.codigo = "";
        this.cantUnidadesMax = 0;
    }

    /**
     * @param nombre          Nombre de la materia
     * @param codigo          Codigo de la materia
     * @param cantUnidadesMax Cantidad maxima de unidades de la materia
     */
    public Materia(String nombre, String codigo, int cantUnidadesMax) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantUnidadesMax = cantUnidadesMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantUnidadesMax() {
        return cantUnidadesMax;
    }

    public void setCantUnidadesMax(int cantUnidadesMax) {
        this.cantUnidadesMax = cantUnidadesMax;
    }

    /**
     * Equals para commparar dos objectos de tipo materia
     *
     * @param o Objecto a comparar
     * @return Si es compatible
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia = (Materia) o;
        return codigo.equals(materia.codigo);
    }

    /**
     * Funcion toString
     *
     * @return Cadena con los datos de la materia
     */
    @Override
    public String toString() {
        return new StringJoiner(", ", Materia.class.getSimpleName() + "[", "]")
                .add("nombre='" + nombre + "'")
                .add("codigo='" + codigo + "'")
                .add("cantUnidadesMax=" + cantUnidadesMax)
                .toString();
    }
}
