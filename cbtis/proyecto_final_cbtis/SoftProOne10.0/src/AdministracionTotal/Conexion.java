
package AdministracionTotal;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Conexion {
   private static Connection conexion=null;
   private ResultSet datos;
   private CallableStatement st;
   private static Statement con=null;
   PreparedStatement preparedStatement = null;
   //EMPLEADOS
    private  int NúmeroEmpleado; //not null  10
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
    //INSUMOS
    private int códigoInsumo; //not null  10
    private String descrInsumo; //30
    private float costoInsumo;
    private String nombreProv; //30
    private String contactoProv;//30
    private String telefonoProv;//20
    private String unidadM;//10
    private int stock;
   
    //COMPRAS
    private int folioComp;  // not null  10
    private String fechaComp; //DATE
    private int codInsComp;
    private int cantComp;
    private float totalComp;
    //CLIENTES
    private int numClient;   //not null  10
    private String nomClient;//50
    private String contClient; //40
    private String telClient; //20
    private String paísClient;//20
    private String estClient; //20
    private String ciudClient; //20
    private String domClient; //20
    private String ifeClient; //2
    //PRODUCTOS
    private int codProduc;   //not null  10
    private String descProduc;//40
    private int stockProduc;
    private float costElbProduc; 
    private float precioProduc;
    //LISTA ASISTENCIA
    private String fechaAsis; //DATE
    private int numEmpAsis;    //not null  10
    private String horaLlegada; //TIME
    private String horaSalida; //TIME
    private int justifNum;
    //JUSTIFICANTES
    private int numJustific;    //not null  10
    private int numEmpJust;    //not null  10
    private String fechaJust; //DATE
    private String motivoJust; //40
    private String hSalidaJust; //TIME
    //FECHA ACTUAL
    public final Calendar calendario= Calendar.getInstance();
    private final  Integer día=calendario.get(Calendar.DATE);
    private final Integer mes=1+(calendario.get(Calendar.MONTH));
    private final Integer año=calendario.get(Calendar.YEAR);
    public final  String FECHA=(día + "-" + mes + "-" + año);
    //VENTAS
    private int folioVenta;
    private String fechaVenta;
    private int codProdVenta;
    private int cant;
    private int numClientVenta;
    private float totalVenta;
    private String tipoPagoVenta;
    private String vencPagoVenta;
    private String pagaréVenta;
    
    
    
public static Connection GetConnection()
    {try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion= DriverManager.getConnection("jdbc:sqlserver://MICHEL;"
                    + "databaseName=fábrica;user=sa;password=sa;");
            con = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        }catch(ClassNotFoundException | SQLException ex)
        {
            conexion=null;
        }
       return conexion;
        
    }
   public static Connection GetResetearConnection(String h,String host,String co)
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion= DriverManager.getConnection("jdbc:sqlserver://"+h
                    +";databaseName=fábrica;user="+host+";password="+co+";");
            con = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        
        }catch(/*ClassNotFoundException | SQL*/Exception ex)
        {
            conexion=null;
        }
       
            return conexion;
        
    }
    public ResultSet setBuscarRelacion(String tabla, String columna, int id, String tabla2, String columna2){
        try{
            datos=con.executeQuery("select " +columna2+ " from "
                    + ""+tabla+ " join "+tabla2 +" where "+columna+ " = "+id);
            return datos;
        }catch(SQLException a){
            JOptionPane.showMessageDialog(null, "No se encontró el ID o Folio de la tabla "+ tabla, tabla, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
   
    public ResultSet setBusqueda(String tabla, String columna, int id){
        try{
            datos=con.executeQuery("select * from "+tabla+" where "+columna+" = "+id);
            return datos;
        }catch(SQLException a){
            JOptionPane.showMessageDialog(null, "No se encontró el ID o Folio de la tabla "+ tabla, tabla, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public ResultSet setNombreEmpleado(int id){
        try{
            datos=con.executeQuery("select nombre from  empleados inner join usuarios ON empleados.NúmeroEmpleado=usuarios."
                    + "numEmpleado where numEmpleado = "+id);
            return datos;
        }catch(SQLException a){
            JOptionPane.showMessageDialog(null, "No se encontró el ID ",a.getMessage(),JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public boolean setEliminarRegistro(String tabla, String columna, int id,String tabla2, String columna2){
        boolean e=true;boolean q=false;
        try{
            datos=con.executeQuery("use fábrica; delete from "+tabla+" where "+columna+ " = "+id);
            e=false;
            ResultSet rs=setBuscarRelacion(tabla,columna,id,tabla2,columna2);
            if(rs.next()){
                String t=rs.getString(1);
                if (t!=null)q=true;
            }
            
        }catch(SQLException a){
            if (q){
            JOptionPane.showMessageDialog(null, "Veifica bien los datos."+a.getLocalizedMessage(), "ERROR AL ELIMINAR UN REGISTRO RELACIONADO CON OTRAS TABLAS", JOptionPane.WARNING_MESSAGE);
            e=true;
            }
        }
        return e;
    }
    public boolean setEliminarRegistroEmpleado(String tabla, String columna, int id){
        boolean e;
        try{
            con.executeUpdate("use fábrica; delete from "+tabla+" where "+columna+ " = "+id);
            e=false;
        }catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Veifica bien los datos."+a.getLocalizedMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);
            e=true;
        }
        return e;
    }
    public int getNumEmp(){
        return this.NúmeroEmpleado;
    }
    public void setNumEmp(int n){
        this.NúmeroEmpleado=n;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String a){
        this.apellidos=a;
    }
    public String getPuesto(){
        return this.puesto;
    }
    public void setPuesto(String p){
        this.puesto=p;
    }
    public int getAntiguedad(){
        return this.antigüedad;
    }
    public void setAntiguedad(int an){
        this.antigüedad=an;
    }
    public float getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(float a){
        this.sueldo=a;
    }
    public String getTelefono(){
        return this.teléfono;
    }
    public void setTelefono(String a){
        this.teléfono=a;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char a){
        this.sexo=a;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int a){
        this.edad=a;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public void setDomicilio(String a){
        this.domicilio=a;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String a){
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
                //Icono de actualizar BD
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS  =="+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
       
        
    }
    public void getUpdateEmp(int id){
        try{
            con.executeUpdate("update empleados set "
                    + "nombre = '"+this.nombre+
                    "', apellidos ='"+this.apellidos
                    + "', puesto ='"+this.puesto+
                    "', antigüedad= "+this.antigüedad
                    + ", sueldo= "+this.sueldo
                    +",  teléfono= "+ this.teléfono+
                    ", sexo= '"+this.sexo+
                    "' , edad = "+this.edad+
                    ", domicilio= '"+ this.domicilio+
                    "' ,e_mail='"+this.email+
                    "' where NúmeroEmpleado="+id+" ;");
                //Icono de actualizar BD
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS  =="+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ResultSet getBusquedaEmp(String orden, String ordenAscDesc){
        try{
            datos=con.executeQuery("select * from empleados order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    //GET INSUMOS
    public void setCodigoIns(int a){
        this.códigoInsumo=a;
    }
    public int getCodigoIns(){
        return this.códigoInsumo;
    }
    public void setDescrIns(String a){
        this.descrInsumo=a;
    }
    public String getDescrIns(){
        return this.descrInsumo;
    }
    public void setCostoIns(float a){
        this.costoInsumo=a;
    }
    public float getCostoIns(){
        return this.costoInsumo;
    }
    public void setUM_Ins(String a){
        this.unidadM=a;
    }
    public String getUM_Ins(){
        return this.unidadM;
    }
    public void setNmProvIns(String a){
        this.nombreProv=a;
    }
    public String getNmProvIns(){
        return this.nombreProv;
    }
    public void setCntProvIns(String a){
        this.contactoProv=a;
    }
    public String getCntProvIns(){
        return this.contactoProv;
    }
    public void setTelProvIns(String a){
        this.telefonoProv=a;
    }
    public String getTelProvIns(){
        return this.telefonoProv;
    }
    public void setStockProvIns(int a){
        this.stock=a;
    }
    public int getStockProvIns(){
        return this.stock;
    }
    public void setInsumos(){
        StringBuffer SqlQuery= new StringBuffer( "insert into insumos("
                    +"código,"
                    +"descripción,"
                    +"costo, "
                    +"unidad_medida ,"
                    +"proveedor,"
                    +"contacto,"
                    +"teléfono,"
                    +"stock"
                    + ") values"
                    + "(");
        SqlQuery.append(this.códigoInsumo).append(",'");
        SqlQuery.append(this.descrInsumo).append("',");
        SqlQuery.append(this.costoInsumo).append(",'");
        SqlQuery.append(this.unidadM).append("','");
        SqlQuery.append(this.nombreProv).append("','");
        SqlQuery.append(this.contactoProv).append("','");
        SqlQuery.append(this.telefonoProv).append("',");
        SqlQuery.append(this.stock).append(");");
        
        String DATOS = SqlQuery.toString();
       try {
           con.executeUpdate(DATOS);
                //Icono de actualizar BD
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS. Verifica que no tengas un mismo insumo \n "
                    + "con la misma clave. O bien el tipo de datos que ingresastes. ", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public void getUpdateInsumos(int cod){
       try {
           String update="update insumos set "
                    +"descripción= ?,"
                    +"costo = ?, "
                    +"unidad_medida = ? ,"
                    +"proveedor = ?,"
                    +"contacto = ?,"
                    +"teléfono = ?,"
                    +"stock = ? "
                   + "where código= ? ;";
            preparedStatement = conexion.prepareStatement(update);
            preparedStatement.setString(1, this.descrInsumo);
            preparedStatement.setFloat(2, this.costoInsumo);
            preparedStatement.setString(3,this.unidadM);
            preparedStatement.setString(4,this.nombreProv);
           preparedStatement.setString(5,this.contactoProv);
            preparedStatement.setString(6,this.telefonoProv);
            preparedStatement.setInt(7,this.stock);
           preparedStatement.setInt(8,cod);
            // execute insert SQL stetement
            preparedStatement .executeUpdate();
                //Icono de actualizar BD
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public ResultSet getInsumos(String orden, String ordenAscDesc){
     
        try{
            
            datos=con.executeQuery("select * from insumos order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    
    }
   //GET NUEVA COMPRA
    public void setFolioComp(int a){
        this.folioComp=a;
    }
    public int getFolioComp(){
        return this.folioComp;
    }
    public void setFechaComp(String a){
        this.fechaComp=a;
    }
    public String getFechaComp(){
        return this.fechaComp;
    }
    public void setCodInsComp(int a){
        this.codInsComp=a;
    }
    public int getCodInsComp(){
        return this.codInsComp;
    }
    public void setCantComp(int a){
        this.cantComp=a;
    }
    public int getCantComp(){
        return this.cantComp;
    }
    public void setTotalComp(float precio,int cantidad){
        //Calcula cantidad* precio
        this.totalComp=precio*cantidad;
    }
    public float getTotalComp(){
        return this.totalComp;
    }
    // NINGUN METODO PARA MOSTRAR TOTAL YA QUE SE HACE POR AUTOMATICO
    public void getCompras(){
        StringBuffer SqlQuery= new StringBuffer( "insert into compras("
                + "folio,"
                + "fecha,"
                + "código,"
                + "cantidad,"
                + "total"
                + ") values"
                + "(");
        SqlQuery.append(this.folioComp).append(",'").
        append(this.FECHA).append("',")
        .append(this.codInsComp).append(",")
        .append(this.cantComp).append(",")
        .append(this.totalComp).append(")");
        String DATOS = SqlQuery.toString();
       try {
           con.executeUpdate(DATOS);
                //Icono de actualizar BD
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public void getUpdateCompras(){
       try {
            PreparedStatement ps = conexion.prepareStatement("update insumos set "
                   + "código =?,"
                   + "cantidad =?,"
                   + " where folio=?");
           ps.setInt(1,this.codInsComp);
           ps.setInt(2,this.cantComp);
           ps.setInt(3, this.folioComp);
           // execute insert SQL stetement
            ps.executeUpdate();

       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);       }
    }
    public ResultSet getCalcularTotal( int a){
        try{
            
            datos=con.executeQuery("select costo from insumos where codigo = "+ a);
            return datos;
        }catch(Exception ag){
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA O SALIDA DE DATOS  ", null, JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public ResultSet getCompras(String orden, String ordenAscDesc){
        try{
            
            datos=con.executeQuery("select * from compras order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    //SET CLIENTES
    public void setNumClient(int a){
        this.numClient=a;
    }
    public int getNumClient(){
        return this.numClient;
    }
    public void setNomCient(String a){
        this.nomClient=a;
    }
    public String getNomCient(){
        return this.nomClient;
    }
    public void setContClient(String a){
        this.contClient=a;
    }
    public String getContClient(){
        return this.contClient;
    }
    public void setTelClient(String a){
        this.telClient=a;
    }
    public String getTelClient(){
        return this.telClient;
    }
    public void setPaísClient(String a){
        this.paísClient=a;
    }
    public String getPaísClient(){
        return this.paísClient;
    }
    public void setEstClient(String a){
        this.estClient=a;
    }
    public String getEstClient(){
        return this.estClient;
    }
    public void setCiudClient(String a){
        this.ciudClient=a;
    }
    public String getCiudClient(){
        return this.ciudClient;
    }
    public void setDomClient (String a){
        this.domClient=a;
    }
    public String getDomClient(){
        return this.domClient;
    }
    public void setIFEClient (String a){
        if("Sí".equals(a)){
            this.ifeClient="SI";
        }else{
        this.ifeClient="NO";
        }
    }
    public String getIFEClient(){
        return this.ifeClient;
    }
    public void getCliente(){
        String SqlQuery= "insert into clientes("
                + "NúmeroCliente," +
                "nombre ," +
                "contacto ," +
                "teléfono ," +
                "país ," +
                "estado ," +
                "ciudad ," +
                "domicilio, "
                + " IFE "
                + ") values"
                + "("+
                numClient+",'"+
                nomClient+"','"+
                contClient+"','"+
                telClient+"','"+
                paísClient+"','"+
                estClient+"','"+
                ciudClient+"','"+
                domClient+"','"+
                ifeClient+"');";
        String DATOS = SqlQuery;
       try {
           con.executeUpdate(DATOS);
                //Icono de actualizar BD
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public ResultSet getCliente(String orden, String ordenAscDesc){
        try{
            
            datos=con.executeQuery("select * from clientes order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public void getUpdateCliente(int a){
       try {
           String upd="update clientes set "+
                   "nombre =? ," +
                   "contacto =? ," +
                   "teléfono = ? ," +
                   "país =? ," +
                   "estado =? ," +
                   "ciudad =? ," +
                   "domicilio =? ,"+
                   " IFE = ?"
                   + " where NúmeroCliente=?";
           preparedStatement = conexion.prepareStatement(upd);
           
           preparedStatement.setString(1, nomClient);
           preparedStatement.setString(2, contClient);
           preparedStatement.setString(3, telClient);
           preparedStatement.setString(4,  paísClient);
           preparedStatement.setString(5, estClient);
           preparedStatement.setString(6, ciudClient);
           preparedStatement.setString(7, domClient);
           preparedStatement.setString(8, ifeClient);
           preparedStatement.setInt(9, a);
           // execute insert SQL stetement
           preparedStatement .executeUpdate();
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

       }

        
    }
    //SET PRODUCTOS
    public void setCodProduc(int a){
        this.codProduc=a;
    }
    public int getCodProduc(){
        return this.codProduc;
    }
    public void setdescProduc(String a){
        this.descProduc=a;
    }
    public String getdescProduc(){
        return this.descProduc;
    }
    public void setStockProduc(int a){
        this.stockProduc=a;
    }
    public int getStockProduc(){
        return this.stockProduc;
    }
    public void setCostElbProduc(float a){
        this.costElbProduc=a;
    }
    public float getCostElbProduc(){
        return this.costElbProduc;
    }
    public void setPrecioProduc(float a){
        this.precioProduc=a;
    }
    public float getPrecioProduc(){
        return this.precioProduc;
    }
    public void getProductos(){
        String SqlQuery= "insert into inventarioProductos("
                +"códigoProducto ,"
                +"descripción,"
                +"stock,"
                +"costo_elaboración,"
                +"precio"
                + ") values"
                + "("+
                +codProduc+",'"+
                descProduc+"',"+
                stockProduc+","+
                costElbProduc+","+
                precioProduc+");";
        String DATOS = SqlQuery;
       try {
           con.executeUpdate(DATOS);
           
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public void getUpdateProductos(int a){
       try {
           String SqlQuery= "update inventarioProductos set "
                   +"descripción = ? ,"
                   +"stock =? ,"
                   +"costo_elaboración=? ,"
                   +"precio =?"
                   + " where códigoProducto =?";
           preparedStatement = conexion.prepareStatement(SqlQuery);
            preparedStatement.setString(1, this.descProduc);
            preparedStatement.setInt(2, this.stockProduc);
            preparedStatement.setFloat(3, this.costElbProduc);
            preparedStatement.setFloat(4, this.precioProduc);
            preparedStatement.setInt(5, a);
            preparedStatement .executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
               
    }
    public ResultSet getProductos(String orden, String ordenAscDesc){
        try{
            
            datos=con.executeQuery("select * from inventarioProductos order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    //SET LISTA DE ASISTENCIA
    public void setFechaAsis(String a){
        this.fechaAsis=a;
    }
    public String getFechaAsis(){
        return this.fechaAsis;
    }
    public void setNumEmpAsis(int a){
        this.numEmpAsis=a;
    }
    public int getNumEmpAsis(){
        return this.numEmpAsis;
    }
    public void setHoraLleg(String a){
        this.horaLlegada=a;
    }
    public String getHoraLleg(){
        return this.horaLlegada;
    }
    public void setHoraSal(String a){
        this.horaSalida=a;
    }
    public String getHoraSal(){
        return this.horaSalida;
    }
    public void setJustNum(int a){
        this.justifNum=a;
    }
    public int getjustifNum(){
        return this.justifNum;
    }
    public void getAsistencia(){
        String SqlQuery= "insert into listaAsistencia("
                +"fecha ,"
                +"NúmeroEmpleado,"
                +"horaLlegada,"
                +"horaSalida,"
                +"justificante"
                + ") values"
                + "('"
                +this.FECHA+"',"+
                this.numEmpAsis+",'"+
                this.horaLlegada+"','"+
                this.horaSalida+"',"+
                this.justifNum+
                ");";
        String DATOS = SqlQuery;
       try {
           con.executeUpdate(DATOS);
           JOptionPane.showMessageDialog(null, "REGISTRO COMPLETO", "ACTUALIZACION DE BD", JOptionPane.INFORMATION_MESSAGE);
                
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); int a=1;
       }
    }
    public ResultSet getAsistenciaJust(String orden, String ordenAscDesc){
        try{
           //NO MUESTRA LOS EMPLEADOS QUE NO TUVIERON ASISTENCIA O NO SEA ACTUALIZA LA TABLA
            
            String Consulta="select empleados.nombre, empleados.apellidos, empleados.puesto,listaAsistencia.fecha, \n" +
            "listaAsistencia.horaLlegada, listaAsistencia.horaSalida, justificantes.numJustificante,justificantes.fecha, justificantes.motivo\n" +
                    " from   listaAsistencia  left join empleados on \n" +
                    "listaAsistencia.NúmeroEmpleado=empleados.NúmeroEmpleado \n" +
                    "left join justificantes on listaAsistencia.justificante=justificantes.numJustificante "
                    + "order by "+" listaAsistencia."+orden+" "+ordenAscDesc;
            datos=con.executeQuery(Consulta);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    //SET JUSTIFICANTES
    public void setNumJustific(int a){
        this.numJustific=a;
    }
    public int getNumJustific(){
        return this.numJustific;
    }
    public void setNumEmpJust(int a){
        this.numEmpJust=a;
    }
    public int getNumEmpJust(){
        return this.numEmpJust;
    }
    public void setFechaJust(){
        this.fechaJust=FECHA;
    }
    public String getFechaJust(){
        return this.fechaJust;
    }
     public void setMotivoJust(String a){
        this.motivoJust=a;
    }
    public String getMotivoJust(){
        return this.motivoJust;
    }
    public void setHoraSalJust (String a){
        this.hSalidaJust=a;
    }
    public String getHoraSalJust(){
        return this.hSalidaJust;
    }
   
    
    public void getJustificante(){
       String SqlQuery= "insert into justificantes("
                +"numJustificante ,"
                +"fecha,"
                +"motivo,"
                +"horaSalida,"
                +"NúmeroEmpleado"
                + ") values"
                + "("+
                this.numJustific+",'"+
                this.fechaJust+"','"+
                this.motivoJust+"','"+
                this.hSalidaJust+"',"+
                this.numEmpJust+
                ");";
        String DATOS = SqlQuery;
       try {
           con.executeUpdate(DATOS);
           
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public ResultSet getJustificantes(String orden, String ordenAscDesc){
        try{
            
            datos=con.executeQuery("select nombre,apellidos,fecha,motivo,horaSalida"
                    + " from justificantes inner join empleados"
                    + "on empleados.NúmeroEmpleado=justificantes.NúmeroEmpleado"
                    + "order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    //VENTAS
    public void setfolioVenta(int a)
    {
        this.folioVenta=a;
    }
    public int getfolioVenta(){
        return this.folioVenta;
    }
    public void setcodProdVenta(int a){
        this.codProdVenta=a;
    }
    public int getcodProdVenta(){
        return this.codProdVenta;
    }
    public void setCant(int a){
        this.cant=a;
    }
    public int getcant(){
        return this.cant;
    }
    public void setnumClientVenta(int a){
        this.numClientVenta=a;
    }
    public int getnumClientVenta(){
        return this.numClientVenta;
    }
    public void settotalVenta(float a){
        this.totalVenta=a;
    }
    public float gettotalVenta(){
       return this.totalVenta;
    }
    public void settipoPagoVenta(String a){
        this.tipoPagoVenta=a;
    }
    public String gettipoPagoVenta(){
        return this.tipoPagoVenta;
    }
    public void setvencPagoVenta(String a){
        this.vencPagoVenta=a;
    }
    public String getvencPagoVenta(){
        
        return this.vencPagoVenta;
    }
    public void setpagaréVenta(String a){
        this.pagaréVenta=a;
    }
    public String getpagaréVenta(){
        return this.pagaréVenta;
    }
    public void getVentas(){
       String SqlQuery= "insert into ventas("
                +"folio,"
                +"fecha,"
                +"códigoProducto,"
                +"cantidad,"
                +"NúmeroCliente, total, tipoPago, vencimientoPago, pagaré"
                + ") values"
                + "("+
                this.folioVenta +",'"+
                this.FECHA+"',"+
                this.codProdVenta+","+
                this.cant+","+
                this.numClientVenta+" , "+this.totalVenta+" ,'"+this.tipoPagoVenta+"','"+vencPagoVenta+"','"+this.pagaréVenta+
                "');";
        String DATOS = SqlQuery;
       try {
           con.executeUpdate(DATOS);
                //Icono de actualizar BD
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    public ResultSet getBusquedaVentas(String orden, String ordenAscDesc){
        try{
            datos=con.executeQuery("select * from ventas order by "+orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public void setReport(String reporte){
        try{
           
            con.executeUpdate( "insert into reportes(fecha,reporte) values"
                    + "('"+this.FECHA+"',"+"'"+reporte+"')");
            JOptionPane.showMessageDialog(null, "Gracias. Con tu ayuda mejoramos el software", "Mejorando..", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException | HeadlessException a){
            JOptionPane.showMessageDialog(null, "ERROR DE DATOS O BASE DE DATOS ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ResultSet getUsuarios(String orden, String ordenAscDesc){
        try{
           datos=con.executeQuery( "select * from usuarios join empleados on usuarios.numEmpleado = empleados.NúmeroEmpleado order by "
                    +orden+" "+ordenAscDesc);
            return datos;
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"ERROR DE BASE DE DATOS  ==  "+a.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
