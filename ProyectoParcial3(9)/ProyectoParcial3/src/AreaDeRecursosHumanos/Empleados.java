
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


public class Empleados extends javax.swing.JFrame {

    private Conexion conexion= new Conexion();
    private FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivo de imagen","jpg");
    String rutaimagen;
    public Empleados() {
        initComponents();
        id.setEnabled(true);
        rutaimagen="";
        tableBusqueda();
        setLocationRelativeTo(this);
        
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
        icn.setIcon(null);
        rutaimagen="";
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
        id.setEnabled(t);
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

        jPanel1 = new javax.swing.JPanel();
        Puesto = new javax.swing.JComboBox();
        txtEmailE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fem = new javax.swing.JRadioButton();
        txtNombreE = new javax.swing.JTextField();
        mas = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtEdadE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        antiguedad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        icn = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        buscaimagen = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dom = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        Empleados = new javax.swing.JTable();
        BtnNuevoE = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        BtnEditarE = new javax.swing.JButton();
        BtnEliminarE = new javax.swing.JButton();
        txtTelefonoE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setName("Empleados"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 550));

        Puesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asistentes o Secretaria", "Recepcionista", "Mensajero", "Obreros", "Personal de intendencia" }));
        Puesto.setEnabled(false);

        txtEmailE.setEnabled(false);

        jLabel8.setText("Domicilio:");

        jLabel9.setText("Email:");

        jLabel6.setText("Puesto a Ocupar:");

        id.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153))));
        id.setDragEnabled(true);
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

        jLabel1.setText("ID.Empleado");

        jLabel5.setText("Sexo:");

        txtApellidoE.setEnabled(false);
        txtApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellido:");

        fem.setText("Femenino");
        fem.setContentAreaFilled(false);
        fem.setFocusPainted(false);
        fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femActionPerformed(evt);
            }
        });

        txtNombreE.setEnabled(false);
        txtNombreE.setName(""); // NOI18N
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

        mas.setText("Masculino");
        mas.setContentAreaFilled(false);
        mas.setFocusPainted(false);
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtEdadE.setEnabled(false);
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

        jLabel4.setText("Edad:");

        jLabel7.setText("Telefono:");

        jLabel11.setText("Sueldo:");

        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
            }
        });

        jLabel10.setText("Antiguedad:");

        antiguedad.setEnabled(false);
        antiguedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                antiguedadKeyTyped(evt);
            }
        });

        jLabel13.setText("Foto de Perfil");
        jLabel13.setEnabled(false);

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imagen.setFocusable(false);

        icn.setText("ESTA FUNCION NO ESTA DISPONIBLE");
        icn.setEnabled(false);

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icn, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icn, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        buscaimagen.setText("Busca Imagen");
        buscaimagen.setEnabled(false);
        buscaimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaimagenActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        dom.setColumns(20);
        dom.setRows(5);
        dom.setEnabled(false);
        jScrollPane1.setViewportView(dom);

        jLabel14.setText("Ver empleados");

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NúmeroEmpleado", "nombre", "apellidos", "puesto", "antigüedad", "sueldo", "sexo", "edad", "domicilio", "e_mail" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel17.setText("Ordenar Por:");

        jLabel18.setText("De Forma:");

        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        Empleados.setForeground(new java.awt.Color(0, 51, 102));
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
        jScrollPane3.setViewportView(Empleados);

        BtnNuevoE.setText("Nuevo");
        BtnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEActionPerformed(evt);
            }
        });

        Registro.setText("Registrar");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        BtnEditarE.setText("Editar");
        BtnEditarE.setEnabled(false);
        BtnEditarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarEActionPerformed(evt);
            }
        });

        BtnEliminarE.setText("Eliminar");
        BtnEliminarE.setEnabled(false);
        BtnEliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(414, 414, 414)
                .addComponent(jLabel13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefonoE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(mas)
                            .addGap(18, 18, 18)
                            .addComponent(fem))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14)
                .addGap(375, 375, 375)
                .addComponent(BtnNuevoE)
                .addGap(6, 6, 6)
                .addComponent(Registro)
                .addGap(18, 18, 18)
                .addComponent(BtnEditarE)
                .addGap(6, 6, 6)
                .addComponent(BtnEliminarE)
                .addGap(81, 81, 81)
                .addComponent(buscaimagen)
                .addGap(4, 4, 4)
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17)
                .addGap(4, 4, 4)
                .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel18)
                .addGap(4, 4, 4)
                .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jToggleButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(mas)
                            .addComponent(fem))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(9, 9, 9)
                        .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(BtnNuevoE)
                    .addComponent(Registro)
                    .addComponent(BtnEditarE)
                    .addComponent(BtnEliminarE)
                    .addComponent(buscaimagen)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaimagenActionPerformed
        //Crear un object de JFIle Chosser
        JFileChooser dig= new JFileChooser();
        //Del objecto creado vamos a llamar al metodo setFileChooser
        dig.setFileFilter(filter);
        //abrimemos la ventana de dialogo parta escojer la imagen
        int opc= dig.showOpenDialog(this);
        //si hacemos click el bton de abrir
        if(opc==JFileChooser.APPROVE_OPTION){
            //obtener el nombre del archivo
            String fil=dig.getSelectedFile().getPath();
            //obtener la direccion dnde se guarda la imagen
            String file=dig.getSelectedFile().toString();
            icn.setIcon(new ImageIcon(fil));
            //Modificamos la imagen
            ImageIcon icon = new ImageIcon(fil);
            //extraer la imagen de icono
            Image img = icon.getImage();
            //cambiando tamaño a nuestra imagen
            Image newIcon= img.getScaledInstance(150, 125, java.awt.Image.SCALE_SMOOTH);
            //se genera la imagen de icono con la new
            ImageIcon neWIcon= new ImageIcon(newIcon);
            icn.setIcon(neWIcon);
            imagen.setSize(266,235);
            ruta.setText(fil);
            rutaimagen="";

        }
    }//GEN-LAST:event_buscaimagenActionPerformed

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
            tableBusqueda();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        if(!a)Limpiar();
    }//GEN-LAST:event_BtnEliminarEActionPerformed

    private void BtnEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarEActionPerformed
        char sexo;
        try {
            if(Integer.parseInt(this.txtEdadE.getText())>18 &&Integer.parseInt(this.antiguedad.getText())<=(
                    Integer.parseInt(this.txtEdadE.getText())-18)&&Integer.parseInt(this.antiguedad.getText())
                    >0){
            
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
            }else{
                JOptionPane.showMessageDialog(null, "Verifica los datos." ,null,JOptionPane.WARNING_MESSAGE);
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifica los datos: " + e.getMessage());
        }
        Limpiar();
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
            }else{
                JOptionPane.showMessageDialog(null, "Verifica los datos." ,null,JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception a){
            
            JOptionPane.showMessageDialog(this, a.getMessage(), "Empleados ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_RegistroActionPerformed

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
        EstadoBoton(true);
        activarCampos(true);
        Limpiar();
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
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
            this.activarCampos(true);
        }else{
            id.setText("");
            this.activarCampos(false);
            JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Empleados" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

        
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
    private javax.swing.JButton buscaimagen;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    private javax.swing.JTextArea dom;
    private javax.swing.JRadioButton fem;
    private javax.swing.JLabel icn;
    public static javax.swing.JTextField id;
    private javax.swing.JPanel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton mas;
    private javax.swing.JLabel ruta;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtEmailE;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefonoE;
    // End of variables declaration//GEN-END:variables
}
