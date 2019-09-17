package distribuciones;

import tecnicasconteo.Combinacion;

/**
 *
 * @author isaac
 */
public class Binomial {
    private double nEnsayos;
    private double nExitos;
    private double probExito;
    public Binomial(double nEnsayos, double nExitos, double probExito){
        this.nEnsayos = nEnsayos;
        this.nExitos = nExitos;
        this.probExito = probExito;
    }
    
    public double obtenerValor(){
        Combinacion combinacion = new Combinacion((long)this.nEnsayos,(long)(this.nEnsayos-this.nExitos),false);
        return (double) combinacion.obtenerCombinacion() * Math.pow(probExito, nExitos) * Math.pow(1 - probExito, nEnsayos - nExitos);
    }
}
