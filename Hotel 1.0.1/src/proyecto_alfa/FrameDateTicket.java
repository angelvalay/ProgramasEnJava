package proyecto_alfa;

import conexionesExt.ConexionMySQL;
import conexionesExt.Habitaciones;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
/**
 *
 * @author The Blacks
 */
public class FrameDateTicket extends javax.swing.JFrame {
    private FrameDatePerson datePerson;
    private FrameDateRoom dateRoom;
    
    public FrameDateTicket(FrameDatePerson datePerson, FrameDateRoom dateRoom) {
        initComponents();
        this.setTitle("Datos Ticket");
        this.setLocationRelativeTo(null);
        this.datePerson = datePerson;
        this.dateRoom = dateRoom; 
        this.campoNombre.setText(this.doNomPerson());
        this.campoFechaInicio.setText(this.doDateToday());
        this.campoFechaFin.setText(this.doDateEnd());
        this.campoCiudad.setText(this.doCityState());
        this.campoMonto.setText(String.valueOf(this.doPrecioHab()));
        this.campoIVA.setText(String.valueOf(this.IVA(this.doPrecioHab())));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoMonto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoIVA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoFechaInicio = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        campoRFC = new javax.swing.JTextField();
        campoFechaFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel1.setText("Nombre:");

        campoNombre.setText("       ");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel3.setText("RFC:");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jLabel5.setText("Ciudad y estado:");

        campoCiudad.setText(" ");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel7.setText("Monto a pagar:");

        campoMonto.setText(" ");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jLabel9.setText("IVA:");

        campoIVA.setText(" ");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jLabel11.setText("Fecha:");

        campoFechaInicio.setText(" ");

        btnImprimir.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(0, 0, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoRFC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addComponent(btnImprimir))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoIVA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(campoFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(campoFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        exitFrame();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        backFrame();
    }//GEN-LAST:event_btnRegresarActionPerformed
    private void exitFrame(){        
        
        ConexionMySQL db = new ConexionMySQL();
        Validaciones v= new Validaciones(this.campoRFC.getText());
        //Pasar a base de datos
        String RFC= this.campoRFC.getText();
        if(RFC != null&& v.isRFC()){
            Habitaciones h= new Habitaciones(this.doNumHab(), this.doNomPerson(), this.doCantPer(), this.doDateToday(), this.doDateEnd(), 
                    this.doTipoHab(), this.doPrecioHab(), this.RFC(this.campoRFC),db.MySQLCo());
            h.sendDatesToHotel();
            JOptionPane.showMessageDialog(null, "El pago se realizo correctamente.");
            FrameIndex Index = new FrameIndex(db.MySQLCo());
            Index.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Checa tu RFC");
        }
    }
    private void backFrame(){
       FrameDateRoom back = new FrameDateRoom(datePerson);
       back.setVisible(true);
       this.dispose();
    }
    
    private int doNumHab(){
        return (int) ((SpinnerNumberModel)dateRoom.getSpinnerNumHabitacion().getModel()).getNumber();
    }
    private String doNomPerson(){
        return String.valueOf(datePerson.getCampoNombre().getText()+" "+datePerson.getCampoApellido().getText());
    }
    private int doCantPer(){
        return (int) ((SpinnerNumberModel)dateRoom.getSpinnerNumPersona().getModel()).getNumber();
    }
    private String doDateToday(){
        return dateRoom.getDateToday().getText();
    }
    
    private String doDateEnd(){
        return dateRoom.getBoxAnioSalida().getSelectedItem().toString()+"-"+
                dateRoom.getBoxMesSalida().getSelectedItem().toString()+"-"+
                dateRoom.getBoxDiaSalida().getSelectedItem().toString();
    }
    
    private String doTipoHab(){
        if(dateRoom.getRadioIndividual().isSelected()) return "Individual";
        else if(dateRoom.getRadioDoble().isSelected()) return "Doble";
        else if(dateRoom.getRadioMini().isSelected()) return "Mini-Suite";
        else if(dateRoom.getRadioPresidencial().isSelected()) return "Presidencial";
        else if(dateRoom.getRadioSuite().isSelected()) return "Suite";
        else return "Individual";
    }
    private float doPrecioHab(){
        if(dateRoom.getRadioIndividual().isSelected()) return 500;
        else if(dateRoom.getRadioDoble().isSelected()) return 800;
        else if(dateRoom.getRadioMini().isSelected()) return 1500;
        else if(dateRoom.getRadioPresidencial().isSelected()) return 2500;
        else if(dateRoom.getRadioSuite().isSelected()) return 3500;
        else return 500;
    }
    private String RFC(JTextField field){
        return field.getText();
    }
    private String doCityState(){
        return this.datePerson.getCampoCuidad().getText();
    }
    private float IVA(float cantidad){
        return (float) (cantidad*0.16);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel campoCiudad;
    private javax.swing.JLabel campoFechaFin;
    private javax.swing.JLabel campoFechaInicio;
    private javax.swing.JLabel campoIVA;
    private javax.swing.JLabel campoMonto;
    private javax.swing.JLabel campoNombre;
    private javax.swing.JTextField campoRFC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
