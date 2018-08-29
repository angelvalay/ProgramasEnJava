package proyecto_alfa;

import conexionesExt.ConexionMySQL;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author The Blacks
 */
public class FrameIndex extends javax.swing.JFrame {
    public  Connection MySQL;
    public FrameIndex(Connection MySQL) {
        initComponents();
        this.setTitle("Home");
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/hotel.png")).getImage());
        this.MySQL = MySQL;
        this.createTableIndex("select * from habitaciones");
        modelarTabla();
    }
    private void modelarTabla(){
        TableColumn columna;
        columna=this.tablaInicio.getColumnModel().getColumn(0);
        columna.setPreferredWidth(150);
        columna.setMaxWidth(150);
        columna.setMinWidth(90);
        columna=this.tablaInicio.getColumnModel().getColumn(2);
        columna.setPreferredWidth(90);
        columna.setMaxWidth(90);
        columna.setMinWidth(90);
        columna=this.tablaInicio.getColumnModel().getColumn(3);
        columna.setPreferredWidth(70);
        columna.setMaxWidth(70);
        columna.setMinWidth(70);
        columna=this.tablaInicio.getColumnModel().getColumn(4);
        columna.setPreferredWidth(70);
        columna.setMaxWidth(70);
        columna.setMinWidth(70);
        columna=this.tablaInicio.getColumnModel().getColumn(5);
        columna.setPreferredWidth(110);
        columna.setMaxWidth(110);
        columna.setMinWidth(110);
        columna=this.tablaInicio.getColumnModel().getColumn(6);
        columna.setPreferredWidth(70);
        columna.setMaxWidth(70);
        columna.setMinWidth(70);
        columna=this.tablaInicio.getColumnModel().getColumn(7);
        columna.setPreferredWidth(90);
        columna.setMaxWidth(90);
        columna.setMinWidth(90);
        
        this.tablaInicio.setRowHeight(25);
    }
    private void addHuesped(){
        FrameDatePerson datosPersonales = new FrameDatePerson();
        datosPersonales.setVisible(true);
        this.dispose();
    }
    private void searchGuest(){
        //Metodo de busqueda
        String query= this.campoBuscar.getText();
        createTableIndex("SELECT * FROM `habitaciones` WHERE `nomP` LIKE '%"+query+"%'");
    }
    private void createTableIndex(String query){
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable (int fila, int columna) {
                return false;
            }
        };;
        ResultSet rs = null;
        Statement cmd = null;
        try{
            // Creamos las columnas.
            modelo.addColumn("Numero de habitacion");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad de persona");
            modelo.addColumn("Inicio");
            modelo.addColumn("Fin");
            modelo.addColumn("Tipo de habitacion");
            modelo.addColumn("Precio");
            modelo.addColumn("RFC");
            cmd=MySQL.createStatement();
            rs=cmd.executeQuery(query);
            // Bucle para cada resultado en la consulta
            while (rs.next())
            {
               // Se crea un array que será una de las filas de la tabla. 
               Object [] fila = new Object[8]; // Hay tres columnas en la tabla

               // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
               for (int i=0;i<8;i++)
                  fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

               // Se añade al modelo la fila completa.
               modelo.addRow(fila); 
            }
            
            this.tablaInicio.setModel(modelo);
        }catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Error "+ a.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subVentana = new javax.swing.JPopupMenu();
        menuUpdate = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInicio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        btnMostrarTodos = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuAgregar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();

