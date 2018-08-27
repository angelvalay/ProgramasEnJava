package AdministracionTotal;

import AreaComercial.venta;
import AreaComercial.Clientes;
import AreaDeProduccion.Insumos;
import AreaDeProduccion.Productos;
import AreaDeProduccion.nuevaCompra;
import AreaDeProduccion.nuevoInsumo2;
import AreaDeRecursosHumanos.Empleados;
import AreaDeRecursosHumanos.EmpleadosLista;
import Ventanas.ListaDeAsistencia;

import reloj.*;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.*;
import Login.contraPrincipal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.*;
            


public final class InicioAdmin extends javax.swing.JFrame implements Runnable {

    private Calendar calendario = new GregorianCalendar();
    String hora, minutos, segundos, ampm;
    
    Thread h1;
    int año = calendario.get(Calendar.YEAR);
    int mes = calendario.get(Calendar.MONTH);
    int dia = calendario.get(Calendar.DAY_OF_MONTH);
    int diasemana= calendario.get(Calendar.DAY_OF_WEEK);
    int horas1 = 0, min = 0, seg = 0, ds = 0;
    Thread hilo = new Thread() {//declaramos el hilo

        @Override
        public void run() {
            try {
                while (true) {//ciclo infinito
                    if (ds == 99) {//si los decisegundos son iguales a 99
                        ds = 0;//decisegundo vuelve a empezar en cero
                        seg++;//y aumenta un segundo
                    }
                    if (seg == 59) {//si los segundos son iguales a 59
                        seg = 0;//segundo vuelve a empezar en cero
                        min++;//y aumenta un minuto
                    }
                    if (min == 59) {//si los minutos son iguales a 59
                        min = 0;//minuto vuelve a empezar en cero
                        horas1++;//y aumenta una hora
                    }
                    ds++;//aumentan las decimas de segundo

                    TiempoEjecucion.setText(horas1 + ":" + min + ":" + seg + ":" + ds);//se muestra en el jlabel

                    hilo.sleep(10);//que duerma una decima de segundo
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };

    Connection miConexion;
    
    public InicioAdmin() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setBackground(Color.black);
        setUndecorated(true);
        initComponents();
        h1 = new Thread(this);
        h1.start();
        CerrarVentana();
        OpaqueButtons();
        miConexion=Conexion.GetConnection();
        jInternalFrame1.setVisible(false);
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
            HabilitarOpciones(true);
            this.estadoConexion.setText("Conectado");
        }else{
            this.estadoConexion.setText("Desconectado");
            HabilitarOpciones(false);
        }
        
        try{
            hilo.start();//el hilo empieza            
            String fecha= FechaActual(diasemana,dia,mes,año).toString();
            fecha1.setText(fecha);
            
        }catch(Exception a){
            System.err.println(a);
        }
        
        jMenuBar1.setOpaque(true);
        jMenuBar1.setBackground(Color.BLACK);
        getContentPane().setBackground(Color.WHITE);
        if(contraPrincipal.Sig==false){
            DesactivarObjectos();
        }
    }

    private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
         cerrar();
       }
     });
    }
    private void DesactivarObjectos(){
       // productos.setEnabled(false);
        nuevoempleado.setEnabled(false);
    }
    private  void OpaqueButtons(){
        
        productos.setContentAreaFilled(false);
        productos.setBorderPainted(false);
        compras.setOpaque(false);
        compras.setContentAreaFilled(false);
        compras.setBorderPainted(false);
        ventas.setOpaque(false);
        ventas.setContentAreaFilled(false);
        ventas.setBorderPainted(false);
        empleados.setOpaque(false);
        empleados.setContentAreaFilled(false);
        empleados.setBorderPainted(false);
        jMenuBar1.setOpaque(false);
        jMenuBar1.setBorderPainted(false);
        nuevoempleado.setOpaque(false);
        nuevoempleado.setContentAreaFilled(false);
        nuevoempleado.setBorderPainted(false);
        jMenuItem4.setOpaque(false);
        jMenuItem4.setContentAreaFilled(false);
        jMenuItem4.setBorderPainted(false);
        acerca.setOpaque(false);
        acerca.setContentAreaFilled(false);
        acerca.setBorderPainted(false);
        FECHA.setOpaque(false);
        FECHA.setOpaque(false);
    }
    private static StringBuffer FechaActual(int diadelasemana,int dia, int mes , int año){
        StringBuffer fecha= new StringBuffer();
        switch(diadelasemana+1){
            case 2:
                fecha.append("Lunes ");
                break;
            case 3:
                fecha.append("Martes ");
                break;
            case 4:
                fecha.append("Miércoles ");
                break;
            case 5:
                fecha.append("Jueves ");
                break;
            case 6:
                fecha.append("Viernes ");
                break;
            case 7:
                fecha.append("Sábado ");
                break;
            case 1:
                fecha.append("Domingo ");
                break;
            default:
                fecha.append(diadelasemana);
            
        }
        fecha.append(diadelasemana+1);
        fecha.append(" de ");
        switch(mes+1){
            case 1:
                fecha.append("enero del ");             
                break;
            case 2:
                fecha.append("febrero del "); 
                break;
            case 3:
                fecha.append("marzo del "); 
                break;
            case 4:
                fecha.append("abril de "); 
                break;
            case 5:
                fecha.append("mayo del "); 
                break;
            case 6:
                fecha.append("junio del "); 
                break;
            case 7:
                fecha.append("julio del "); 
                break;
            case 8:
                fecha.append("agosto del "); 
                break;
            case 9:
                fecha.append("septiembre del "); 
                break;
            case 10:
                fecha.append("octubre del "); 
                break;
            case 11:
                fecha.append("noviembre del "); 
                break;
            case 12:
                fecha.append("diciembre del "); 
                break;
            default:
                fecha.append(año);
        }
        fecha.append(año);
        return fecha;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fecha1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TiempoEjecucion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estadoConexion = new javax.swing.JLabel();
        FECHA = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo1 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        conectar = new javax.swing.JMenuItem();
        reiniciar = new javax.swing.JMenuItem();
        desconectar = new javax.swing.JMenuItem();
        cambiocontra1 = new javax.swing.JMenuItem();
        Salir1 = new javax.swing.JMenuItem();
        productos = new javax.swing.JMenu();
        empleados = new javax.swing.JMenu();
        nuevoempleado = new javax.swing.JMenuItem();
        Asistencia = new javax.swing.JMenuItem();
        compras = new javax.swing.JMenu();
        insumos = new javax.swing.JMenu();
        ventas = new javax.swing.JMenu();
        clientes = new javax.swing.JMenu();
        acerca = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        fecha1.setBackground(new java.awt.Color(0, 0, 0));
        fecha1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        fecha1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo de ejecución:");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        TiempoEjecucion.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N
        TiempoEjecucion.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");

        estadoConexion.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        estadoConexion.setForeground(new java.awt.Color(255, 255, 255));

        FECHA.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        FECHA.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoConexion, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(TiempoEjecucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadoConexion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("Tiempo de ejecución..");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        archivo1.setForeground(new java.awt.Color(255, 255, 255));
        archivo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invINICIOCOMO2.png"))); // NOI18N
        archivo1.setText("Sesión");
        archivo1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N

        jMenu1.setText("Conexion Base De Datos");

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });
        jMenu1.add(conectar);

        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jMenu1.add(reiniciar);

        desconectar.setText("Desconectar");
        desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectarActionPerformed(evt);
            }
        });
        jMenu1.add(desconectar);

        archivo1.add(jMenu1);

        cambiocontra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Perfil2.jpg"))); // NOI18N
        cambiocontra1.setText("Cambiar de usuario");
        cambiocontra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiocontra1ActionPerformed(evt);
            }
        });
        archivo1.add(cambiocontra1);

        Salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Salir2.png"))); // NOI18N
        Salir1.setText("Salir");
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        archivo1.add(Salir1);

        jMenuBar1.add(archivo1);

        productos.setForeground(new java.awt.Color(255, 255, 255));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invP10_.png"))); // NOI18N
        productos.setText("Productos");
        productos.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosMouseClicked(evt);
            }
        });
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        jMenuBar1.add(productos);

        empleados.setBackground(new java.awt.Color(255, 255, 255));
        empleados.setForeground(new java.awt.Color(255, 255, 255));
        empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invP2_.png"))); // NOI18N
        empleados.setText("Empleados");
        empleados.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N

        nuevoempleado.setBackground(new java.awt.Color(255, 255, 255));
        nuevoempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/AñadirEmpleado_1.png"))); // NOI18N
        nuevoempleado.setText("Registro de empleados");
        nuevoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoempleadoActionPerformed(evt);
            }
        });
        empleados.add(nuevoempleado);

        Asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Cliente2.jpg"))); // NOI18N
        Asistencia.setText("Asistencia");
        Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsistenciaActionPerformed(evt);
            }
        });
        empleados.add(Asistencia);

        jMenuBar1.add(empleados);

        compras.setForeground(new java.awt.Color(255, 255, 255));
        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invP6_.png"))); // NOI18N
        compras.setText("Compras");
        compras.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprasMouseClicked(evt);
            }
        });
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jMenuBar1.add(compras);

        insumos.setForeground(new java.awt.Color(255, 255, 255));
        insumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invP11_.png"))); // NOI18N
        insumos.setText("Insumos");
        insumos.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        insumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insumosMouseClicked(evt);
            }
        });
        jMenuBar1.add(insumos);

        ventas.setForeground(new java.awt.Color(255, 255, 255));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invVENTAS3.png"))); // NOI18N
        ventas.setText("Ventas");
        ventas.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasMouseClicked(evt);
            }
        });
        jMenuBar1.add(ventas);

        clientes.setForeground(new java.awt.Color(255, 255, 255));
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invP4_.png"))); // NOI18N
        clientes.setText("Clientes");
        clientes.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        jMenuBar1.add(clientes);

        acerca.setForeground(new java.awt.Color(255, 255, 255));
        acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/invAYUDA2_1.png"))); // NOI18N
        acerca.setText("Acerca de...");
        acerca.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N

        jMenu2.setText("Infomación de..");

        jMenuItem6.setText("Software");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Base de datos");
        jMenu2.add(jMenuItem7);

        acerca.add(jMenu2);

        jMenu3.setText("Ayuda..");

        jMenuItem3.setText("Manual de Usuario");
        jMenu3.add(jMenuItem3);

        jMenuItem5.setText("Reportar Fallas");
        jMenu3.add(jMenuItem5);

        acerca.add(jMenu3);

        jMenuBar1.add(acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar(){
        hilo.stop();
        int a=JOptionPane.showConfirmDialog(this, "¿Desea Salir Del Sistema?", "Exit", JOptionPane.YES_NO_OPTION);
       if(a==JOptionPane.NO_OPTION){
          hilo.resume(); 
       }else if(a==JOptionPane.YES_OPTION){
           System.exit(0);
       }
    }
    private void nuevoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoempleadoActionPerformed
        Empleados newEmpleados= new Empleados();
        newEmpleados.setTitle("Empleados");
        newEmpleados.setExtendedState(MAXIMIZED_BOTH);
        jInternalFrame1.setContentPane(newEmpleados.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
        
        
    }//GEN-LAST:event_nuevoempleadoActionPerformed

    private void AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsistenciaActionPerformed
        ListaDeAsistencia listaAsis = new ListaDeAsistencia();
        jInternalFrame1.setContentPane(listaAsis.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
        
    }//GEN-LAST:event_AsistenciaActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        Principal pro= new Principal();
        pro.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        nuevaCompra compra = new nuevaCompra();
        jInternalFrame1.setContentPane(compra.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_comprasActionPerformed

    private void comprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasMouseClicked
        nuevaCompra nCompra = new nuevaCompra();
        jInternalFrame1.setContentPane(nCompra.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_comprasMouseClicked

    private void insumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insumosMouseClicked
        Insumos nInsumos = new Insumos ();
        jInternalFrame1.setContentPane(nInsumos.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_insumosMouseClicked

    private void ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseClicked
        venta nVenta = new venta();
        jInternalFrame1.setContentPane(nVenta.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_ventasMouseClicked

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        Clientes nClientes = new Clientes();
        jInternalFrame1.setContentPane(nClientes.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_clientesMouseClicked

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        //Productos
        
    }//GEN-LAST:event_productosActionPerformed

    private void productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseClicked
        Productos nProduc = new Productos();
        jInternalFrame1.setContentPane(nProduc.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
    }//GEN-LAST:event_productosMouseClicked

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        Connection miConexion;
        miConexion=Conexion.GetResetearConnection();
        if(miConexion!=null)
        {
            conectar.setEnabled(false);
            reiniciar.setEnabled(true);
            desconectar.setEnabled(true);
            this.HabilitarOpciones(true);
            this.estadoConexion.setText("Conectado");

        }else{
            this.estadoConexion.setText("Desconectado");
            this.HabilitarOpciones(false);
        }
    }//GEN-LAST:event_conectarActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        this.estadoConexion.setText("Desconectado");
        miConexion=Conexion.GetResetearConnection();
        if(miConexion!=null)
        {
            this.estadoConexion.setText("Conectado");
            JOptionPane.showMessageDialog(null, "El Reinicio Se Realizó Correctamente");
            conectar.setEnabled(false);
            reiniciar.setEnabled(false);
            desconectar.setEnabled(true);
            jInternalFrame1.setVisible(false);
            this.HabilitarOpciones(true);
        }
    }//GEN-LAST:event_reiniciarActionPerformed

    private void desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectarActionPerformed
        try {
            int aviso= JOptionPane.showConfirmDialog(null, "Al desconectar la Base de Datos \n"
                + "Se perderá toda imformacion almacenada dentro de la ventana abierta \n"
                + "¿Confirmar de todos modos?", "Base De Datos", JOptionPane.YES_NO_OPTION);
            if(aviso==JOptionPane.YES_OPTION){
                miConexion.close();
                this.estadoConexion.setText("Desconectado");
                JOptionPane.showMessageDialog(null, "Desconexión Realizada Correctamente");
                this.HabilitarOpciones(false);
                conectar.setEnabled(true);
                reiniciar.setEnabled(false);
                desconectar.setEnabled(false);
                jInternalFrame1.setVisible(false);
            }

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_desconectarActionPerformed

    private void cambiocontra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiocontra1ActionPerformed
        hilo.stop();
        int a=JOptionPane.showConfirmDialog(this, "¿Esta seguro de Cambiar de usuario?", "Exit", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.NO_OPTION){
            hilo.resume();
        }else if(a==JOptionPane.YES_OPTION){
            this.dispose();
            this.setVisible(false);
            contraPrincipal slo= new contraPrincipal();
            slo.setVisible(true);
        }
    }//GEN-LAST:event_cambiocontra1ActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        try {
            cerrar();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_Salir1ActionPerformed

    
    private void HabilitarOpciones(boolean a){
        productos.setVisible(a);
        empleados.setVisible(a);
        compras.setVisible(a);
        insumos.setVisible(a);
        ventas.setVisible(a);
        clientes.setVisible(a);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asistencia;
    private javax.swing.JLabel FECHA;
    private javax.swing.JMenuItem Salir1;
    private javax.swing.JLabel TiempoEjecucion;
    private javax.swing.JMenu acerca;
    private javax.swing.JMenu archivo1;
    private javax.swing.JMenuItem cambiocontra1;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenu compras;
    private javax.swing.JMenuItem conectar;
    private javax.swing.JMenuItem desconectar;
    private javax.swing.JMenu empleados;
    private javax.swing.JLabel estadoConexion;
    private javax.swing.JLabel fecha1;
    private javax.swing.JMenu insumos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem nuevoempleado;
    private javax.swing.JMenu productos;
    private javax.swing.JMenuItem reiniciar;
    private javax.swing.JMenu ventas;
    // End of variables declaration//GEN-END:variables
    
    public void run() {
        Thread ct = Thread.currentThread();
        
        while (ct == h1) {
            calcula();
            FECHA.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    public void calcula() {
        Calendar CA = new GregorianCalendar();
        Date fechaHoraActual = new Date();


        CA.setTime(fechaHoraActual);
        ampm = CA.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = CA.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = CA.get(Calendar.HOUR_OF_DAY) > 9 ? "" + CA.get(Calendar.HOUR_OF_DAY) : "0" + CA.get(Calendar.HOUR_OF_DAY);
        }
        minutos = CA.get(Calendar.MINUTE) > 9 ? "" + CA.get(Calendar.MINUTE) : "0" + CA.get(Calendar.MINUTE);
        segundos = CA.get(Calendar.SECOND) > 9 ? "" + CA.get(Calendar.SECOND) : "0" + CA.get(Calendar.SECOND);
    }  
}
