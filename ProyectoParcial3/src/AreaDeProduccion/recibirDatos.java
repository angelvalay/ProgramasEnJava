
package AreaDeProduccion;
        
import AreaDeProduccion.nuevoInsumo2;
import AreaDeProduccion.nuevaCompra;
import java.util.Calendar;

public class recibirDatos {
    
public static String CODIGOINSUMO;
public static String NOMBREINSUMO;
public static float COSTOINSUMO;
public static String NOMPROV;
public static String CONTACTOPROV;
public static String TELPROV;
public static Object UM;

public static String FOLIOCOMPRA;
public static String CODIGOINSUMOcomp;
public static int CANTIDAD;
public static float TOTAL;

public static Calendar calendario= Calendar.getInstance();
public static Integer día=calendario.get(Calendar.DATE);
public static Integer mes=1+(calendario.get(Calendar.MONTH));
public static Integer año=calendario.get(Calendar.YEAR);
public static String FECHA=(día + "/" + mes + "/" + año);
    
    public static boolean validarInsumo(){
        boolean seguir= true; 
        try{
            CODIGOINSUMO=nuevoInsumo2.codigoInsumo.getText();
            NOMBREINSUMO=nuevoInsumo2.nombreInsumo.getText();
            COSTOINSUMO=Float.parseFloat(nuevoInsumo2.costoInsumo.getText());
            NOMPROV=nuevoInsumo2.nomProv.getText();
            CONTACTOPROV=nuevoInsumo2.contactoProv.getText();
            TELPROV=nuevoInsumo2.telProv.getText();
            UM=nuevoInsumo2.umInsumo.getSelectedItem();

            if ("".equals(CODIGOINSUMO) || "".equals(NOMBREINSUMO) || "".equals(NOMPROV) || "".equals(CONTACTOPROV) || "".equals(TELPROV)){
                seguir= false;
            }else{
                if(NOMBREINSUMO.matches("^[A-Z ]*$") || NOMPROV.matches("^[A-Z ]*$") || CONTACTOPROV.matches("^[A-Z ]*$")) {}
                else{
                    seguir=false;
                }
                if (TELPROV.matches("^[A-Z ]*$")) seguir=false;
                if (COSTOINSUMO<0) seguir=false;
            }
        }catch (Exception a){
            seguir=false;
        }
        if(seguir==false) nuevoInsumo2.mensaje.setText("ERROR EN EL DATO INGRESADO.");
        return seguir;
    }
    
    public static boolean validarCompra(){
        boolean seguir=true;

        try{
            FOLIOCOMPRA=nuevaCompra.folioCompra.getText();
            CODIGOINSUMOcomp=nuevaCompra.codInsumo.getText();
            CANTIDAD= Integer.parseInt(nuevaCompra.cantInsumos.getText());
            TOTAL=Float.parseFloat(nuevaCompra.totalCompra.getText());
            
            if("".equals(FOLIOCOMPRA) || "".equals(CODIGOINSUMO) || "".equals(CANTIDAD) || "".equals(TOTAL)){
                seguir = false;
            }else{
                if (CANTIDAD < 0) seguir = false;
                if (TOTAL < 0) seguir = false;
            }
                
        }catch (Exception a){
            seguir = false;
        }
        if(seguir==false) {nuevaCompra.amessage.setText("ERROR EN EL DATO INGRESADO.");}
        return seguir;
    }
    
}
