
package proyectoparcial2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class launcherDomicilio extends javax.swing.JFrame {

    private static boolean siguiente1=true;
    public launcherDomicilio() {
        initComponents();
        String c=String.valueOf(resultados.conta);
        this.contador.setText(c);
        siguiente1=true;
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
        estado = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        sig = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        domicilio = new javax.swing.JTextArea();
        atras = new javax.swing.JButton();
        municipio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registros :");

        contador.setText("1");

        jLabel3.setText("Estado :");

        estado.setBackground(new java.awt.Color(0, 0, 51));
        estado.setForeground(new java.awt.Color(153, 153, 255));
        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        estado.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Municipio* :");

        sig.setBackground(new java.awt.Color(0, 0, 0));
        sig.setForeground(new java.awt.Color(255, 255, 255));
        sig.setText("Siguiente");
        sig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancelar");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion:");

        domicilio.setBackground(new java.awt.Color(255, 255, 102));
        domicilio.setColumns(20);
        domicilio.setRows(5);
        jScrollPane1.setViewportView(domicilio);

        atras.setBackground(new java.awt.Color(0, 0, 0));
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atras");
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        municipio.setBackground(new java.awt.Color(0, 0, 0));
        municipio.setForeground(new java.awt.Color(255, 255, 255));
        municipio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("*Sólo mayúsculas.");

        mensaje.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contador))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(estado, 0, 146, Short.MAX_VALUE)
                                    .addComponent(municipio))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sig))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(mensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(jLabel3)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sig)
                    .addComponent(cancel)
                    .addComponent(atras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        boolean sig=true;
        sig=PedirDatos.entradaDatosLauncherDomicilio();
        if(sig){
            if(siguiente1==true){
            PedirDatos.entradaDatosLauncherDomicilio();
            launcherCredito jFrame= new launcherCredito();
            ImageIcon image= new ImageIcon ("iconBook.jpg");
            jFrame.setTitle("Registros");
            jFrame.setIconImage(image.getImage());
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            this.setVisible(false);
            siguiente1=false;
            }else{
            launcherCredito anterior=new launcherCredito();
            ImageIcon image= new ImageIcon ("iconBook.jpg");
            anterior.setTitle("Registros");
            anterior.setIconImage(image.getImage());
            anterior.setLocationRelativeTo(null);
            anterior.setVisible(true);
            launcherCredito.cantidad.setText(String.valueOf(PedirDatos.crecant[PedirDatos.c]));
            launcherCredito.tipocredito.setSelectedIndex(PedirDatos.indice);
            PedirDatos.entradaDatosLauncherDomicilio();
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_sigActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        
    }//GEN-LAST:event_estadoActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        launcher anterior=new launcher();
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        anterior.setTitle("Registros");
        anterior.setIconImage(image.getImage());
        anterior.setLocationRelativeTo(null);
        anterior.setVisible(true);
        launcher.nombre.setText(PedirDatos.nombre[PedirDatos.c]); 
        launcher.apellidomaterno.setText(PedirDatos.apemat[PedirDatos.c]);
        launcher.apellidopaterno.setText(PedirDatos.apepat[PedirDatos.c]);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        PedirDatos.salir();
    }//GEN-LAST:event_cancelActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton cancel;
    public static javax.swing.JLabel contador;
    public static javax.swing.JTextArea domicilio;
    public static javax.swing.JComboBox estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel mensaje;
    public static javax.swing.JTextField municipio;
    public static javax.swing.JButton sig;
    // End of variables declaration//GEN-END:variables
}
