/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidas.localizacion;

import interfaz.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author angel
 */
public class Mediana {
    private ArrayList <Double> elementos;

    public Mediana(ArrayList<String> elementos) {
        this.elementos = List.parseDouble(elementos);
    }
    
    public Mediana(JRootPane componentParent, long cantidad){
        this.elementos = List.getList(componentParent, "Mediana", JOptionPane.QUESTION_MESSAGE , cantidad);
    }


    public double obtenerMediana() {
        Collections.sort(elementos);
        double mediana = 0;
        int i = this.elementos.size()%2;
        if (i == 0){
            i = this.elementos.size()/2;
            mediana = (this.elementos.get(i)+ this.elementos.get(i - 1)) / 2;
        }
        else{
            if (this.elementos.size() == 1)
                mediana = this.elementos.get(0);
            else
                mediana = this.elementos.get((this.elementos.size()/2) + 1);
        }
        return mediana;
    }
    
    
    
    
}
