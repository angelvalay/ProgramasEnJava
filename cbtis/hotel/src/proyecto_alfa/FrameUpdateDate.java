
package proyecto_alfa;

import conexionesExt.ConexionMySQL;
import conexionesExt.Habitaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class FrameUpdateDate extends javax.swing.JDialog {

    static Habitaciones h;
    public FrameUpdateDate(java.awt.Frame parent, boolean modal, String humHab) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        //Metodo para buscar el huesped
        h=habitaciones(humHab);
        mostrarDatos(h);
    }
    
    private void mostrarDatos(Habitaciones h){
        this.campoNombreCompleto.setText(h.getNomHab());
        //FALTAN DATOS
        this.campoRFC.setText(h.getRFC());            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombreCompleto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        campoRFC = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel1.setText("Nombre completo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ticket"));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel14.setText("RFC:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(campoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        btnAceptar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Validaciones v= new Validaciones(this.campoRFC.getText());
        ConexionMySQL cmsql= new ConexionMySQL();
         Connection MySQL2= cmsql.MySQLCo();
         String nombre=this.campoNombreCompleto.getText();
        Validaciones v2= new Validaciones(nombre); 
        //Pasar a base de datos
        String RFC= this.campoRFC.getText();
        
        if(RFC != null&& v.isRFC()&&v2.forName()){
            try {
                PreparedStatement stmt;
                stmt = MySQL2.prepareStatement("UPDATE habitaciones SET nomP=?,rfc=? WHERE numHab=?");
                stmt.setString(1,nombre);
                stmt.setString(2, RFC);
                stmt.setInt(3, h.getNumHab());
                stmt.executeUpdate();
                this.dispose();
                
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Checa tu RFC y/o el nombre completo");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public JTextField getCampoRFC() {
        return campoRFC;
    }

    

    public JTextField getCampoNombre() {
        return campoNombreCompleto;
    }

    
    private Habitaciones habitaciones(String numHab){
        Habitaciones habitaciones = null;
        try {
            ConexionMySQL cmsql= new ConexionMySQL();
            Connection MySQL= cmsql.MySQLCo();
            ResultSet rs = null;
            Statement cmd = null;
            cmd=MySQL.createStatement();
            rs=cmd.executeQuery("select * from habitaciones where numHab="+ numHab);
            // Bucle para cada resultado en la consulta
            if(rs.next())
            {
                habitaciones = new Habitaciones(rs.getInt(1), rs.getString(2), 
                        rs.getInt(3), rs.getString(4), rs.getString(5), 
                        rs.getString(6), rs.getFloat(7), rs.getString(8), MySQL);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FrameDateRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoNombreCompleto;
    private javax.swing.JTextField campoRFC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
