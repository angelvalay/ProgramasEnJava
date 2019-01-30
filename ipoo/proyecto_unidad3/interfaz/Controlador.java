package interfaz;

import distribuciones.Binomial;
import distribuciones.HyperGeometrica;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import medidas.localizacion.*;
import medidas.variabilidad.*;
import tecnicasconteo.*;

/**
 *
 * @author angel
 */

public class Controlador extends Menu{
    Archivo archivo;
    Datos datos;
    public Controlador(){
        super();
        super.setLocationRelativeTo(null);
        super.setTitle("Herramienta de aprendizaje");
        this.archivo    =  new Archivo(rootPane);
        this.datos      =  new Datos();
    }
    
    public void iniciar(){
        this.iniciarEventos();
        super.setVisible(true);
    }
    
    private void iniciarEventos(){
        super.getBtnBinomial().addActionListener((ActionEvent e) -> {
            try{
                double n = Double.parseDouble(JOptionPane.showInputDialog(rootPane,"Numero de ensayos:", "Distribucion binomial"));
                double x = Double.parseDouble(JOptionPane.showInputDialog(rootPane,"Numero de exitos:", "Distribucion binomial"));
                double p = Double.parseDouble(JOptionPane.showInputDialog(rootPane,"Probabilidad de exito:", "Distribucion binomial"));
                Binomial binomial =  new Binomial(n,x,p);
                JOptionPane.showMessageDialog(rootPane, "Probabilidad: " + binomial.obtenerValor());
            }catch(Exception error){
                
            }
        });
        
        super.getBtnCombinacion().addActionListener((ActionEvent e) -> {
            try{
                long resultado = 0;
                if (this.hayDatos()) {
                    long r = Long.parseLong(JOptionPane.showInputDialog(rootPane,"Ingresa el valor de R:", "Combinacion"));
                    Combinacion combinacion =  new Combinacion(this.datos.getDatos().size(),r, false);
                    resultado = combinacion.obtenerCombinacion();
                    JOptionPane.showMessageDialog(rootPane, "Combinacion: "+ resultado, "Combinacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int seleccion;
                    String[] opciones = {"Con repeticion","Sin repeticion"};

                    seleccion =  JOptionPane.showOptionDialog(rootPane, "Elige un tipo de combinacion:", "Combinacion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    if (seleccion != JOptionPane.CLOSED_OPTION) {
                        String n = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de N:");
                        String r = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de R:");
                        Combinacion combinacion;
                        if (!n.equals(null) && !n.equals("")) {
                            switch(seleccion){
                                case 0:
                                    combinacion = new Combinacion(Long.parseLong(n), Long.parseLong(r),true);
                                    resultado = combinacion.obtenerCombinacion();
                                    break;
                                case 1:
                                    combinacion = new Combinacion(Long.parseLong(n), Long.parseLong(r),false);
                                    resultado = combinacion.obtenerCombinacion();
                                    break;
                            }

                        }
                        JOptionPane.showMessageDialog(rootPane, "Combinacion: "+ resultado, "Combinacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                
            }catch  (NullPointerException error) {
                    JOptionPane.showMessageDialog(rootPane, "No deje vacio los campos.","Error",JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(rootPane, "Ingrese correctamente los datos.","Error",JOptionPane.ERROR_MESSAGE);
            } catch (UnsupportedOperationException error ){
                    JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        super.getBtnDesvEstandar().addActionListener((ActionEvent e) -> {
            try{
                DesviacionEstandar desviacionEstandar;
                if (this.hayDatos()){
                     desviacionEstandar = new DesviacionEstandar(this.datos.getDatos());
                }else{
                    long cantidad = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos:"));
                    desviacionEstandar =  new DesviacionEstandar(rootPane, cantidad);
                }
                JOptionPane.showMessageDialog(rootPane, "Desviacion Estandar: " + desviacionEstandar.obtenerDesviacion(), "Desviacion Estandar", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        super.getBtnDistNormal().addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(rootPane, "Funcion no disponible", "Distibucion Normal", JOptionPane.ERROR_MESSAGE);
        });
        
        super.getBtnHyper().addActionListener((ActionEvent e) -> {
            try{
                HyperGeometrica hyperGeometrica; 
                String nInd, tamMue, valorX;
                if (this.hayDatos()){
                    nInd     = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de K:");
                    tamMue   = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de n:");
                    valorX   = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de X:");
                    hyperGeometrica =  new HyperGeometrica(this.datos.getDatos(), Long.parseLong(nInd),
                        Long.parseLong(tamMue),Long.parseLong(valorX));
                }else{
                    String N =  JOptionPane.showInputDialog(rootPane, "Ingresa el valor de N:");
                    nInd = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de K:");
                    tamMue = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de n:");
                    valorX = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de X:");
                    hyperGeometrica =  new HyperGeometrica(Long.parseLong(N), Long.parseLong(nInd),
                        Long.parseLong(tamMue),Long.parseLong(valorX));
                }
                JOptionPane.showMessageDialog(rootPane, "Distribucion hypergeometrica: " + hyperGeometrica.obtenerValor(), "Distribuciones", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        super.getBtnMedia().addActionListener((ActionEvent e) -> {
            try{
                Media media; 
                if (this.hayDatos()){
                    media =  new Media(this.datos.getDatos());
                }else{
                    long cantidad = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos:"));
                    media = new Media(rootPane,cantidad);
                }
                JOptionPane.showMessageDialog(rootPane, "Media: " + media.obtenerMedia(), "Media", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        super.getBtnMediana().addActionListener((ActionEvent e) -> {
            try{
                Mediana mediana;
                if (this.hayDatos()){
                   mediana =  new Mediana(this.datos.getDatos());
                }else{
                    long cantidad = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos:"));
                    mediana = new Mediana(rootPane, cantidad);
                }
                JOptionPane.showMessageDialog(rootPane, "Mediana: " + mediana.obtenerMediana(), "Mediana", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        super.getBtnMuestra().addActionListener((ActionEvent e) -> {
            this.archivo.leerArchivo();
            super.getTxtNombreArchivo().setText(this.archivo.getDireccion().toString());
            if (this.archivo.existeArchivo()) {
                super.getCampoMuestra().setEnabled(false);
            }
        });
        
        super.getBtnPermutacion().addActionListener((ActionEvent e) -> {
            long resultado = 0;
            try {
                if (this.hayDatos()){
                    PermutacionConDatos permutacion = new PermutacionConDatos(datos.getDatos());
                    resultado = permutacion.obtenerPermutacion();
                    JOptionPane.showMessageDialog(rootPane, "Permutacion: "+ resultado, "Permutacion", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    int seleccion;
                    String[] opciones = {"Con repeticion","Sin repeticion"};

                    seleccion =  JOptionPane.showOptionDialog(rootPane, "Elige un tipo de permutacion:", "Permutacion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    if (seleccion != JOptionPane.CLOSED_OPTION) {
                        String n = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de N:");
                        PermutacionSinDatos permutacion =  new PermutacionSinDatos(Long.parseLong(n));
                        if (!n.equals(null) && !n.equals("")) {
                            String r = null;
                            switch(seleccion){
                                case 0:
                                    ArrayList<Long> valoresRepetidos = new ArrayList<Long>();  
                                    r = JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos que estan repetidos:");
                                    if (!r.equals(null) && !r.equals("")) {
                                        for (int i = 0; i < Long.parseLong(r); i++) {
                                            valoresRepetidos.add(Long.parseLong(JOptionPane.showInputDialog(rootPane,"Cantidad de elementos",
                                                    "Valor " + (i+1),JOptionPane.QUESTION_MESSAGE)));
                                        }
                                    }
                                    resultado =  permutacion.obtenerPermutacion(valoresRepetidos);
                                    break;
                                case 1:
                                    r = JOptionPane.showInputDialog(rootPane, "Ingresa el valor de R:");
                                    if (!r.equals(null) && !r.equals("")) {
                                        resultado = permutacion.obtenerPermutacion(Long.parseLong(r));
                                    }
                                    break;
                            }

                        }
                        JOptionPane.showMessageDialog(rootPane, "Permutacion: "+ resultado, "Permutacion", JOptionPane.INFORMATION_MESSAGE);
                    } 
                }   

            } catch (NullPointerException error) {
                JOptionPane.showMessageDialog(rootPane, "No deje vacio los campos.","Error",JOptionPane.ERROR_MESSAGE);   
            } catch (NumberFormatException error){
                JOptionPane.showMessageDialog(rootPane, "Ingrese correctamente los datos.","Error",JOptionPane.ERROR_MESSAGE);
            } catch (UnsupportedOperationException error ){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }    
        });
        super.getBtnPruebas().addActionListener((ActionEvent e) -> {
            try{
                long resultado = 0;
                int seleccion;
                String[] opciones = {"Con reemplazo","Sin reemplazo"};
                seleccion =  JOptionPane.showOptionDialog(rootPane, "Elige un tipo de pruebas ordenadas:", "Pruebas ordenadas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                if (seleccion != JOptionPane.CLOSED_OPTION) {
                    long r = 0;
                    long n = 0;
                    if (this.hayDatos()) {
                        r = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa el valor de R:"));
                        PruebasOrdenadas pruebasOrdenadas =  new PruebasOrdenadas(this.datos.getDatos());
                        if(seleccion == 0)
                            resultado  = pruebasOrdenadas.obtenerConReemplazo(r);
                        else
                            resultado = pruebasOrdenadas.obtenerSinReemplazo(r);
                    }else{
                        n = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa el valor de N:"));
                        r = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa el valor de R:"));
                        PruebasOrdenadas pruebasOrdenadas =  new PruebasOrdenadas(n);
                        if(seleccion == 0)
                            resultado  = pruebasOrdenadas.obtenerConReemplazo(r);
                        else
                            resultado = pruebasOrdenadas.obtenerSinReemplazo(r);
                    }
                    JOptionPane.showMessageDialog(rootPane, "Cantidad de pruebas: "+ resultado, "Pruebas ordenadas", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch (NullPointerException error) {
                JOptionPane.showMessageDialog(rootPane, "No deje vacio los campos.","Error",JOptionPane.ERROR_MESSAGE);   
            } catch (NumberFormatException error){
                JOptionPane.showMessageDialog(rootPane, "Ingrese correctamente los datos.","Error",JOptionPane.ERROR_MESSAGE);
            } catch (UnsupportedOperationException error ){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            } 
        });
        super.getBtnRango().addActionListener((ActionEvent e) -> {
            try{
                Rango rango;
                if (this.hayDatos()){
                    rango =  new Rango(this.datos.getDatos());
                }else{
                    long cantidad = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos:"));
                    rango =  new Rango(rootPane,cantidad);
                }
                JOptionPane.showMessageDialog(rootPane, "Rango: "+ rango.getRango(), "Rango", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        super.getBtnTStudent().addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(rootPane, "Funcion no disponible.", "Distribucion T-Student", JOptionPane.ERROR_MESSAGE);
        });
        super.getBtnVarianza().addActionListener((ActionEvent e) -> {
            try{
                Varianza varianza;
                if (this.hayDatos()){
                     varianza = new Varianza(this.datos.getDatos());
                }else{
                    long cantidad = Long.parseLong(JOptionPane.showInputDialog(rootPane, "Ingresa la cantidad de elementos:"));
                    varianza =  new Varianza(rootPane, cantidad);
                }
                JOptionPane.showMessageDialog(rootPane, "Varianza: " + varianza.obtenerVarianza(), "Varianza", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception error){
                JOptionPane.showMessageDialog(rootPane, error.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        });
        super.getBtnBorrarDatos().addActionListener((ActionEvent e) -> {
            borrarCampos();
        });
        super.getCampoMuestra().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if(hayTexto())
                    getBtnMuestra().setEnabled(false);
                else
                    getBtnMuestra().setEnabled(true);
            }
        });
    }
    
    private boolean hayTexto(){
        return super.getCampoMuestra().getText().length() > 0;
    }
    
    private boolean hayDatos(){
        if (this.archivo.existeArchivo()) {
            datos =  new Datos(this.archivo.getDireccion());
            return true;
        }else{
            if (this.hayTexto()) {
                datos =  new Datos(super.getCampoMuestra().getText());
                return true;
            }else{
                return false;
            }
        }
    }
    
    private void borrarCampos(){
        this.archivo = new Archivo(rootPane);
        super.getCampoMuestra().setText("");
        super.getTxtNombreArchivo().setText("");
        if (!super.getCampoMuestra().isEnabled())
            super.getCampoMuestra().setEnabled(true);
        if (!super.getBtnMuestra().isEnabled())
            super.getBtnMuestra().setEnabled(true);
        
        
    }
    
}
