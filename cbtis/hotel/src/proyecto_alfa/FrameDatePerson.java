package proyecto_alfa;

import conexionesExt.ConexionMySQL;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
/**
 *
 * @author The Blacks
 */
public class FrameDatePerson extends javax.swing.JFrame {    
    private FrameIndex frameIndex;
    public FrameDatePerson() {
        initComponents();
        this.setTitle("Datos Personales");
        this.setLocationRelativeTo(null);
    }
    
    public FrameDatePerson(FrameIndex frameIndex) {
        initComponents();
        this.setTitle("Datos Personales");
        this.setLocationRelativeTo(null);
        this.frameIndex=frameIndex;
    }
    
    private void nextFrame(){
        FrameDateRoom frameDateRoom= new FrameDateRoom(this);
        frameDateRoom.setVisible(true);
        this.dispose();
    }
    private void backFrame(){
        ConexionMySQL db = new ConexionMySQL();
        FrameIndex Index = new FrameIndex(db.MySQLCo());
        Index.setVisible(true);
        this.dispose();
    }    
    private boolean checkName(JTextField texto){        
        String nombre=texto.getText();
        Validaciones v= new Validaciones(nombre);        
        boolean isName=v.forName();        
        return isName;
    }
    private boolean checkSexo(JRadioButton jRadioButton, JRadioButton jRadioButton1){
        return jRadioButton.isSelected()||jRadioButton1.isSelected();
    }
    private boolean checkAge(JSpinner jSpinner){
        try {
            byte age=Byte.parseByte(jSpinner.getValue().toString());
            return age>=18;            
        }catch (NumberFormatException e){
            return false;
        }        
    }
    private void returnValues(){
        this.campoApellido.setText(null);
        this.campoNombre.setText(null);        
    }
    private void viewMessage(String message, String title, int typeMessage){
        JOptionPane.showMessageDialog(null, message, title, typeMessage);
    }
    private void eventCloseWindow(){
        int close=JOptionPane.showConfirmDialog(null, "Desea Salir ?", "Salir", JOptionPane.YES_NO_OPTION);
        if (close==JOptionPane.YES_OPTION) {
            backFrame();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioMasculino = new javax.swing.JRadioButton();
        radioFemenino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        spinnerEdad = new javax.swing.JSpinner();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoCuidad = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                eventClosingWindow(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel3.setText("Sexo:");

        buttonGroup1.add(radioMasculino);
        radioMasculino.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 11)); // NOI18N
        radioMasculino.setForeground(new java.awt.Color(0, 0, 204));
        radioMasculino.setText("Masculino");

        buttonGroup1.add(radioFemenino);
        radioFemenino.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 11)); // NOI18N
        radioFemenino.setForeground(new java.awt.Color(255, 102, 102));
        radioFemenino.setText("Femenino");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel4.setText("Edad:");

        spinnerEdad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 120, 1));

        btnCancelar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jLabel5.setText("Ciudad y Estado:");

        jScrollPane1.setViewportView(campoCuidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre)
                            .addComponent(campoApellido)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioFemenino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino)
                    .addComponent(radioFemenino)
                    .addComponent(jLabel4)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(checkName(getCampoApellido())&&
                checkName(getCampoNombre())&&
                    checkSexo(getRadioFemenino(), getRadioMasculino())&&
                        checkAge(getSpinnerEdad())){
            nextFrame(); 
        }else{
            returnValues();
            viewMessage("Datos incorrectos", "Checa los datos", JOptionPane.ERROR_MESSAGE);
        }                
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        backFrame();        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void eventClosingWindow(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_eventClosingWindow
        // TODO add your handling code here:
        eventCloseWindow();
    }//GEN-LAST:event_eventClosingWindow

    public JTextPane getCampoCuidad() {
        return campoCuidad;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextPane campoCuidad;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JSpinner spinnerEdad;
    // End of variables declaration//GEN-END:variables
    
    public JTextField getCampoApellido() {
        return campoApellido;
    }
    
    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JRadioButton getRadioFemenino() {
        return radioFemenino;
    }
    
    public JRadioButton getRadioMasculino() {
        return radioMasculino;
    }

    public javax.swing.JSpinner getSpinnerEdad() {
        return spinnerEdad;
    }

    public void setCampoApellido(javax.swing.JTextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public void setCampoCuidad(javax.swing.JTextPane campoCuidad) {
        this.campoCuidad = campoCuidad;
    }

    public void setCampoNombre(javax.swing.JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public void setRadioFemenino(javax.swing.JRadioButton radioFemenino) {
        this.radioFemenino = radioFemenino;
    }

    public void setRadioMasculino(javax.swing.JRadioButton radioMasculino) {
        this.radioMasculino = radioMasculino;
    }

    public void setSpinnerEdad(javax.swing.JSpinner spinnerEdad) {
        this.spinnerEdad = spinnerEdad;
    }
    
}
