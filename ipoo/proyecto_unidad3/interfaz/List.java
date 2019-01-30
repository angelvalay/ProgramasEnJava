package interfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author isaac
 */
public class List {
    
    public static ArrayList<Double> getList(JRootPane componentParent, String title, int messageType, long times){
        ArrayList<Double> resultados = new ArrayList<Double>();
        for(long i = 0; i < times; i++){
            try{
                resultados.add(Double.parseDouble(JOptionPane.showInputDialog(componentParent,"Ingrese el valor " + (i+1),title,messageType)));
            }catch(Exception e){
                JOptionPane.showMessageDialog(componentParent, "Vuelva a ingresar el valor correctamente.", title, JOptionPane.ERROR_MESSAGE);
                i --;
            }  
        }
        return resultados;
    }
    
    public static ArrayList<Double> parseDouble(ArrayList<String> StringArray) throws NumberFormatException{
        ArrayList<Double> resultados = new ArrayList<Double>();
        for(String valor : StringArray){
            resultados.add(Double.parseDouble(valor));
        }
        return resultados;
    }
    
    public static ArrayList<String> parseString(ArrayList<Double> DoubleArray){
        ArrayList<String> resultados = new ArrayList<String>();
        for(double valor : DoubleArray){
            resultados.add(String.valueOf(valor));
        }
        return resultados;
    }
}
