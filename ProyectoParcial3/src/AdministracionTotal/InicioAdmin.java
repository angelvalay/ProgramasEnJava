package AdministracionTotal;

import AreaDeProduccion.nuevaCompra;
import AreaDeProduccion.nuevoInsumo2;
import AreaDeRecursosHumanos.Empleados;
import AreaDeRecursosHumanos.EmpleadosLista;
import AreaDeRecursosHumanos.NewJDialog;
import reloj.*;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.*;
import Login.contraPrincipal;
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

    public InicioAdmin() {
        this.setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponents();
        h1 = new Thread(this);
        h1.start();
        CerrarVentana();
        OpaqueButtons();
        Connection miConexion;
        miConexion=Conexion.GetConnection();
        jInternalFrame1.setVisible(false);
        RELOJ.setVisible(false);
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        
        try{
            hilo.start();//el hilo empieza            
            String fecha= FechaActual(diasemana,dia,mes,año).toString();
            fecha1.setText(fecha);
            ImageIcon Adm = new ImageIcon(getClass().getResource("// Direccion Del Icono"));
            setIconImage(Adm.getImage());
            
        }catch(Exception a){
            System.err.println(a);
        }
        
        jMenuBar1.setOpaque(true);
        jMenuBar1.setBackground(Color.WHITE);
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
        InventarioProductos.setEnabled(false);
        nuevoempleado.setEnabled(false);
        Configuracion.setEnabled(false);
    }
    private  void OpaqueButtons(){
        InventarioProductos.setOpaque(false);
        InventarioProductos.setContentAreaFilled(false);
        InventarioProductos.setBorderPainted(false);
        NuevaCompra.setOpaque(false);
        NuevaCompra.setContentAreaFilled(false);
        NuevaCompra.setBorderPainted(false);
        clientes.setOpaque(false);
        clientes.setContentAreaFilled(false);
        clientes.setBorderPainted(false);
        empleados.setOpaque(false);
        empleados.setContentAreaFilled(false);
        empleados.setBorderPainted(false);
        registro.setOpaque(false);
        registro.setContentAreaFilled(false);
        registro.setBorderPainted(false);
        configuracion.setOpaque(false);
        configuracion.setContentAreaFilled(false);
        configuracion.setBorderPainted(false);
        jMenuBar1.setOpaque(false);
        jMenuBar1.setBorderPainted(false);
        NuevoModelo.setOpaque(false);
        NuevoModelo.setContentAreaFilled(false);
        NuevoModelo.setBorderPainted(false);
        inventario.setOpaque(false);
        inventario.setContentAreaFilled(false);
        inventario.setBorderPainted(false);
        nuevoempleado.setOpaque(false);
        nuevoempleado.setContentAreaFilled(false);
        nuevoempleado.setBorderPainted(false);
        jMenuItem4.setOpaque(false);
        jMenuItem4.setContentAreaFilled(false);
        jMenuItem4.setBorderPainted(false);
        verempleados.setOpaque(false);
        verempleados.setContentAreaFilled(false);
        verempleados.setBorderPainted(false);
        compras.setOpaque(false);
        compras.setContentAreaFilled(false);
        compras.setBorderPainted(false);
        ventas.setOpaque(false);
        ventas.setContentAreaFilled(false);
        ventas.setBorderPainted(false);
        acerca.setOpaque(false);
        acerca.setContentAreaFilled(false);
        acerca.setBorderPainted(false);
        //FECHA.setOpaque(false);
        //FECHA.setOpaque(false);
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
        fecha1 = new javax.swing.JLabel();
        FECHA = new javax.swing.JLabel();
        TiempoEjecucion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        RELOJ = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        InventarioProductos = new javax.swing.JMenu();
        NuevoModelo = new javax.swing.JMenuItem();
        inventario = new javax.swing.JMenuItem();
        empleados = new javax.swing.JMenu();
        nuevoempleado = new javax.swing.JMenuItem();
        verempleados = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenu();
        compras = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenuItem();
        NuevaCompra = new javax.swing.JMenu();
        newIntake = new javax.swing.JMenuItem();
        NuevoInsumo = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        NuevoCliente = new javax.swing.JMenuItem();
        VerClientes = new javax.swing.JMenuItem();
        configuracion = new javax.swing.JMenu();
        Configuracion = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        acerca = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        fecha1.setBackground(new java.awt.Color(0, 0, 0));
        fecha1.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N

        FECHA.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N

        TiempoEjecucion.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 3, 14)); // NOI18N
        jLabel1.setText("Tiempo de ejecución:");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        RELOJ.setBorder(null);
        RELOJ.setVisible(true);

        javax.swing.GroupLayout RELOJLayout = new javax.swing.GroupLayout(RELOJ.getContentPane());
        RELOJ.getContentPane().setLayout(RELOJLayout);
        RELOJLayout.setHorizontalGroup(
            RELOJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        RELOJLayout.setVerticalGroup(
            RELOJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        InventarioProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Guitarra - copia2.jpg"))); // NOI18N
        InventarioProductos.setText("Productos");

        NuevoModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/AgregarProducto.jpg"))); // NOI18N
        NuevoModelo.setText("Nuevo Modelo");
        InventarioProductos.add(NuevoModelo);

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/InventarioProducto2.png"))); // NOI18N
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        InventarioProductos.add(inventario);

        jMenuBar1.add(InventarioProductos);

        empleados.setBackground(new java.awt.Color(255, 255, 255));
        empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/AñadirEmpleado_1.png"))); // NOI18N
        empleados.setText("Empleados");

        nuevoempleado.setBackground(new java.awt.Color(255, 255, 255));
        nuevoempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/AñadirEmpleado_1.png"))); // NOI18N
        nuevoempleado.setText("Nuevo empleado");
        nuevoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoempleadoActionPerformed(evt);
            }
        });
        empleados.add(nuevoempleado);

        verempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Empleado.png"))); // NOI18N
        verempleados.setText("Ver empleados");
        verempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verempleadosActionPerformed(evt);
            }
        });
        empleados.add(verempleados);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Cliente2.jpg"))); // NOI18N
        jMenuItem2.setText("Asistencia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        empleados.add(jMenuItem2);

        jMenuBar1.add(empleados);

        registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Registros2.png"))); // NOI18N
        registro.setText("Registro");

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Compras.png"))); // NOI18N
        compras.setText("Compras");
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        registro.add(compras);

        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Ventas.JPG"))); // NOI18N
        ventas.setText("Ventas");
        registro.add(ventas);

        jMenuBar1.add(registro);

        NuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Compras2.png"))); // NOI18N
        NuevaCompra.setText("Compras");

        newIntake.setText("Nueva Compra");
        newIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newIntakeActionPerformed(evt);
            }
        });
        NuevaCompra.add(newIntake);

        NuevoInsumo.setText("Nuevo Insumo");
        NuevoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoInsumoActionPerformed(evt);
            }
        });
        NuevaCompra.add(NuevoInsumo);

        jMenuBar1.add(NuevaCompra);

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Cliente2.png"))); // NOI18N
        clientes.setText("Ventas");

        NuevaVenta.setText("Nueva venta");
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        clientes.add(NuevaVenta);

        NuevoCliente.setText("Nuevo cliente");
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });
        clientes.add(NuevoCliente);

        VerClientes.setText("Ver clientes");
        clientes.add(VerClientes);

        jMenuBar1.add(clientes);

        configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Configuracion2.jpg"))); // NOI18N
        configuracion.setText("Configuración");

        Configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Confi.jpg"))); // NOI18N
        Configuracion.setText("Configuracion");
        configuracion.add(Configuracion);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Salir.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        configuracion.add(Salir);

        jMenuBar1.add(configuracion);

        acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Ayuda2.jpg"))); // NOI18N
        acerca.setText("Acerca de...");
        jMenuBar1.add(acerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(RELOJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TiempoEjecucion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addComponent(FECHA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 414, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RELOJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("Tiempo de ejecución..");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar(){
        
        int a=JOptionPane.showConfirmDialog(this, "¿Desea Salir Del Sistema?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
       if(a==JOptionPane.CANCEL_OPTION){
           
       }else if(a==JOptionPane.NO_OPTION){
           hilo.stop();
           contraPrincipal usuario= new contraPrincipal();
           this.dispose();
           usuario.setVisible(true);
       }else if(a==JOptionPane.YES_OPTION){
           System.exit(0);
       }
    }
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       cerrar();
    }//GEN-LAST:event_SalirActionPerformed

    private void nuevoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoempleadoActionPerformed
        Empleados newEmpleados= new Empleados();
        newEmpleados.setTitle("Empleados");
        jInternalFrame1.setContentPane(newEmpleados.getContentPane());
        jInternalFrame1.setVisible(true);
        jInternalFrame1.setMaximizable(true);
        
        
    }//GEN-LAST:event_nuevoempleadoActionPerformed

    private void verempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verempleadosActionPerformed
        EmpleadosLista lista= new EmpleadosLista();
        lista.setTitle("Lista De Empleados....");
        jInternalFrame1.setContentPane(lista.getContentPane());
        jInternalFrame1.setVisible(true);
    }//GEN-LAST:event_verempleadosActionPerformed

    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_NuevoClienteActionPerformed

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
        //nuevaCompra nCompra = new nuevaCompra();
        
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventarioActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasActionPerformed

    private void newIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newIntakeActionPerformed
        nuevaCompra NUEVAcompra = new nuevaCompra();
        NUEVAcompra.setTitle("Nueva Compra");
        jInternalFrame1.setContentPane(NUEVAcompra.getContentPane());
        jInternalFrame1.setVisible(true);
    }//GEN-LAST:event_newIntakeActionPerformed

    private void NuevoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoInsumoActionPerformed
        nuevoInsumo2 NUEVOinsumo = new nuevoInsumo2();
        NUEVOinsumo.setTitle("Nuevo Insumo");
        jInternalFrame1.setContentPane(NUEVOinsumo.getContentPane());
        jInternalFrame1.setVisible(true);
    }//GEN-LAST:event_NuevoInsumoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NewJDialog dialog = new NewJDialog();
        dialog.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Principal pro= new Principal();
        RELOJ.setContentPane(pro.getContentPane());
        RELOJ.setVisible(true);
        FECHA.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Configuracion;
    private javax.swing.JLabel FECHA;
    private javax.swing.JMenu InventarioProductos;
    private javax.swing.JMenu NuevaCompra;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuItem NuevoCliente;
    private javax.swing.JMenuItem NuevoInsumo;
    private javax.swing.JMenuItem NuevoModelo;
    private javax.swing.JInternalFrame RELOJ;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel TiempoEjecucion;
    private javax.swing.JMenuItem VerClientes;
    private javax.swing.JMenu acerca;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem compras;
    private javax.swing.JMenu configuracion;
    private javax.swing.JMenu empleados;
    private javax.swing.JLabel fecha1;
    private javax.swing.JMenuItem inventario;
    public static javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem newIntake;
    private javax.swing.JMenuItem nuevoempleado;
    private javax.swing.JMenu registro;
    private javax.swing.JMenuItem ventas;
    private javax.swing.JMenuItem verempleados;
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
