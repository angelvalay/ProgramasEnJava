
package proyectoparcial3;
import AdministracionTotal.Conexion;
import Login.contraPrincipal;
import java.awt.Dialog.ModalityType;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class ProyectoParcial3 {

    private static Conexion conexion = new Conexion();
    private static Connection conex= null;
    public  static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.pack();
        inicio.setVisible(true);
    }
    public static void setConnection(Connection a){
        conex=a;
    }
    public static Connection getConnection(){
        return conex;
    } 
    public static Conexion getConexion(){
        return conexion;
    }

    public static void getCloseConnection() throws SQLException {
        conex.close();    
    }
   
}
