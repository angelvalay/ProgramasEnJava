/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministracionTotal;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ImformacionBaseDeDatos extends javax.swing.JDialog {

    public ImformacionBaseDeDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomPro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jToggleButton1.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Cerrar Ventana");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Imformación De La Base De Datos:");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del producto:");

        nomPro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        nomPro.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel4.setText("Version del producto:");

        verPro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        verPro.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del driver:");

        nomDriver.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        nomDriver.setText("jLabel7");

        jLabel9.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel9.setText("Version de Driver:");

        verDriver.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        verDriver.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(verPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked
private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       @Override
       public void windowClosing(WindowEvent e) {
         cerrar();
       }
     });
    }
public void cerrar(){
        
        this.setVisible(false);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    public final javax.swing.JLabel nomDriver = new javax.swing.JLabel();
    public javax.swing.JLabel nomPro;
    public final javax.swing.JLabel verDriver = new javax.swing.JLabel();
    public final javax.swing.JLabel verPro = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
