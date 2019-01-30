
package programa12_movimientobanco_081015;
import javax.swing.*;

public class Programa12_movimientoBanco_081015 {

    
    public static void main(String[] args) {
        String line = System.getProperty("line.separator");
        int nclie,corte,l,m,n,ñ,opc_mov ,i,j,fecha_año, fecha_mes, fecha_dia,a,b,c;
        nclie=corte=l=m=n=opc_mov=ñ=i=fecha_año=fecha_mes=j=fecha_dia=a=b=c=0;
        Object[] botones = {"ACEPTAR", "CONTINUAR" };
        Object seleccion = null;
        String clie=null;
        float cantidad,sueldo,auxsueldo;
        cantidad=sueldo=auxsueldo=0;
        boolean res=true, bye = false,system=true,mov=false;
        String fecha=null;
        String fecha1;
        while(system==true){
            res=true;
            bye=false;
            nclie=opc_mov=0;
            clie=null;
            sueldo=cantidad=0;
        
            for(int x=0;;x++){
            if(bye==true){
                nclie=opc_mov=0;
                clie=null;
                sueldo=cantidad=0;
                res=false;
                }
        
                if(nclie==0&&clie==null){
                    while(res==true){
                        nclie=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el No de cliente:"));
                        res=ValidacionesBanco.ValidarNo(nclie);
                    }
        
                    clie=JOptionPane.showInputDialog("Ingresa el nombre del cliente:");
        
                    sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el saldo que deseas tener:"));
                    auxsueldo=sueldo;
                }
            
                seleccion=null;
            
                if(sueldo>0){
                    opc_mov=ValidacionesBanco.movimientosConSaldo(opc_mov, seleccion);
                }else opc_mov=ValidacionesBanco.movimientosSinSaldo(opc_mov, seleccion);
            
                if (opc_mov==1)seleccion="Deposito";
                if (opc_mov==2)seleccion="Retiro";
                if (opc_mov==3)seleccion="Pago de servicios";
            
                if(seleccion!=null||opc_mov==4){
                
                do{    
                    cantidad=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad del "+ seleccion));
                }while(cantidad<1);
            
                if (cantidad>sueldo&&opc_mov==2||opc_mov==3&&cantidad>sueldo) {
                    m=1;
                    mov=true;
                    JOptionPane.showMessageDialog(null,"No cuentas con el saldo suficiente para realizar este movimiento");
                }else{ 
                    l++;
                    mov=false;
                    sueldo=OperacionesBanco.Seleccion(opc_mov, cantidad, sueldo);
                }
            
                if(sueldo<100&&opc_mov!=1&&mov==false&&sueldo>0)
                {       
                    i=JOptionPane.showOptionDialog(null, "TU SALDO ESTA POR AGOTARSE", "ADVERTENCIA",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, botones, botones[0]);
                } else if(sueldo==0)
                    j=JOptionPane.showOptionDialog(null, "TU SALDO DE LA CUENTA SE HA AGOTADO", "AVISO",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, botones, botones[0]);
            
                fecha=ValidacionesBanco.getFechaActual();
            
                }
            
                corte =JOptionPane.showOptionDialog(
                    null,
                    "Saldo Actual: $"+sueldo+line+"Fecha: "+fecha, 
                    "Estado de la cuenta",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,   
                    new Object[] { "SALIR DE LA CUENTA", "CONTINUAR" },   
                    "SALIR DE LA CUENTA");
        
                if(JOptionPane.OK_OPTION==corte){
                    break; 
                }
            
        }
        ñ+=m;
        bye=true; 
    
        if(auxsueldo>50000)
            n++;
    
        OperacionesBanco.lanzarMensaje(nclie, clie, sueldo, l);
        system=OperacionesBanco.mensajeSystem();
    }
     OperacionesBanco.mostrarContadores(ñ, n);
 } 
}
