
package AreaDeProduccion;

import AdministracionTotal.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nuevaCompra extends javax.swing.JFrame {

    private  float Costo;
    private Conexion conexion= new Conexion();
    
    public nuevaCompra() {
        initComponents();
        tableBusqueda();
        fecha.setText(conexion.FECHA);  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        folioCompra = new javax.swing.JTextField();
        totalCompra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codInsumo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantInsumos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Ordenar por");

        comboOrdenar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "folio", "fecha", "código", "cantidad", "total" }));
        comboOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOrdenarMouseClicked(evt);
            }
        });
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("de forma ");

        comboAsc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(0, 153, 153));
        tabla.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setGridColor(new java.awt.Color(102, 255, 204));
        tabla.setOpaque(false);
        tabla.setSelectionBackground(new java.awt.Color(204, 255, 0));
        tabla.setSelectionForeground(new java.awt.Color(0, 102, 51));
        jScrollPane2.setViewportView(tabla);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Registro de compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13)
                        .addGap(32, 32, 32)
                        .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nueva compra");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Folio:");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        folioCompra.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        folioCompra.setEnabled(false);
        folioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                folioCompraKeyTyped(evt);
            }
        });

        totalCompra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        totalCompra.setText("0.0");
        totalCompra.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Fecha:");

        fecha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Código del insumo:");

        codInsumo.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        codInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codInsumoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad:");

        cantInsumos.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        cantInsumos.setText("1");
        cantInsumos.setEnabled(false);
        cantInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantInsumosActionPerformed(evt);
            }
        });
        cantInsumos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantInsumosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantInsumosKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Total:");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 204));
        jButton1.setText("Cancelar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ingresar.setBackground(new java.awt.Color(0, 102, 102));
        ingresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ingresar.setForeground(new java.awt.Color(102, 255, 204));
        ingresar.setText("Realizar compra");
        ingresar.setBorderPainted(false);
        ingresar.setFocusable(false);
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codInsumo)
                    .addComponent(cantInsumos)
                    .addComponent(totalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(folioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(folioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        try{ 
        float as= this.Costo*(Float.parseFloat(this.cantInsumos.getText()));
        this.totalCompra.setText(String.valueOf(as));
        conexion.setFolioComp(Integer.parseInt(this.folioCompra.getText()));
        conexion.setCodInsComp(Integer.parseInt(this.codInsumo.getText()));
        conexion.setCantComp(Integer.parseInt(this.cantInsumos.getText()));
        conexion.setTotalComp(Costo, Integer.parseInt(this.cantInsumos.getText()));
        conexion.getCompras();
        this.tableBusqueda();
        JOptionPane.showMessageDialog(this, "Compra Exitosa");
        }catch(Exception A){
            JOptionPane.showMessageDialog(this, "ERROR DE INGRESO DE DATOS. \n "+A.getMessage(), null, WIDTH);
        }
        this.jButton1ActionPerformed(evt);
    }//GEN-LAST:event_ingresarActionPerformed

    private void folioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folioCompraKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            if(folioCompra.getText().length()>CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }        
    }//GEN-LAST:event_folioCompraKeyTyped

    private void codInsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codInsumoKeyTyped
         char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(codInsumo.getText().length()>CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }        
    }//GEN-LAST:event_codInsumoKeyTyped

    private void cantInsumosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantInsumosKeyTyped
         char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            if(cantInsumos.getText().length()>CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_cantInsumosKeyTyped

    private void HabilitarOpciones(boolean a){
        this.folioCompra.setEnabled(a);
        this.totalCompra.setEnabled(a);
        this.cantInsumos.setEnabled(a);
        this.ingresar.setEnabled(a);
    }
    private void comboOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOrdenarMouseClicked
        tableBusqueda();
    }//GEN-LAST:event_comboOrdenarMouseClicked

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboOrdenarActionPerformed

    private void comboAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAscActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboAscActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try{
            ResultSet con=conexion.setBusqueda("insumos", "código", Integer.parseInt(codInsumo.getText()));
            int ad = 0;
            if(con.next()){
                ad= con.getInt(1);
                Costo= con.getFloat(3);
                this.HabilitarOpciones(true);
                codInsumo.setEnabled(false);
                this.totalCompra.setText(String.valueOf(Costo));
                this.cantInsumos.setText("1");
            }else{
            
                this.HabilitarOpciones(false);
                JOptionPane.showMessageDialog(this, "Insumo NO encontrado", "Busqueda", JOptionPane.WARNING_MESSAGE);
            }
    }catch(Exception a){
        JOptionPane.showMessageDialog(null, "Verfica bien los datos.", null, JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cantInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantInsumosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantInsumosActionPerformed

    private void cantInsumosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantInsumosKeyPressed
        if(cantInsumos.getText()==null){
            totalCompra.setText("00.0");
        }else{
        try{
            float as= this.Costo*(Float.parseFloat(this.cantInsumos.getText()));
            this.totalCompra.setText(String.valueOf(as));
        }catch(Exception e){
            
        }
        }
    }//GEN-LAST:event_cantInsumosKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.HabilitarOpciones(false);
        this.codInsumo.setEnabled(true);
        this.codInsumo.setText("");
        this.cantInsumos.setText("");
        this.folioCompra.setText("");
        this.totalCompra.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableBusqueda(){
        DefaultTableModel modelo = new DefaultTableModel(){
            //TE PERMITE MODIFICAR LA ESTRUCTURA DE LA TABLA
            //NO SE PUEDE EDITAR LA TABLA
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("Folio");
        modelo.addColumn("Fecha");
        modelo.addColumn("Código");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        String por= comboOrdenar.getSelectedItem().toString();
        String order;
        if(comboAsc.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getCompras(por, order);
            while(rs.next()){
                Object []ob=new Object[5];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getInt(1));
            ob[1]=(rs.getString(2));
            ob[2]=(rs.getString(3));
            ob[3]=(rs.getString(4));
            ob[4]=(rs.getString(5));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            Logger.getLogger(nuevaCompra.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        tabla.setModel(modelo);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantInsumos;
    public static javax.swing.JTextField codInsumo;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    public static javax.swing.JLabel fecha;
    public static javax.swing.JTextField folioCompra;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel totalCompra;
    // End of variables declaration//GEN-END:variables
}
