
package Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author asdfgghjkl
 */
public class Empleados extends javax.swing.JFrame {

   
    public Empleados() {
        initComponents();
        this.setLocationRelativeTo(this);
    }     
   
    public void Limpiar()
    {
        txtIDEmple.setText("");
        txtNombreE.setText("");
        txtApellidoE.setText("");
        txtEdadE.setText("");
        txtEmailE.setText("");
        txtTelefonoE.setText("");
        txtDomicilioE.setText("");
    }
    
 public void EstadoBoton(boolean b)
    {
        BtnNuevoE.setEnabled(!b);
        BtnAgregarE.setEnabled(b);
        BtnCancelar.setEnabled(b);
        BtnBuscar.setEnabled(!b);
        BtnEditarE.setEnabled(!b);
        BtnEliminarE.setEnabled(!b);
        BtnMostrarE.setEnabled(!b);

    }
 public void activarCampos(boolean t)
    {
        txtNombreE.setEnabled(t);
        txtApellidoE.setEnabled(t);
        txtEdadE.setEnabled(t);
        cboSexoE.setEnabled(t);
        txtEmailE.setEnabled(t);
        txtTelefonoE.setEnabled(t);
        txtDomicilioE.setEnabled(t);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDEmple = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdadE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboSexoE = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDomicilioE = new javax.swing.JTextField();
        txtEmailE = new javax.swing.JTextField();
        BtnNuevoE = new javax.swing.JButton();
        BtnAgregarE = new javax.swing.JButton();
        BtnEditarE = new javax.swing.JButton();
        BtnEliminarE = new javax.swing.JButton();
        BtnMostrarE = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoE = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID.Empleado");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtNombreE.setEnabled(false);
        txtNombreE.setName(""); // NOI18N

        jLabel3.setText("Apellido:");

        txtApellidoE.setEnabled(false);

        jLabel4.setText("Edad:");

        txtEdadE.setEnabled(false);

        jLabel5.setText("Sexo:");

        cboSexoE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su sexo...", "F", "M" }));
        cboSexoE.setEnabled(false);

        jLabel7.setText("Telefono:");

        jLabel8.setText("Domicilio:");

        jLabel9.setText("Email:");

        txtDomicilioE.setEnabled(false);

        txtEmailE.setEnabled(false);

        BtnNuevoE.setText("Nuevo");
        BtnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEActionPerformed(evt);
            }
        });

        BtnAgregarE.setText("Agegar");
        BtnAgregarE.setEnabled(false);
        BtnAgregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarEActionPerformed(evt);
            }
        });

        BtnEditarE.setText("Editar");
        BtnEditarE.setEnabled(false);
        BtnEditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarEActionPerformed(evt);
            }
        });

        BtnEliminarE.setText("Eliminar");
        BtnEliminarE.setEnabled(false);
        BtnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarEActionPerformed(evt);
            }
        });

        BtnMostrarE.setText("Mostrar");
        BtnMostrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel10.setText("Empleados");

        try {
            txtTelefonoE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoE.setText("(  )-     -    ");
        txtTelefonoE.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboSexoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(73, 73, 73)))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDomicilioE, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevoE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAgregarE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEditarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(BtnEliminarE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrarE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboSexoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDomicilioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevoE)
                    .addComponent(BtnAgregarE)
                    .addComponent(BtnEditarE)
                    .addComponent(BtnEliminarE)
                    .addComponent(BtnMostrarE)
                    .addComponent(BtnCancelar))
                .addGap(28, 28, 28)
                .addComponent(BtnSalir)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
       EstadoBoton(true);
       activarCampos(true);
       Limpiar();
    }//GEN-LAST:event_BtnNuevoEActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAgregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarEActionPerformed
        // TODO add your handling code here:
        if(txtIDEmple.getText().compareTo("")!=0 && txtNombreE.getText().compareTo("")!=0 && txtApellidoE.getText().compareTo("")!=0 
      && txtEdadE.getText().compareTo("")!=0 && txtTelefonoE.getText().compareTo("")!=0
      && txtDomicilioE.getText().compareTo("")!=0){
       //Insesrtar en base de datos
       // try {
            
            Limpiar();
       /* } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }*/
        JOptionPane.showMessageDialog(null, "Datos Agregados Correctamente");
   }else{
       JOptionPane.showMessageDialog(null, "Error; Faltan Datos");
   }
    }//GEN-LAST:event_BtnAgregarEActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
       
        if (txtIDEmple.getText().compareTo("")!= 0) {
            int result = JOptionPane.showConfirmDialog(
                    this, "¿Deseas Buscar al Empleado para Modificarlo?",
                    "Mensaje..!!",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                //Aqui...Metodo para buscar empleado
                BtnNuevoE.setEnabled(false);
                BtnMostrarE.setEnabled(false);
                BtnCancelar.setEnabled(true);
                BtnEditarE.setEnabled(true);
                activarCampos(true);
            }
            if (result == JOptionPane.NO_OPTION) {
                //Aqui...Metodo para buscar emplado
                BtnEliminarE.setEnabled(true);
                BtnNuevoE.setEnabled(false);
                BtnCancelar.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese ID del empleado que desea Buscar");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarEActionPerformed
        // TODO add your handling code here:
         
           // try {
                
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
            /*} catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }*/
        Limpiar();
    }//GEN-LAST:event_BtnEditarEActionPerformed

    private void BtnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarEActionPerformed
        // TODO add your handling code here:
          
           /*try {
            Buscar empleado
            if (" Aqui Variable"== null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else {
               metodo elliminar empleado de BD
                JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }*/
        Limpiar();
    }//GEN-LAST:event_BtnEliminarEActionPerformed

    private void BtnMostrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEActionPerformed
        
        ListaEmpleados LE = new ListaEmpleados();
        LE.setVisible(true);
    }//GEN-LAST:event_BtnMostrarEActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
      
        Limpiar();
        activarCampos(false);
        BtnCancelar.setEnabled(false);
        BtnEliminarE.setEnabled(false);
        BtnNuevoE.setEnabled(true);
        BtnMostrarE.setEnabled(true);
        BtnBuscar.setEnabled(true);
        BtnAgregarE.setEnabled(false);
        BtnEditarE.setEnabled(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarE;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditarE;
    private javax.swing.JButton BtnEliminarE;
    private javax.swing.JButton BtnMostrarE;
    private javax.swing.JButton BtnNuevoE;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox cboSexoE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtDomicilioE;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtEmailE;
    private javax.swing.JTextField txtIDEmple;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JFormattedTextField txtTelefonoE;
    // End of variables declaration//GEN-END:variables
}