        menuUpdate.setText("Actualizar Datos");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });
        subVentana.add(menuUpdate);

        menuDelete.setText("Borrar Huesped");
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });
        subVentana.add(menuDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tablaInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nombre", "Cantidad", "Fecha Inicio", "Fecha Fin", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInicio.setComponentPopupMenu(subVentana);
        tablaInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaInicio);

        jLabel1.setText("Nombre:");

        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscarKeyPressed(evt);
            }
        });

        btnMostrarTodos.setForeground(new java.awt.Color(0, 0, 153));
        btnMostrarTodos.setText("Mostrar Todos");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnAgregar.setText("Agregar Huesped");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.setFocusable(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnActualizar.setText("Actualizar datos");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

        btnEliminar.setText("Eliminar Huesped");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        jMenu1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI Light", 0, 11))); // NOI18N
        jMenu1.setText("Sesion");

        menuCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuCerrarSesion.setText("Cerrar sesion");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrarSesion);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Huesped");

        menuAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAgregar.setText("Agregar");
        menuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarActionPerformed(evt);
            }
        });
        jMenu5.add(menuAgregar);

        menuActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuActualizar.setText("Actualizar");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jMenu5.add(menuActualizar);

        menuEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuEliminar.setText("Eliminar");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu5.add(menuEliminar);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 331, Short.MAX_VALUE)
                        .addComponent(btnMostrarTodos)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarTodos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        // TODO add your handling code here:
        createTableIndex("Select * from habitaciones");
        this.campoBuscar.setText(null);
        modelarTabla();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        // TODO add your handling code here:
        searchGuest();
        modelarTabla();
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null, "Desea Salir ?", "Salir", JOptionPane.YES_NO_OPTION);
        if (close==JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        // TODO add your handling code here:
        int close=JOptionPane.showConfirmDialog(null, "Desea Cerrar Sesion ?", "Cerrar Sesion", JOptionPane.YES_NO_OPTION);
        if (close==JOptionPane.YES_OPTION) {
            try {
                FrameLogin fl= new FrameLogin();
                fl.setVisible(true);
                MySQL.close();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FrameIndex.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            MySQL.close();
        } catch (SQLException ex) {
            Logger.getLogger(FrameIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        addHuesped();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        openFrameUpdate();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed
        // TODO add your handling code here:
        
         int filaseleccionada;
         try{
         filaseleccionada= this.tablaInicio.getSelectedRow();
         if (filaseleccionada==-1){
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
         }else{
             DefaultTableModel modelotabla=(DefaultTableModel) tablaInicio.getModel();
             Object codigo=modelotabla.getValueAt(filaseleccionada, 0);
             String c= String.valueOf(codigo);
                FrameUpdateDate date= new FrameUpdateDate(this, true,c);
                date.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        createTableIndex("select * from habitaciones");
                        modelarTabla();
                    }
                });
                 //hago visible el dialogo
                date.setVisible(true);  
          }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       }     
    }//GEN-LAST:event_menuUpdateActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
        // TODO add your handling code here:
        btnActualizarActionPerformed(evt);
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void menuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarActionPerformed
        // TODO add your handling code here:
        btnAgregarActionPerformed(evt);
    }//GEN-LAST:event_menuAgregarActionPerformed

    private void menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
         int filaseleccionada;
         try{
         filaseleccionada= this.tablaInicio.getSelectedRow();
         if (filaseleccionada==-1){
             JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
         }else{
             DefaultTableModel modelotabla=(DefaultTableModel) tablaInicio.getModel();
             Object codigo=modelotabla.getValueAt(filaseleccionada, 0);
             String c= String.valueOf(codigo);
             ConexionMySQL cmsql= new ConexionMySQL();
                Connection MySQL2= cmsql.MySQLCo();
                PreparedStatement stmt;
                stmt=MySQL2.prepareStatement("delete from habitaciones where numHab=?");
                stmt.setInt(1, Integer.parseInt(c));
                stmt.executeUpdate();
                createTableIndex("select * from habitaciones");
                modelarTabla();
          }

       }catch (HeadlessException ex){

             JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);

       } catch (SQLException ex) {
            Logger.getLogger(FrameIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuDeleteActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String c= JOptionPane.showInputDialog(null, "Ingresa el numero de habitacion para eliminar:");
            if(isExistNumHabUpdate(Integer.parseInt(c))){
            ConexionMySQL cmsql= new ConexionMySQL();
            Connection MySQL2= cmsql.MySQLCo();
            PreparedStatement stmt;
            stmt=MySQL2.prepareStatement("delete from habitaciones where numHab=?");
            stmt.setInt(1, Integer.parseInt(c));
            stmt.executeUpdate();
            createTableIndex("select * from habitaciones");
            modelarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Nom Hab no encontrado");
            }
        } catch (SQLException  x) {
            JOptionPane.showMessageDialog(null, "Vuelve intentarlo.");
        } catch(NumberFormatException  |NullPointerException x){
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        // TODO add your handling code here:
        btnEliminarActionPerformed(evt);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private boolean isExistNumHabUpdate(int numhab){
        boolean isExist=false;
        try {
            ConexionMySQL cmsql= new ConexionMySQL();
            Connection MySQL2= cmsql.MySQLCo();
            ResultSet rs;
            Statement cmd; 
            cmd=MySQL2.createStatement();
            rs=cmd.executeQuery("select numHab from habitaciones where numHab="+String.valueOf(numhab));
            // Bucle para cada resultado en la consulta
            if(rs.next()){
               isExist=true;
               MySQL2.close();
            }else{
               isExist=false;
               MySQL2.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FrameDateRoom.class.getName()).log(Level.SEVERE, null, ex);
            isExist= false;
        }
        return isExist;
    }
    private void openFrameUpdate(){
        try{
            String habitacion;
            habitacion = JOptionPane.showInputDialog("Ingresa el Numero de Habitaion");      
            int convertiraint;
            convertiraint = Integer.parseInt(habitacion);
            if(convertiraint >= 100 && convertiraint <=800 || isExistNumHabUpdate(convertiraint)){
                FrameUpdateDate date= new FrameUpdateDate(this, true,habitacion);
                date.setVisible(true);   
            }else{
                JOptionPane.showMessageDialog(null,"Numero invalido de Habitacion o "
                        + "no existe el numero de habitacion");
                openFrameUpdate();
            }        
          }
        catch(HeadlessException | NumberFormatException A){
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuAgregar;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenuItem menuDelete;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JPopupMenu subVentana;
    private javax.swing.JTable tablaInicio;
    // End of variables declaration//GEN-END:variables
}