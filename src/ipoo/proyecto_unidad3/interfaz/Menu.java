package interfaz;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnMuestra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoMuestra = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnBorrarDatos = new javax.swing.JButton();
        txtNombreArchivo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMedia = new javax.swing.JButton();
        btnMediana = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnRango = new javax.swing.JButton();
        btnDesvEstandar = new javax.swing.JButton();
        btnVarianza = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnBinomial = new javax.swing.JButton();
        btnHyper = new javax.swing.JButton();
        btnDistNormal = new javax.swing.JButton();
        btnTStudent = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnPermutacion = new javax.swing.JButton();
        btnPruebas = new javax.swing.JButton();
        btnCombinacion = new javax.swing.JButton();

        jButton12.setText("Permutacion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Muestra"));
        jPanel1.setToolTipText("Datos");
        jPanel1.setName("Datos"); // NOI18N

        btnMuestra.setText("Archivo");

        campoMuestra.setColumns(20);
        campoMuestra.setRows(5);
        jScrollPane1.setViewportView(campoMuestra);

        jLabel1.setText("O");

        btnBorrarDatos.setText("Borrar datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMuestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarDatos)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMuestra)
                            .addComponent(jLabel1))
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnBorrarDatos)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Medidas de localizacion"));

        btnMedia.setText("Media");

        btnMediana.setText("Mediana");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMedia)
                .addGap(18, 18, 18)
                .addComponent(btnMediana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btnMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Medidas de variabilidad"));

        btnRango.setText("Rango");

        btnDesvEstandar.setText("Desviacion estandar");

        btnVarianza.setText("Varianza");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDesvEstandar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRango)
                        .addGap(18, 18, 18)
                        .addComponent(btnVarianza)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRango)
                    .addComponent(btnVarianza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesvEstandar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Distribucion de probabilidad"));

        btnBinomial.setText("Binomial");

        btnHyper.setText("Hypergeometrica");

        btnDistNormal.setText("Distribucion normal");

        btnTStudent.setText("T-Student");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBinomial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHyper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBinomial)
                    .addComponent(btnHyper))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDistNormal)
                    .addComponent(btnTStudent))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Probabilidad"));

        btnPermutacion.setText("Permutacion");

        btnPruebas.setText("Pruebas");

        btnCombinacion.setText("Combinacion");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPermutacion)
                .addGap(18, 18, 18)
                .addComponent(btnPruebas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCombinacion)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPermutacion)
                    .addComponent(btnPruebas)
                    .addComponent(btnCombinacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinomial;
    private javax.swing.JButton btnBorrarDatos;
    private javax.swing.JButton btnCombinacion;
    private javax.swing.JButton btnDesvEstandar;
    private javax.swing.JButton btnDistNormal;
    private javax.swing.JButton btnHyper;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMediana;
    private javax.swing.JButton btnMuestra;
    private javax.swing.JButton btnPermutacion;
    private javax.swing.JButton btnPruebas;
    private javax.swing.JButton btnRango;
    private javax.swing.JButton btnTStudent;
    private javax.swing.JButton btnVarianza;
    private javax.swing.JTextArea campoMuestra;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtNombreArchivo;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnBinomial() {
        return btnBinomial;
    }

    public void setBtnBinomial(javax.swing.JButton btnBinomial) {
        this.btnBinomial = btnBinomial;
    }

    public javax.swing.JButton getBtnCombinacion() {
        return btnCombinacion;
    }

    public void setBtnCombinacion(javax.swing.JButton btnCombinacion) {
        this.btnCombinacion = btnCombinacion;
    }

    public javax.swing.JButton getBtnDesvEstandar() {
        return btnDesvEstandar;
    }

    public void setBtnDesvEstandar(javax.swing.JButton btnDesvEstandar) {
        this.btnDesvEstandar = btnDesvEstandar;
    }

    public javax.swing.JButton getBtnDistNormal() {
        return btnDistNormal;
    }

    public void setBtnDistNormal(javax.swing.JButton btnDistNormal) {
        this.btnDistNormal = btnDistNormal;
    }

    public javax.swing.JButton getBtnHyper() {
        return btnHyper;
    }

    public void setBtnHyper(javax.swing.JButton btnHyper) {
        this.btnHyper = btnHyper;
    }

    public javax.swing.JButton getBtnMedia() {
        return btnMedia;
    }

    public void setBtnMedia(javax.swing.JButton btnMedia) {
        this.btnMedia = btnMedia;
    }

    public javax.swing.JButton getBtnMediana() {
        return btnMediana;
    }

    public void setBtnMediana(javax.swing.JButton btnMediana) {
        this.btnMediana = btnMediana;
    }

    public javax.swing.JButton getBtnMuestra() {
        return btnMuestra;
    }

    public void setBtnMuestra(javax.swing.JButton btnMuestra) {
        this.btnMuestra = btnMuestra;
    }

    public javax.swing.JButton getBtnPermutacion() {
        return btnPermutacion;
    }

    public void setBtnPermutacion(javax.swing.JButton btnPermutacion) {
        this.btnPermutacion = btnPermutacion;
    }

    public javax.swing.JButton getBtnPruebas() {
        return btnPruebas;
    }

    public void setBtnPruebas(javax.swing.JButton btnPruebas) {
        this.btnPruebas = btnPruebas;
    }

    public javax.swing.JButton getBtnRango() {
        return btnRango;
    }

    public void setBtnRango(javax.swing.JButton btnRango) {
        this.btnRango = btnRango;
    }

    public javax.swing.JButton getBtnTStudent() {
        return btnTStudent;
    }

    public void setBtnTStudent(javax.swing.JButton btnTStudent) {
        this.btnTStudent = btnTStudent;
    }

    public javax.swing.JButton getBtnVarianza() {
        return btnVarianza;
    }

    public void setBtnVarianza(javax.swing.JButton btnVarianza) {
        this.btnVarianza = btnVarianza;
    }

    public javax.swing.JTextArea getCampoMuestra() {
        return campoMuestra;
    }

    public void setCampoMuestra(javax.swing.JTextArea campoMuestra) {
        this.campoMuestra = campoMuestra;
    }

    public javax.swing.JButton getBtnBorrarDatos() {
        return btnBorrarDatos;
    }

    public void setBtnBorrarDatos(javax.swing.JButton btnBorrarDatos) {
        this.btnBorrarDatos = btnBorrarDatos;
    }

    public javax.swing.JLabel getTxtNombreArchivo() {
        return txtNombreArchivo;
    }

    public void setTxtNombreArchivo(javax.swing.JLabel txtNombreArchivo) {
        this.txtNombreArchivo = txtNombreArchivo;
    }
    
    
}
