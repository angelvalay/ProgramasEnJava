package tecnicasconteo;

import java.util.ArrayList;

/**
 *
 * @isaac 
 */
public class PermutacionConDatos extends Permutacion{
    private ArrayList<String> elementos;
    private ArrayList<Long> elementosRepetidos;
    private long longitud;
    private PermutacionSinDatos permutacion;

    public PermutacionConDatos(ArrayList<String> elementos) {
        this.elementos              = elementos;
        this.elementosRepetidos     = new ArrayList<>();
        this.longitud               = this.elementos.size();
        this.permutacion            = new PermutacionSinDatos(longitud);
    }

    @Override
    public long obtenerPermutacion() {
        if (buscarRepeticiones()) {
            return permutacion.obtenerPermutacion(elementosRepetidos);
        } else {
            return permutacion.obtenerPermutacion();
        }
    }
    
    private boolean buscarRepeticiones(){
        boolean hayRepetidos = false;
        long cantRep;
        for (int i = 0; i < this.elementos.size(); i++) {
            cantRep = 0;
            for (int j = i + 1; j < this.elementos.size(); j++) {
                System.out.println(this.elementos.get(i) + " - " + this.elementos.get(j));
                if (this.elementos.get(i).equals(this.elementos.get(j))) {
                    cantRep ++;
                    this.elementos.remove(j);
                    j --;
                    this.setLongitud(this.getLongitud() - 1);
                    hayRepetidos = true;
                    System.out.println(this.longitud);
                    
                }
            }
            if (cantRep > 0) {
                this.elementosRepetidos.add(cantRep + 1);
            }
        }

        return hayRepetidos;
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<String> elementos) {
        this.elementos = elementos;
    }

    public ArrayList<Long> getElementosRepetidos() {
        return elementosRepetidos;
    }

    public void setElementosRepetidos(ArrayList<Long> elementosRepetidos) {
        this.elementosRepetidos = elementosRepetidos;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public PermutacionSinDatos getPermutacion() {
        return permutacion;
    }

    public void setPermutacion(PermutacionSinDatos permutacion) {
        this.permutacion = permutacion;
    }
    
    
    
    
}