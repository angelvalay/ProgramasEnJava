/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas.variabilidad;

import interfaz.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import medidas.localizacion.Media;

/**
 *
 * @author angel
 */
public class DesviacionEstandar {
    private ArrayList <Double> elementos;
    private Media media;
    
    public DesviacionEstandar(ArrayList<String> elementos) {
        this.elementos  = List.parseDouble(elementos);
        this.media      = new Media(List.parseString(this.elementos));
    }
    
    public DesviacionEstandar(JRootPane componentParent, long cantidad){
        this.elementos = List.getList(componentParent, "Mediana", JOptionPane.QUESTION_MESSAGE , cantidad);
        this.media      = new Media(List.parseString(this.elementos));
    }
    
    private double sumarElementos(){
        double suma = 0;
        for (int i = 0; i < this.elementos.size(); i++){
            suma += Math.pow((this.elementos.get(i) - media.obtenerMedia()),2);
        }
        suma/=this.elementos.size();
        return suma;
    }

    public double obtenerDesviacion() {
        return Math.sqrt(sumarElementos());
    }
    
}
