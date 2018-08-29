package conexionesExt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author The Blacks
 */
public class Habitaciones {
    private int numHab;
    private String nomHab;
    private int cantPer;
    private String inicio;
    private String fin;
    private String tipoHab;
    private float precioHab;
    private String RFC;
    private final Connection c;
    public Habitaciones(int numHab, String nomHab, int cantPer, 
            String inicio, String fin, String tipoHab, float precioHab, 
            String RFC, Connection c) {
        this.numHab = numHab;
        this.nomHab = nomHab;
        this.cantPer = cantPer;
        this.inicio = inicio;
        this.fin = fin;
        this.tipoHab = tipoHab;
        this.precioHab = precioHab;
        this.RFC = RFC;
        this.c=c;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public String getNomHab() {
        return nomHab;
    }

    public void setNomHab(String nomHab) {
        this.nomHab = nomHab;
    }

    public int getCantPer() {
        return cantPer;
    }

    public void setCantPer(int cantPer) {
        this.cantPer = cantPer;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public float getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(float precioHab) {
        this.precioHab = precioHab;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    public void sendDatesToHotel(){
        try {
           PreparedStatement preparedStatement= c.prepareStatement("INSERT INTO habitaciones VALUES (?,?,?,?,?,?,?,?)"); 
           preparedStatement.setInt(1, numHab);
           preparedStatement.setString(2, nomHab);
           preparedStatement.setInt(3, cantPer);
           preparedStatement.setString(4, inicio);
           preparedStatement.setString(5, fin);
           preparedStatement.setString(6, tipoHab);
           preparedStatement.setFloat(7, precioHab);
           preparedStatement.setString(8, RFC);
           preparedStatement.execute();
           c.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
        }
        
    }
    
}
