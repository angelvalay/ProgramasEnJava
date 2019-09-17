package medidas.variabilidad;

import java.util.ArrayList;
import javax.swing.JRootPane;

/**
 *
 * @author angel
 */
public class Varianza extends DesviacionEstandar{

    public Varianza(ArrayList<String> elementos) {
        super(elementos);
    }

    public Varianza(JRootPane componentParent, long cantidad) {
        super(componentParent, cantidad);
    }
    
    public double obtenerVarianza(){
        return Math.pow(super.obtenerDesviacion(), 2);
    }

}
