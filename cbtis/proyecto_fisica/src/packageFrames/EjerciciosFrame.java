
package packageFrames;

import java.awt.Color;
import javax.swing.JOptionPane;
import packageDatosProblemas.ProblemasDistancia;
import packageDatosProblemas.ProblemasRapidez;
import packageDatosProblemas.ProblemasTiempo;

/**
 *
 * @author Angel Armando Valay Martinez
 */
public class EjerciciosFrame extends javax.swing.JFrame {

    private ProblemasDistancia problemasDistancia;  //Opcion 1
    private ProblemasRapidez problemasRapidez;      //Opcion 2
    private ProblemasTiempo problemasTiempo;        //Opcion 3
    private int opcionEjercicio;
    /**
     * 
     * @param problemasDistancia 
     */
    public EjerciciosFrame(ProblemasDistancia problemasDistancia) {
        initComponents();
        this.problemasDistancia=problemasDistancia;
        this.opcionEjercicio=1;
        habilitarConfiguraciones();
    }
    /**
     * 
     * @param problemasRapidez 
     */
    public EjerciciosFrame(ProblemasRapidez problemasRapidez) {
        initComponents();
        this.problemasRapidez=problemasRapidez;
        this.opcionEjercicio=2;
        habilitarConfiguraciones();
        validarTipoEjercicio();
    }
    /**
     * 
     * @param problemasTiempo 
     */
    public EjerciciosFrame(ProblemasTiempo problemasTiempo) {
        initComponents();
        this.problemasTiempo=problemasTiempo;
        this.opcionEjercicio=3;
        habilitarConfiguraciones();
        validarTipoEjercicio();
    }
    
    private void habilitarConfiguraciones(){
        this.getContentPane().setBackground(Color.white);
        this.cerrarApp.setBackground(Color.white);
        this.setExtendedState(MAXIMIZED_BOTH);
        validarTipoEjercicio();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEjercicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDato1 = new javax.swing.JLabel();
        edt1 = new javax.swing.JTextField();
        txtDato2 = new javax.swing.JLabel();
        edt2 = new javax.swing.JTextField();
        dato1 = new javax.swing.JLabel();
        dato2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        radioDistancia = new javax.swing.JRadioButton();
        radioTiempo = new javax.swing.JRadioButton();
        radioVelocidad = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        edt3 = new javax.swing.JTextField();
        dato3 = new javax.swing.JLabel();
        btnChecar = new javax.swing.JButton();
        txtDato3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cerrarApp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtEjercicio.setBackground(Color.decode("#B0BEC5"));
        txtEjercicio.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtEjercicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEjercicio.setFocusable(false);
        txtEjercicio.setInheritsPopupMenu(false);
        txtEjercicio.setOpaque(true);
        jScrollPane1.setViewportView(txtEjercicio);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escribe los datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N

        txtDato1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtDato1.setText("Tiempo =");

        edt1.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N

        txtDato2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtDato2.setText("Velocidad =");

        edt2.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N

        dato1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        dato1.setText("dato");

        dato2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        dato2.setText("dato");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edt2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(edt1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dato1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dato2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato1)
                    .addComponent(edt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDato2)
                    .addComponent(edt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato2))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elige la formula correcta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N

