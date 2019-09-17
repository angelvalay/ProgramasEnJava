/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageDatosProblemas;

/**
 *
 * @author Angel Armando Valay Martinez
 */
public class ProblemasDistancia extends Problemas{

    public ProblemasDistancia(String problema, float distancia, 
            String tDistancia, float tiempo, String tTiempo, float rapidez, String tRapidez) {
        super(problema, distancia, tDistancia, tiempo, tTiempo, rapidez, tRapidez);
    }

    public String getProblema() {
        return problema;
    }

    public float getDistancia() {
        return distancia;
    }

    public String gettDistancia() {
        return tDistancia;
    }

    public float getTiempo() {
        return tiempo;
    }

    public String gettTiempo() {
        return tTiempo;
    }

    public float getRapidez() {
        return rapidez;
    }

    public String gettRapidez() {
        return tRapidez;
    }
    
    
    
}
