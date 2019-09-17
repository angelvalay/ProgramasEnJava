
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
private String pagaré;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ordenarPor = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        orden = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBúsqueda = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        codigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        folio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sí = new javax.swing.JCheckBox();
        no = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        tipopago = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numerocliente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        con = new javax.swing.JButton();
        plazo = new javax.swing.JTextField();
        Imprimir = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        busPro = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        existencia = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        nombrecliente = new javax.swing.JLabel();
        vencimiento = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Registro de ventas");

        jLabel30.setText("Ordenar por:");

        ordenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "folio", "fecha", "códigoProducto", "cantidad", "NúmeroCliente", "total", "tipoPago", "vencimientoPago", "pagaré" }));
        ordenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorActionPerformed(evt);
            }
        });

        jLabel31.setText("De forma: ");

        orden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "asc", "desc" }));
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablaBúsqueda);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel11.setText("NumeroCliente:");

        jLabel6.setText("Vencimiento Pago:");

        jLabel7.setText("Pagaré:");

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

        jLabel9.setText("Cantidad:");

        cantidad.setEnabled(false);
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jLabel10.setText("Codigo del producto:");

        sí.setText("Si");
        sí.setEnabled(false);
        sí.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                síActionPerformed(evt);
            }
        });

        no.setText("No");
        no.setEnabled(false);
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        jLabel4.setText("TipoPago:");

        fecha1.setText("00/00/00");
        fecha1.setEnabled(false);
        fecha1.setFocusable(false);

        tipopago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione su tipo de pago...", "Credito", "Contado" }));
        tipopago.setEnabled(false);
        tipopago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipopagoActionPerformed(evt);
            }
        });

        jLabel2.setText("Folio:");

        jLabel3.setText("Fecha:");

        jLabel22.setText("Plazo:");

        jLabel1.setText("Nueva venta");

        numerocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroclienteKeyTyped(evt);
            }
        });

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");

        con.setText("Continuar");
        con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActionPerformed(evt);
            }
        });

        plazo.setEnabled(false);

        Imprimir.setActionCommand("Imprimir");
        Imprimir.setEnabled(false);
        Imprimir.setLabel("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        jLabel5.setText("Total:                        $");

        busPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Busqueda.jpe"))); // NOI18N
        busPro.setBorderPainted(false);
        busPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busPro.setFocusPainted(false);
        busPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busProActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio del producto:");

        precio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setText("Existencia Actual:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4)
                            .addGap(181, 181, 181))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fecha1))))
                            .addGap(13, 13, 13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busPro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(63, 63, 63)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel22)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tipopago, 0, 191, Short.MAX_VALUE)
                                .addComponent(plazo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(numerocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton1))))
                    .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(con)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(72, 72, 72)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sí)
                                        .addGap(18, 18, 18)
                                        .addComponent(no)))))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numerocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(sí))
                            .addComponent(no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombrecliente))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(fecha1))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(busPro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel9)
                                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addComponent(vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)
                        .addComponent(con))
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        float precio=Float.parseFloat(this.precio.getText());
        String tipocredito;
        tipocredito=tipopago.getSelectedItem().toString();
               
        if (canti>=1000 && precio>=300) {
            
            if (plaz>=36 && plaz<=48){
                if(tipocredito.equals("Credito")){
                tott=(float) (((canti *precio)* 1.015)*.90);}
                else if(tipocredito.equals("Contado"))
                {tott=(float) (((canti *precio)* 1.015)*.92);}
                
                total.setText((formatod.format(tott)));
            }
            else{JOptionPane.showMessageDialog(this, "Error, solo tienes un plazo de 36 a 48 meses");return;}
   
        }
        if (canti>100 && canti<1000  /*&& precio<300*/) { 
            if (plaz>=12 && plaz<=36) { tott=(float) ((canti *precio)* 1.015);
                
            }
                else{JOptionPane.showMessageDialog(this, "Error, solo tienes un plazo de 12 a 36"); 
                
            }
               
       } 
        try{
        java.util.Date fechavencimiento=this.sumar(fecha, plaz);
        vencimiento.setText(fechavencimiento.toString());
        conexion.setvencPagoVenta(String.valueOf(fechavencimiento));
        conexion.setfolioVenta(Integer.parseInt(folio.getText()));
        conexion.setcodProdVenta(Integer.parseInt(codigo.getText()));
        conexion.setCant(Integer.parseInt(cantidad.getText()));
        conexion.setnumClientVenta(Integer.parseInt(numerocliente.getText()));
        conexion.settotalVenta(Float.parseFloat(total.getText()));
        conexion.settipoPagoVenta(tipopago.getSelectedItem().toString());
        conexion.setvencPagoVenta(vencimiento.getText());
        if (sí.isSelected()){
            pagaré="Sí";
        }else if (no.isSelected()){
            pagaré="No";
        }else pagaré="--";
        conexion.setpagaréVenta(pagaré);
        conexion.getVentas();
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
        codigo.setEnabled(true);
        numerocliente.setEnabled(true);
        HabilitarClientes(false);
        HabilitarProducto(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tipopagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipopagoActionPerformed
        // TODO add your handling code here:
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
        dialog.total.setText(String.valueOf(this.tott));
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
            }else{
                JOptionPane.showInternalMessageDialog(this, "Cliente no encontrado.", "Cliente", JOptionPane.ERROR_MESSAGE);
                HabilitarClientes(false);
            }
        }catch(Exception a){
            
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Imprimir;
    private javax.swing.JToggleButton busPro;
    public static javax.swing.JTextField cantidad;
    public static javax.swing.JTextField codigo;
    private javax.swing.JButton con;
    private javax.swing.JLabel existencia;
    private javax.swing.JLabel fecha1;
    public static javax.swing.JTextField folio;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