        radioDistancia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioDistancia);
        radioDistancia.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        radioDistancia.setText("d=v t");
        radioDistancia.setBorder(null);
        radioDistancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioDistancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radioDistanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radioDistanciaMouseExited(evt);
            }
        });

        radioTiempo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioTiempo);
        radioTiempo.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        radioTiempo.setText("t= d / v");
        radioTiempo.setBorder(null);
        radioTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radioTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radioTiempoMouseExited(evt);
            }
        });
        radioTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTiempoActionPerformed(evt);
            }
        });

        radioVelocidad.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioVelocidad);
        radioVelocidad.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        radioVelocidad.setText("v= d / t");
        radioVelocidad.setBorder(null);
        radioVelocidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radioVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                radioVelocidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                radioVelocidadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioDistancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(radioTiempo)
                .addGap(18, 18, 18)
                .addComponent(radioVelocidad)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioDistancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anota el resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N

        edt3.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N

        dato3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        dato3.setText("dato");

        btnChecar.setBackground(Color.decode("#263238"));
        btnChecar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnChecar.setForeground(new java.awt.Color(255, 255, 255));
        btnChecar.setText("CHECAR");
        btnChecar.setBorderPainted(false);
        btnChecar.setFocusPainted(false);
        btnChecar.setFocusable(false);
        btnChecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChecarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChecarMouseExited(evt);
            }
        });
        btnChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecarActionPerformed(evt);
            }
        });

        txtDato3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtDato3.setText("Distancia =");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(txtDato3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edt3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dato3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChecar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChecar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dato3)
                    .addComponent(edt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDato3))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movimiento Rectilíneo Uniforme (MRU)");

        cerrarApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/marca-de-la-cruz-sobre-un-fondo-negro-de-circulo.png"))); // NOI18N
        cerrarApp.setBorderPainted(false);
        cerrarApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarApp.setDefaultCapable(false);
        cerrarApp.setFocusable(false);
        cerrarApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarAppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarAppMouseExited(evt);
            }
        });
        cerrarApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarAppActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrarApp))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerrarApp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTiempoActionPerformed

    private void cerrarAppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarAppMouseEntered
        // TODO add your handling code here:
        this.cerrarApp.setBackground(Color.decode("#B0BEC5"));
    }//GEN-LAST:event_cerrarAppMouseEntered

    private void cerrarAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarAppMouseExited
        // TODO add your handling code here:
        this.cerrarApp.setBackground(Color.white);
    }//GEN-LAST:event_cerrarAppMouseExited

    private void cerrarAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarAppActionPerformed
        this.dispose();
        IndexFrame indexFrame = new IndexFrame();
        indexFrame.show();
    }//GEN-LAST:event_cerrarAppActionPerformed

    private void btnChecarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChecarMouseEntered
        // TODO add your handling code here:
        btnChecar.setForeground(Color.decode("#263238"));
        btnChecar.setBackground(this.getContentPane().getBackground());
    }//GEN-LAST:event_btnChecarMouseEntered

    private void btnChecarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChecarMouseExited
        // TODO add your handling code here:
        btnChecar.setForeground(this.getContentPane().getBackground());
        btnChecar.setBackground(Color.decode("#263238"));
    }//GEN-LAST:event_btnChecarMouseExited

    private void radioDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDistanciaMouseEntered
        // TODO add your handling code here:
        this.radioDistancia.setBackground(Color.decode("#B0BEC5"));
    }//GEN-LAST:event_radioDistanciaMouseEntered

    private void radioDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDistanciaMouseExited
        // TODO add your handling code here:
        this.radioDistancia.setBackground(this.getContentPane().getBackground());
    }//GEN-LAST:event_radioDistanciaMouseExited

    private void radioTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTiempoMouseExited
        // TODO add your handling code here:
        this.radioTiempo.setBackground(this.getContentPane().getBackground());
    }//GEN-LAST:event_radioTiempoMouseExited

    private void radioVelocidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioVelocidadMouseEntered
        // TODO add your handling code here:
        this.radioVelocidad.setBackground(Color.decode("#B0BEC5"));
    }//GEN-LAST:event_radioVelocidadMouseEntered

    private void radioVelocidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioVelocidadMouseExited
        // TODO add your handling code here:
        this.radioVelocidad.setBackground(this.getContentPane().getBackground());
    }//GEN-LAST:event_radioVelocidadMouseExited

    private void radioTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTiempoMouseEntered
        // TODO add your handling code here:
        this.radioTiempo.setBackground(Color.decode("#B0BEC5"));
    }//GEN-LAST:event_radioTiempoMouseEntered

    private void btnChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecarActionPerformed
        // TODO add your handling code here:
        validarEntrada();
    }//GEN-LAST:event_btnChecarActionPerformed

    private void validarTipoEjercicio(){
        switch(opcionEjercicio){
            case 1:
                asignarValoresDistancia();
                break;
            case 2:
                asignarValoresRapidez();
                break;
            case 3:
                asignarValoresTiempo();
                break;
        }
    }
    private void asignarValoresDistancia(){
        this.txtEjercicio.setText(problemasDistancia.getProblema());
        this.txtDato1.setText("Tiempo =");
        this.dato1.setText(problemasDistancia.gettTiempo());
        this.txtDato2.setText("Velocidad =");
        this.dato2.setText(problemasDistancia.gettRapidez());
        this.txtDato3.setText("Distancia =");
        this.dato3.setText(problemasDistancia.gettDistancia());
    }
    private void asignarValoresRapidez(){
        this.txtEjercicio.setText(problemasRapidez.getProblema());
        this.txtDato1.setText("Tiempo =");
        this.dato1.setText(problemasRapidez.gettTiempo());
        this.txtDato2.setText("Distancia =");
        this.dato2.setText(problemasRapidez.gettDistancia());
        this.txtDato3.setText("Velocidad =");
        this.dato3.setText(problemasRapidez.gettRapidez());
    }
    private void asignarValoresTiempo(){
        this.txtEjercicio.setText(problemasTiempo.getProblema());
        this.txtDato1.setText("Velocidad =");
        this.dato1.setText(problemasTiempo.gettRapidez());
        this.txtDato2.setText("Distancia =");
        this.dato2.setText(problemasTiempo.gettDistancia());
        this.txtDato3.setText("Tiempo =");
        this.dato3.setText(problemasTiempo.gettTiempo());
    }
    private int opcionMarcada(){
        if(this.radioDistancia.isSelected())return 1;
        else if (this.radioVelocidad.isSelected()) return 2;
        else if (this.radioTiempo.isSelected()) return 3;
        else return 0;
    }
    private void validarEntrada(){
        try {
            float d1= Float.parseFloat(this.edt1.getText());
            float d2= Float.parseFloat(this.edt2.getText());
            float d3= Float.parseFloat(this.edt3.getText());
            switch(opcionEjercicio){
                case 1:
                    if(d1==problemasDistancia.getTiempo()&& 
                            d2==problemasDistancia.getRapidez()&&
                            d3==problemasDistancia.getDistancia()&& opcionMarcada()==1){
                        viewIndex();
                    }else if(opcionMarcada()!=1){
                        JOptionPane.showMessageDialog(this, "Checa que formula elegiste", "Formula incorrecta", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Vuelve a intentarlo", "Error de problema", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 2:
                    if(d1==problemasRapidez.getTiempo()&& 
                            d2==problemasRapidez.getDistancia()&&
                            d3==problemasRapidez.getRapidez()&& opcionMarcada()==2){
                        viewIndex();
                    }else if(opcionMarcada()!=2){
                        JOptionPane.showMessageDialog(this, "Checa que formula elegiste", "Formula incorrecta", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Vuelve a intentarlo", "Error del problema", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;
                case 3:
                    if(d1==problemasTiempo.getRapidez()&& 
                            d2==problemasDistancia.getDistancia()&&
                            d3==problemasDistancia.getTiempo()&& opcionMarcada()==3){
                        viewIndex();
                    }else if(opcionMarcada()!=3){
                        JOptionPane.showMessageDialog(this, "Checa que formula elegiste", "Formula incorrecta", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this, "Vuelve a intentarlo", "Error del problema", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vuelve a intentarlo", "Error de conversion", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }
    private void viewIndex(){
        JOptionPane.showMessageDialog(this, "Correcto", "Pregunta contestada", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        IndexFrame indexFrame = new IndexFrame();
        indexFrame.show();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChecar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cerrarApp;
    private javax.swing.JLabel dato1;
    private javax.swing.JLabel dato2;
    private javax.swing.JLabel dato3;
    private javax.swing.JTextField edt1;
    private javax.swing.JTextField edt2;
    private javax.swing.JTextField edt3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioDistancia;
    private javax.swing.JRadioButton radioTiempo;
    private javax.swing.JRadioButton radioVelocidad;
    private javax.swing.JLabel txtDato1;
    private javax.swing.JLabel txtDato2;
    private javax.swing.JLabel txtDato3;
    private javax.swing.JLabel txtEjercicio;
    // End of variables declaration//GEN-END:variables
}
