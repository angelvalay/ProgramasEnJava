
package programa_trycatch_15102015;

import javax.swing.JOptionPane;


public class llenarDatos {
    public static String nombre(){
        String nombre=null;
        boolean a=true;
        while(nombre==null)
        {
            while(a){
                try{
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                a=false;
                }catch(ArrayIndexOutOfBoundsException aj){

                }
            }
        }
        return nombre;
    }
    public static  String domicilio(){
        String domicilio=null;
        while(domicilio==null)
        {
            domicilio = JOptionPane.showInputDialog("Ingrese el domicilio del empleado");
        }
        return domicilio;
    }
    public static byte edad(){
        byte edad=0;
        boolean op=true;
        while(op)
        {
            try
            {
                edad = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese la edad del empleado"));
                if(edad<18)    JOptionPane.showMessageDialog(null,"Edad invalida"); 
                else op=false;
            }
            catch(Exception n)
            {
                JOptionPane.showMessageDialog(null,"Error en el dato ingresado");
            }
        }
        return edad;
    }
    public static short antiguedad(){
        short antiguedad=0;
        boolean op=true;
        while(op)
        {
            try
            {
                antiguedad = Short.parseShort(JOptionPane.showInputDialog(null,"Ingrese la antiguedad del empleado"));
                if(antiguedad<0)
                    JOptionPane.showMessageDialog(null,"Antiguedad invalida");
                else op=false;
            }
            catch(Exception n)
            {
                JOptionPane.showMessageDialog(null,"Error en el dato ingresado");
            }
        }
        return antiguedad;
    }
    public static float sueldo(){
        float sueldo_quincenal=0f;
        boolean op=true;
        while(op)
        {
            try
            {
                sueldo_quincenal=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el sueldo del empleado"));
                if(sueldo_quincenal<0)
                    JOptionPane.showMessageDialog(null,"Sueldo invalido");
                else op=false;
            }
            catch(Exception n)
            {
                JOptionPane.showMessageDialog(null,"Error en el tipo de dato");
            }
        }
        return sueldo_quincenal;
    }
    public static Object gradoEstudios(){
        Object GradoDeEstudios;
        
        GradoDeEstudios= JOptionPane.showInputDialog(
                    null,
                    "Seleccion Grado de Estudios ->",
                    "Grado de Estudios",
                    JOptionPane.QUESTION_MESSAGE,
                    null , //new ImageIcon ("banco.jpg"), 
                    new Object[] { "Maestria","Ingenieria","Licenciatura","Media Superior","Secundaria"}, 
                    "Media Superior");
        
        return GradoDeEstudios;
        
    }
    public static boolean salirDelSistema(){
        boolean bye;
        int opcion = JOptionPane.showConfirmDialog(null, 
                "Desea seguir ejecutando la aplicación?", "Seleccione una opción", JOptionPane.YES_NO_OPTION);
        
        if(opcion==1)bye=false; else bye=true;
        return bye;
        
    }
}
