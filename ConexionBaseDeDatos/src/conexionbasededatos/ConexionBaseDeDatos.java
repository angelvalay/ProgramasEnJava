
package conexionbasededatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.JOptionPane;

public class ConexionBaseDeDatos {

    static String url="jdbc:sqlserver://VALAY:1433;"
                    + "databaseName=escuela;user=sa;password=angel";
    static Connection conSql=null;
    private ConexionBaseDeDatos() throws ClassNotFoundException  {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conSql= DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "CONEXION HABILITADA A SQL", "CONEXION", 
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException d){
            System.err.println("CONEXION INHABILITADA "+ d);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet generar() throws SQLException{
        Statement stm = null;
        ResultSet rs;
        String SQL = "SELECT * FROM alumnos";
        stm = conSql.createStatement();
        rs = stm.executeQuery(SQL);
        return rs;
    }
     
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        ConexionBaseDeDatos conexion = new ConexionBaseDeDatos(); 
        NewJFrame frame = new NewJFrame();
        frame.setTitle(url);
        frame.setVisible(true);
        
        
        
        
    }
    
        
  } 

