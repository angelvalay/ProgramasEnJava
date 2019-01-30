
package programa12_movimientobanco_081015;

import javax.swing.*;



public class OperacionesBanco {
    
    public static float Opcion1(float cantidad,float sueldo){
        if(sueldo>0){
        sueldo+=cantidad;
        }
        return sueldo;
    }
    public static float Seleccion(int opc_mov, float cantidad , float sueldo){
        switch(opc_mov){
            case 1: 
                sueldo+=cantidad;
                break;
            case 2: 
                sueldo-=cantidad;
                break;
            case 3:
                sueldo-=cantidad;
                break;
            default : 
                break;
        }
        return sueldo;
    }
    public static void lanzarMensaje(int nclie,String clie,float sueldo, int l){
         
       
        String line = System.getProperty("line.separator");
        
        JOptionPane.showMessageDialog(null, "No. Cliente ->" + nclie
        + line + "Nombre -> "+clie
        + line + "Saldo Final -> $" +sueldo
        + line + "Cantidad de movimientos que se realizaron correctamente -> "+ l
        );
     
       
    }
    public static boolean mensajeSystem(){
        boolean system=true;
        int corte =JOptionPane.showOptionDialog(
                        null,
                        "DESEAS SALIR DEL SISTEMA?..",
                        "STOP", 
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        new ImageIcon ("Stop.jpg"),    
                        new Object[] { "SALIR", "CONTINUAR" },   
                        "SALIR");
         if(corte==0)system=false; else system=true;
         return system;
    } 
     
    public static void mostrarContadores(int ñ, int n){
        String line = System.getProperty("line.separator");
        
        JOptionPane.showMessageDialog(null, "Clientes que quisieron retirar dinero y no tuvieron fondos -> " + ñ
        + line + "Clientes que tuvieron un saldo incial mayor a 50000 -> "+n
        );
    }
}
