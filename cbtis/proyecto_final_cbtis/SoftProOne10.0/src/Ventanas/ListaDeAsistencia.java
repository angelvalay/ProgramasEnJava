
package Ventanas;

import static AreaComercial.Clientes.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


   public final class ListaDeAsistencia extends javax.swing.JFrame {
   Date fechac;
   String fechabd;
   SimpleDateFormat fech;
   
    public ListaDeAsistencia() {
        initComponents();
        fechac= new Date(System.currentTimeMillis());
        fech = new SimpleDateFormat("dd-MM-yyyy");//Formato de fecha
        fechabd=fech.format(fechac);//Da el formato
        JMFechaA.setText(fechabd);
        tableBusqueda();
        
    }
    
    public void segCampos(boolean t)
    {
        numJus.setEnabled(t);
        LRazon.setEnabled(t);
        txtRazon.setEnabled(t);
        Hora3.setEnabled(t);
        Minutos3.setEnabled(t);
        numJus.setEnabled(t);
        
        
    }

     public void mostrarCampos(boolean t)
    {
       
       
        JMostrarNomb.setEnabled(t);
        HE.setEnabled(t);
        HS.setEnabled(t);
        Minutos1.setEnabled(t);
        Hora1.setEnabled(t);
        Hora2.setEnabled(t);
        Minutos2.setEnabled(t);
        JSalir.setEnabled(t);
        JHoras.setEnabled(t);
        JMinutos.setEnabled(t);
        JHoras2.setEnabled(t);
        JMinutos2.setEnabled(t);
        RSi.setEnabled(t);
        RNo.setEnabled(t);
       
    }
     
     public void tableBusqueda(){
        DefaultTableModel modelo = new DefaultTableModel() {
            //TE PERMITE MODIFICAR LA ESTRUCTURA DE LA TABLA
            //NO SE PUEDE EDITAR LA TABLA
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Puesto");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora de Llegada");
        modelo.addColumn("Hora de Salida");
        modelo.addColumn("Num de Justificante");
        modelo.addColumn("Fecha del jus..");
        modelo.addColumn("Motivo del jus..");
        
        String por= orden.getSelectedItem().toString();
        String order;
        if(forma.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getAsistenciaJust(por, order);
            while(rs.next()){
                Object []ob=new Object[9];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getString(1));
            ob[1]=(rs.getString(2));
            ob[2]=(rs.getString(3));
            ob[3]=(rs.getDate(4));
            ob[4]=(rs.getTime(5));
            ob[5]=(rs.getTime(6));
            ob[6]=(rs.getString(7));
            ob[7]=(rs.getDate(8));
            ob[8]=(rs.getString(9));
            
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hubo un error." +ex.getMessage(), "Lista de Asistencia", JOptionPane.ERROR_MESSAGE);
        } 
        
        tableAsistencia.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JMostrarNomb = new javax.swing.JLabel();
        JMFechaA = new javax.swing.JLabel();
        JHoras = new javax.swing.JLabel();
        JMinutos = new javax.swing.JLabel();
        JHoras2 = new javax.swing.JLabel();
        JMinutos2 = new javax.swing.JLabel();
        Hora1 = new javax.swing.JSpinner();
        Minutos1 = new javax.swing.JSpinner();
        Hora2 = new javax.swing.JSpinner();
        Minutos2 = new javax.swing.JSpinner();
        HE = new javax.swing.JLabel();
        HS = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        nom = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        JSalir = new javax.swing.JLabel();
        RSi = new javax.swing.JRadioButton();
        RNo = new javax.swing.JRadioButton();
        a = new javax.swing.JLabel();
        numJus = new javax.swing.JTextField();
        LRazon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRazon = new javax.swing.JTextArea();
        HS1 = new javax.swing.JLabel();
        JHoras3 = new javax.swing.JLabel();
        Hora3 = new javax.swing.JSpinner();
        JMinutos3 = new javax.swing.JLabel();
        Minutos3 = new javax.swing.JSpinner();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        orden = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        forma = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAsistencia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFocusable(false);
        jPanel2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        JMostrarNomb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JMostrarNomb.setText("Número de empleado:");

        JMFechaA.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JMFechaA.setText("00-00-00");

        JHoras.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JHoras.setText("HH:");

        JMinutos.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JMinutos.setText("MM:");

        JHoras2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JHoras2.setText("HH:");

        JMinutos2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JMinutos2.setText("MM:");

        Hora1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Hora1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        Hora1.setEnabled(false);

        Minutos1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Minutos1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minutos1.setEnabled(false);

        Hora2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Hora2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        Hora2.setEnabled(false);

        Minutos2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Minutos2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minutos2.setEnabled(false);

        HE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        HE.setText("Hora-Entrada:");

        HS.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        HS.setText("Hora-Salida:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Actual:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Registro de asistencia");

        BtnAgregar.setBackground(new java.awt.Color(0, 102, 102));
        BtnAgregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(153, 255, 204));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.setEnabled(false);
        BtnAgregar.setFocusable(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        id.setDisabledTextColor(new java.awt.Color(102, 102, 102));
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

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        nom.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        nom.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        JSalir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        JSalir.setText("Salir antes de tiempo (No Obligatorio)");

        RSi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RSi.setText("Si");
        RSi.setEnabled(false);
        RSi.setOpaque(false);
        RSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RSiMouseClicked(evt);
            }
        });
        RSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSiActionPerformed(evt);
            }
        });

        RNo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RNo.setSelected(true);
        RNo.setText("No");
        RNo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RNo.setEnabled(false);
        RNo.setNextFocusableComponent(txtRazon);
        RNo.setOpaque(false);
        RNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNoActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        a.setText("No. del Justificante:");

        numJus.setEnabled(false);
        numJus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numJusActionPerformed(evt);
            }
        });

        LRazon.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LRazon.setText("Especifique razon de la salida:");

        txtRazon.setColumns(20);
        txtRazon.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtRazon.setRows(5);
        txtRazon.setEnabled(false);
        txtRazon.setOpaque(false);
        jScrollPane1.setViewportView(txtRazon);

        HS1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        HS1.setText("Hora-Salida:");

        JHoras3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JHoras3.setText("HH:");

        Hora3.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Hora3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        Hora3.setEnabled(false);

        JMinutos3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        JMinutos3.setText("MM:");

        Minutos3.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        Minutos3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minutos3.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LRazon)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JSalir)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(a)
                                        .addGap(18, 18, 18)
                                        .addComponent(numJus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(HS1)
                                        .addGap(18, 18, 18)
                                        .addComponent(JHoras3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JMinutos3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Minutos3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(RSi)
                                        .addGap(18, 18, 18)
                                        .addComponent(RNo)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RSi)
                    .addComponent(RNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numJus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HS1)
                    .addComponent(JHoras3)
                    .addComponent(Hora3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JMinutos3)
                    .addComponent(Minutos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LRazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(296, 296, 296))
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JMinutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HS)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JHoras2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JMinutos2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Minutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnAgregar)
                                        .addGap(19, 19, 19))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HE, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(JMostrarNomb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JMFechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JMFechaA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jToggleButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JMostrarNomb)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JHoras)
                            .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JHoras2)
                            .addComponent(Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JMinutos2)
                            .addComponent(Minutos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JMinutos)
                            .addComponent(BtnAgregar))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Ver registros de asistencia");

        orden.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        orden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "fecha", "NúmeroEmpleado", "horaLlegada", "horaSalida", "justificante" }));
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Ordenar por");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("de forma ");

        forma.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        forma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaActionPerformed(evt);
            }
        });

        tableAsistencia.setBackground(new java.awt.Color(0, 153, 153));
        tableAsistencia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        tableAsistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAsistencia.setFocusable(false);
        tableAsistencia.setGridColor(new java.awt.Color(102, 255, 255));
        tableAsistencia.setOpaque(false);
        tableAsistencia.setSelectionBackground(new java.awt.Color(204, 255, 0));
        tableAsistencia.setSelectionForeground(new java.awt.Color(0, 102, 51));
        jScrollPane2.setViewportView(tableAsistencia);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane3)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSiActionPerformed
        RNo.setSelected(false); 
        if(RSi.isSelected()==true){
            segCampos(true);
        }
    }//GEN-LAST:event_RSiActionPerformed

    private void RNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNoActionPerformed
        RSi.setSelected(false);
        if(RNo.isSelected()==true){
            segCampos(false);
        }
    }//GEN-LAST:event_RNoActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
         try{
        conexion.setNumEmpAsis(Integer.parseInt(id.getText()));
        conexion.setFechaAsis(fechabd);
        conexion.setHoraLleg(Hora1.getValue().toString()+":"+Minutos1.getValue().toString());
        conexion.setHoraSal(Hora2.getValue().toString()+":"+Minutos2.getValue().toString());
        
        
        if(RSi.isSelected()){
            conexion.setJustNum(Integer.parseInt(numJus.getText()));
            conexion.setHoraSalJust(fechabd);
            conexion.setNumEmpJust(Integer.parseInt(id.getText()));
            conexion.setNumJustific(Integer.parseInt(numJus.getText()));
            conexion.setMotivoJust(txtRazon.getText());
            conexion.setFechaJust();
            conexion.getJustificante();
        }
        conexion.getAsistencia();
        this.tableBusqueda();
        this.mostrarCampos(false);
         }catch(Exception a){
             JOptionPane.showMessageDialog(this, "Hubo un error." +a.getMessage(), "Lista de Asistencia", JOptionPane.ERROR_MESSAGE);
         } 
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
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
    }//GEN-LAST:event_idKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       try{
        int cod= Integer.parseInt(this.id.getText());
        ResultSet rs=conexion.setBusqueda("empleados", "NúmeroEmpleado", cod);
        
        if(rs.next()){
            
            nom.setText(rs.getString(2)+ rs.getString(3));
            BtnAgregar.setEnabled(true);
            JOptionPane.showMessageDialog(this, "EMPLEADO ENCONTRADO", "Empleados" +"  "+ cod, JOptionPane.PLAIN_MESSAGE); 
            this.tableBusqueda();
            this.mostrarCampos(true);
        }else{
            BtnAgregar.setEnabled(false);
           id.setText("");
        JOptionPane.showMessageDialog(this, "NO ENCONTRADO", "Empleados" +"  "+ cod, JOptionPane.INFORMATION_MESSAGE); 
        this.mostrarCampos(false);
        }
        }catch(RuntimeException a){
            JOptionPane.showMessageDialog(this, "Verifica bien el ID", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }catch(SQLException d){
            JOptionPane.showMessageDialog(this, "Error en la conexion con Base De Datos", null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_ordenActionPerformed

    private void formaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_formaActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void numJusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numJusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numJusActionPerformed

    private void RSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RSiMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JLabel HE;
    private javax.swing.JLabel HS;
    private javax.swing.JLabel HS1;
    private javax.swing.JSpinner Hora1;
    private javax.swing.JSpinner Hora2;
    private javax.swing.JSpinner Hora3;
    private javax.swing.JLabel JHoras;
    private javax.swing.JLabel JHoras2;
    private javax.swing.JLabel JHoras3;
    private javax.swing.JLabel JMFechaA;
    private javax.swing.JLabel JMinutos;
    private javax.swing.JLabel JMinutos2;
    private javax.swing.JLabel JMinutos3;
    private javax.swing.JLabel JMostrarNomb;
    private javax.swing.JLabel JSalir;
    private javax.swing.JLabel LRazon;
    private javax.swing.JSpinner Minutos1;
    private javax.swing.JSpinner Minutos2;
    private javax.swing.JSpinner Minutos3;
    private javax.swing.JRadioButton RNo;
    private javax.swing.JRadioButton RSi;
    private javax.swing.JLabel a;
    private javax.swing.JComboBox forma;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField numJus;
    private javax.swing.JComboBox orden;
    private javax.swing.JTable tableAsistencia;
    private javax.swing.JTextArea txtRazon;
    // End of variables declaration//GEN-END:variables
}
