
package programa_jframe_21102015;

import javax.swing.JOptionPane;


public class Funciones {

    public Funciones() {
        
    }
    public static boolean bye;
    Integer age=0;
    String nombre="",apellidos="",apellidos2="";
    boolean noMensaje=true;
    Integer contador;
    
   public static void salirDelSistema(){
        JOptionPane.showMessageDialog(null, "Gracias... Hasta Pronto");
    } 
   public void pedirDatos(){
       //try{
       nombre=Launcher.nombre.getText();
       apellidos=Launcher.apellidos.getText();
       apellidos2=Launcher.apellidos2.getText();
       age=Integer.parseInt(Launcher.edad.getText());
       contador++;
       //}
       /*catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Error en el tipo de dato que ingreso");
           noMensaje=false;
       }*/
   }
   public void mostrarDatos(){
       
       JOptionPane.showMessageDialog(null, "El nombre que se capturo es : "+apellidos+" "+apellidos2+" "+nombre+
               "\nLa edad es : "+age+" años" , /*TITULO*/ "Mensaje Emitido", JOptionPane.PLAIN_MESSAGE, null);
       
   }
   public static boolean salir(){
        
        int opcion = JOptionPane.showConfirmDialog(null, 
                "Desea seguir ejecutando la aplicación?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        
        if(opcion==1)bye=false; else bye=true;
        return bye;
        
    }
}
