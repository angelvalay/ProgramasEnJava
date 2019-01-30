/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuciones;

import java.util.ArrayList;
import tecnicasconteo.Combinacion;

/**
 *
 * @author isaac
 */
public class HyperGeometrica {
    private long tamPoblacion;
    private long nIndividuos;
    private long tamMuestra;
    private long valorX;
    public HyperGeometrica(ArrayList<String> elementos,long nIndividuos, long tamMuestra, long valorX){
        this.tamPoblacion   = elementos.size();
        this.tamMuestra     = tamMuestra;
        this.nIndividuos    = nIndividuos;
        this.valorX         = valorX;
        if (this.tamMuestra > this.tamPoblacion)
            throw new UnsupportedOperationException("Tamano de la muestra supera a la poblacion.");
        if(this.nIndividuos > this.tamPoblacion)
            throw new UnsupportedOperationException("Numero de individuos supera a la muestra.");
    }
    
    public HyperGeometrica(long tamPoblacion,long nIndividuos, long tamMuestra, long valorX){
        this.tamPoblacion   = tamPoblacion;
        this.tamMuestra     = tamMuestra;
        this.nIndividuos    = nIndividuos;
        this.valorX         = valorX;
        if (this.tamMuestra > this.tamPoblacion)
            throw new UnsupportedOperationException("Tamano de la muestra supera a la poblacion.");
        if(this.nIndividuos > this.tamPoblacion)
            throw new UnsupportedOperationException("Numero de individuos supera a la muestra.");
    }
    
    public double obtenerValor(){
        Combinacion combinacion1 = new Combinacion(nIndividuos,valorX,false);
        Combinacion combinacion2 = new Combinacion(tamPoblacion-nIndividuos,tamMuestra-valorX,false);
        Combinacion combinacion3 = new Combinacion(tamPoblacion,tamMuestra,false);
        return (double)combinacion1.obtenerCombinacion() * (double)combinacion2.obtenerCombinacion() / (double)combinacion3.obtenerCombinacion();
    }
}
