

package conexionbasededatos;


import java.sql.*;
import java.util.Hashtable;


public class Codigo {
    private ResultSet rs;
    private Statement stm;
    public ResultSet consultar(String tabla) throws SQLException
            {
                
                rs = stm.executeQuery("use "+"escuela;"
                        + "SELECT * FROM " + tabla);
                return rs;
    }

    public String buscarNombre(String tabla, String nombre) throws SQLException
            {
                String name = null;
                try{
                rs = stm.executeQuery("SELECT * FROM " + tabla + " WHERE nombre = "+ nombre +" LIMIT 1");
                rs.next();
                name = rs.getString(2);
                }catch(SQLException ex){System.out.println(ex);}
                return name;
    }

    public void insertar(Hashtable usuario)
            {
                try {
                stm.execute("INSERT INTO usuarios (nombre, contraseña) VALUES (" 
                        + usuario.get("nombre") + "," + usuario.get("contraseña") + 
                        ")");
                } catch (SQLException ex) {
                System.out.println(ex);
                }
    }

    public void actualizar(String tabla, Hashtable usuario, String nombre)
            {
                try {
                stm.execute("UPDATE " + tabla + " SET nombre='" + usuario.get(nombre) + "' WHERE nombre='" + nombre + "'");
                } catch (SQLException ex) {
                System.out.println(ex);
                }
    }

    public void eliminar(String tabla, String nombre)
            {
                try {
                stm.execute("DELETE FROM "+ tabla + " WHERE nombre='" + nombre + "'");
                } catch (SQLException ex) {
                System.out.println(ex);
                }
    }
}

