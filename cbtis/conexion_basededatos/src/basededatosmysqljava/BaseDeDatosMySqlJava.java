
package basededatosmysqljava;
import java.sql.*;
import javax.swing.JOptionPane;

public class BaseDeDatosMySqlJava {

    
 

 public static void main(String[] args) throws Exception {
        MySQL db = new MySQL();
        db.MySQLConnection("root", "12345", "");
        String base =JOptionPane.showInputDialog(null, "Teclea el nombre de la base de datos", 
                "Base de datos", JOptionPane.INFORMATION_MESSAGE);
        db.createDB(base);
        String tabla =JOptionPane.showInputDialog(null, "Teclea el nombre de la tabla de la BD - " + base, 
                "Base de datos", JOptionPane.INFORMATION_MESSAGE);
        db.createTable(tabla);
        //terminar la entrada de datos
        //db.insertData(tabla, id, nombre, apellidos, años, sexo);
        db.getValues(tabla);
        //si deseo borrar un registro db.deleteRecord(String table_name, String ID);
        db.closeConnection();
    }

    
}
    

