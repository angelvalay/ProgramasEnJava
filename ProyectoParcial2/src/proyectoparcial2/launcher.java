
package proyectoparcial2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class launcher extends javax.swing.JFrame {

    private static boolean siguiente = true;
    public launcher() {
        PedirDatos.conMes=-1;
        initComponents();
        String c=String.valueOf(resultados.conta);
        this.contador.setText(c);
        siguiente=true; 
        PedirDatos.cantidad_anticipo=(float) 0.00;
        PedirDatos.fin="";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidopaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidomaterno = new javax.swing.JTextField();
        sig = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Registros :");

        contador.setText("1");

        jLabel3.setText("Nombre(s)* :");

        nombre.setBackground(new java.awt.Color(153, 0, 153));
        nombre.setForeground(new java.awt.Color(255, 255, 51));
        nombre.setCaretColor(new java.awt.Color(255, 255, 51));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setText("Apellido Paterno* :");

        apellidopaterno.setBackground(new java.awt.Color(153, 0, 153));
        apellidopaterno.setForeground(new java.awt.Color(255, 255, 51));
        apellidopaterno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellidopaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setText("Apellido Materno* :");

        apellidomaterno.setBackground(new java.awt.Color(153, 0, 153));
        apellidomaterno.setForeground(new java.awt.Color(255, 255, 51));
        apellidomaterno.setCaretColor(new java.awt.Color(255, 255, 255));
        apellidomaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        mensaje.setBackground(new java.awt.Color(153, 153, 153));
        mensaje.setForeground(new java.awt.Color(204, 0, 0));
        mensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* Sólo mayúsculas.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sig))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidopaterno)
                                    .addComponent(apellidomaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contador))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(sig))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        boolean sig=true;
        sig=PedirDatos.entradaDatosLauncher();
        if(sig){
            if(siguiente==false){ PedirDatos.entradaDatosLauncher();
            launcherDomicilio menuSecundario= new launcherDomicilio();
            ImageIcon image= new ImageIcon ("iconBook.jpg");
            menuSecundario.setTitle("Registros");
            menuSecundario.setIconImage(image.getImage());
            menuSecundario.setLocationRelativeTo(null);
            menuSecundario.setVisible(true);
            this.setVisible(false);
            siguiente=false;
           }else{
            launcherDomicilio anterior=new launcherDomicilio();
            ImageIcon image= new ImageIcon ("iconBook.jpg");
            anterior.setTitle("Registros");
            anterior.setIconImage(image.getImage());
            anterior.setLocationRelativeTo(null);
            anterior.setVisible(true);
            launcherDomicilio.domicilio.setText(PedirDatos.direccion[PedirDatos.c]);
            launcherDomicilio.municipio.setText(PedirDatos.mun[PedirDatos.c]);
            launcherDomicilio.estado.setSelectedItem(PedirDatos.estadoBox);
            PedirDatos.entradaDatosLauncher();
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_sigActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        PedirDatos.salir();
    }//GEN-LAST:event_cancelActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellidomaterno;
    public static javax.swing.JTextField apellidopaterno;
    private javax.swing.JButton cancel;
    public static javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel mensaje;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JButton sig;
    // End of variables declaration//GEN-END:variables
}
