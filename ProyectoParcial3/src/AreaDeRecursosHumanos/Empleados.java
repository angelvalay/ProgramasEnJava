
package AreaDeRecursosHumanos;


import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import AdministracionTotal.Conexion;
import AdministracionTotal.InicioAdmin;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Empleados extends javax.swing.JFrame {

    private Conexion conexion= new Conexion();
    private FileNameExtensionFilter filter= new FileNameExtensionFilter("Archivo de imagen","jpg");
    String rutaimagen;
    public Empleados() {
        initComponents();
        rutaimagen="";
        // llamar a CerrarVentana() solo cuando este esté lleno
        setLocationRelativeTo(this);
        
    }     
    private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
         cerrar();
       }
     });
    }
    private void cerrar(){
        boolean x= verificacion();
        if (x){
        InicioAdmin.jInternalFrame1.setVisible(false);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Tiene datos sin guardar, ¿desea continuar?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (a==JOptionPane.YES_OPTION){
                InicioAdmin.jInternalFrame1.setVisible(false);
            }else{
                
            }
        }
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
        txtNombreE.setText("");
        txtApellidoE.setText("");
        txtEdadE.setText("");
        txtEmailE.setText("");
        txtTelefonoE.setText("");
        dom.setText("");
        mas.setSelected(false);
        fem.setSelected(false);
    }
    
 private void EstadoBoton(boolean b)
    {
        BtnNuevoE.setEnabled(!b);
        BtnCancelar.setEnabled(b);
        BtnEditarE.setEnabled(!b);
        BtnEliminarE.setEnabled(!b);
        BtnMostrarE.setEnabled(!b);

    }
 private void activarCampos(boolean t)
    {
        txtNombreE.setEnabled(t);
        txtApellidoE.setEnabled(t);
        txtEdadE.setEnabled(t);
        mas.setEnabled(t);
        fem.setEnabled(t);
        txtEmailE.setEnabled(t);
        txtTelefonoE.setEnabled(t);
        dom.setEnabled(t);
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
   private void keyTypedNumber(KeyEvent ke) {
        char c=ke.getKeyChar();
        if(Character.isLetter(c)) {
              getToolkit().beep();
              ke.consume();
              ERROR.setText("Ingresa Solo Numeros");
          }
        
    }
   private void keyTypedLetter(KeyEvent ke) {
        char c=ke.getKeyChar();
         if(Character.isDigit(c)) {
            getToolkit().beep();
            ke.consume();
            ERROR.setText("Ingresa Solo Letras");
            }        
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNuevoE = new javax.swing.JButton();
        BtnEditarE = new javax.swing.JButton();
        BtnEliminarE = new javax.swing.JButton();
        BtnMostrarE = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        dom = new javax.swing.JTextArea();
        txtTelefonoE = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Anti = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        ERROR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        imagen = new javax.swing.JPanel();
        IMAGENPERFIL = new javax.swing.JLabel();
        buscaimagen = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnNuevoE.setText("Nuevo");
        BtnNuevoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoEActionPerformed(evt);
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

        BtnMostrarE.setText("Mostrar");
        BtnMostrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarEActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Borrar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        Registro.setText("Registrar");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setName("Empleados"); // NOI18N

        Puesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asistentes o Secretaria", "Recepcionista", "Mensajero", "Obreros", "Personal de intendencia" }));

        txtEmailE.setEnabled(false);

        jLabel8.setText("Domicilio:");

        jLabel9.setText("Email:");

        jLabel6.setText("Puesto a Ocupar:");

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

        jLabel3.setText("Apellido:");

        fem.setText("Femenino");
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

        mas.setText("Masculino");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtEdadE.setEnabled(false);
        txtEdadE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadEKeyTyped(evt);
            }
        });

        jLabel4.setText("Edad:");

        dom.setColumns(20);
        dom.setRows(5);
        jScrollPane1.setViewportView(dom);

        try {
            txtTelefonoE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoE.setText("(  )-     -    ");
        txtTelefonoE.setEnabled(false);
        txtTelefonoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEKeyTyped(evt);
            }
        });

        jLabel7.setText("Telefono:");

        jLabel10.setText("Antiguedad:");

        Anti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AntiKeyTyped(evt);
            }
        });

        jLabel11.setText("Sueldo:");

        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
            }
        });

        ERROR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        ERROR.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ERROR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreE)
                            .addComponent(txtApellidoE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anti, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Puesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mas)
                                .addGap(6, 6, 6)
                                .addComponent(fem))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(txtEmailE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(mas)
                    .addComponent(fem)
                    .addComponent(txtEdadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(Anti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtEmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ERROR, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Buscar Empleado");

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMAGENPERFIL, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMAGENPERFIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buscaimagen.setText("Busca Imagen");
        buscaimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaimagenActionPerformed(evt);
            }
        });

        jLabel12.setText("ID->");

        jLabel13.setText("Foto de Perfil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscaimagen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaimagen)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevoE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registro)
                        .addGap(28, 28, 28)
                        .addComponent(BtnEditarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminarE)
                        .addGap(14, 14, 14)
                        .addComponent(BtnMostrarE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnNuevoE)
                    .addComponent(Registro)
                    .addComponent(BtnEditarE)
                    .addComponent(BtnEliminarE)
                    .addComponent(BtnMostrarE)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoEActionPerformed
       EstadoBoton(true);
       activarCampos(true);
       Limpiar();
    }//GEN-LAST:event_BtnNuevoEActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
      cerrar();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEditarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarEActionPerformed
        // TODO add your handling code here:
         
           // try {
                
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
            /*} catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }*/
        Limpiar();
    }//GEN-LAST:event_BtnEditarEActionPerformed

    private void BtnEliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarEActionPerformed
        // TODO add your handling code here:
          
           try {
            //Buscar empleado
            //if (" Aqui Variable"== null) {
                JOptionPane.showMessageDialog(null, "No existe");
            //} else {
               //metodo elliminar empleado de BD
                //JOptionPane.showMessageDialog(null, "Se Elimino Exitosamente");
            //}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        Limpiar();
    }//GEN-LAST:event_BtnEliminarEActionPerformed

    private void BtnMostrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarEActionPerformed
        
    }//GEN-LAST:event_BtnMostrarEActionPerformed

    
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Limpiar();
        activarCampos(false);
        BtnCancelar.setEnabled(false);
        BtnEliminarE.setEnabled(false);
        BtnNuevoE.setEnabled(true);
        BtnMostrarE.setEnabled(true);
        BtnEditarE.setEnabled(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        
        char sexo;
        try{
            conexion.getNumEmp(Integer.parseInt(id.getText()));
            conexion.getNombre(txtNombreE.getText());
            conexion.getApellidos(txtApellidoE.getText());
            conexion.getPuesto(Puesto.getSelectedItem().toString());
            conexion.getAntiguedad(Integer.parseInt(Anti.getText()));
            conexion.getSueldo(Float.parseFloat(sueldo.getText()));
            conexion.getTelefono(txtTelefonoE.getText());
            if(sexo()==true){
                sexo='M';
            }else {
                sexo='F';
            }
            conexion.getSexo(sexo);
            conexion.getEdad(Integer.parseInt(txtEdadE.getText()));
            conexion.getDomicilio(dom.getText());
            conexion.getEmail(txtEmailE.getText());
            conexion.getEmpleados();
        }catch(Exception a){
            ERROR.setText("ERROR EN LOS DATOS");
        }
        System.out.println(conexion.setNumEmp());
        System.out.println(conexion.setNombre());
        System.out.println(conexion.setApellidos());
        System.out.println(conexion.setDomicilio());
        System.out.println(conexion.setSexo());
        System.out.println(conexion.setEmail());
        System.out.println(conexion.setTelefono());
    }//GEN-LAST:event_RegistroActionPerformed


    
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
            IMAGENPERFIL.setIcon(new ImageIcon(fil));
            //Modificamos la imagen
            ImageIcon icon = new ImageIcon(fil);
            //extraer la imagen de icono
            Image img = icon.getImage();
            //cambiando tamaño a nuestra imagen
            Image newIcon= img.getScaledInstance(265, 200, java.awt.Image.SCALE_SMOOTH);
            //se genera la imagen de icono con la new
            ImageIcon neWIcon= new ImageIcon(newIcon);
            IMAGENPERFIL.setIcon(neWIcon);
            IMAGENPERFIL.setSize(266,235);
            ruta.setText(fil);
            rutaimagen="";
            
        }
    }//GEN-LAST:event_buscaimagenActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        fem.setSelected(false);
    }//GEN-LAST:event_masActionPerformed

    private void femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femActionPerformed
        mas.setSelected(false);
    }//GEN-LAST:event_femActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
        try{
            if(Integer.parseInt(id.getText())>0)
           conexion.getNumEmp(Integer.parseInt(id.getText())); 
        }catch(Exception a){
            JOptionPane.showMessageDialog(this, "ERROR EN EL TIPO DE DATO "+ a.getMessage(),"ERROR", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_idActionPerformed

    private void txtNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c=evt.getKeyChar();
           if(Character.isLetter(c)) {
             if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
              getToolkit().beep();
              evt.consume();
              ERROR.setText("Ingresa Solo Numeros");
             } 
          }
    }//GEN-LAST:event_idKeyTyped

    private void txtEdadEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadEKeyTyped
        this.keyTypedNumber(evt);
    }//GEN-LAST:event_txtEdadEKeyTyped

    private void AntiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AntiKeyTyped
        this.keyTypedNumber(evt);
    }//GEN-LAST:event_AntiKeyTyped

    private void txtTelefonoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEKeyTyped
        this.keyTypedNumber(evt);
    }//GEN-LAST:event_txtTelefonoEKeyTyped

    private void sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyTyped
        this.keyTypedNumber(evt);
    }//GEN-LAST:event_sueldoKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        this.keyTypedNumber(evt);
    }//GEN-LAST:event_jTextField1KeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anti;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditarE;
    private javax.swing.JButton BtnEliminarE;
    private javax.swing.JButton BtnMostrarE;
    private javax.swing.JButton BtnNuevoE;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel ERROR;
    private javax.swing.JLabel IMAGENPERFIL;
    private javax.swing.JComboBox Puesto;
    private javax.swing.JButton Registro;
    private javax.swing.JButton buscaimagen;
    private javax.swing.JTextArea dom;
    private javax.swing.JRadioButton fem;
    public static javax.swing.JTextField id;
    private javax.swing.JPanel imagen;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton mas;
    private javax.swing.JLabel ruta;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtEdadE;
    private javax.swing.JTextField txtEmailE;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JFormattedTextField txtTelefonoE;
    // End of variables declaration//GEN-END:variables
}
