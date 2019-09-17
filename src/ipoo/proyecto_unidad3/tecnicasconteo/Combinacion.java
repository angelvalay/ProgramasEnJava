package tecnicasconteo;

public  class Combinacion {
    private long n;
    private long r;
    private boolean esRepeticion;
    public Combinacion(long n, long r, boolean esRepeticion){
        this.n = n;
        this.r = r;
        this.esRepeticion = esRepeticion;
    }
    
    public long obtenerCombinacion(){
        PermutacionSinDatos permutacion = esRepeticion ? new PermutacionSinDatos(n + r - 1) : new PermutacionSinDatos(this.n);
        return permutacion.obtenerPermutacion(this.r) / Factorial.factorial(r);
    };

}
