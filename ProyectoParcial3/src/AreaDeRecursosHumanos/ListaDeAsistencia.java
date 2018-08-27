/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
   public final class ListaDeAsistencia extends javax.swing.JFrame {
   Date fechac;
   String fechabd;
   SimpleDateFormat fech;
   
    public ListaDeAsistencia() {
        initComponents();
        fechac= new Date(System.currentTimeMillis());
        fech = new SimpleDateFormat("dd-MM-yyyy");//Formato de fecha
        fechabd=fech.format(fechac);//Da el formato
        JMFechaA.setText(fechabd);
        
        
    }
    
    public void segCampos(boolean t)
    {
        LRazon.setEnabled(t);
        txtRazon.setEnabled(t);
    }

     public void mostrarCampos(boolean t)
    {
        
        JMostrarNomb.setEnabled(t);
        HE.setEnabled(t);
        HS.setEnabled(t);
        Minutos1.setEnabled(t);
        Hora1.setEnabled(t);
        Hora2.setEnabled(t);
        Minutos2.setEnabled(t);
        JSalir.setEnabled(t);
        JHoras.setEnabled(t);
        JMinutos.setEnabled(t);
        JHoras2.setEnabled(t);
        JMinutos2.setEnabled(t);
        RSi.setEnabled(t);
        RNo.setEnabled(t);
        BtnAgregar.setEnabled(t);
    }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        BNombre = new javax.swing.JTextField();
        JMostrarNomb = new javax.swing.JLabel();
        JMFechaA = new javax.swing.JLabel();
        JHoras = new javax.swing.JLabel();
        JMinutos = new javax.swing.JLabel();
        JHoras2 = new javax.swing.JLabel();
        JMinutos2 = new javax.swing.JLabel();
        RSi = new javax.swing.JRadioButton();
        RNo = new javax.swing.JRadioButton();
        JSalir = new javax.swing.JLabel();
        LRazon = new javax.swing.JLabel();
        Hora1 = new javax.swing.JSpinner();
        Minutos1 = new javax.swing.JSpinner();
        Hora2 = new javax.swing.JSpinner();
        Minutos2 = new javax.swing.JSpinner();
        HE = new javax.swing.JLabel();
        HS = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRazon = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        JMostrarNomb.setText("Empleado");
        JMostrarNomb.setEnabled(false);

        JMFechaA.setText("00-00-00");

        JHoras.setText("Hora:");
        JHoras.setEnabled(false);

        JMinutos.setText("Minutos:");
        JMinutos.setEnabled(false);

        JHoras2.setText("Hora:");
        JHoras2.setEnabled(false);

        JMinutos2.setText("Minutos:");
        JMinutos2.setEnabled(false);

        RSi.setText("Si");
        RSi.setEnabled(false);
        RSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSiActionPerformed(evt);
            }
        });

        RNo.setSelected(true);
        RNo.setText("No");
        RNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RNo.setEnabled(false);
        RNo.setNextFocusableComponent(txtRazon);
        RNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNoActionPerformed(evt);
            }
        });

        JSalir.setText("Salir antes de tiempo (No Obligatorio)");
        JSalir.setEnabled(false);

        LRazon.setText("Especifique razon de la salida:");
        LRazon.setEnabled(false);

        Hora1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        Hora1.setEnabled(false);

        Minutos1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minutos1.setEnabled(false);

        Hora2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        Hora2.setEnabled(false);

        Minutos2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minutos2.setEnabled(false);

        HE.setText("Hora-Entrada:");
        HE.setEnabled(false);

        HS.setText("Hora-Salida:");
        HS.setEnabled(false);

        jLabel9.setText("Fecha Actual:");

        jLabel10.setText("Lista De Asistencia:");

        BtnAgregar.setText("Agregar");
        BtnAgregar.setEnabled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        txtRazon.setColumns(20);
        txtRazon.setRows(5);
        jScrollPane1.setViewportView(txtRazon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JHoras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JMinutos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Minutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HS)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JHoras2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(JMinutos2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Minutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JMostrarNomb)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JMFechaA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnAgregar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RNo))
                            .addComponent(LRazon)
                            .addComponent(JSalir)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBuscar)
                            .addComponent(BNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JMostrarNomb)
                            .addComponent(JMFechaA)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(HE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JHoras)
                            .addComponent(JMinutos)
                            .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JMinutos2)
                            .addComponent(JHoras2)
                            .addComponent(Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minutos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(JSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RSi)
                    .addComponent(RNo))
                .addGap(4, 4, 4)
                .addComponent(LRazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BtnAgregar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSiActionPerformed
        RNo.setSelected(false); 
        if(RSi.isSelected()==true){
            segCampos(true);
        }
    }//GEN-LAST:event_RSiActionPerformed

    private void RNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNoActionPerformed
        RSi.setSelected(false);
        if(RNo.isSelected()==true){
            segCampos(false);
        }
    }//GEN-LAST:event_RNoActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if (BNombre.getText().compareTo("")== 0) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del empleado a busca", "rAviso",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } else{
            /* try {
            //Buscar nombre empleado
            if (" Aqui Variable con el nombre"== null) {
                JOptionPane.showMessageDialog(null, "No existe");
            } else{
                //Mostrar nombre en Label JMostrarNomb
            //Habilitar campos
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }*/
        mostrarCampos(true);
        }
        
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
         //A base de datos
    }//GEN-LAST:event_BtnAgregarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BNombre;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JLabel HE;
    private javax.swing.JLabel HS;
    private javax.swing.JSpinner Hora1;
    private javax.swing.JSpinner Hora2;
    private javax.swing.JLabel JHoras;
    private javax.swing.JLabel JHoras2;
    private javax.swing.JLabel JMFechaA;
    private javax.swing.JLabel JMinutos;
    private javax.swing.JLabel JMinutos2;
    private javax.swing.JLabel JMostrarNomb;
    private javax.swing.JLabel JSalir;
    private javax.swing.JLabel LRazon;
    private javax.swing.JSpinner Minutos1;
    private javax.swing.JSpinner Minutos2;
    private javax.swing.JRadioButton RNo;
    private javax.swing.JRadioButton RSi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtRazon;
    // End of variables declaration//GEN-END:variables
}
