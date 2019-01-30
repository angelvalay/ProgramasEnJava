
package AdministracionTotal;

import Login.contraPrincipal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import proyectoparcial3.ProyectoParcial3;


public class PanelBD1 {
    private String host;
    private String user;
    private String contra;
    private String getHost(){
         return JOptionPane.showInputDialog(null, "Host:");
        
    }
    private String getUser(){
        return JOptionPane.showInputDialog(null, "User");
         
    }
    private String getPassword(){
        return JOptionPane.showInputDialog(null, "Contraseña:");
    }
    public void getRegistro(){
        host=getHost();
        user=getUser();
        contra=getPassword();
        inicio();
    }
    private void inicio(){
        //Creamos un Thread para mejorar el ejemplo
        final Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                if(host!=null&&user!=null&&contra!=null){
            ProyectoParcial3.setConnection(Conexion.GetResetearConnection(host, user, contra));
            host=user=contra=null;
            if(ProyectoParcial3.getConnection()!=null){
                contraPrincipal.setTextEstado("Conectado");
            }else{
                contraPrincipal.setTextEstado("Desconectado");
            }
            
            }else{
                JOptionPane.showMessageDialog(null, "Datos invalidos.", "Aviso",  JOptionPane.ERROR_MESSAGE);
                host=user=contra=null;
                    if(ProyectoParcial3.getConnection()!=null){
                    contraPrincipal.setTextEstado("Conectado");
                }else{
                    contraPrincipal.setTextEstado("Desconectado");
                }
            }
            }
        });
        //Se ejecuta el Thread
        t.start();
    }
}
