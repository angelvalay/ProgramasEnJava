package interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Datos {
    private File archivo;
    private String texto;
    private ArrayList<String> datos;
    
    public Datos(){
        this.archivo = null;
        this.datos = new ArrayList<>();
    }
    public Datos(File archivo){
        this.archivo =  archivo;
        this.datos = new ArrayList<>();
        this.generarNumerosPorArchivo();
    }
    public Datos(String texto){
        this.texto = texto;
        this.datos = new ArrayList<>();
        this.generarNumerosPorTexto();
    }

    private void generarNumerosPorArchivo(){
        if (this.archivo != null) {
            LeerArchivo leerArchivo = new LeerArchivo(archivo.toString());
            try {    
                this.datos =  leerArchivo.delimitador_cadena();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    private void generarNumerosPorTexto(){
        //separate all values by comma
        String[] lineVector = texto.split("\n");
        for (String string : lineVector) {
            //System.out.println("Numbers:" + string);
            this.datos.add(string);
        }
    }

    public ArrayList<String> getDatos() {
        return datos;
    }
    
    
}
