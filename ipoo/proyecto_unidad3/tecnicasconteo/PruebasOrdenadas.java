package tecnicasconteo;

import java.util.ArrayList;

public class PruebasOrdenadas {
    private final long n;

    public PruebasOrdenadas(long n) {
        this.n = n;
    }
    public PruebasOrdenadas(ArrayList<String> elementos) {
        this.n = elementos.size();
    }

    public long obtenerConReemplazo(long r){
        return (long) Math.pow(n,r);
    }

    public long obtenerSinReemplazo(long r){
        if(r > n)
            throw new UnsupportedOperationException ("R no debe ser mayor que N");
        PermutacionSinDatos permutacion = new PermutacionSinDatos(n);
        return permutacion.obtenerPermutacion(r);
    }
}
