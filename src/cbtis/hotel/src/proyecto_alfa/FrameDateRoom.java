package proyecto_alfa;

import com.mysql.jdbc.MySQLConnection;
import conexionesExt.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author The Blacks
 */
public class FrameDateRoom extends javax.swing.JFrame {
    private FrameDatePerson datePerson;
    public FrameDateRoom(FrameDatePerson datePerson) {
        initComponents();
        this.datePerson= datePerson;
        this.setTitle("Habitacion");
        this.setLocationRelativeTo(null);
        this.dateToday.setText(getDate());
    }
    private void nextFrame(){
        int dia=Integer.parseInt(this.getBoxDiaSalida().getSelectedItem().toString());
        int mes = Integer.parseInt(this.getBoxMesSalida().getSelectedItem().toString());
        int ano= Integer.parseInt(this.getBoxAnioSalida().getSelectedItem().toString());
        int numHab1= (int) ((SpinnerNumberModel)this.getSpinnerNumHabitacion().getModel()).getNumber();
        int numHab2= (int) ((SpinnerNumberModel)this.getSpinnerConfimarHab().getModel()).getNumber();
        boolean isExist=isExistNumHab();
        if(validaFecha(ano, mes, dia)&&isNumHab(numHab1, numHab2)&&!isExist){
                FrameDateTicket frameDateTicket= new FrameDateTicket(datePerson, this);
                frameDateTicket.setVisible(true);
                this.dispose();
        }else{
            if(isExist){
                JOptionPane.showMessageDialog(null,"Ya existe una persona con esa misma habitacion");
            }else{
                JOptionPane.showMessageDialog(null,"Checa bien los datos");
            }
            
        }
        

    }

