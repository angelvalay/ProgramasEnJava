/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial3;

import AdministracionTotal.Conexion;
import Login.contraPrincipal;

/**
 *
 * @author Osvaldo
 */
public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); // Te pérmite Centrar La Ventana
        setResizable(false); //Te permite No modificar el tamaño de la ventana
        inicio();
        inicio2();
        establecerConexion();
    }

    
    //Método que llamaremos desde nuestro botón
    private void inicio(){
        //Creamos un Thread para mejorar el ejemplo
        final Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                
                int x = 1;
                //Utilizamos un while para emular el valor mínimo y máximo
                //En este caso 0 - 100
                while(x <= 100){
                    //Asignamos valor a nuestro JProgressBar por cada siclo del bucle
                    if(x==100){
                        contraPrincipal contra = new contraPrincipal();
                        contra.setVisible(true);
                        dispose();
                    }
                    barProgress.setValue(x);
                    try {
                        if(x>0&&x<50)
                        Thread.sleep(50);
                        if(x>49&&x<75)
                        Thread.sleep(75);
                        if(x>74)
                        Thread.sleep(100);
                        
                    } catch (InterruptedException e) {
                    }
                    //Se incrementa el valor de x
                    x++;
                }
            }
        });
        //Se ejecuta el Thread
        t.start();
    }
    private void inicio2(){
        //Creamos un Thread para mejorar el ejemplo
        final Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                int x = 1;
                while(x <= 1000){
                    if (x%2!=0)
                    cargando.setText("Cargando o0o0o0");
                    else
                    cargando.setText("Cargando 0o0o0o");
                    
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                    }
                    //Se incrementa el valor de x
                    x++;
                }
            }
        });
        //Se ejecuta el Thread
        t.start();
    }
    private void establecerConexion(){
        //Creamos un Thread para mejorar el ejemplo
        final Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                ProyectoParcial3.setConnection(Conexion.GetConnection());
            }
        });
        //Se ejecuta el Thread
        t.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cargando = new javax.swing.JLabel();
        barProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        cargando.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        cargando.setText("Cargando o0o0o0");

        barProgress.setForeground(new java.awt.Color(0, 0, 51));
        barProgress.setBorderPainted(false);
        barProgress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cargando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(barProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barProgress;
    private javax.swing.JLabel cargando;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
