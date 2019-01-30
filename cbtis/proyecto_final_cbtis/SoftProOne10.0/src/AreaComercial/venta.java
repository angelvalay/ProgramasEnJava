
package AreaComercial;

import AdministracionTotal.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class venta extends javax.swing.JFrame {
String cadena;
public DecimalFormat formatod;
public String[] fechasdeplazo;
private float totalPago;
private float precioProduc;
private String pagaré;
private int cantProduc;
private int cantidades;  
private Conexion conexion= new Conexion();
float tott = 0;
java.util.Date fecha = new Date();
 Date lol = new Date(System.currentTimeMillis());
        SimpleDateFormat fech = new SimpleDateFormat("dd-MM-yyyy");//Formato de fecha
    public venta() {
       
        initComponents();
        tableBusqueda();
        formatod= new DecimalFormat("#.##");
        this.setLocationRelativeTo(null);
        setTitle("Ventas");
        setResizable(false);
        
        fecha1.setText(fech.format(lol));
    }

    public Date sumar(Date fecha, int mes){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.MONTH, mes);
        return calendar.getTime();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tipopago = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        numerocliente = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        nombrecliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        plazo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vencimiento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sí = new javax.swing.JCheckBox();
        no = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        busPro = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        existencia = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        con = new javax.swing.JButton();
        Imprimir = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ordenarPor = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        orden = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBúsqueda = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Nueva venta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tipopago.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tipopago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su tipo de pago", "Credito", "Contado" }));
        tipopago.setEnabled(false);
        tipopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipopagoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("NumeroCliente:");

        numerocliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        numerocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroclienteKeyTyped(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setFocusPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        nombrecliente.setText("         ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("TipoPago:");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel22.setText("Plazo:");

        plazo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        plazo.setEnabled(false);
        plazo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                plazoInputMethodTextChanged(evt);
            }
        });
        plazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                plazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plazoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Vencimiento Pago:");

        vencimiento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        vencimiento.setForeground(new java.awt.Color(0, 102, 204));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Pagaré:");

        sí.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sí.setText("Si");
        sí.setEnabled(false);
        sí.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                síActionPerformed(evt);
            }
        });

        no.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        no.setText("No");
        no.setEnabled(false);
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Total:                      $");

        total.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(numerocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11))
                            .addGap(18, 18, 18)
                            .addComponent(jToggleButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(74, 74, 74)))
                            .addGap(32, 32, 32)
                            .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(95, 95, 95)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(sí)
                                    .addGap(18, 18, 18)
                                    .addComponent(no))
                                .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(tipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(numerocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sí)
                    .addComponent(no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Folio:");

        folio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        folio.setEnabled(false);
        folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioActionPerformed(evt);
            }
        });
        folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                folioKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        fecha1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fecha1.setText("00/00/00");
        fecha1.setEnabled(false);
        fecha1.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Codigo del producto:");

        codigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        busPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        busPro.setBorderPainted(false);
        busPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busPro.setFocusPainted(false);
        busPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busProActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cantidad.setEnabled(false);
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cantidadPropertyChange(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Precio del producto:");

        precio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 153, 204));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 153));
        jLabel12.setText("Existencia actual:");

        existencia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        existencia.setForeground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(existencia, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(cantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(busPro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fecha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(busPro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 255, 204));
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        con.setBackground(new java.awt.Color(0, 102, 102));
        con.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        con.setForeground(new java.awt.Color(102, 255, 204));
        con.setText("Continuar");
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });

        Imprimir.setActionCommand("Imprimir");
        Imprimir.setBackground(new java.awt.Color(0, 102, 102));
        Imprimir.setEnabled(false);
        Imprimir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(0, 255, 204));
        Imprimir.setLabel("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(con)
                .addGap(23, 23, 23)
                .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(60, 60, 60))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setText("Registro de ventas");

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel30.setText("Ordenar por");

        ordenarPor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ordenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "folio", "fecha", "códigoProducto", "cantidad", "NúmeroCliente", "total", "tipoPago", "vencimientoPago", "pagaré" }));
        ordenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel31.setText("de forma ");

        orden.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        orden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ascendiente", "descendiente" }));
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });

        tablaBúsqueda.setBackground(new java.awt.Color(0, 153, 153));
        tablaBúsqueda.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tablaBúsqueda.setForeground(new java.awt.Color(255, 255, 255));
        tablaBúsqueda.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaBúsqueda.setGridColor(new java.awt.Color(51, 255, 204));
        tablaBúsqueda.setSelectionBackground(new java.awt.Color(204, 255, 0));
        tablaBúsqueda.setSelectionForeground(new java.awt.Color(0, 102, 51));
        jScrollPane1.setViewportView(tablaBúsqueda);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(27, 27, 27)
                        .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel31)
                        .addGap(30, 30, 30)
                        .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioActionPerformed
        

    }//GEN-LAST:event_folioActionPerformed

    private void conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActionPerformed
        String imp = null;
       
      if(tipopago.getSelectedItem().toString().equals("Seleccione su tipo de pago...")){
      JOptionPane.showMessageDialog(this, "ERROR: Tipo de pago no valido", "Error", JOptionPane.WARNING_MESSAGE);} 
        String paga=vencimiento.getText();
        int canti=Integer.parseInt(cantidad.getText());
        int plaz=Integer.parseInt(plazo.getText());

        float PRECIO=Float.parseFloat(this.precio.getText());
        String tipocredito;
        tipocredito=tipopago.getSelectedItem().toString();
        tott=(float)(canti*PRECIO);
        total.setText((formatod.format(tott)));
               
        /*if (canti>=1000 && PRECIO>=300) {
            
            if (plaz>=36 && plaz<=48){
                if(tipocredito.equals("Credito")){
                tott=(float) (((canti *PRECIO)* 1.015)*.90);}
                else if(tipocredito.equals("Contado"))
                {tott=(float) (((canti *PRECIO)* 1.015)*.92);}
                
                total.setText((formatod.format(tott)));
            }
            else{JOptionPane.showMessageDialog(this, "Error, solo tienes un plazo de 36 a 48 meses");return;}
   
        }*/
        /*if (canti>100 && canti<1000  /*&& precio<300) { 
            if (plaz>=12 && plaz<=36) { tott=(float) ((canti *PRECIO)* 1.015);
                
            }
                else{JOptionPane.showMessageDialog(this, "Error, solo tienes un plazo de 12 a 36"); 
                
            }
               
       }*/
        
        
        try{
        java.util.Date fechavencimiento=this.sumar(fecha, plaz);
        //vencimiento.setText(fechavencimiento.toString());
        int VencDía; VencDía= fechavencimiento.getDate();//JOptionPane.showMessageDialog(null,VencDía);
        int VencMes; VencMes= (fechavencimiento.getMonth()) + 1;//JOptionPane.showMessageDialog(null, VencMes);
        int VencAño; VencAño= (fechavencimiento.getYear())+1900;// JOptionPane.showMessageDialog(null, VencAño);
        String FECHAVENC; FECHAVENC= VencAño + "-" + VencMes + "-" + VencDía;
        conexion.setvencPagoVenta(FECHAVENC);
        conexion.setfolioVenta(Integer.parseInt(folio.getText()));
        conexion.setcodProdVenta(Integer.parseInt(codigo.getText()));
        conexion.setCant(Integer.parseInt(cantidad.getText()));
        conexion.setnumClientVenta(Integer.parseInt(numerocliente.getText()));
        conexion.settotalVenta(Float.parseFloat(total.getText()));
        conexion.settipoPagoVenta(tipopago.getSelectedItem().toString());
        if (sí.isSelected()){
            pagaré="Sí";
        }else if (no.isSelected()){
            pagaré="No";
        }else pagaré="--";
        conexion.setpagaréVenta(pagaré);
        conexion.getVentas();
        tableBusqueda();
        }catch(Exception a){
            JOptionPane.showMessageDialog(this, "Error. \n "+ a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_conActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        folio.setText("");
        tipopago.setSelectedItem("Seleccione su tipo de pago...");
        cantidad.setText("");
        codigo.setText("");
        numerocliente.setText("");
        vencimiento.setText("");
        total.setText("");
        plazo.setText("");
        existencia.setText("");
        precio.setText("");
        nombrecliente.setText("");
        tipopago.setSelectedIndex(0);
        codigo.setEnabled(true);
        numerocliente.setEnabled(true);
        HabilitarClientes(false);
        HabilitarProducto(false);
        con.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tipopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipopagoActionPerformed
        int w = tipopago.getSelectedIndex();
        if (w!=1){
            plazo.setEnabled(false);
            vencimiento.setText("---------------");
            sí.setEnabled(false);
            no.setEnabled(false);
        }else{
            plazo.setEnabled(true);
            vencimiento.setText("");
            sí.setEnabled(true);
            no.setEnabled(true);
        }
    }//GEN-LAST:event_tipopagoActionPerformed

    private void folioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_folioKeyTyped
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
    }//GEN-LAST:event_folioKeyTyped

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
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
    }//GEN-LAST:event_codigoKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
 char c=evt.getKeyChar();
        int a=0;
        try{
            a=Integer.parseInt(String.valueOf(c));
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void numeroclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroclienteKeyTyped
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
    }//GEN-LAST:event_numeroclienteKeyTyped

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        Factura dialog = new Factura(new javax.swing.JFrame(), true);
        dialog.Mcantidad.setText(String.valueOf(cantidades));
        dialog.Mcodigo.setText(this.codigo.getText());
        dialog.Mfecha.setText(this.fech.format(lol));
        dialog.Mnumerocliente.setText(this.numerocliente.getText());
        dialog.Mpagare.setText(this.pagaré);
        dialog.Mpago.setText(this.tipopago.getSelectedItem().toString());
        dialog.Mplazo.setText(this.plazo.getText());
        dialog.Mvencimiento.setText(this.vencimiento.getText());
        dialog.total.setText(this.total.getText());
        dialog.setVisible(true);
    }//GEN-LAST:event_ImprimirActionPerformed

    private void síActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_síActionPerformed
        no.setSelected(false);
        
    }//GEN-LAST:event_síActionPerformed

    
    
    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        sí.setSelected(false);
    }//GEN-LAST:event_noActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void ordenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_ordenarPorActionPerformed

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_ordenActionPerformed

    private void busProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busProActionPerformed
    try {
        if (codigo.getText()!= null){
            ResultSet a= conexion.setBusqueda("inventarioProductos", "códigoProducto", Integer.parseInt(codigo.getText()));
            if(a.next()){
                cantidades=a.getInt(3);
                existencia.setText(String.valueOf(cantidades));
                precio.setText(String.valueOf(a.getFloat(5)));
                precioProduc=Float.parseFloat(precio.getText());
                codigo.setEnabled(false);
                cantidad.setEnabled(true);
                folio.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Producto No Encontrado",null,JOptionPane.WARNING_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        
    }
    }//GEN-LAST:event_busProActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try{
            ResultSet ss=conexion.setBusqueda("clientes", "NúmeroCliente", Integer.parseInt(this.numerocliente.getText()));
            if(ss.next()){
                nombrecliente.setText(ss.getString(2));
                HabilitarClientes(true);
                plazo.setEnabled(false);
                sí.setEnabled(false);
                no.setEnabled(false);
            }else{
                JOptionPane.showInternalMessageDialog(this, "Cliente no encontrado.", "Cliente", JOptionPane.ERROR_MESSAGE);
                HabilitarClientes(false);
            }
        }catch(Exception a){
            
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        
    }//GEN-LAST:event_cantidadActionPerformed

    private void cantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cantidadPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadPropertyChange

    private void plazoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_plazoInputMethodTextChanged

    }//GEN-LAST:event_plazoInputMethodTextChanged

    private void plazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plazoKeyTyped
        char c=evt.getKeyChar();
        int a=0;
        try{
            a=Integer.parseInt(String.valueOf(c));
        }catch(Exception e){
           getToolkit().beep();
           evt.consume(); 
        }
        
    }//GEN-LAST:event_plazoKeyTyped

    private void plazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plazoKeyReleased
        try{
            obtVencimiento();
        }catch (Exception q){}
    }//GEN-LAST:event_plazoKeyReleased

    private void obtVencimiento(){
        Date dasDatum;
        dasDatum = sumar(fecha, Integer.parseInt(plazo.getText()));
        vencimiento.setText(fech.format(dasDatum));
    }
    
    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        try{
            cantProduc=Integer.parseInt(cantidad.getText());
            mostrarTotal();
        }catch (Exception a){
            
        }
    }//GEN-LAST:event_cantidadKeyReleased
    public void HabilitarClientes(boolean a){
        tipopago.setEnabled(a);
        plazo.setEnabled(a);
        vencimiento.setEnabled(a);
        sí.setEnabled(a);
        no.setEnabled(a);
        Imprimir.setEnabled(a);
    }
    public void HabilitarProducto(boolean b){
        folio.setEnabled(b);
        cantidad.setEnabled(b);
        con.setEnabled(b);
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }
    
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
        modelo.addColumn("Folio");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cod. producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Num. cliente");
        modelo.addColumn("Total");
        modelo.addColumn("Tipo de pago");
        modelo.addColumn("Venc. de pago");
        modelo.addColumn("Pagaré");
        String por= ordenarPor.getSelectedItem().toString();
        String order;
        if(ordenarPor.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getBusquedaVentas(ordenarPor.getSelectedItem().toString(), order);
            while(rs.next()){
                Object []ob=new Object[9];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getInt(1));
            ob[1]=(rs.getDate(2));
            ob[2]=(rs.getInt(3));
            ob[3]=(rs.getInt(4));
            ob[4]=(rs.getInt(5));
            ob[5]=(rs.getFloat(6));
            ob[6]=(rs.getString(7));
            ob[7]=(rs.getDate(8));
            ob[8]=(rs.getString(9));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        
        tablaBúsqueda.setModel(modelo);
    }
    
    private void mostrarTotal(){
        if (cantidad != null && precio.getText() != null){
            totalPago = cantProduc*precioProduc;
            total.setText(String.valueOf(totalPago));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Imprimir;
    private javax.swing.JToggleButton busPro;
    public static javax.swing.JTextField cantidad;
    public static javax.swing.JTextField codigo;
    private javax.swing.JButton con;
    private javax.swing.JLabel existencia;
    private javax.swing.JLabel fecha1;
    public static javax.swing.JTextField folio;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JCheckBox no;
    private javax.swing.JLabel nombrecliente;
    public static javax.swing.JTextField numerocliente;
    private javax.swing.JComboBox orden;
    private javax.swing.JComboBox ordenarPor;
    private javax.swing.JTextField plazo;
    private javax.swing.JLabel precio;
    private javax.swing.JCheckBox sí;
    private javax.swing.JTable tablaBúsqueda;
    private javax.swing.JComboBox tipopago;
    private javax.swing.JLabel total;
    private javax.swing.JLabel vencimiento;
    // End of variables declaration//GEN-END:variables
}