    private boolean isExistNumHab(){
        boolean isExist=false;
        try {
            ConexionMySQL cmsql= new ConexionMySQL();
            Connection MySQL= cmsql.MySQLCo();
            ResultSet rs = null;
            Statement cmd = null;
            cmd=MySQL.createStatement();
            rs=cmd.executeQuery("select numHab from habitaciones");
            // Bucle para cada resultado en la consulta
            while (rs.next())
            {
                if(rs.getInt(1)== (int) ((SpinnerNumberModel)this.getSpinnerNumHabitacion().getModel()).getNumber()){
                    isExist=true;
                    MySQL.close();
                    break;
                }else{
                    isExist=false;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FrameDateRoom.class.getName()).log(Level.SEVERE, null, ex);
            isExist= false;
        }
        return isExist;
    }
    public JSpinner getSpinnerConfimarHab() {
        return spinnerConfimarHab;
    }
    private void backFrame(){
        FrameDatePerson Back = new FrameDatePerson();
        Back.setVisible(true);
        this.dispose();
    }
    private void changeNumPersons(){
        if(this.radioIndividual.isSelected()){
            this.spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1,1,2,1));
        }else if(this.radioDoble.isSelected()){
            this.spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1,1,4,1));
        }else if(this.radioMini.isSelected()){
            this.spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1,1,4,1));
        }else if(this.radioPresidencial.isSelected()){
            this.spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1,1,8,1));
        }else if(this.radioSuite.isSelected()){
            this.spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1,1,6,1));
        }
    }
    // Para optener la fecha actual 
    private String getDate(){
        Date today = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(today);
    }
    
    private boolean validaFecha(int año, int mes, int dia)
    {
        int[] diasMes= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ( año < 2016 ) {
            throw new IllegalArgumentException( 
                    "Solo se comprueban fechas del año 1900 o posterior");
        }
        if ( mes<1 || mes>12 )
            return false;
        // Para febrero y bisiesto el limite es 29
        if ( mes==2 && año%4==0 )
            return dia>=1 && dia<=29;
        return dia>=0 && dia<=diasMes[mes-1];
    }
    private boolean isNumHab(int a1, int a2){
        return a1==a2;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        spinnerNumPersona = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinnerNumHabitacion = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spinnerConfimarHab = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        radioIndividual = new javax.swing.JRadioButton();
        radioMini = new javax.swing.JRadioButton();
        radioDoble = new javax.swing.JRadioButton();
        radioSuite = new javax.swing.JRadioButton();
        radioPresidencial = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        dateToday = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boxDiaSalida = new javax.swing.JComboBox<String>();
        boxMesSalida = new javax.swing.JComboBox<String>();
        boxAnioSalida = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel3.setText("Nuemero de personas ");

        spinnerNumPersona.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel4.setText("Numero de Abitacion");

        spinnerNumHabitacion.setModel(new javax.swing.SpinnerNumberModel(101, 101, 800, 1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel6.setText("Confirma el numero de Habitacion");

        spinnerConfimarHab.setModel(new javax.swing.SpinnerNumberModel(101, 101, 800, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de habitacion"));

        radioIndividual.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(radioIndividual);
        radioIndividual.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        radioIndividual.setText("Individual");
        radioIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIndividualActionPerformed(evt);
            }
        });

        radioMini.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(radioMini);
        radioMini.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        radioMini.setText("Mini-suite");
        radioMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMiniActionPerformed(evt);
            }
        });

        radioDoble.setBackground(new java.awt.Color(255, 51, 102));
        buttonGroup1.add(radioDoble);
        radioDoble.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        radioDoble.setText("Doble");
        radioDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDobleActionPerformed(evt);
            }
        });

        radioSuite.setBackground(new java.awt.Color(255, 153, 102));
        buttonGroup1.add(radioSuite);
        radioSuite.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        radioSuite.setText("Suite");
        radioSuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuiteActionPerformed(evt);
            }
        });

        radioPresidencial.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(radioPresidencial);
        radioPresidencial.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        radioPresidencial.setText("Presidencial");
        radioPresidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresidencialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioDoble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radioMini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioSuite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(radioPresidencial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioIndividual)
                    .addComponent(radioMini))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDoble)
                    .addComponent(radioSuite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(radioPresidencial)
                .addContainerGap())
        );

        btnAceptar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        dateToday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        dateToday.setText("07/NOV/2016");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Salida"));

        boxDiaSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        boxMesSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        boxMesSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMesSalidaActionPerformed(evt);
            }
        });

        boxAnioSalida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018" }));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel1.setText("Dia");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel5.setText("Mes");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel7.setText("Año");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boxDiaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(boxMesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(boxAnioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxDiaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAnioSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel2.setText("Fecha de Entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)
                                .addComponent(dateToday))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spinnerNumPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spinnerNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spinnerConfimarHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateToday)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerNumPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinnerConfimarHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        nextFrame();
        getDate();
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        backFrame();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radioIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIndividualActionPerformed
        // TODO add your handling code here:
        this.changeNumPersons();
    }//GEN-LAST:event_radioIndividualActionPerformed

    private void radioMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMiniActionPerformed
        // TODO add your handling code here:
        this.changeNumPersons();
    }//GEN-LAST:event_radioMiniActionPerformed

    private void radioDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDobleActionPerformed
        // TODO add your handling code here:
        this.changeNumPersons();
    }//GEN-LAST:event_radioDobleActionPerformed

    private void radioSuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuiteActionPerformed
        // TODO add your handling code here:
        this.changeNumPersons();
    }//GEN-LAST:event_radioSuiteActionPerformed

    private void radioPresidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresidencialActionPerformed
        // TODO add your handling code here:
        this.changeNumPersons();
    }//GEN-LAST:event_radioPresidencialActionPerformed

    private void boxMesSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMesSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMesSalidaActionPerformed

    public JLabel getDateToday() {
        return dateToday;
    }

    public JComboBox<String> getBoxAnioSalida() {
        return boxAnioSalida;
    }

    public JComboBox<String> getBoxDiaSalida() {
        return boxDiaSalida;
    }

    public JComboBox<String> getBoxMesSalida() {
        return boxMesSalida;
    }

    public JRadioButton getRadioDoble() {
        return radioDoble;
    }

    public JRadioButton getRadioIndividual() {
        return radioIndividual;
    }

    public JRadioButton getRadioMini() {
        return radioMini;
    }

    public JRadioButton getRadioPresidencial() {
        return radioPresidencial;
    }

    public JRadioButton getRadioSuite() {
        return radioSuite;
    }

    public JSpinner getSpinnerNumHabitacion() {
        return spinnerNumHabitacion;
    }

    public JSpinner getSpinnerNumPersona() {
        return spinnerNumPersona;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAnioSalida;
    private javax.swing.JComboBox<String> boxDiaSalida;
    private javax.swing.JComboBox<String> boxMesSalida;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dateToday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radioDoble;
    private javax.swing.JRadioButton radioIndividual;
    private javax.swing.JRadioButton radioMini;
    private javax.swing.JRadioButton radioPresidencial;
    private javax.swing.JRadioButton radioSuite;
    private javax.swing.JSpinner spinnerConfimarHab;
    private javax.swing.JSpinner spinnerNumHabitacion;
    private javax.swing.JSpinner spinnerNumPersona;
    // End of variables declaration//GEN-END:variables
}
