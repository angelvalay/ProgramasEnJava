/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginaprincipal;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.*;

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    private void AbrirAplicacionVector(){
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vector = new javax.swing.JButton();
        Shake = new javax.swing.JButton();
        Prestamos = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vector.setText("Uso de Vectores");
        Vector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VectorActionPerformed(evt);
            }
        });

        Shake.setText("Juego Shake");

        Prestamos.setText("Simulador de Prestamos");

        Ventas.setText("Sistema de Ventas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Vector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Shake))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Prestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(Ventas)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vector)
                    .addComponent(Shake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prestamos)
                    .addComponent(Ventas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VectorActionPerformed
        Runtime aplicacion = Runtime.getRuntime();
        try{
        aplicacion.exec("C://Users//Osvaldo//Documents//NetBeansProjects//paginaPrincipal//Vectores.exe");//el archivo se llama 1.exe
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Archivo No encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VectorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Prestamos;
    private javax.swing.JButton Shake;
    private javax.swing.JButton Vector;
    private javax.swing.JButton Ventas;
    // End of variables declaration//GEN-END:variables
}
