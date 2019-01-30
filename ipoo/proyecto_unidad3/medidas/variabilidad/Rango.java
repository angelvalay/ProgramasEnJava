package medidas.variabilidad;

import interfaz.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author isaac
 */
public class Rango {
    private ArrayList<Double> elementos;
    public Rango(ArrayList<String> elementos) {
        this.elementos  = List.parseDouble(elementos);
    }
    
    public Rango(JRootPane componentParent, long cantidad){
        this.elementos = List.getList(componentParent, "Rango", JOptionPane.QUESTION_MESSAGE , cantidad);
    }
    
    public double getRango(){
        Collections.sort(elementos);
        return this.elementos.get(this.elementos.size() - 1) - this.elementos.get(0);
    }
}
