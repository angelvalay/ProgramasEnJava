
package AreaComercial;

import AdministracionTotal.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {
    public static Conexion conexion= new Conexion();

    public Clientes() {
        this.setBackground(Color.WHITE);
        
        initComponents();
        enablingReset();
        setModelo();
        
    }
    
    private void enablingReset(){
        activarCampos(false);
        txtNumC.setEnabled(true);
        busqueda.setEnabled(true);
        BtnNuevo.setEnabled(true);
        BtnAgregar.setEnabled(false);
        BtnEditar.setEnabled(false);
        BtnEliminar.setEnabled(false);
        BtnCancelar.setEnabled(false);
    }
    
    public static void activarCampos(boolean t)
    {
        txtNombreC.setEnabled(t);
        txtNumC.setEnabled(t);
        txtPaisC.setEnabled(t);
        txtCiudadC.setEnabled(t); 
        txtContactoC.setEnabled(t);
        txtEstadoC.setEnabled(t);
        txtTelefonoC.setEnabled(t);
        txtDireccionC.setEnabled(t);
    }
    
    public void EstadoBoton(boolean b)
    {
        BtnNuevo.setEnabled(!b);
        BtnAgregar.setEnabled(b);
        BtnCancelar.setEnabled(b);
        busqueda.setEnabled(!b);
        BtnEditar.setEnabled(!b);
        BtnEliminar.setEnabled(!b);


    }

    public void Limpiar()
    {
        txtNumC.setText("");
        txtNombreC.setText("");
        txtPaisC.setText("");
        txtContactoC.setText("");
        txtEstadoC.setText("");
        txtCiudadC.setText("");
        txtTelefonoC.setText("");
        txtDireccionC.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionC = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtContactoC = new javax.swing.JTextField();
        txtPaisC = new javax.swing.JTextField();
        txtEstadoC = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JFormattedTextField();
        txtCiudadC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ident = new javax.swing.JComboBox();
        busqueda = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 630));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("No.");

        txtNumC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNumC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCActionPerformed(evt);
            }
        });
        txtNumC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Contacto:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Pais:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Direccion:");

        txtDireccionC.setColumns(20);
        txtDireccionC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtDireccionC.setRows(5);
        txtDireccionC.setEnabled(false);
        jScrollPane1.setViewportView(txtDireccionC);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Clientes");

        txtNombreC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombreC.setEnabled(false);
        txtNombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCKeyTyped(evt);
            }
        });

        txtContactoC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtContactoC.setEnabled(false);
        txtContactoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoCKeyTyped(evt);
            }
        });

        txtPaisC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPaisC.setEnabled(false);
        txtPaisC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisCKeyTyped(evt);
            }
        });

        txtEstadoC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEstadoC.setEnabled(false);
        txtEstadoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoCKeyTyped(evt);
            }
        });

        try {
            txtTelefonoC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoC.setEnabled(false);
        txtTelefonoC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtTelefonoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoCKeyTyped(evt);
            }
        });

        txtCiudadC.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCiudadC.setEnabled(false);
        txtCiudadC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadCKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("¿Presento identificacion? ");

        ident.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ident.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sí", "No" }));

        busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        busqueda.setBorderPainted(false);
        busqueda.setContentAreaFilled(false);
        busqueda.setFocusable(false);
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(254, 254, 254)
                                        .addComponent(jLabel8))))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNumC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(busqueda))
                                    .addComponent(txtContactoC, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtEstadoC)
                            .addComponent(txtPaisC)
                            .addComponent(txtCiudadC))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busqueda)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCiudadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContactoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(ident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPaisC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Ver clientes");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Ordenar por:");

        comboOrdenar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NúmeroCliente", "nombre", "contacto", "teléfono", "país", "estado", "ciudad", "domicilio", "IFE" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("de forma ");

        comboAsc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendiente", "Descendiente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        tablaClientes.setBackground(new java.awt.Color(0, 153, 153));
        tablaClientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaClientes.setGridColor(new java.awt.Color(102, 255, 204));
        tablaClientes.setSelectionBackground(new java.awt.Color(204, 255, 0));
        tablaClientes.setSelectionForeground(new java.awt.Color(0, 102, 0));
        jScrollPane2.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        BtnNuevo.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnNuevo.setForeground(new java.awt.Color(102, 255, 204));
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnAgregar.setBackground(new java.awt.Color(0, 102, 102));
        BtnAgregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(51, 255, 204));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setEnabled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEditar.setBackground(new java.awt.Color(0, 102, 102));
        BtnEditar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(51, 255, 204));
        BtnEditar.setText("Editar");
        BtnEditar.setEnabled(false);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(0, 102, 102));
        BtnEliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(102, 255, 204));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setEnabled(false);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        BtnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(51, 255, 204));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setEnabled(false);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnNuevo)
                .addGap(21, 21, 21)
                .addComponent(BtnAgregar)
                .addGap(18, 18, 18)
                .addComponent(BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        try {
            conexion.setNumClient(Integer.parseInt(txtNumC.getText()));
            conexion.setNomCient(txtNombreC.getText());
            conexion.setContClient(txtContactoC.getText());
            conexion.setTelClient(txtTelefonoC.getText());  
            conexion.setPaísClient(txtPaisC.getText());
            conexion.setEstClient(txtEstadoC.getText());
            conexion.setCiudClient(txtCiudadC.getText());
            conexion.setDomClient(txtDireccionC.getText());
            conexion.setIFEClient(ident.getSelectedItem().toString());
            conexion.getUpdateCliente(Integer.parseInt(this.txtNumC.getText()));
            setModelo();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
        }
        Limpiar();
        enablingReset();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void txtCiudadCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadCKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtCiudadCKeyTyped

    private void txtTelefonoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoCKeyTyped
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
    }//GEN-LAST:event_txtTelefonoCKeyTyped

    private void txtEstadoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoCKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEstadoCKeyTyped

    private void txtPaisCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisCKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtPaisCKeyTyped

    private void txtContactoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoCKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtContactoCKeyTyped

    private void txtNombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtNombreCKeyTyped

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Limpiar();
        activarCampos(false);
        enablingReset();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        conexion.setEliminarRegistro("clientes", "NúmeroCliente", Integer.parseInt(this.txtNumC.getText()),"ventas","NúmeroCliente");
        setModelo();
        Limpiar();
        enablingReset();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        if(txtNumC.getText().compareTo("")!=0 && txtNombreC.getText().compareTo("")!=0 && txtContactoC.getText().compareTo("")!=0
            && txtPaisC.getText().compareTo("")!=0 && txtTelefonoC.getText().compareTo("")!=0 && txtEstadoC.getText().compareTo("")!=0
            && txtDireccionC.getText().compareTo("")!=0 && txtCiudadC.getText().compareTo("")!=0){

             try {
                conexion.setNumClient(Integer.parseInt(txtNumC.getText()));
                conexion.setNomCient(txtNombreC.getText());
                conexion.setContClient(txtContactoC.getText());
                conexion.setTelClient(txtTelefonoC.getText());  
                conexion.setPaísClient(txtPaisC.getText());
                conexion.setEstClient(txtEstadoC.getText());
                conexion.setCiudClient(txtCiudadC.getText());
                conexion.setDomClient(txtDireccionC.getText());
                conexion.setIFEClient(ident.getSelectedItem().toString());
                conexion.getCliente();
                setModelo();
                 //Generar tabla de clientes
                Limpiar();
                enablingReset();
                 } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifica bien los datos. ",null,JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Error; Faltan Datos");
        }
        
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    
    
    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed

        EstadoBoton(true);
        activarCampos(true);
        Limpiar();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void txtNumCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCKeyTyped
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
    }//GEN-LAST:event_txtNumCKeyTyped

    private void txtNumCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCActionPerformed

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        setModelo();
    }//GEN-LAST:event_comboOrdenarActionPerformed

    private void comboAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAscActionPerformed
        setModelo();
    }//GEN-LAST:event_comboAscActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        try{
            int cod= Integer.parseInt(txtNumC.getText());
            ResultSet rs=conexion.setBusqueda("clientes", "NúmeroCliente", cod);
            if(rs.next()){
                Clientes.txtNombreC.setText(rs.getString(2));
                Clientes.txtContactoC.setText(rs.getString(3));
                Clientes.txtTelefonoC.setText(rs.getString(4));
                Clientes.txtPaisC.setText(rs.getString(5));
                Clientes.txtEstadoC.setText(rs.getString(6));
                Clientes.txtCiudadC.setText(rs.getString(7));
                Clientes.txtDireccionC.setText(rs.getString(8));
                String ife=rs.getString(9);
                if ("Sí".equals(ife)){
                    this.ident.setSelectedIndex(0);
                }else{
                    this.ident.setSelectedIndex(1);
                }
                this.BtnNuevo.setEnabled(false);
                this.BtnAgregar.setEnabled(false);
                this.BtnEditar.setEnabled(true);
                this.BtnEliminar.setEnabled(true);
                BtnCancelar.setEnabled(true);
                this.activarCampos(true);
                txtNumC.setEnabled(false);
            }else{
                txtNumC.setText("");
                JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Clente" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_busquedaActionPerformed

    private void setModelo (){
        DefaultTableModel modelo = new DefaultTableModel(){
            //TE PERMITE MODIFICAR LA ESTRUCTURA DE LA TABLA
            //NO SE PUEDE EDITAR LA TABLA
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("NO.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Contacto");
        modelo.addColumn("Teléfono");
        modelo.addColumn("País");
        modelo.addColumn("Estado");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Domicilio");
        modelo.addColumn("IFE");
        String por= comboOrdenar.getSelectedItem().toString();
        String order;
        if(comboAsc.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getCliente(por, order);
            while(rs.next()){
                Object []ob=new Object[9];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getInt(1));
            ob[1]=(rs.getString(2));
            ob[2]=(rs.getString(3));
            ob[3]=(rs.getString(4));
            ob[4]=(rs.getString(5));
            ob[5]=(rs.getString(6));
            ob[6]=(rs.getString(7));
            ob[7]=(rs.getString(8));
            ob[8]=(rs.getString(9));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        tablaClientes.setModel(modelo);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JToggleButton busqueda;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    private javax.swing.JComboBox ident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaClientes;
    private static javax.swing.JTextField txtCiudadC;
    private static javax.swing.JTextField txtContactoC;
    private static javax.swing.JTextArea txtDireccionC;
    private static javax.swing.JTextField txtEstadoC;
    private static javax.swing.JTextField txtNombreC;
    private static javax.swing.JTextField txtNumC;
    private static javax.swing.JTextField txtPaisC;
    private static javax.swing.JFormattedTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}
