
package AreaDeRecursosHumanos;


import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import AdministracionTotal.Conexion;
import AdministracionTotal.InicioAdmin;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Empleados extends javax.swing.JDialog {

    private Conexion conexion= new Conexion();
    private FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivo de imagen","jpg");
    
    public Empleados( /*java.awt.Frame parent*/) {
        //super(parent, true);
        initComponents();
        id.setEnabled(true);
        
        tableBusqueda();
        setLocationRelativeTo(this);
        
    }     

    public Empleados(InicioAdmin aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private boolean verificacion(){
        boolean x= true;
        if(id.getText()==null) x= false;
        else if (txtNombreE.getText()==null) x=false;
        else if (txtApellidoE.getText()==null) x= false;
        else if (txtEdadE.getText()==null) x= false;
        else if (txtEmailE.getText()==null) x= false;
        else if (txtTelefonoE.getText()==null) x= false;
        else if (dom.getText()==null) x= false;
        else if (mas.isSelected()==false) x=false;
        else if (fem.isSelected()==false) x=false;
        else x=true;       
        return x;
    }
    
    private void Limpiar()
    {
        
        id.setText("");
        antiguedad.setText("");
        txtNombreE.setText("");
        txtApellidoE.setText("");
        txtEdadE.setText("");
        txtEmailE.setText("");
        txtTelefonoE.setText("");
        dom.setText("");
        mas.setSelected(false);
        fem.setSelected(false);
        antiguedad.setText("");
        sueldo.setText("");
    }
    
 private void EstadoBoton(boolean b)
    {
        BtnNuevoE.setEnabled(!b);
        BtnEditarE.setEnabled(!b);
        BtnEliminarE.setEnabled(!b);
        this.BtnNuevoE.setEnabled(!b);

    }
 private void activarCampos(boolean t)
    {
        id.setEnabled(true);
        txtNombreE.setEnabled(t);
        txtApellidoE.setEnabled(t);
        txtEdadE.setEnabled(t);
        mas.setEnabled(t);
        fem.setEnabled(t);
        txtEmailE.setEnabled(t);
        txtTelefonoE.setEnabled(t);
        dom.setEnabled(t);
        antiguedad.setEnabled(t);
        Puesto.setEnabled(t);
        sueldo.setEnabled(t);
    }
   private boolean sexo(){
        boolean muestra = true;
        if(mas.isSelected()==true){ 
            fem.setSelected(false);
            muestra=true;
        }
        else if (mas.isSelected()==false && fem.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Verfica tu sexo..","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else if (fem.isSelected()==true){ 
            mas.setSelected(false);
            muestra=false;
        }
        return muestra;
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bus = new javax.swing.JToggleButton();
        fem = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Puesto = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mas = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        BtnNuevoE = new javax.swing.JButton();
        BtnEditarE = new javax.swing.JButton();
        BtnEliminarE = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        Empleados = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdadE = new javax.swing.JTextField();
        antiguedad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmailE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dom = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("ID.Empleado:");

        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        id.setCaretColor(new java.awt.Color(51, 51, 51));
        id.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        id.setDragEnabled(true);
        id.setOpaque(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        bus.setBackground(new java.awt.Color(255, 255, 255));
        bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        bus.setBorder(null);
        bus.setBorderPainted(false);
        bus.setContentAreaFilled(false);
        bus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });

        fem.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fem.setText("Femenino");
        fem.setContentAreaFilled(false);
        fem.setEnabled(false);
        fem.setFocusPainted(false);
        fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Puesto a Ocupar:");

        Puesto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Puesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asistentes o Secretaria", "Recepcionista", "Mensajero", "Obreros", "Personal de intendencia" }));
        Puesto.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombreE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNombreE.setEnabled(false);
        txtNombreE.setName(""); // NOI18N
        txtNombreE.setOpaque(false);
        txtNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEActionPerformed(evt);
            }
        });
        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        txtApellidoE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApellidoE.setEnabled(false);
        txtApellidoE.setOpaque(false);
        txtApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        mas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        mas.setText("Masculino");
        mas.setContentAreaFilled(false);
        mas.setEnabled(false);
        mas.setFocusPainted(false);
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoE)
                                .addComponent(txtNombreE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(mas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fem)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(Puesto, 0, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas)
                    .addComponent(fem)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        BtnNuevoE.setBackground(new java.awt.Color(0, 102, 102));
        BtnNuevoE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnNuevoE.setForeground(new java.awt.Color(102, 255, 204));
        BtnNuevoE.setText("Nuevo");
        BtnNuevoE.setBorderPainted(false);
        BtnNuevoE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEActionPerformed(evt);
            }
        });

        BtnEditarE.setBackground(new java.awt.Color(0, 102, 102));
        BtnEditarE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnEditarE.setForeground(new java.awt.Color(51, 255, 204));
        BtnEditarE.setText("Editar");
        BtnEditarE.setBorderPainted(false);
        BtnEditarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEditarE.setEnabled(false);
        BtnEditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarEActionPerformed(evt);
            }
        });

        BtnEliminarE.setBackground(new java.awt.Color(0, 102, 102));
        BtnEliminarE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnEliminarE.setForeground(new java.awt.Color(51, 255, 204));
        BtnEliminarE.setText("Eliminar");
        BtnEliminarE.setBorderPainted(false);
        BtnEliminarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarE.setEnabled(false);
        BtnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarEActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 102, 102));
        cancel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 255, 204));
        cancel.setText("Cancelar");
        cancel.setBorderPainted(false);
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(0, 102, 102));
        Registro.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Registro.setForeground(new java.awt.Color(51, 255, 204));
        Registro.setText("Añadir");
        Registro.setBorderPainted(false);
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.setEnabled(false);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminarE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnNuevoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNuevoE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEditarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Ordenar por");

        comboOrdenar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NúmeroEmpleado", "nombre", "apellidos", "puesto", "antigüedad", "sueldo", "sexo", "edad", "domicilio", "e_mail" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("de forma");

        comboAsc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        Empleados.setBackground(new java.awt.Color(0, 153, 153));
        Empleados.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Empleados.setForeground(new java.awt.Color(255, 255, 255));
        Empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        Empleados.setGridColor(new java.awt.Color(51, 255, 204));
        Empleados.setSelectionBackground(new java.awt.Color(204, 255, 0));
        Empleados.setSelectionForeground(new java.awt.Color(0, 102, 51));
        jScrollPane3.setViewportView(Empleados);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Registro de empleados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Telefono:");

        txtTelefonoE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtTelefonoE.setOpaque(false);
        txtTelefonoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Edad:");

        txtEdadE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEdadE.setEnabled(false);
        txtEdadE.setOpaque(false);
        txtEdadE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadEActionPerformed(evt);
            }
        });
        txtEdadE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadEKeyTyped(evt);
            }
        });

        antiguedad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        antiguedad.setEnabled(false);
        antiguedad.setOpaque(false);
        antiguedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antiguedadKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Antiguedad:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Email:");

        txtEmailE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEmailE.setEnabled(false);
        txtEmailE.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Sueldo:");

        sueldo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sueldo.setEnabled(false);
        sueldo.setOpaque(false);
        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Domicilio:");

        dom.setColumns(20);
        dom.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dom.setRows(5);
        dom.setBorder(null);
        dom.setEnabled(false);
        dom.setOpaque(false);
        jScrollPane1.setViewportView(dom);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Empleados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel13)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAscActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboAscActionPerformed

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboOrdenarActionPerformed

    private void BtnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarEActionPerformed
       boolean a = false;
        try {
           a=conexion.setEliminarRegistroEmpleado("empleados", "NúmeroEmpleado", Integer.parseInt(id.getText()));
           this.activarCampos(false);
            this.Limpiar();
            id.setEnabled(true);
            bus.setEnabled(true);
            Registro.setEnabled(false);
            BtnEliminarE.setEnabled(false);
            BtnEditarE.setEnabled(false);
            BtnNuevoE.setEnabled(true);
            tableBusqueda();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        if(!a)Limpiar();
    }//GEN-LAST:event_BtnEliminarEActionPerformed

    private void BtnEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarEActionPerformed
        char sexo;
        try {
            if(Integer.parseInt(txtEdadE.getText())<50){
            if(Integer.parseInt(this.txtEdadE.getText())>18 &&Integer.parseInt(this.antiguedad.getText())<=(
                    Integer.parseInt(this.txtEdadE.getText())-18)&&Integer.parseInt(this.antiguedad.getText())
                    >=0){
            
            conexion.setNombre(txtNombreE.getText());
            conexion.setApellidos(txtApellidoE.getText());
            conexion.setPuesto(Puesto.getSelectedItem().toString());
            conexion.setAntiguedad(Integer.parseInt(antiguedad.getText()));
            conexion.setSueldo(Float.parseFloat(sueldo.getText()));
            conexion.setTelefono(txtTelefonoE.getText());
            if(sexo()==true){
                sexo='M';
            }else {
                sexo='F';
            }
            
            //validar edad con antiguedad que no sea menor a 18 años
            conexion.setSexo(sexo);
            conexion.setEdad(Integer.parseInt(txtEdadE.getText()));
            conexion.setDomicilio(dom.getText());
            conexion.setEmail(txtEmailE.getText());
            conexion.getUpdateEmp(Integer.parseInt(this.id.getText()));
            tableBusqueda();
            this.activarCampos(false);
            this.Limpiar();
            id.setEnabled(true);
            bus.setEnabled(true);
            Registro.setEnabled(false);
            BtnEliminarE.setEnabled(false);
            BtnEditarE.setEnabled(false);
            BtnNuevoE.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Verifica los datos.\n Checa que tus datos esten bien escritos." ,null,JOptionPane.WARNING_MESSAGE);
            }
            }else{
                JOptionPane.showMessageDialog(null, "Verifica los datos. \n Solo mayores >= 18 y <50 años de edad" ,null,JOptionPane.WARNING_MESSAGE);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los datos: " + e.getMessage());
        }
        
    }//GEN-LAST:event_BtnEditarEActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed

        char sexo;
        try{
            if(Integer.parseInt(this.txtEdadE.getText())>18 &&Integer.parseInt(this.antiguedad.getText())<=(
                    Integer.parseInt(this.txtEdadE.getText())-18)&&Integer.parseInt(this.antiguedad.getText())
                    >0){
            conexion.setNumEmp(Integer.parseInt(id.getText()));
            conexion.setNombre(txtNombreE.getText());
            conexion.setApellidos(txtApellidoE.getText());
            conexion.setPuesto(Puesto.getSelectedItem().toString());
            conexion.setAntiguedad(Integer.parseInt(antiguedad.getText()));
            conexion.setSueldo(Float.parseFloat(sueldo.getText()));
            conexion.setTelefono(txtTelefonoE.getText());
            if(sexo()==true){
                sexo='M';
            }else {
                sexo='F';
            }
            //validar edad con antiguedad que no sea menor a 18 años
            conexion.setSexo(sexo);
            conexion.setEdad(Integer.parseInt(txtEdadE.getText()));
            conexion.setDomicilio(dom.getText());
            conexion.setEmail(txtEmailE.getText());
            conexion.getEmpleados();
            tableBusqueda();
            this.Limpiar();
            this.activarCampos(false);
            Registro.setEnabled(false);
            BtnNuevoE.setEnabled(true);
            bus.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Verifica los datos." ,null,JOptionPane.WARNING_MESSAGE);
                bus.setEnabled(true);
            }
        }catch(Exception a){
            this.Limpiar();
            Registro.setEnabled(false);
            BtnNuevoE.setEnabled(true);
            this.activarCampos(false);
            JOptionPane.showMessageDialog(this, a.getMessage(), "Empleados ", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_RegistroActionPerformed

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
        EstadoBoton(true);
        activarCampos(true);
        Limpiar();
        Registro.setEnabled(true);
        this.BtnNuevoE.setEnabled(false);
        bus.setEnabled(false);
    }//GEN-LAST:event_BtnNuevoEActionPerformed

    private void antiguedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_antiguedadKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_antiguedadKeyTyped

    private void sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_sueldoKeyTyped

    private void txtEdadEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadEKeyTyped
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
    }//GEN-LAST:event_txtEdadEKeyTyped

    private void txtEdadEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadEActionPerformed
        try{
            int a= Integer.parseInt(txtEdadE.toString());
            if(a<18){
                /*ERROR4.setVisible(true);
                ERROR4.setText("SOLO >18 ");*/
            }
        }catch(Exception a){

        }
    }//GEN-LAST:event_txtEdadEActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        fem.setSelected(false);
    }//GEN-LAST:event_masActionPerformed

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreEKeyTyped

    private void femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femActionPerformed
        mas.setSelected(false);
    }//GEN-LAST:event_femActionPerformed

    private void txtApellidoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoEKeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c=evt.getKeyChar();
        int CharLong=10;
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
        if("-".equals(String.valueOf(c))||"'".equals(String.valueOf(c))||"+".equals(String.valueOf(c))
            ||"/".equals(String.valueOf(c))||".".equals(String.valueOf(c))||"*".equals(String.valueOf(c))
            ||"|".equals(String.valueOf(c))||"{".equals(String.valueOf(c))||"}".equals(String.valueOf(c)))
        //AGREGAR MAS CARACTERES
        {
            getToolkit().beep();
            evt.consume();
        }
        if(id.getText().length()>CharLong ){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        try{
        int cod= Integer.parseInt(id.getText());
        ResultSet rs=conexion.setBusqueda("empleados", "NúmeroEmpleado", cod);
        if(rs.next()){
            this.txtNombreE.setText(rs.getString(2));
            this.txtApellidoE.setText(rs.getString(3));
            this.Puesto.setSelectedItem(rs.getString(4));
            this.antiguedad.setText(String.valueOf(rs.getInt(5)));
            this.sueldo.setText(String.valueOf(rs.getFloat(6)));
            this.txtTelefonoE.setText(rs.getString(7));
            String sexo= rs.getString(8);
            if("M".equals(sexo)){
                this.mas.setSelected(true);
                this.fem.setSelected(false);
                
            }else {
                this.fem.setSelected(true);
                this.mas.setSelected(false);
            }
            this.txtEdadE.setText(String.valueOf(rs.getInt(9)));
            this.dom.setText(rs.getString(10));
            this.txtEmailE.setText(rs.getString(11));   
            this.BtnNuevoE.setEnabled(false);
            this.Registro.setEnabled(false);
            this.BtnEditarE.setEnabled(true);
            this.BtnEliminarE.setEnabled(true);
            id.setEnabled(false);
            bus.setEnabled(false);
            this.activarCampos(true);
        }else{
            id.setText("");
            this.activarCampos(false);
            JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Empleados" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
            this.Limpiar();
            id.setEnabled(true);
        }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
            id.setEnabled(true);
            this.Limpiar();
            this.activarCampos(false);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
            this.Limpiar();
            id.setEnabled(true);
            this.activarCampos(false);
        }
       
    }//GEN-LAST:event_busActionPerformed

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       this.activarCampos(false);
       this.Limpiar();
       id.setEnabled(true);
       bus.setEnabled(true);
       Registro.setEnabled(false);
       BtnEliminarE.setEnabled(false);
       BtnEditarE.setEnabled(false);
       BtnNuevoE.setEnabled(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void txtTelefonoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        int CharLong=12;
        try{
            a=Integer.parseInt(String.valueOf(c));
            
            if(txtTelefonoE.getText().length()>=CharLong){
                getToolkit().beep();
                evt.consume(); 
            }
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
    }//GEN-LAST:event_txtTelefonoEKeyTyped

        
    public void tableBusqueda(){
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
        modelo.addColumn("Apellidos");
        modelo.addColumn("Puesto");
        modelo.addColumn("Antiguedad");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Email");
        String por= comboOrdenar.getSelectedItem().toString();
        String order;
        if(comboAsc.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getBusquedaEmp(por, order);
            while(rs.next()){
                Object []ob=new Object[11];//Crea un vector
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
            ob[9]=(rs.getString(10));
            ob[10]=(rs.getString(11));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosLista.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Empleados.setModel(modelo);
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditarE;
    private javax.swing.JButton BtnEliminarE;
    private javax.swing.JButton BtnNuevoE;
    private javax.swing.JTable Empleados;
    private javax.swing.JComboBox Puesto;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField antiguedad;
    private javax.swing.JToggleButton bus;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    private javax.swing.JTextArea dom;
    private javax.swing.JRadioButton fem;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton mas;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtEmailE;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefonoE;
    // End of variables declaration//GEN-END:variables
}
