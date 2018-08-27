
package proyectoparcial2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class launcherCredito extends javax.swing.JFrame {
    private static boolean siguiente2=true;
    
    public launcherCredito() {
        initComponents();
         String c=String.valueOf(resultados.conta);
         this.contador.setText(c);
         if(cantidad!=null)cantidad.setText("");
         siguiente2=true;
         mesesAuto auto = new mesesAuto();
        auto.setVisible(false);
        mesesCasa casa =new mesesCasa();
        casa.setVisible(false);
        mesesPersonal personal = new mesesPersonal();
        personal.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipocredito = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registros :");

        contador.setText("1");

        jLabel3.setText("Tipo de credito :");

        tipocredito.setBackground(new java.awt.Color(0, 102, 102));
        tipocredito.setForeground(new java.awt.Color(204, 153, 0));
        tipocredito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Automoviles", "Casa", "Personal" }));
        tipocredito.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        tipocredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipocreditoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad :");

        cantidad.setBackground(new java.awt.Color(0, 0, 0));
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setCaretColor(new java.awt.Color(204, 204, 0));

        jLabel5.setText("$");

        siguiente.setBackground(new java.awt.Color(0, 0, 0));
        siguiente.setForeground(new java.awt.Color(255, 255, 255));
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        mensaje.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cancel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipocredito, 0, 192, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 115, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(siguiente, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipocredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(30, 30, 30)
                .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(siguiente))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        boolean salir;
        if(siguiente2){
            salir=PedirDatos.entradaDatosLauncherCredito();
            
                if(salir==false){
                    launcherPlazo plazo=new launcherPlazo();
                    ImageIcon image= new ImageIcon ("iconBook.jpg");
                    plazo.setTitle("Registros");
                    plazo.setIconImage(image.getImage());
                    plazo.setLocationRelativeTo(null);
                    plazo.setVisible(true);
                    this.setVisible(false);
                    siguiente2=false;
                }
                    
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        PedirDatos.salir();
    }//GEN-LAST:event_cancelActionPerformed

    private void tipocreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipocreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipocreditoActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    public static javax.swing.JTextField cantidad;
    public static javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel mensaje;
    public static javax.swing.JButton siguiente;
    public static javax.swing.JComboBox tipocredito;
    // End of variables declaration//GEN-END:variables
}
