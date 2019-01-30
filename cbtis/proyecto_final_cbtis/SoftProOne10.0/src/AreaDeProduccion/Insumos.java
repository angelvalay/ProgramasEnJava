
package AreaDeProduccion;

import AdministracionTotal.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Insumos extends javax.swing.JFrame {
    
   public static Conexion conexion= new Conexion();
    public Insumos() {
        initComponents();
        EnablingReset();
        tableBusqueda();
        
    }

    private void EnablingReset(){
        this.Limpiar();
        txtCodI.setEnabled(true);
        txtaDescripcionI.setEnabled(false);
        txtStockI.setEnabled(false);
        txtCostoI.setEnabled(false);
        txtProveedorI.setEnabled(false);
        txtContacto.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtMedidaI.setEnabled(false);
        nuevo.setEnabled(true);
        eliminar.setEnabled(false);
        editar.setEnabled(false);
        agregar.setEnabled(false);
        cancelar.setEnabled(false);
        busqueda.setEnabled(true);
    }
    
    private void habilitarCampos(){
        
        txtaDescripcionI.setEnabled(true);
        txtStockI.setEnabled(true);
        txtCostoI.setEnabled(true);
        txtProveedorI.setEnabled(true);
        txtContacto.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtMedidaI.setEnabled(true);
        nuevo.setEnabled(false);
        eliminar.setEnabled(false);
        editar.setEnabled(false);
        agregar.setEnabled(true);
        cancelar.setEnabled(true);
        busqueda.setEnabled(false);
        this.txtCodI.setEnabled(false);
   }
    
    private void cambiarCampos(){
        habilitarCampos();
        txtCodI.setEnabled(false);
        nuevo.setEnabled(false);
        eliminar.setEnabled(true);
        editar.setEnabled(true);
        agregar.setEnabled(false);
        busqueda.setEnabled(false);
    }
    
    public void Limpiar()
    {
        txtCodI.setText("");
        txtaDescripcionI.setText("");
        txtStockI.setText("");
        txtMedidaI.setText("");
        txtCostoI.setText("");
        txtProveedorI.setText("");    
        txtContacto.setText("");
        txtTelefono.setText("");
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcionI = new javax.swing.JTextArea();
        busqueda = new javax.swing.JToggleButton();
        txtProveedorI = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStockI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMedidaI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCostoI = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);
        jPanel1.setOpaque(false);

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
        tabla.setGridColor(new java.awt.Color(51, 255, 204));
        tabla.setSelectionBackground(new java.awt.Color(204, 255, 0));
        tabla.setSelectionForeground(new java.awt.Color(0, 102, 51));
        jScrollPane2.setViewportView(tabla);

        jScrollPane3.setViewportView(jScrollPane2);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("de forma");

        comboOrdenar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Costo", "Proveedor" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Ordenar por");

        comboAsc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Insumos registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        txtCodI.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCodI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodIKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        txtaDescripcionI.setColumns(20);
        txtaDescripcionI.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtaDescripcionI.setRows(5);
        txtaDescripcionI.setEnabled(false);
        jScrollPane1.setViewportView(txtaDescripcionI);

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

        txtProveedorI.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtProveedorI.setEnabled(false);
        txtProveedorI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorIKeyTyped(evt);
            }
        });

        txtContacto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtContacto.setEnabled(false);
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Proveedor:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Contacto:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setEnabled(false);
        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Stock:");

        txtStockI.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtStockI.setEnabled(false);
        txtStockI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockIKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Medida:");

        txtMedidaI.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtMedidaI.setEnabled(false);
        txtMedidaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedidaIActionPerformed(evt);
            }
        });
        txtMedidaI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedidaIKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Costo:");

        txtCostoI.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCostoI.setEnabled(false);
        txtCostoI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoIActionPerformed(evt);
            }
        });
        txtCostoI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoIKeyTyped(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 102, 102));
        nuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nuevo.setForeground(new java.awt.Color(51, 255, 204));
        nuevo.setText("Nuevo");
        nuevo.setBorderPainted(false);
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.setDefaultCapable(false);
        nuevo.setFocusPainted(false);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(0, 102, 102));
        agregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(51, 255, 204));
        agregar.setText("Agregar");
        agregar.setBorderPainted(false);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.setDefaultCapable(false);
        agregar.setFocusPainted(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 102, 102));
        eliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(51, 255, 204));
        eliminar.setText("Eliminar");
        eliminar.setBorderPainted(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setDefaultCapable(false);
        eliminar.setEnabled(false);
        eliminar.setFocusPainted(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(0, 102, 102));
        editar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        editar.setForeground(new java.awt.Color(0, 255, 204));
        editar.setText("Editar");
        editar.setBorderPainted(false);
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.setDefaultCapable(false);
        editar.setFocusPainted(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 102, 102));
        cancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(51, 255, 204));
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.setDefaultCapable(false);
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Insumos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCodI, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(busqueda))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContacto)
                            .addComponent(txtProveedorI)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtStockI, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCostoI, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMedidaI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStockI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCostoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMedidaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedorI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(17, 17, 17)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(nuevo)
                                .addGap(43, 43, 43)
                                .addComponent(agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editar)
                                .addGap(44, 44, 44)
                                .addComponent(cancelar)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        EnablingReset();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_nuevoActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        try{
            int cod= Integer.parseInt(txtCodI.getText());
            ResultSet rs=conexion.setBusqueda("insumos", "código", cod);
            if(rs.next()){
                this.txtaDescripcionI.setText(rs.getString(2));
                this.txtStockI.setText(rs.getString(8));
                this.txtCostoI.setText(rs.getString(3));
                this.txtMedidaI.setText(rs.getString(4));
                this.txtProveedorI.setText(rs.getString(5));
                this.txtContacto.setText(rs.getString(6));
                this.txtTelefono.setText(rs.getString(7));

                /*this.nuevo.setEnabled(false);
                this.añadir.setEnabled(false);
                this.editar.setEnabled(true);
                this.eliminar.setEnabled(true);
                cancelar.setEnabled(true);
                this.activarCampos(true);
                txtCodI.setEnabled(false);*/

                cambiarCampos();
            }else{
                txtCodI.setText("");
                JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Producto" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el Código del Producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(Exception d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_busquedaActionPerformed

    private void comboAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAscActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboAscActionPerformed

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboOrdenarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        boolean abrir=true;
        try {
            //Buscar empleado
            if (this.txtCodI.getText()== null) {
                JOptionPane.showMessageDialog(null, "Ingresa un ID de insumo");
            } else {
                abrir=conexion.setEliminarRegistroEmpleado("insumos", "código", Integer.parseInt(this.txtCodI.getText()));
                JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente");
                tableBusqueda();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: \n" + e.getMessage());
        }

        Limpiar();
        EnablingReset();
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        try {
            conexion.setDescrIns(txtaDescripcionI.getText());
            conexion.setCostoIns(Float.parseFloat(txtCostoI.getText()));
            conexion.setUM_Ins(txtMedidaI.getText());
            conexion.setNmProvIns( txtProveedorI.getText());
            conexion.setCntProvIns(txtContacto.getText());
            conexion.setTelProvIns(txtTelefono.getText());
            conexion.setStockProvIns(Integer.parseInt(txtStockI.getText()));
            conexion.getUpdateInsumos(Integer.parseInt(this.txtCodI.getText()));
            tableBusqueda();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
        Limpiar();
        EnablingReset();
    }//GEN-LAST:event_editarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        int exist=0;

        String cadena;
        float costo=0;
        float tot;
        if(txtCodI.getText().compareTo("")!=0 && txtaDescripcionI.getText().compareTo("")!=0 && txtStockI.getText().compareTo("")!=0
            && txtMedidaI.getText().compareTo("")!=0 && txtCostoI.getText().compareTo("")!=0 && txtProveedorI.getText().compareTo("")!=0
            && txtContacto.getText().compareTo("")!=0 && txtTelefono.getText().compareTo("")!=0){
            try{
                cadena=txtCostoI.getText();
                exist=Integer.parseInt(this.txtStockI.getText());
                costo=Float.parseFloat(cadena);}
            catch(Exception e){JOptionPane.showInputDialog(null,"Error","Ingrese completamentes los valores.");}
            tot=exist*costo;
            
            try {
                conexion.setCodigoIns(Integer.parseInt(txtCodI.getText()));
                conexion.setDescrIns(txtaDescripcionI.getText());
                conexion.setCostoIns(Float.parseFloat(txtCostoI.getText()));
                conexion.setUM_Ins(txtMedidaI.getText());
                conexion.setNmProvIns( txtProveedorI.getText());
                conexion.setCntProvIns(txtContacto.getText());
                conexion.setTelProvIns(txtTelefono.getText());
                conexion.setStockProvIns(Integer.parseInt(txtStockI.getText()));
                conexion.setInsumos();
                Limpiar();
                tableBusqueda();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }

        }else{
            JOptionPane.showMessageDialog(null, "Error; Faltan Datos");
        }
        EnablingReset();
    }//GEN-LAST:event_agregarActionPerformed

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtProveedorIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorIKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtProveedorIKeyTyped

    private void txtCostoIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoIKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCostoIKeyTyped

    private void txtCostoIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoIActionPerformed

    }//GEN-LAST:event_txtCostoIActionPerformed

    private void txtMedidaIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedidaIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedidaIKeyTyped

    private void txtMedidaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedidaIActionPerformed
        try{
            float a= Float.parseFloat(this.txtCostoI.getText());
            float b=Float.parseFloat(this.txtStockI.getText());
            
        }catch(Exception a){
        }
    }//GEN-LAST:event_txtMedidaIActionPerformed

    private void txtStockIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockIKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        int CharLong=10;
        try{
            a=Integer.parseInt(String.valueOf(c));
            if(String.valueOf(c).length()>CharLong){
                getToolkit().beep();
                evt.consume();
            }
        }catch(Exception e){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtStockIKeyTyped

    private void txtCodIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodIKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCodIKeyTyped

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
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Costo");
        modelo.addColumn("Unidad de medida");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Contacto");
        modelo.addColumn("Telefono");
        modelo.addColumn("Stock");
        String por= comboOrdenar.getSelectedItem().toString();
        String order;
        if(comboAsc.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getInsumos(por, order);
            while(rs.next()){
                Object []ob=new Object[8];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getInt(1));
            ob[1]=(rs.getString(2));
            ob[2]=(rs.getString(3));
            ob[3]=(rs.getString(4));
            ob[4]=(rs.getString(5));
            ob[5]=(rs.getString(6));
            ob[6]=(rs.getString(7));
            ob[7]=(rs.getString(8));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            Logger.getLogger(Insumos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JToggleButton busqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nuevo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodI;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCostoI;
    private javax.swing.JTextField txtMedidaI;
    private javax.swing.JTextField txtProveedorI;
    private javax.swing.JTextField txtStockI;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextArea txtaDescripcionI;
    // End of variables declaration//GEN-END:variables
}
