
package AdministracionTotal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
   private static Connection conexion=null;
   private ResultSet datos;
   private CallableStatement st;
   private static Statement con=null;
   
    private  int NúmeroEmpleado; //not null
    private String nombre; //30
    private String apellidos; //30
    private String puesto; //30
    private int antigüedad; 
    private float sueldo; 
    private String teléfono; //20
    private char sexo; //1
    private int edad; 
    private String domicilio; //30
    private String email; //30
   public static Connection GetConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://VALAY;databaseName=fábrica;user=sa;password=valay060199;";
            conexion= DriverManager.getConnection(url);
            con = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    }
   
  public int setNumEmp(){
        return this.NúmeroEmpleado;
    }
    public void getNumEmp(int n){
        this.NúmeroEmpleado=n;
    }
    public String setNombre(){
        return this.nombre;
    }
    public void getNombre(String nom){
        this.nombre=nom;
    }
    public String setApellidos(){
        return this.apellidos;
    }
    public void getApellidos(String a){
        this.apellidos=a;
    }
    public String setPuesto(){
        return this.puesto;
    }
    public void getPuesto(String p){
        this.puesto=p;
    }
    public int setAntiguedad(){
        return this.antigüedad;
    }
    public void getAntiguedad(int an){
        this.antigüedad=an;
    }
    public float setSueldo(){
        return this.sueldo;
    }
    public void getSueldo(float a){
        this.sueldo=a;
    }
    public String setTelefono(){
        return this.teléfono;
    }
    public void getTelefono(String a){
        this.teléfono=a;
    }
    public char setSexo(){
        return this.sexo;
    }
    public void getSexo(char a){
        this.sexo=a;
    }
    public int setEdad(){
        return this.edad;
    }
    public void getEdad(int a){
        this.edad=a;
    }
    public String setDomicilio(){
        return this.domicilio;
    }
    public void getDomicilio(String a){
        this.domicilio=a;
    }
    public String setEmail(){
        return this.email;
    }
    public void getEmail(String a){
        this.email=a;
    }
    public void getEmpleados() {
       try{
            StringBuffer SqlQuery= new StringBuffer( "insert into empleados("
                    + "NúmeroEmpleado,"
                    + "nombre,"
                    + "apellidos,"
                    + "puesto,"
                    + "antigüedad,"
                    + "sueldo,"
                    + "teléfono,"
                    + "sexo ,"
                    + "edad,"
                    + "domicilio,"
                    + "e_mail"
                    + ") values"
                    + "(");
            SqlQuery.append(this.NúmeroEmpleado).append(",'");
            SqlQuery.append(this.nombre).append("','");
            SqlQuery.append(this.apellidos).append("','");
            SqlQuery.append(this.puesto).append("',");
            SqlQuery.append(this.antigüedad).append(",");
            SqlQuery.append(this.sueldo).append(",'");
            SqlQuery.append(this.teléfono).append("','");
            SqlQuery.append(this.sexo).append("',");
            SqlQuery.append(this.edad).append(",'");
            SqlQuery.append(this.domicilio).append("','");
            SqlQuery.append(this.email).append("'");
            SqlQuery.append(");");
            String DATOS = SqlQuery.toString();
                con.executeUpdate(DATOS);
                
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS"+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
       
        
    }
    public ResultSet setEmpleados(String orden, String ordenAscDesc){
        try{
            String Consulta="select * from empleados order by "+orden+" "+ordenAscDesc;
            datos=con.executeQuery(Consulta);
            datos.next();
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS"+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
                   
   
}
