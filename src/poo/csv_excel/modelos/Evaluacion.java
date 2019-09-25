package poo.csv_excel.modelos;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Clase concreta para guardar la evaluacion
 */
public class Evaluacion implements Comparable {
    private Materia materia;
    private Alumno alumno;
    private ArrayList<Double> unidades;
    private double promedio;
    private double asistencia;

    public Evaluacion(Materia materia, Alumno alumno, double asistencia) {
        this.materia = materia;
        this.alumno = alumno;
        this.asistencia = asistencia;
        this.unidades = new ArrayList<>();
    }

    public void addUnidad(Double unidad) {
        if (this.unidades.size() >= this.materia.getCantUnidadesMax()) {
            System.out.println(unidad);
            throw new ArrayIndexOutOfBoundsException("Maxima capacidad de unidades " + this.toString());
        } else
            unidades.add(unidad);
    }

    public double getPromedio() throws Exception {
        double cantTotal = 0;
//        System.out.println(this.unidades);
//        System.out.println(this.unidades.size());
//        System.out.println(this.materia.getCantUnidadesMax());
        if (this.unidades.size() < this.materia.getCantUnidadesMax())
            throw new Exception("Faltan unidades");
        else if (this.unidades.size() > this.materia.getCantUnidadesMax())
            throw new ArrayIndexOutOfBoundsException("Maxima capacidad de unidades");
        else {
            for (Double cal : this.unidades) {
                if (cal <= 60) {
                    return 60;
                } else
                    cantTotal += cal;
            }
            return (this.asistencia < 80) ? 60 : (cantTotal / (this.unidades.size()));
        }

    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Double> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Double> unidades) {
        this.unidades = unidades;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Evaluacion.class.getSimpleName() + "[", "]")
                .add("materia=" + materia)
                .add("alumno=" + alumno)
                .add("unidades=" + unidades)
                .add("asistencia=" + asistencia)
                .toString();
    }

    @Override
    public int compareTo(@NotNull Object o) {
        int comparable = 0;
        try {
            if (o.getClass() == Evaluacion.class) {
                return Double.compare(this.getPromedio(), ((Evaluacion) o).getPromedio());
            } else {
                comparable = -1;
            }
            return comparable;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return comparable;
    }


    //TO ARRAY
}
