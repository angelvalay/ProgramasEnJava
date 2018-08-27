
package proyectoparcial2;

import javax.swing.ImageIcon;

public class mesesAuto extends javax.swing.JFrame {

    public mesesAuto() {
        initComponents();
        String c=String.valueOf(resultados.conta);
        this.contador.setText(c);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        meses = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sí = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registros :");

        contador.setText("1");

        meses.setBackground(new java.awt.Color(0, 102, 102));
        meses.setForeground(new java.awt.Color(204, 255, 255));
        meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12", "24", "48" }));
        meses.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesesActionPerformed(evt);
            }
        });

        jLabel3.setText("Elija el plazo a pagar:");

        jLabel4.setText("meses");

        jLabel5.setText("¿Desea dar un aticipo?");

        Sí.setBackground(new java.awt.Color(0, 0, 0));
        Sí.setForeground(new java.awt.Color(255, 255, 255));
        Sí.setText("Sí");
        Sí.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SíActionPerformed(evt);
            }
        });

        Siguiente.setBackground(new java.awt.Color(0, 0, 0));
        Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Siguiente.setText("No, Siguiente");
        Siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(Sí)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Siguiente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sí)
                    .addComponent(Siguiente))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SíActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SíActionPerformed
        PedirDatos.MESES=mesesAuto.meses.getSelectedIndex();
        PedirDatos.mesesAuto();
        anticipo ant=new anticipo();
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        ant.setTitle("Registros");
        ant.setIconImage(image.getImage());
        ant.setLocationRelativeTo(null);
        ant.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SíActionPerformed

    private void mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesActionPerformed
        
    }//GEN-LAST:event_mesesActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        PedirDatos.MESES=mesesAuto.meses.getSelectedIndex();
        //PedirDatos.vector=PedirDatos.mesesA();
        resultados outcome= new resultados();
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        outcome.setTitle("Registros");
        outcome.setIconImage(image.getImage());
        outcome.setLocationRelativeTo(null);
        outcome.setVisible(true);
        this.setVisible(false);
        PedirDatos.cantidad_anticipo=(float) 0.00;
    }//GEN-LAST:event_SiguienteActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Sí;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JComboBox meses;
    // End of variables declaration//GEN-END:variables
}
