
package proyectoparcial2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class launcherPlazo extends javax.swing.JFrame {

    
    public launcherPlazo() {
        initComponents();
        String c=String.valueOf(resultados.conta);
        this.contador.setText(c);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha_día = new javax.swing.JSpinner();
        siguiente = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        fecha_mes = new javax.swing.JSpinner();
        fecha_año = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registros: ");

        contador.setText("1");

        jLabel3.setText("Fecha Actual:");

        fecha_día.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        fecha_día.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

        siguiente.setBackground(new java.awt.Color(0, 0, 0));
        siguiente.setForeground(new java.awt.Color(255, 255, 255));
        siguiente.setText("Siguiente");
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        atras.setBackground(new java.awt.Color(0, 0, 0));
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atras");
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        fecha_mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        fecha_mes.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

        fecha_año.setModel(new javax.swing.SpinnerNumberModel(15, 0, 99, 1));
        fecha_año.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

        jLabel4.setText("20");

        jLabel5.setText("Día");

        jLabel6.setText("Mes");

        jLabel7.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contador)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(salir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(siguiente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_día, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fecha_año, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_día, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(atras)
                    .addComponent(salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        boolean salida;
        salida=PedirDatos.validarFecha();
        if(salida==true){
            Object tipocre=launcherCredito.tipocredito.getSelectedItem();
            if (tipocre=="Automoviles") {
                mesesAuto auto =new mesesAuto();
                ImageIcon image= new ImageIcon ("iconBook.jpg");
                auto.setTitle("Registros");
                auto.setIconImage(image.getImage());
                auto.setLocationRelativeTo(null);
                auto.setVisible(true);
                this.setVisible(false);
                } 
            if (tipocre=="Casa"){
                mesesCasa casa =new mesesCasa();
                ImageIcon image= new ImageIcon ("iconBook.jpg");
                casa.setTitle("Registros");
                casa.setIconImage(image.getImage());
                casa.setLocationRelativeTo(null);
                casa.setVisible(true);
                this.setVisible(false);
                }
            if (tipocre=="Personal"){
                mesesPersonal personal =new mesesPersonal();
                ImageIcon image= new ImageIcon ("iconBook.jpg");
                personal.setTitle("Registros");
                personal.setIconImage(image.getImage());
                personal.setLocationRelativeTo(null);
                personal.setVisible(true);
                this.setVisible(false);
                }
            }
                else{
                launcherPlazo plazo=new launcherPlazo();
                ImageIcon image= new ImageIcon ("iconBook.jpg");
                plazo.setTitle("Registros");
                plazo.setIconImage(image.getImage());
                plazo.setLocationRelativeTo(null);
                plazo.setVisible(true);
                this.setVisible(false);
            }  
    }//GEN-LAST:event_siguienteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        launcherCredito anterior=new launcherCredito();
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        anterior.setTitle("Registros");
        anterior.setIconImage(image.getImage());
        anterior.setLocationRelativeTo(null);
        anterior.setVisible(true);
        launcherCredito.cantidad.setText(Float.toString(PedirDatos.crecant[PedirDatos.c]));
        launcherCredito.tipocredito.setSelectedIndex(PedirDatos.indice);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        PedirDatos.salir();
    }//GEN-LAST:event_salirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel contador;
    public static javax.swing.JSpinner fecha_año;
    public static javax.swing.JSpinner fecha_día;
    public static javax.swing.JSpinner fecha_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton salir;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
