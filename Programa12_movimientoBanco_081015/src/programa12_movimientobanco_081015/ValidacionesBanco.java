
package programa12_movimientobanco_081015;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


public class ValidacionesBanco {
    public static boolean ValidarNo(int nclie){
        boolean res=true;
        
        if(nclie>0&&nclie<1001) res=false;else JOptionPane.showMessageDialog(null,"No de Cliente Incorrecto");
        
        return res;
    }
    public static int movimientosSinSaldo(int opc_mov,Object seleccion){
        seleccion= JOptionPane.showInputDialog(
                null,
                "Seleccione un movimiento ->",
                "Tipos de movimientos disponibles",
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon ("banco.jpg"), 
                new Object[] { "Deposito"}, 
                "Deposito");
            if(seleccion=="Deposito")opc_mov=1;
            else opc_mov=4;
            
        return opc_mov;
    }
    public static int movimientosConSaldo(int opc_mov,Object seleccion){
        seleccion= JOptionPane.showInputDialog(
                null,
                "Seleccione un movimiento ->",
                "Tipos de movimientos disponibles",
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon ("banco.jpg"), 
                new Object[] { "Deposito", "Retiro", "Pago de servicios"}, 
                "Deposito");
                if(seleccion=="Deposito")opc_mov=1;
                if(seleccion=="Retiro")opc_mov=2;
                if(seleccion=="Pago de servicios")opc_mov=3;
                return opc_mov;
    }

    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }
}
