/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasconteo;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class PermutacionSinDatos extends Permutacion{
    
    private long valorN;
    
    public PermutacionSinDatos(long valorN) {
        this.valorN = valorN;
        if (valorN <=  0)
            throw new UnsupportedOperationException("Valor de N fuera del rango."); 
    }
    
    @Override
    public long obtenerPermutacion() {
        return Factorial.factorial(this.valorN);
    }
    
    public long obtenerPermutacion(long R) {
        if(R > this.valorN || R < 0 )
            throw new UnsupportedOperationException("Valor de R fuera del rango."); 
        long resultado  = 1;
        for (long i = (this.valorN - R) + 1; i <= this.valorN ; i++) {
            resultado*=i;
        }
        return resultado;
    }
    
    public long obtenerPermutacion(ArrayList<Long> valorRep) {
        long sumaDeClases = 1;
        for(long valor : valorRep){
            sumaDeClases*=Factorial.factorial(valor);
        }
        return Factorial.factorial(valorN) / sumaDeClases;
    }
    
    
}
