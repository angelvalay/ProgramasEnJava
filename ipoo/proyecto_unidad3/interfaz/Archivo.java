/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author angel
 */
public class Archivo {
    private File direccion;
    private final Component contenedor;

    public Archivo(Component contenedor) {
        this.contenedor = contenedor;
    }
    
    public void leerArchivo(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Archivos de texto (txt,csv)", "txt", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(contenedor);
        if ( returnVal == JFileChooser.APPROVE_OPTION ) {
           System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName() + "\n" + chooser.getSelectedFile());
           this.direccion = chooser.getSelectedFile();
        }else{
            if ( returnVal == JFileChooser.CANCEL_OPTION ) {
                System.out.println("Canceled");
            }
        }
    }
    
    public boolean existeArchivo(){
        return this.direccion != null ;
    }

    public File getDireccion() {
        return direccion;
    }

    public void setDireccion(File direccion) {
        this.direccion = direccion;
    }
    
    
    
}
