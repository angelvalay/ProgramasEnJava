/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas.localizacion;

import interfaz.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author isaac
 */
public class Media {
    private ArrayList <Double> elementos;

    public Media(ArrayList<String> elementos) {
        this.elementos = List.parseDouble(elementos);
    }
    
    public Media(JRootPane componentParent, long cantidad){
        this.elementos = List.getList(componentParent, "Media", JOptionPane.QUESTION_MESSAGE , cantidad);
    }

    public double obtenerMedia() {
        double promedio = 0;
        int i;
        for (i = 0; i != this.elementos.size(); i++)
            promedio += this.elementos.get(i);
        return promedio / i;
    }
    
}
