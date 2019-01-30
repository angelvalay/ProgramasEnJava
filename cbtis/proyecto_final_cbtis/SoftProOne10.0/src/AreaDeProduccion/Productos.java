/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaDeProduccion;

import AdministracionTotal.Conexion;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osvaldo
 */
public class Productos extends javax.swing.JDialog{

    private Conexion conexion= new Conexion();
    public Productos(/*java.awt.Frame parent, boolean modal*/) {
      //super(parent, modal);
      initComponents();
      enablingReset();
      setLocationRelativeTo(null); // Te pérmite Centrar La Ventana
      generarTable("códigoProducto");
    }
/*
    public Productos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuEme1 = new javax.swing.JPopupMenu();
        orden = new javax.swing.JMenu();
        codPro = new javax.swing.JMenuItem();
        desc = new javax.swing.JMenuItem();
        st = new javax.swing.JMenuItem();
        costo = new javax.swing.JMenuItem();
        precio = new javax.swing.JMenuItem();
        actualizar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productosTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        idpro = new javax.swing.JTextField();
        busqueda = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        costoE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        añadir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        MenuEme1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        orden.setText("Ordenar");

        codPro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codPro.setText("Cod. Producto");
        codPro.setToolTipText("");
        codPro.setContentAreaFilled(false);
        codPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codProMousePressed(evt);
            }
        });
        orden.add(codPro);

        desc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        desc.setText("Descripcion");
        desc.setContentAreaFilled(false);
        desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descMousePressed(evt);
            }
        });
        orden.add(desc);

        st.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        st.setText("Stock");
        st.setToolTipText("");
        st.setContentAreaFilled(false);
        st.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stMousePressed(evt);
            }
        });
        orden.add(st);

        costo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        costo.setText("Costo");
        costo.setToolTipText("");
        costo.setContentAreaFilled(false);
        costo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                costoMousePressed(evt);
            }
        });
        orden.add(costo);

        precio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        precio.setText("Precio");
        precio.setContentAreaFilled(false);
        precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioMousePressed(evt);
            }
        });
        orden.add(precio);

        MenuEme1.add(orden);

        actualizar.setText("Actualizar");
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actualizarMousePressed(evt);
            }
        });
        MenuEme1.add(actualizar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        productosTable.setBackground(new java.awt.Color(0, 153, 153));
        productosTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        productosTable.setForeground(new java.awt.Color(255, 255, 255));
        productosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productosTable.setGridColor(new java.awt.Color(51, 255, 204));
        productosTable.setOpaque(false);
        productosTable.setSelectionBackground(new java.awt.Color(204, 255, 0));
        productosTable.setSelectionForeground(new java.awt.Color(0, 102, 51));
        productosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productosTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(productosTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        des.setColumns(20);
        des.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        des.setRows(5);
        jScrollPane1.setViewportView(des);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Codigo del producto:");

        idpro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idproKeyTyped(evt);
            }
        });

        busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        busqueda.setBorderPainted(false);
        busqueda.setContentAreaFilled(false);
        busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busqueda.setFocusable(false);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion del producto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(busqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Stock:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");

        stock.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        pre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                preKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Costo de elaboracion:");

        costoE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        costoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoEActionPerformed(evt);
            }
        });
        costoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(costoE, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(costoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Productos");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Productos registrados");

        añadir.setBackground(new java.awt.Color(0, 102, 102));
        añadir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        añadir.setForeground(new java.awt.Color(102, 255, 204));
        añadir.setText("Añadir producto");
        añadir.setBorder(null);
        añadir.setBorderPainted(false);
        añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 102, 102));
        cancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(51, 255, 204));
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 102, 102));
        eliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(102, 255, 204));
        eliminar.setText("Eliminar");
        eliminar.setBorderPainted(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 102, 102));
        nuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nuevo.setForeground(new java.awt.Color(102, 255, 204));
        nuevo.setText("Nuevo");
        nuevo.setBorderPainted(false);
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(0, 102, 102));
        editar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        editar.setForeground(new java.awt.Color(102, 255, 204));
        editar.setText("Editar");
        editar.setBorderPainted(false);
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(jLabel7))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cancelar)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_idproKeyTyped

    private void preKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_preKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_preKeyTyped

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        if(c!='.'){
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        }
    }//GEN-LAST:event_stockKeyTyped

    private void costoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoEKeyTyped
        char c=evt.getKeyChar();
        float a=0;
        int CharLong=10;
        if(c!='.'){
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(idpro.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        }
    }//GEN-LAST:event_costoEKeyTyped

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        try{
        conexion.setCodProduc(Integer.parseInt(idpro.getText()));
        conexion.setdescProduc(des.getText());
        conexion.setPrecioProduc(Float.parseFloat(pre.getText()));
        conexion.setStockProduc(Integer.parseInt(stock.getText()));
        conexion.setCostElbProduc(Float.parseFloat(costoE.getText()));
        conexion.getProductos();
        generarTable("códigoProducto");
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Verifica bien los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        enablingReset();
    }//GEN-LAST:event_añadirActionPerformed

    private void activarCampos(boolean t){
        idpro.setEnabled(t);
        des.setEnabled(t);
        pre.setEnabled(t);
        stock.setEnabled(t);
        costoE.setEnabled(t);
        //buscaimagen.setEnabled(t);
    }
    
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        activarCampos(true);
        añadir.setEnabled(true);
        //añadir.setBackground(java.awt.Color.BLUE);
        busqueda.setEnabled(false);
        editar.setEnabled(false);
        //editar.setBackground(java.awt.Color.WHITE);
        eliminar.setEnabled(false);
        //eliminar.setBackground(java.awt.Color.WHITE);
        cancelar.setEnabled(true);
        //cancelar.setBackground(java.awt.Color.blue);
    }//GEN-LAST:event_nuevoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        try{
            int cod= Integer.parseInt(idpro.getText());
            ResultSet rs=conexion.setBusqueda("inventarioProductos", "códigoProducto", cod);
            if(rs.next()){
                this.des.setText(rs.getString(2));
                this.stock.setText(rs.getString(3));
                this.costoE.setText(rs.getString(4));
                this.pre.setText(rs.getString(5));
                this.nuevo.setEnabled(false);
                //nuevo.setBackground(java.awt.Color.WHITE);
                this.añadir.setEnabled(false);
                //añadir.setBackground(java.awt.Color.WHITE);
                this.editar.setEnabled(true);
                //editar.setBackground(java.awt.Color.blue);
                this.eliminar.setEnabled(true);
                //eliminar.setBackground(java.awt.Color.blue);
                cancelar.setEnabled(true);
                //cancelar.setBackground(java.awt.Color.blue);
                this.activarCampos(true);
                idpro.setEnabled(false);
            }else{
                idpro.setText("");
                JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Producto" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el Código del Producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(Exception d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_busquedaActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try{
            conexion.setCodProduc(Integer.parseInt(idpro.getText()));
            conexion.setdescProduc(des.getText());
            conexion.setPrecioProduc(Float.parseFloat(pre.getText()));
            conexion.setStockProduc(Integer.parseInt(stock.getText()));
            conexion.setCostElbProduc(Float.parseFloat(costoE.getText()));
            conexion.getUpdateProductos(Integer.parseInt(this.idpro.getText()));
            generarTable("códigoProducto");
        }catch (Exception a){
            JOptionPane.showMessageDialog(null, "Error BD: " + a.getMessage());
        }
        limpiarCampos(); 
        enablingReset();
    }//GEN-LAST:event_editarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        enablingReset();
    }//GEN-LAST:event_cancelarActionPerformed

    
    private void enablingReset(){
        limpiarCampos();
        activarCampos(false);
        idpro.setEnabled(true);
        nuevo.setEnabled(true);
        //nuevo.setBackground(java.awt.Color.blue);
        añadir.setEnabled(false);
        //añadir.setBackground(java.awt.Color.WHITE);
        editar.setEnabled(false);
        //editar.setBackground(java.awt.Color.WHITE);
        eliminar.setEnabled(false);
        //eliminar.setBackground(java.awt.Color.WHITE);
        busqueda.setEnabled(true);
    }
    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        conexion.setEliminarRegistro("inventarioProductos", "códigoProducto", Integer.parseInt(this.idpro.getText()),"ventas","códigoProducto");
        generarTable("códigoProducto");
        enablingReset();
    }//GEN-LAST:event_eliminarActionPerformed

    private void costoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoEActionPerformed

    private void productosTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosTableMousePressed
         if(evt.getButton()== MouseEvent.BUTTON3){
            //Forma de localizar el punto en que se hace clic
            //Parámetro x e y
            //BUTTON3, clic derecho
            MenuEme1.show(evt.getComponent(), evt.getX(), evt.getY());
            MenuEme1.setVisible(true);
        }
    }//GEN-LAST:event_productosTableMousePressed

    private void codProMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codProMousePressed
        generarTable("códigoProducto");
    }//GEN-LAST:event_codProMousePressed

    private void descMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descMousePressed
        generarTable("descripción");
    }//GEN-LAST:event_descMousePressed

    private void stMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stMousePressed
        generarTable("stock");
    }//GEN-LAST:event_stMousePressed

    private void costoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costoMousePressed
        generarTable("costo_elaboración");
    }//GEN-LAST:event_costoMousePressed

    private void precioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioMousePressed
        generarTable("precio");
    }//GEN-LAST:event_precioMousePressed

    private void actualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMousePressed
        generarTable("códigoProducto");
    }//GEN-LAST:event_actualizarMousePressed

    private void limpiarCampos(){
        idpro.setText("");
        des.setText("");
        pre.setText("");
        stock.setText("");
        costoE.setText("");
    }
    
    private void generarTable(String order){
        DefaultTableModel modelo = new DefaultTableModel(){
            //TE PERMITE MODIFICAR LA ESTRUCTURA DE LA TABLA
            //NO SE PUEDE EDITAR LA TABLA
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("ID Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock");
        modelo.addColumn("Capital invertido");
        modelo.addColumn("Precio Unitario");
        try{
            ResultSet rs=conexion.getProductos(order, "asc");
             while(rs.next()){
                 Object []ob=new Object[5];
                 ob[0]=(rs.getInt(1));
                 ob[1]=(rs.getString(2));
                 ob[2]=(rs.getInt(3));
                 ob[3]=(rs.getFloat(4));
                 ob[4]=(rs.getFloat(5));
                 modelo.addRow(ob);
                 ob=null;
                    
             }
             rs.close();
             
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA O SALIDA DE DATOS  ", null, JOptionPane.ERROR_MESSAGE);
            
        }
        productosTable.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu MenuEme1;
    private javax.swing.JMenuItem actualizar;
    private javax.swing.JButton añadir;
    private javax.swing.JToggleButton busqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JMenuItem codPro;
    private javax.swing.JMenuItem costo;
    private javax.swing.JTextField costoE;
    private javax.swing.JTextArea des;
    private javax.swing.JMenuItem desc;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField idpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nuevo;
    private javax.swing.JMenu orden;
    private javax.swing.JTextField pre;
    private javax.swing.JMenuItem precio;
    private javax.swing.JTable productosTable;
    private javax.swing.JMenuItem st;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
